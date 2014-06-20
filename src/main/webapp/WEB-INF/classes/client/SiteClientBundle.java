package com.ppp.prm.portal.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ClientBundle.Source;
import com.google.gwt.resources.client.ImageResource.ImageOptions;
import com.google.gwt.resources.client.ImageResource.RepeatStyle;
import com.ppp.prm.portal.shared.Resource;


public interface SiteClientBundle extends ClientBundle{
	
	public static final SiteClientBundle INSTANCE = GWT.create(SiteClientBundle.class);
	
	@Source("com/ppp/prm/portal/shared/images/Logo_Banner.gif")
	// @ImageOptions(repeatStyle=RepeatStyle.Both)
	 ImageResource bg();
	

}
