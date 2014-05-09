package com.ppp.prm.portal.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Composite;
import com.ppp.prm.portal.client.messages.MessagesConst;

/**
 * Parent class of all the view
 * 
 * @author Abdelilah
 * 
 */
public class ParentView extends Composite {

	protected static MessagesConst messages = (MessagesConst) GWT
			.create(MessagesConst.class);

}
