/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppp.prm.portal.server.dao;

import java.util.List;

import com.ppp.prm.portal.server.exceptions.DAOException;
import com.ppp.prm.portal.shared.dto.MNews;
import com.ppp.prm.portal.shared.dto.ObjectUIMenu;

/**
 DAO MComments interface
  */
public interface DB4oDao {

    /**
     * select all the MComments from the database
     * @return all the MComments
     * @throws DAOException : when error occur when accessing to the database
     */
	public List<MNews> getNews() throws DAOException;
	
	public List<ObjectUIMenu> saveUIObject(ObjectUIMenu obj) throws DAOException;
	public List<ObjectUIMenu> getUIObject(ObjectUIMenu obj) throws DAOException;
	public List<ObjectUIMenu> purgeUIObject(ObjectUIMenu obj) throws DAOException;
	public List<ObjectUIMenu> traceUIObject(ObjectUIMenu obj) throws DAOException;
	
    
    /**
     * Create MComment
     * @throws DAOException : when error occur when accessing to the database
     */
	
}
