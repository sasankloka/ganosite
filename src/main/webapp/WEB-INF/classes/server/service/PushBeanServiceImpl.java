package com.ppp.prm.portal.server.service;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import com.ppp.prm.portal.server.dao.DB4oDao;
import com.ppp.prm.portal.server.dao.NewsDao;
import com.ppp.prm.portal.server.exceptions.BusinessException;
import com.ppp.prm.portal.server.exceptions.DAOException;
import com.ppp.prm.portal.server.service.gwt.GWTServiceRemoteImpl;
import com.ppp.prm.portal.shared.dto.ALstVal;
import com.ppp.prm.portal.shared.dto.ContextObject;
import com.ppp.prm.portal.shared.dto.MNews;
import com.ppp.prm.portal.shared.dto.ObjectUIMenu;

// @Transactional
public class PushBeanServiceImpl extends GWTServiceRemoteImpl
 implements PushBeanService 
{
	
	 private Logger log = Logger.getLogger(PushBeanServiceImpl.class);
	    private DB4oDao db4oDao;
	
	    public void setNewsDao(NewsDao NewsDAO) {
			this.newsDao = NewsDAO;
		}
	    
	    public void setDb4oDao(DB4oDao db4oDao) {
			this.db4oDao = db4oDao;
		}

	    public	    List<ObjectUIMenu> pushUIObject(ContextObject ctx) throws BusinessException{
	    	
	    	try {
	    		Db4oLoadClass dbo = new Db4oLoadClass();
				log.log(Level.INFO,"ServerService pushUIObject Action"+ctx.getAction());
			    if(ctx.getAction().equals("SaveInLineText") && ctx.getObjectUi() != null)
			    	return db4oDao.saveUIObject(ctx.getObjectUi());
			    if(ctx.getAction().equals("SaveMenu"))
			    	return db4oDao.saveUIObject(ctx.getObjectUi());	
			    if(ctx.getAction().equals("LoadMenu"))
			    {ObjectUIMenu obj = new ObjectUIMenu(); obj.setType("Menu");
			 //   log.log(Level.INFO,"QBE  ");
			    // for (Object O:db4oDao.getUIObject(obj))   Db4oLoadClass.examineFields((Object) O);
			    
			    return db4oDao.getUIObject(obj);	
			    }
			    if(ctx.getAction().equals("LoadSubMenu"))
			    {ObjectUIMenu obj = ctx.getObjectUi(); obj.setType("Menu");
			    log.log(Level.INFO,"QBE  "+ctx.getAction() + " "+obj.getType());
			    List<ObjectUIMenu> objLst = db4oDao.getUIObject(obj);
			    log.log(Level.INFO,"QBE  "+objLst.get(0).getListMenu());
			    List<ObjectUIMenu> ret = new ArrayList<ObjectUIMenu>();
			    if (objLst.get(0).getListMenu() != null) 
			    {
			    	for(ObjectUIMenu bj: objLst.get(0).getListMenu())
			   {
			   // Db4oLoadClass.examineFields((Object) obj);  
			   ret.add(db4oDao.getUIObject(bj).get(0));}
			   objLst.get(0).setListMenu(ret);
			    return objLst;}
			    return ret;
			    }
			    if(ctx.getAction().equals("PurgeMenu"))
			    {ObjectUIMenu obj = ctx.getObjectUi(); //obj.setType("Menu");
			    log.log(Level.INFO,"QBE  "+obj.getType() + db4oDao.purgeUIObject(obj));
			    return db4oDao.getUIObject(obj);	
			    }	
			    if(ctx.getAction().equals("ShowObjects"))
			    {ObjectUIMenu obj = ctx.getObjectUi(); //obj.setType("Menu");
			    log.log(Level.INFO,"QBE  "+obj.getType() + db4oDao.traceUIObject(obj));
			   // traceUIObject
			    return db4oDao.traceUIObject(obj);	
			    }	
			    if(ctx.getAction().equals("SaveSubMenu"))
				    { ObjectUIMenu obj = ctx.getObjectUi(); //obj.setType("Menu");
				     log.log(Level.INFO,"QBE  SaveSubMenu "+obj.getType() +" Id" +obj.getId());
            //         int i = 0;
				    if(obj.getType().equals("SubMenu"))	
				    	return(db4oDao.saveUIObject(obj));		
				    log.log(Level.INFO,"QBE  SaveSubMenu "+obj.getListMenu());
				     for(ObjectUIMenu bj: obj.getListMenu())
				   {   log.log(Level.INFO,"  for Loop " +bj);
				   // Db4oLoadClass.examineFields((Object) obj);  
				    		if(bj.getId()==0)
				    		{ log.log(Level.INFO,"QBE  SaveSubMenu "+ bj.getMenu());
				    		      List <ObjectUIMenu> objlst = db4oDao.saveUIObject(bj);
				    		      obj.getListMenu().set(obj.getListMenu().indexOf(bj), objlst.get(0));
				    			}		
				    		}
				     log.log(Level.INFO,"QBE  SaveSubMenu "+obj.getType() +" Id" +obj.getId());
				    	return db4oDao.saveUIObject(obj);
				    //	return null;
				  //  return db4oDao.saveUIObject(obj);	
				    }
			    log.log(Level.INFO,"  null out of for Loop ");
			    return null;
			} catch (DAOException e) {
				log.log(Level.ERROR, e.getMessage());
		        throw new BusinessException(e.getMessage());}
		 }

	public MNews addNews(MNews obj) throws BusinessException {
		// TODO Auto-generated method stub
		try {
			log.log(Level.INFO,"Adding News");
		
			return newsDao.addNews(obj);
		} catch (DAOException e) {
			log.log(Level.ERROR, e.getMessage());
	        throw new BusinessException(e.getMessage());
		}
		// return null;
	}




	public List<ALstVal> loadGlobalList() throws BusinessException
	{
	//	newsDao.loadGlobalList();
		try {
			return(newsDao.loadGlobalList());
		} catch (DAOException e) {
			log.log(Level.ERROR, e.getMessage());
	        throw new BusinessException(e.getMessage());
		}
	}
	


	
}


