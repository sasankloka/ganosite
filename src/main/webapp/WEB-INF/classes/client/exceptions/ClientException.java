
package com.ppp.prm.portal.client.exceptions;

import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * Client Exception
  */
public class ClientException extends Exception implements IsSerializable {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;
    /**
     * stackTrace.
     */
    private   String stackTrace;
    /**
     * message.
     */
    private   String message;

    /**
     * Constructeur par defaut.
     */
    public ClientException() {
        super();
    }

    /**
     * Constructeur.
     * @param message message
     * @param cause cause
     */
    public ClientException(String message, String cause) {
        super(message);
        this.message = message;
        stackTrace = cause;
    }

    /**
     *
     * @param message message
     */
    public ClientException(String message) {
        super(message);
        this.message = message;
    }

    /**
     *
     * @return CauseStackTrace
     */
    public final String getCauseStackTrace() {
        return stackTrace;
    }

    /**
     *
     * @return Message
     */
    @Override
    public final String getMessage() {
        return message;
    }
}
