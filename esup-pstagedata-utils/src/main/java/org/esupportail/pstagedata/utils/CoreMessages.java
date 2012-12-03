package org.esupportail.pstagedata.utils;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class CoreMessages {
	private static final String BUNDLE_NAME = "properties/pstagedataCore"; //$NON-NLS-1$
	

	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle
			.getBundle(BUNDLE_NAME);

	private CoreMessages() {
	}

	public static String getString(String key) {
		String result;
		try {
			result = RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append(" La constante : '"); //$NON-NLS-1$
			stringBuilder.append(key);
			stringBuilder.append("' n'est pas accessible ou definie"); //$NON-NLS-1$
			result = stringBuilder.toString();
		}
		return result;
	}
}
