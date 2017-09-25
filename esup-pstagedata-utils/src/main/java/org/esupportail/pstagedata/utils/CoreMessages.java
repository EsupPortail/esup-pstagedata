package org.esupportail.pstagedata.utils;
import java.util.ResourceBundle;

public class CoreMessages {

	private static final String BUNDLE_NAME = "properties/pstagedataCore"; //$NON-NLS-1$

	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);

	private CoreMessages() {
	}

	public static String getString(String key) {

		return RESOURCE_BUNDLE.getString(key);
	}
}
