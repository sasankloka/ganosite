package com.ppp.prm.portal.shared;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.ImageOptions;
import com.google.gwt.resources.client.ImageResource.RepeatStyle;

	
	public interface Resource extends ClientBundle {
	
		public static final Resource INSTANCE = GWT.create(Resource.class);

		
		
	@Source("com/ppp/prm/portal/shared/gmail_logo.gif")
	 @ImageOptions(repeatStyle=RepeatStyle.Both)
	 ImageResource bg();
	 
		@Source("com/ppp/prm/portal/shared/Styles.css")
		Style style();
			
		public interface Style extends CssResource{
		// String bgSprite();
		String GreenBorder();
		String GreenBorderNorth();
	   }
	}
