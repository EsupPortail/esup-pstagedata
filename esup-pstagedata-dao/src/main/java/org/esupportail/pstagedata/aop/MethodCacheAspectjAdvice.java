package org.esupportail.pstagedata.aop;

import java.io.Serializable;

import net.sf.ehcache.Cache;
import net.sf.ehcache.Element;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.util.Assert;

public class MethodCacheAspectjAdvice implements InitializingBean{
	private static final Logger logger = Logger.getLogger(MethodCacheAspectjAdvice.class);

	private Cache cache;

	/**
	 * sets cache name to be used
	 */
	public void setCache(Cache cache) {
		this.cache = cache;
	}
	/**
	 * Checks if required attributes are provided.
	 */
	public void afterPropertiesSet() throws Exception {
		Assert.notNull(cache, " Un cache est necessaire . Utilisez setCache(Cache) pour en donner un.");
	}

	public Object handleCache(ProceedingJoinPoint joinPoint) throws Throwable {

		String targetName  = joinPoint.getThis().getClass().getName();
		String methodName  = joinPoint.getSignature().getName();
		Object[] arguments = joinPoint.getArgs();
		Object result;
		if(logger.isDebugEnabled()){
			logger.debug(" Recherche si le resultat est d'une methode est en cache");
		}
		String cacheKey = getCacheKey(targetName, methodName, arguments);

		Element element = cache.get(cacheKey);

		if (element == null) {

			if(logger.isDebugEnabled()){
				logger.debug(" Sinon on intercepte la methode");
			}
			result = joinPoint.proceed();

			//cache method result
			if(logger.isDebugEnabled()){
				logger.debug(" Et on met le resulat en cache ");
			}
			element = new Element(cacheKey, (Serializable) result);
			cache.put(element);
			//on declenche  immediatement sur disque pour sur
			cache.flush();


		}else {
			logger.debug(" elements recuperes du cache");
		}
		return element.getValue();

	}

	/**
	 *
	 * Creation de caches :  targetName.methodName.argument0.argument1...
	 */
	private String getCacheKey(String targetName,
							   String methodName,
							   Object[] arguments) {
		StringBuilder sb = new StringBuilder();
		sb.append(targetName)
				.append(".").append(methodName);
		if ((arguments != null) && (arguments.length != 0)) {
			for (int i=0; i < arguments.length; i++) {
				sb.append(".")
						.append(arguments[i]);
			}
		}

		return sb.toString();
	}


}
