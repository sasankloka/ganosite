package com.ppp.prm.portal.client.service;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.ppp.prm.portal.client.exceptions.ClientException;
import com.ppp.prm.portal.shared.dto.Comments;
import com.ppp.prm.portal.shared.dto.MComments;
import com.ppp.prm.portal.shared.dto.MTypeMain;

public interface ClientCommentsServiceAsync {
 /**
  * Get All MComments
  * @param callback callback
  * @throws ClientException ClientException when error occur
  */
	// public void getMComments(AsyncCallback<List<MCommentsDTO>> callback) throws ClientException; DetachHibernate

	public void getComments(AsyncCallback<List<Comments>> callback) throws ClientException;
  /**
   * Create MComments
   * 
   * @param MCommentsDTO MCommentsDTO to create
   * @throws ClientException when error occur
   */
  public void createComments(MComments CommentsDTO, AsyncCallback callback) throws ClientException;

   public void getMain(AsyncCallback<List<MTypeMain>> callback);
// public void createComments(CommentsDTO commentsDTO, AsyncCallback callback);

}