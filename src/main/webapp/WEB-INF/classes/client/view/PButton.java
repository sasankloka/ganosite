package com.ppp.prm.portal.client.view;



import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.ppp.prm.portal.client.service.PushService;
import com.ppp.prm.portal.client.service.PushServiceAsync;
import com.ppp.prm.portal.shared.dto.ContextObject;
import com.ppp.prm.portal.shared.dto.ObjectUIMenu;
import java.util.List;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.InlineHTML;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.MenuItem;
import com.google.gwt.user.client.ui.MultiWordSuggestOracle;
import com.google.gwt.user.client.ui.PushButton;
import com.google.gwt.user.client.ui.RichTextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.ppp.prm.portal.client.service.PushService;
import com.ppp.prm.portal.client.service.PushServiceAsync;
import com.ppp.prm.portal.shared.dto.ContextObject;
import com.ppp.prm.portal.shared.dto.MKeyword;
import com.ppp.prm.portal.shared.dto.MNews;
import com.ppp.prm.portal.shared.dto.MTypeMain;
import com.ppp.prm.portal.shared.dto.ObjectUIMenu;
import com.google.gwt.user.client.ui.Label;

// public class Push implements EntryPoint {
	
public class PButton extends ParentView {

	
	private final static PushServiceAsync PushService = GWT.create(PushService.class);
	
	public PushButton createPushButton(final ObjectUIMenu obj)
    {
    final PushButton pushButton1 = new PushButton(obj.getMenu());
    //disable a push button
    pushButton1.setEnabled(true);
    pushButton1.setStyleName("gwt-SubMenu");
    //add a clickListener to the push button
    pushButton1.addClickHandler(new ClickHandler() {
       @Override
       public void onClick(ClickEvent event) {
    	//   selectMenuItem=obj;
	    	//  MenuSelect.setText(obj.getMenu());
	         Window.alert("You selected a Load menu item!"+obj.getMenu());
	         // inLine.setHTML(obj.getInLine());
	         // area.setText(obj.getInLine());
	         // obj.setType("SubMenu");
	         // ContextObject ctx = new ContextObject();
			 // ctx.setAction("LoadSubMenu");
			 //ctx.setObjectUi(obj);
			 // pushButton1.addStyleName("demo-PButton-down-hovering");
	   //      return(obj);
       }
    });
    return pushButton1; }
		
		
		 
}
