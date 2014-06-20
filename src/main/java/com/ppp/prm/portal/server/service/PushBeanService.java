/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ppp.prm.portal.server.service;

import java.util.List;

import com.ppp.prm.portal.server.exceptions.BusinessException;
import com.ppp.prm.portal.shared.dto.ALstVal;
import com.ppp.prm.portal.shared.dto.ContextObject;
import com.ppp.prm.portal.shared.dto.MNews;
import com.ppp.prm.portal.shared.dto.ObjectUIMenu;

/**
 *
 * CommentsService
 */
public interface PushBeanService   {


  
 
 	public MNews addNews(MNews obj) throws BusinessException;
 	
 
 	List<ObjectUIMenu> pushUIObject(ContextObject ctx) throws BusinessException;
 	public List<ALstVal> loadGlobalList() throws BusinessException;
 	
 	

}
