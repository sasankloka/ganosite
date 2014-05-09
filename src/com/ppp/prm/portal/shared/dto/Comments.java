package com.ppp.prm.portal.shared.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * Comments Hibernate bean
 * 
 */
public interface Comments extends Serializable {
	/**
	 * Id comment
	*/ 
	// Integer idComment;
	/*
	 * The comment
	 */
//	String comments;
	/**
	 * The user code
	 */
//	String codeUser;

	/**
	 * @return the idComment
	 */
	// public Integer getIdComment() ;

	/**
	 * @param idComment
	 *            the idComment to set
	 */
	// public void setIdComment(Integer idComment);

	/**
	 * @return the comments
	 */
	// public String getComments() ;

	/**
	 * @param comments
	 *            the comments to set
	 */
	// public void setComments(String comments) ;

	/**
	 * @return the codeUser
	 */
	// public String getCodeUser() ;

	/**
	 * @param codeUser
	 *            the codeUser to set
	 */
	// public void setCodeUser(String codeUser);
	
	
	

   public void MComments() ;

	
   public void MComments(int rid, Date created, Date updated) ;
   public void MComments(MNews MNews, MUser MUser, int rid, String descr, Date created, Date updated);
  
   public Integer getId();
   public void setId(Integer id) ;
   
   public MNews getMNews() ;
   public void setMNews(MNews MNews) ;
   
   public MUser getMUser() ;
   public void setMUser(MUser MUser) ;
   
   public int getRid() ;
   public void setRid(int rid);
   
   public String getDescr() ;
   public void setItem(String descr);
  
   public Date getCreated() ;
   public void setCreated(Date created);
   
   public Date getUpdated() ;
   public void setUpdated(Date updated);

}
