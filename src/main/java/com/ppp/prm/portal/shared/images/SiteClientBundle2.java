package com.ppp.prm.portal.shared.images;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ClientBundle.Source;
import com.google.gwt.resources.client.ImageResource.ImageOptions;
import com.google.gwt.resources.client.ImageResource.RepeatStyle;
import com.ppp.prm.portal.shared.Resource;


public interface SiteClientBundle2 extends ClientBundle{
	
	public static final SiteClientBundle2 INSTANCE = GWT.create(SiteClientBundle2.class);
	@Source("com/ppp/prm/portal/shared/images/Logo_Banner.gif")
	// @ImageOptions(repeatStyle=RepeatStyle.Both)
	 ImageResource bg();
}
