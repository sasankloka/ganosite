package com.ppp.prm.portal.server.service.gwt;

import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import com.ppp.prm.portal.client.exceptions.ClientException;
import com.ppp.prm.portal.client.service.PushService;
import com.ppp.prm.portal.server.exceptions.BusinessException;
import com.ppp.prm.portal.server.service.gwt.HibernateDetachUtility.SerializationType;
import com.ppp.prm.portal.shared.dto.ALstVal;
import com.ppp.prm.portal.shared.dto.ContextObject;
import com.ppp.prm.portal.shared.dto.MNews;
import com.ppp.prm.portal.shared.dto.ObjectUIMenu;

/**
 * The server side implementation of the RPC service.
 */

public class PushServiceImpl extends GWTServiceRemoteImpl
implements
		PushService {

	/**
	 * Logging infos et erreurs
	 */
	private Logger logger = Logger.getLogger(PushServiceImpl.class);

	
		
	public MNews addNews(MNews obj) throws ClientException {
		// TODO Auto-generated method stub
		try {
			return getPushBeanService().addNews(obj);
		} catch (BusinessException e) {
			logger.log(Level.ERROR, e);
			throw new ClientException(e.getMessage());
		} catch (Exception e) {
			logger.log(Level.ERROR, e);
			throw new ClientException(e.getMessage());
		}
	}

	
	
	public List<ALstVal> loadGlobalList() throws ClientException {
		// TODO Auto-generated method stub
		try {
			return getPushBeanService().loadGlobalList();
		} catch (BusinessException e) {
			logger.log(Level.ERROR, e);
			throw new ClientException(e.getMessage());
		} catch (Exception e) {
			logger.log(Level.ERROR, e);
			throw new ClientException(e.getMessage());
		}
	}



	@Override
	public List<ObjectUIMenu> pushUIObject(ContextObject ctx) throws ClientException {
		// TODO Auto-generated method stub
		try {
			logger.info(" pushUIObject Action "+ctx.getAction());
			List<ObjectUIMenu> result= getPushBeanService().pushUIObject(ctx);
			logger.info("pushUIObject result"+ result +" result size "+result.size());
			if(result.size() == 0) {List<ObjectUIMenu> ns = new ArrayList<ObjectUIMenu>(); return(ns);} if(result.get(0) == null ) { logger.info("Get All  Push Bean Service2Null " ); return(null);}
			HibernateDetachUtility.nullOutUninitializedFields(result, SerializationType.SERIALIZATION);
			logger.info("pushUIObject nullOutUninitializedFields Push Bean Service2" + result);
			return (new ArrayList<ObjectUIMenu>(result));
		} catch (BusinessException e) {
			logger.log(Level.ERROR, e);
			throw new ClientException(e.getMessage());
		} catch (Exception e) {
			logger.log(Level.ERROR, e);
			throw new ClientException(e.getMessage());
		}
		
	}

	

}
