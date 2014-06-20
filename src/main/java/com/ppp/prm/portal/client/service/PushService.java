package com.ppp.prm.portal.client.service;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.ppp.prm.portal.client.exceptions.ClientException;
import com.ppp.prm.portal.shared.dto.ALstVal;
import com.ppp.prm.portal.shared.dto.ContextObject;
import com.ppp.prm.portal.shared.dto.MNews;
import com.ppp.prm.portal.shared.dto.ObjectUIMenu;


@RemoteServiceRelativePath("pushService")
public interface PushService extends RemoteService {
	MNews addNews(MNews obj) throws ClientException;
	List<ALstVal> loadGlobalList() throws ClientException;
	List<ObjectUIMenu> pushUIObject(ContextObject ctx) throws ClientException;

}
