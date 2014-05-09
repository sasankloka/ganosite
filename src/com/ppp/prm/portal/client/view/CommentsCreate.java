package com.ppp.prm.portal.client.view;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.Widget;
import com.ppp.prm.portal.client.exceptions.ClientException;
import com.ppp.prm.portal.client.service.ClientCommentsService;
import com.ppp.prm.portal.client.service.ClientCommentsServiceAsync;
import com.ppp.prm.portal.client.view.ViewFactory.TypePage;
import com.ppp.prm.portal.shared.dto.MComments;

public class CommentsCreate extends ParentView implements HasText {

	private static CommentsCreateUiBinder uiBinder = GWT
			.create(CommentsCreateUiBinder.class);

	/**
	 * client MComment service Asynchrone
	 */
	 public ClientCommentsServiceAsync CommentsServiceAsync = (ClientCommentsServiceAsync) GWT.create(ClientCommentsService.class);

	interface CommentsCreateUiBinder extends UiBinder<Widget, CommentsCreate> {
	}

	@UiField
	Button saveBoutton;

	@UiField TextArea CommentsTxt;

	public CommentsCreate(String txt) {
		initWidget(uiBinder.createAndBindUi(this));
		// Can access @UiField after calling createAndBindUi
		saveBoutton.setText(txt);
	}


	public CommentsCreate() {
		initWidget(uiBinder.createAndBindUi(this));
		
	}

	@UiHandler("saveBoutton")
	void onClick(ClickEvent e) {
		// Access to Base donnees
		try {
			//The connected user will be obtained12\ from the server session
			MComments CommentsDTO = new MComments("12", CommentsTxt.getValue());
			
			
			
			CommentsServiceAsync.createComments(CommentsDTO,  new AsyncCallback () {

			    public void onFailure(Throwable caught) {
			    	Window.alert("RPC failed.");
				      Log.error("RPC failed." + caught.getMessage());
			    }

				@Override
				public void onSuccess(Object result) {
					//Window.alert("OK." + result);
					
					//Change the page : go to Comments list
					RootPanel.get().clear();
					RootPanel.get().add(ViewFactory.createView(TypePage.COMMENTS_LIST));
					
				}

    
			  });
			  
		} catch (ClientException ex) {
	        Window.alert("Server ERROR" + ex.getMessage());
		} catch (Exception ex) {
	        Window.alert("Client ERROR" + ex.getMessage());
		}
	}

	public void setText(String text) {
		saveBoutton.setText(text);
	}

	/**
	 * Gets invoked when the default constructor is called
	 * and a string is provided in the ui.xml file.
	 */
	public String getText() {
		return saveBoutton.getText();
	}


}
