package com.ppp.prm.portal.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.MenuItem;
import com.google.gwt.user.client.ui.MultiWordSuggestOracle;
import com.google.gwt.user.client.ui.Widget;
import com.ppp.prm.portal.client.service.PushService;
import com.ppp.prm.portal.client.service.PushServiceAsync;
import com.ppp.prm.portal.shared.dto.MKeyword;
import com.ppp.prm.portal.shared.dto.MNews;
import com.ppp.prm.portal.shared.dto.MTypeMain;

public class AddSeedData extends Composite implements HasText {

	private final static PushServiceAsync PushService = GWT.create(PushService.class);
	private static AddSeedDataUiBinder uiBinder = GWT
			.create(AddSeedDataUiBinder.class);
	@UiField MenuItem Home;
	@UiField Button save;
	@UiField Button cancel;
	@UiField MenuBar menubar;

	interface AddSeedDataUiBinder extends UiBinder<Widget, AddSeedData> {
	}

	public AddSeedData() {
		
		initWidget(uiBinder.createAndBindUi(this));
		
		
	}
	MTypeMain ma = new MTypeMain();
	MKeyword ky = new MKeyword();
	MNews nw = new MNews();
	
	// @UiField(provided = true)
	// CellTable<CommentsDTO> cellTable; DetachHibernateUtil
	// CellTable<Comments> cellTable;
	
	 
	private final MultiWordSuggestOracle commentsSuggestions = new MultiWordSuggestOracle();
	private final MultiWordSuggestOracle mainSuggestions = new MultiWordSuggestOracle();
	private final MultiWordSuggestOracle keywordSuggestions = new MultiWordSuggestOracle();

	public AddSeedData(String firstName) {
		
	
		Command cmd = new Command() {
		      public void execute() {
		        Window.alert("You selected a menu item!");
		      }
		    };
		
			
		initWidget(uiBinder.createAndBindUi(this));
			
			 /*PushService.getAcclList("Main",mainAccl.getTextBox().getValue(),new AsyncCallback<List<String>>() {
       			@Override
       			public void onFailure(Throwable caught) { Log.debug("Add News Error: " + caught.getMessage()); }
       			@Override
       			public void onSuccess(List<String> result) {  Log.info("MainAccle is success"); mainSuggestions.addAll(result);  }
       		});*/
		
		  
	      
		menubar.addItem("About", cmd);
		
		

	        
	     
	      

	}
	
	

	

	public String getText() {
		return null;
	}





	@Override
	public void setText(String arg0) {
		// TODO Auto-generated method stub
		
	}


	@UiHandler("save")
	void onSaveClick(ClickEvent event) {
	}
	
	
	
}
