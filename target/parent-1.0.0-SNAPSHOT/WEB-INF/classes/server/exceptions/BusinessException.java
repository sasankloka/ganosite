package com.ppp.prm.portal.server.exceptions;

/**
 * Business Layer Exception class
*/
public class BusinessException extends Exception {

    /**
     * the Business Exception thrower.
     *
     * @param message
     *                the message error
     */
    public BusinessException(String message) {
        super(message);
    }

    /**
     * the Business Exception thrower.
     *
     * @param message
     *                the message error
     * @param cause
     *                the cause of the exception
     */
    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

}
