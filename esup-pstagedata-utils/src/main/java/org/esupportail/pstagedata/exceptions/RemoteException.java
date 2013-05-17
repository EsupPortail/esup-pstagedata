package org.esupportail.pstagedata.exceptions;

public class RemoteException extends CoreException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor.
	 * @param message 
	 * @param cause 
	 */
	public RemoteException(final String message, final Throwable cause) {
		super(message, cause);
	}

}
