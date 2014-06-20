package com.ppp.prm.portal.client.service;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.ppp.prm.portal.client.exceptions.ClientException;
import com.ppp.prm.portal.shared.dto.Comments;
import com.ppp.prm.portal.shared.dto.MComments;
import com.ppp.prm.portal.shared.dto.MTypeMain;

@RemoteServiceRelativePath("clientCommentsService")
public interface ClientCommentsService extends RemoteService {
  
	/**
	 * 	 * Get All MComments
	 * @throws ClientException when error occur
	 */
//	public List<MCommentsDTO> getMComments()throws ClientException; DetachHibernate
	public List<Comments> getComments()throws ClientException;
	public List<MTypeMain>getMain() throws ClientException;

	
	
/**
 * Create Comments
 * 
 * @param CommentsDTO CommentsDTO to create
 * @throws ClientException when error occur
 */
public void createComments(MComments CommentsDTO) throws ClientException;
}