package com.ppp.prm.portal.client.service;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.ppp.prm.portal.shared.dto.ALstVal;
import com.ppp.prm.portal.shared.dto.ContextObject;
import com.ppp.prm.portal.shared.dto.MNews;
import com.ppp.prm.portal.shared.dto.ObjectUIMenu;



/**
 * The async counterpart of <code>PushService</code>.
 */
public interface PushServiceAsync {
	
	
	void addNews(MNews obj, AsyncCallback<MNews> asyncCallback);

	
	void loadGlobalList(AsyncCallback<List<ALstVal>> callback);


	void pushUIObject(ContextObject ctx,AsyncCallback<List<ObjectUIMenu>> callback);

	

	
}
