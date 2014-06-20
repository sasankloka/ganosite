package com.ppp.prm.portal.client.service;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.ppp.prm.portal.client.exceptions.ClientException;
import com.ppp.prm.portal.shared.dto.UserDTO;

public interface AuthentificationServiceAsync {

	/**
	 * Verify if login + pwd are valid
     * @return true(if user valid)/false(if not)
     * @throws ClientException : when error occur when accessing to the database
	 */
   public void checkUser(UserDTO user, AsyncCallback<Boolean> callback) throws ClientException;

}