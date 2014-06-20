		package com.ppp.prm.portal.client.view;

import com.google.gwt.user.client.ui.Composite;


/**
 * View Factory : Create instance of the view
 *
 */
public class ViewFactory {
	/**
	 * view identiant
	 */
	public static	enum TypePage {
		COMMENTS_LIST,
		COMMENTS_CREATE,
		AUTHENTIFICATION_FORM,
		NEWS_LIST
	}

	/**
	 * create View dinamically
	 * @param ident view identifiant
	 * @return the created view
	 */
	public static Composite createView(TypePage ident) {
		Composite view = null;
		
		switch (ident) {
			case COMMENTS_LIST :
				System.out.println("Comment List");
			//	 view = new CommentsList();
				 view= new Push();
				break;
			case COMMENTS_CREATE :
			//	view = new CommentsCreate();
				break;	
			case AUTHENTIFICATION_FORM :
				view = new AuthentificationForm();
				break;
			case NEWS_LIST:
				view = new Push();
				break;
						
		}
		
		return view;
	}
}
