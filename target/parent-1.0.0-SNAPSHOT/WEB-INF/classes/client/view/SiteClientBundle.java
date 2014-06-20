package com.ppp.prm.portal.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ClientBundle.Source;
import com.google.gwt.resources.client.ImageResource.ImageOptions;
import com.google.gwt.resources.client.ImageResource.RepeatStyle;
import com.ppp.prm.portal.shared.Resource;


public interface SiteClientBundle extends ClientBundle{
	
	public static final SiteClientBundle INSTANCE = GWT.create(SiteClientBundle.class);
	
	@Source("../../shared/images/gmail_logo.gif")
	// @ImageOptions(repeatStyle=RepeatStyle.Both)
	 ImageResource bg();
	@Source("../../shared/images/Logo_Banner.gif")
	// @ImageOptions(repeatStyle=RepeatStyle.Both)
	 ImageResource logo();
	

}
