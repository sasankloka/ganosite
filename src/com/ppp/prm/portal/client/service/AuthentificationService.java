package com.ppp.prm.portal.client.service;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.ppp.prm.portal.client.exceptions.ClientException;
import com.ppp.prm.portal.shared.dto.UserDTO;

@RemoteServiceRelativePath("authentificationService")
public interface AuthentificationService extends RemoteService {
  

	/**
	 * Verify if login + pwd are valid
     * @return true(if user valid)/false(if not)
     * @throws ClientException : when error occur when accessing to the database
	 */
   public Boolean checkUser(UserDTO user) throws ClientException;
   	
}