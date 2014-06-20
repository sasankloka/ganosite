package com.ppp.prm.portal.server.exceptions;

/**
 * DAO Layer Exception class
 *  */
public class DAOException extends Exception {

    /**
     * the DAO Exception thrower.
     *
     * @param message
     *                the message error
     */
    public DAOException(String message) {
        super(message);
    }

    /**
     * the DAO Exception thrower.
     *
     * @param message
     *                the message error
     * @param cause
     *                the cause of the exception
     */
    public DAOException(String message, Throwable cause) {
        super(message, cause);
    }

}
