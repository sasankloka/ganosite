package com.ppp.prm.portal.server.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.springextensions.db4o.support.Db4oDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.db4o.ObjectSet;
import com.db4o.query.Predicate;
import com.ppp.prm.portal.server.exceptions.DAOException;
import com.ppp.prm.portal.shared.dto.ALstVal;
import com.ppp.prm.portal.shared.dto.MComments;
import com.ppp.prm.portal.shared.dto.MNews;
import com.ppp.prm.portal.shared.dto.MUserRel;
import com.ppp.prm.portal.shared.dto.ObjectUIMenu;

@Transactional
public class DB4oDaoImpl extends Db4oDaoSupport implements DB4oDao {

	 private Logger log = Logger.getLogger(DB4oDaoImpl.class);
  //  private NewsDao NewsDAO;
	
	
	public List<MNews> getNews() {
		List<MNews> news = null;
		// TBD
		return news;
	}

	
	public List<MUserRel> getUserList() {
		
		return null;
	}
	
	public List<MNews> getNews(String User) {
		
		return null;
	}	
	
	public List<MNews> getRelatedNews() {
		
		 return null;
	}
	
	public List<ObjectUIMenu> saveUIObject(ObjectUIMenu obj) throws DAOException {
		log.info("saveUIObject  Type "+obj.getType()+" Id-"+obj.getId());
		log.info("saveUIObject  Type "+obj.getType()+" Id-"+obj.getId()+"  inLine "+ obj.getInLine()+" Menu "+obj.getMenu()); 
		if(obj.getListMenu()!=null)
		for(ObjectUIMenu rs1: obj.getListMenu())	
		{  
			if(rs1.getId()>0)
			getDb4oTemplate().bind(rs1,rs1.getId());
			 getDb4oTemplate().store(rs1);
			// List<ObjectUIMenu> ret = getUIObject(rs1);
			 // log.info( "   saveUIObject  Type "+ret.get(0).getType()+ " Id-"+ret.get(0).getId()+"  inLine  "+ ret.get(0).getInLine()+" Menu  "+ret.get(0).getMenu());
			log.info( "   saveUIObject  Type "+rs1.getType()+ " Id-"+rs1.getId()+"  inLine  "+ rs1.getInLine()+" Menu  "+rs1.getMenu());
		}	
		if(obj.getId() > 0 )
			getDb4oTemplate().bind(obj,obj.getId());
			 getDb4oTemplate().store(obj);
	//	  getUIObject(obj);
		// ObjectSet queryByExample = getDb4oTemplate().queryByExample(obj);
		// log.info("DB4oDAOImpl Retrieve"+getUIObject());
		List<ObjectUIMenu> ret = getUIObject(obj);
		// ObjectUIMenu commnts = getDb4oTemplate().getByID('1');
		//MNews qw = new MNews();
		// List<MNews> nw = getDb4oTemplate().queryByExample(toAdd);
		log.info("DB4oDAOImpl return Size"+ ret.size() +" "+ret.get(0).getId());
		return ret;
		}

	
	public List<ObjectUIMenu> getUIObject(ObjectUIMenu obj) throws DAOException {
	//	log.info(" getObjectUI "); // obj.setMenu("Menu");
		ObjectUIMenu test = new ObjectUIMenu();
		ObjectSet queryByExample = getDb4oTemplate().queryByExample(obj);

		// log.info("Retrieve");
		List<ObjectUIMenu> ret = queryByExample;
		int i=0;
		for(ObjectUIMenu rs: ret)
			{ ret.get(i++).setId(getDb4oTemplate().getID(rs));
			log.info("getUIObject  Type"+rs.getType()+" Id"+rs.getId()+"  inLine"+ rs.getInLine()+" Menu"+rs.getMenu());
			traceUIObject(rs);
			}
		    
		// ObjectUIMenu commnts = getDb4oTemplate().getByID('1');
		//MNews qw = new MNews();
		// List<MNews> nw = getDb4oTemplate().queryByExample(toAdd);
		log.info("getUIObject Ret Size"+ ret.size());
		return ret;
		}
	
	public List<ObjectUIMenu> traceUIObject(ObjectUIMenu obj) throws DAOException {
//		log.info(" getObjectUI "); // obj.setMenu("Menu");
		ObjectUIMenu test = new ObjectUIMenu();
		ObjectSet queryByExample = getDb4oTemplate().queryByExample(obj);

		log.info("Traces");
		List<ObjectUIMenu> ret = queryByExample;
		int i=0;
		for(ObjectUIMenu rs: ret)
			{ ret.get(i++).setId(getDb4oTemplate().getID(rs));
		//	log.info("Retrieve "+getDb4oTemplate().getID(rs) +"Menu "+rs.getMenu()+" inLine"+" ListMenu"+rs.getListMenu());
			log.info("traceUIObject Type "+rs.getType()+" Id-"+rs.getId()+"  inLine "+ rs.getInLine()+" Menu "+rs.getMenu());
			if(rs.getListMenu()!=null)
			for(ObjectUIMenu rs1: rs.getListMenu())
				log.info("            traceUIObject  Type "+rs1.getType()+" Id-"+rs1.getId()+"  inLine "+ rs1.getInLine()+" Menu "+rs1.getMenu());
			//	if(rs1.getMenu() != null && rs1.getId()>1)
		//	log.info("Retrieve Submeu"+rs1.getId());
				
			}
		    
		// ObjectUIMenu commnts = getDb4oTemplate().getByID('1');
		//MNews qw = new MNews();
		// List<MNews> nw = getDb4oTemplate().queryByExample(toAdd);
		log.info("traceUIObject Ret Size"+ ret.size());
		return ret;
		}
	
	
	public List<ObjectUIMenu> purgeUIObject(ObjectUIMenu obj) throws DAOException {
		log.info(" delObjectUI "+obj); // obj.setMenu("Menu");
		ObjectUIMenu obj2 = new ObjectUIMenu();
		getDb4oTemplate().delete(ObjectUIMenu.class);
	//	getDb4oTemplate().delete(getDb4oTemplate().queryByExample(obj2));
		ObjectSet queryByExample = getDb4oTemplate().queryByExample(obj2);
		
	// 	log.info("Retrieve");
		List<ObjectUIMenu> ret = queryByExample;
		for(ObjectUIMenu rs: ret)
		 getDb4oTemplate().delete(rs);
		//log.info("Retrieve"+getDb4oTemplate().getID(rs));}
		// ObjectUIMenu commnts = getDb4oTemplate().getByID('1');
		//MNews qw = new MNews();
		// List<MNews> nw = getDb4oTemplate().queryByExample(toAdd);
		log.info(" delObjectUI Ret Size"+ ret.size());
		return ret;
		}
	

	
		
	   public  List<MComments> getAllComments(MComments cm) throws DAOException {

	        try {
	        	cm.setDescr(null);
	        	List<MComments> commnts = getDb4oTemplate().queryByExample(cm);
	        	
	        	
	        
	        //	Comments = new Comments();
	        	List<MComments>  comments = (List<MComments>) getDb4oTemplate().query(new Predicate<MComments>()
	                    {
	      	      public boolean match(MComments com) {
	                   return com.getDescr().isEmpty();
	              }
	      	      // return(com);
	      });
	        	
	        	log.info(" getAllMComments Class"+ comments.getClass() +"getAllComments Size"+comments.size());
	        return commnts;
	        	                       
	        } catch (Exception e) {
	        	log.error("CommentsDAO -->getAllComments : Error", e);
	            throw new DAOException(e.getMessage());
	        } 
	      
	    }
	
	   
	public void addComment(MComments toAdd) {
		
		getDb4oTemplate().store(toAdd);
		log.info("MComments Added"+ toAdd.getDescr() + getDb4oTemplate().isStored(toAdd)
				+ getDb4oTemplate().queryByExample(toAdd).toString());
		
		// return toAdd;
		}


	public List<ALstVal> loadGlobalList() {
		// TODO Auto-generated method stub
		
		return null;
	}
	

}
