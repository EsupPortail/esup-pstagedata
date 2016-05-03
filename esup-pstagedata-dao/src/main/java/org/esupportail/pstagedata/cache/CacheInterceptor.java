package org.esupportail.pstagedata.cache;

import org.apache.commons.beanutils.MethodUtils;
import org.apache.cxf.interceptor.Fault;
import org.esupportail.pstagedata.dao.AbstractIBatisDaoService;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.util.ReflectionUtils;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.io.ByteArrayOutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Set;

import static org.hsqldb.HsqlDateTime.e;
import static org.springframework.util.ReflectionUtils.getAllDeclaredMethods;

/**
 * Created by Ostrowski on 29/04/2016.
 */
public class CacheInterceptor extends AbstractIBatisDaoService implements SOAPHandler<SOAPMessageContext> {

    private Method[] remoteMethods;

    public CacheInterceptor() {
        if(logger.isDebugEnabled())
            logger.debug("CACHE INTERCEPTOR CONSTRUCTOR");
        try {
            remoteMethods = ReflectionUtils.getAllDeclaredMethods(Class.forName("org.esupportail.pstagedata.remote.RemoteServicesImpl"));
        } catch (ClassNotFoundException e) {
            logger.error("CacheInterceptor => Class RemoteServicesImpl not found");
            e.printStackTrace();
        }
    }

    private Method getMethodFromName(String name) {
        for(Method m : remoteMethods) {
            if(m.getName().equals(name)) {
                return m;
            }
        }
        return null;
    }

    private void dumpSOAPMessage (SOAPMessage msg) {
        if (msg == null)
        {
            System.out.println ("SOAP Message is null");
            return;
        }
        System.out.println ("");
        System.out.println ("--------------------");
        System.out.println ("DUMP OF SOAP MESSAGE");
        System.out.println ("--------------------");
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream ();
            msg.writeTo (baos);
            System.out.println (baos.toString (getMessageEncoding (msg)));
            // show included values
            String values = msg.getSOAPBody ().getTextContent ();
            System.out.println ("Included values:" + values);
        } catch (Exception e) {
            e.printStackTrace ();
        }
    }

    private String getMessageEncoding (SOAPMessage msg) throws SOAPException {
        String encoding = "utf-8";
        if (msg.getProperty(SOAPMessage.CHARACTER_SET_ENCODING) != null) {
            encoding = msg.getProperty(SOAPMessage.CHARACTER_SET_ENCODING).toString();
        }
        return encoding;
    }

    @Override
    public boolean handleMessage(SOAPMessageContext context) throws Fault {
        if(!(Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY))
        try {
//            dumpSOAPMessage(context.getMessage());
            QName opn = (QName) context.get(MessageContext.WSDL_OPERATION);
            Method m = getMethodFromName(opn.getLocalPart());
            if(m != null) {
                FlushCache a = AnnotationUtils.findAnnotation(m, FlushCache.class);
                if(a != null) {
                    Cache[] caches = a.value();
                    for(Cache c : caches) {
                        String v = c.toString();
                        if (v == null || v.isEmpty()) {
                            getSqlMapClient().flushDataCache();
                        } else {
                            getSqlMapClient().flushDataCache(v);
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {
        return true;
    }

    @Override
    public void close(MessageContext context) {

    }

    @Override
    public Set<QName> getHeaders() {
        return null;
    }
}
