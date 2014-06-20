package com.ppp.prm.portal.shared.dto;

/**
 * MComment DTO class.
 * It is a serialisable class : to authorise its transfert via RPC 
 * @author aalaoui
 * @version 1.0
 */
public class CommentsDTO implements java.io.Serializable {

public CommentsDTO()
{
	
}

public CommentsDTO (String codeUser, String MComments)
{
	this.MComments = MComments;
	this.codeUser = codeUser;
}
    /**
     * id MComment
     */
    private Integer idMComment;
     /**
     * MComment
     */
    private String MComments;
    /**
     * the user code
     */
    private String codeUser;
	/**
	 * @return the idMComment
	 */
	public Integer getIdComment() {
		return idMComment;
	}
	/**
	 * @param idMComment the idMComment to set
	 */
	public void setIdComment(Integer idMComment) {
		this.idMComment = idMComment;
	}
	/**
	 * @return the MComment
	 */
	public String getComments() {
		return MComments;
	}
	/**
	 * @param MComment the MComment to set
	 */
	public void setComments(String Comments) {
		this.MComments = MComments;
	}
	/**
	 * @return the codeUser
	 */
	public String getCodeUser() {
		return codeUser;
	}
	/**
	 * @param codeUser the codeUser to set
	 */
	public void setCodeUser(String codeUser) {
		this.codeUser = codeUser;
	}
   }
