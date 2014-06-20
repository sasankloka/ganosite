/**
 * 
 */
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
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.ppp.prm.portal.client.exceptions.ClientException;
import com.ppp.prm.portal.client.service.AuthentificationService;
import com.ppp.prm.portal.client.service.AuthentificationServiceAsync;
import com.ppp.prm.portal.client.view.ViewFactory.TypePage;
import com.ppp.prm.portal.shared.dto.UserDTO;

/**
 * @author Abdelilah
 *
 */
public class AuthentificationForm extends ParentView implements HasText {

	private static AuthentificationFormUiBinder uiBinder = GWT
			.create(AuthentificationFormUiBinder.class);
	
	/**
	 * authentification Service Asynchrone
	 */
	 private AuthentificationServiceAsync authentificationServiceAsync = (AuthentificationServiceAsync) GWT.create(AuthentificationService.class);


	interface AuthentificationFormUiBinder extends
			UiBinder<Widget, AuthentificationForm> {
	}

	/**
	 * Because this class has a default constructor, it can
	 * be used as a binder template. In other words, it can be used in other
	 * *.ui.xml files as follows:
	 * <ui:UiBinder xmlns:ui="urn:ui:com.google.gwt.uibinder"
	 *   xmlns:g="urn:import:**user's package**">
	 *  <g:**UserClassName**>Hello!</g:**UserClassName>
	 * </ui:UiBinder>
	 * Note that depending on the widget that is used, it may be necessary to
	 * implement HasHTML instead of HasText.
	 */
	public AuthentificationForm() {
		initWidget(uiBinder.createAndBindUi(this));
	//	String linkServlet = GWT.getModuleBaseURL() + "AuthentificationServlet";
	//	String linkPicture = GWT.getModuleBaseURL() + "image/gmail_logo.gif";
	//	blocHtml.setHTML("<a href='" + linkServlet + "'>ceci est link<img src='"+ linkPicture+ "'/> </a>");
	}

	@UiField
	Button LoginBoutton;
	@UiField TextBox loginTxt;
	@UiField TextBox passTxt;

	//@UiField HTML blocHtml;

	public AuthentificationForm(String txt) {
		initWidget(uiBinder.createAndBindUi(this));

		// Can access @UiField after calling createAndBindUi
		LoginBoutton.setText(txt);
	}

	@UiHandler("LoginBoutton")
	void onClick(ClickEvent e) {
		try {
			UserDTO userDTO = new UserDTO(loginTxt.getValue(),passTxt.getValue());
			
			
			
			authentificationServiceAsync.checkUser(userDTO,  new AsyncCallback <Boolean>() {

			    public void onFailure(Throwable caught) {
			    	Window.alert("RPC failed.");
			      Log.error("RPC failed." + caught.getMessage());
			    }

				@Override
				public void onSuccess(Boolean result) {
					//Window.alert("OK." + result);
					if (result)
					{
						Log.debug("login suceess");
					//Change the page : go to MComments create
					RootPanel.get().clear();
					RootPanel.get().add(ViewFactory.createView(TypePage.COMMENTS_CREATE));
					}
					else
					{
						Window.alert("Bad login/password.");
					}
				}

    
			  });
			  
		} catch (ClientException ex) {
	        Window.alert("Server ERROR" + ex.getMessage());
		} catch (Exception ex) {
	        Window.alert("Client ERROR" + ex.getMessage());
		}

	}

	public void setText(String text) {
		LoginBoutton.setText(text);
	}

	/**
	 * Gets invoked when the default constructor is called
	 * and a string is provided in the ui.xml file.
	 */
	public String getText() {
		return LoginBoutton.getText();
	}

}
