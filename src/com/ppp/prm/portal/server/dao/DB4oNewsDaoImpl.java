package com.ppp.prm.portal.server.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.springextensions.db4o.support.Db4oDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.db4o.query.Predicate;
import com.ppp.prm.portal.server.exceptions.DAOException;
import com.ppp.prm.portal.shared.dto.ALstVal;
import com.ppp.prm.portal.shared.dto.MComments;
import com.ppp.prm.portal.shared.dto.MNews;
import com.ppp.prm.portal.shared.dto.MUserRel;

@Transactional
public class DB4oNewsDaoImpl extends Db4oDaoSupport implements NewsDao {

	 private Logger log = Logger.getLogger(DB4oNewsDaoImpl.class);
    private NewsDao NewsDAO;
	
	
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
	
	public MNews addNews(MNews toAdd) {
		log.info("DB4oNewsDAO Adding Main Size"+ toAdd);
		getDb4oTemplate().store(toAdd);
		MNews qw = new MNews();
		List<MNews> nw = getDb4oTemplate().queryByExample(toAdd);
		log.info("DB4oNewsDAO Adding Main Size"+ nw.size());
		return null;
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
