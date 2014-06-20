/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppp.prm.portal.server.dao;

import java.util.List;

import com.ppp.prm.portal.server.exceptions.DAOException;
import com.ppp.prm.portal.shared.dto.ALstVal;
import com.ppp.prm.portal.shared.dto.MComments;
import com.ppp.prm.portal.shared.dto.MNews;
import com.ppp.prm.portal.shared.dto.MUserRel;

/**
 DAO MComments interface
  */
public interface NewsDao {

    /**
     * select all the MComments from the database
     * @return all the MComments
     * @throws DAOException : when error occur when accessing to the database
     */
	public List<MNews> getNews() throws DAOException;
    
    /**
     * Create MComment
     * @throws DAOException : when error occur when accessing to the database
     */
	public List<MUserRel> getUserList() throws DAOException;
	
	
	public List<MNews> getNews(String User) throws DAOException;
	
	
	public List<MNews> getRelatedNews() throws DAOException;
	
	public MNews addNews(MNews toAdd) throws DAOException;
	
	public void addComment(MComments toAdd) throws DAOException;
	
	// public  List<MComments> getAllComments(MComments cm) throws DAOException;
	
	public List<ALstVal> loadGlobalList() throws DAOException;
}
