				package com.ppp.prm.portal.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.ppp.prm.portal.client.view.LayoutPage;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class PortalTemplate implements EntryPoint {



	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		System.out.println("Entry Onload module");
		//The first screen should be the home page, not the authetification screen.
		//The authentification screen is in a seperate html page that invoke a servlet.
		RootPanel.get("root").add(new LayoutPage("SeedData"));
		// SiteClientBundle.INSTANCE.bg();
		// bg();
		//RootLayoutPanel.get("root").add(new LayoutPage("SeedData"));
	// 	RootPanel.get().add(ViewFactory.createView(TypePage.COMMENTS_LIST));
		
	}
}
