 package com.ppp.prm.portal.client.view;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;

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
//import com.google.gwt.user.client.rpc.core.java.util.Collections;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Image;
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
import com.ppp.prm.portal.client.view.SiteClientBundle;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.Window.Location;

public class LayoutPage extends Composite implements HasText {

	private final static PushServiceAsync PushService = GWT.create(PushService.class);
	public  final static SiteClientBundle image = GWT.create(SiteClientBundle.class);
	// image.
	
	private static LayoutPageUiBinder uiBinder = GWT
			.create(LayoutPageUiBinder.class);
	@UiField MenuItem Home;
	@UiField MenuBar menubar;
	 
	@UiField HTMLPanel vp;
	@UiField HTML inLine;
	@UiField Button addMenu;
	@UiField TextBox addMenuText;
	@UiField Button Purge;
	@UiField Label MenuSelect;
	@UiField TextBox subMenuTxt;
	@UiField Grid subMenuGrid;
	@UiField Button subMenuButton;
	@UiField VerticalPanel svp;
	@UiField Button ShowAll;
	
	
	@UiField TextBox menuIndex;
	@UiField TextBox submenuIndex;
	@UiField Label mLabel;

	
	  final RichTextArea area = new RichTextArea();
	interface LayoutPageUiBinder extends UiBinder<Widget, LayoutPage> {
	}

	public LayoutPage() {
		
		initWidget(uiBinder.createAndBindUi(this));
		
		
	}
	MTypeMain ma = new MTypeMain();
	MKeyword ky = new MKeyword();
	MNews nw = new MNews();
	
	// SiteClientBundle.
	// IMAGE.
	// @UiField(provided = true)
	// CellTable<CommentsDTO> cellTable; DetachHibernateUtil
	// CellTable<Comments> cellTable;
	
	private ObjectUIMenu selectMenuItem  = new  ObjectUIMenu();
	private final MultiWordSuggestOracle commentsSuggestions = new MultiWordSuggestOracle();
	private final MultiWordSuggestOracle mainSuggestions = new MultiWordSuggestOracle();
	private final MultiWordSuggestOracle keywordSuggestions = new MultiWordSuggestOracle();

	public LayoutPage(String firstName) {
		
		
		// RichTextArea txtArea = new RichTextArea();
		// RichTextToolbar Rtb = new RichTextToolbar(txtArea);
	
		
		//    vp.add(Rtb);
		 //   vp.add(txtArea);
		    initWidget(uiBinder.createAndBindUi(this));	
		    Button txtSave = new Button();
		    Button txtSaveHtml = new Button();
		    Button txtCancel = new Button();
		    Button txtDelete = new Button();
		 //     image.bg()
		  
		    area.ensureDebugId("cwRichText-area");
		    area.setSize("70%", "70%");
		    RichTextToolbar toolbar = new RichTextToolbar(area);
		    toolbar.ensureDebugId("cwRichText-toolbar");
		    toolbar.setWidth("100%");
		    toolbar.setHeight("20%");

		    // Add the components to a panel
		    Grid grid = new Grid(4, 4);
		    grid.setStyleName("cw-RichText");
		     grid.setWidget(0, 0, toolbar);
		    grid.setWidget(1, 0, area);
		    grid.setWidget(1,1,txtSave);
		    grid.setWidget(1,2,txtSaveHtml);
		    grid.setWidget(1, 3,txtCancel);
		    txtSave.setText("Save");
		    txtSaveHtml.setText("Save As Html");
		    txtCancel.setText("Cancel");
		    
		    subMenuGrid.resize(10,2);
		    txtSave.addClickHandler(new ClickHandler() {
				@Override
			public void onClick(ClickEvent event) {
					ContextObject ctx = new ContextObject();
					ObjectUIMenu obj  = new  ObjectUIMenu();
					// obj.setInLine(area.getHTML());
					if(selectMenuItem != null)
					{   //selectMenuItem.setType("Menu");
						ctx.setAction("SaveInLineText");
						selectMenuItem.setInLine(area.getText());
						MenuSelect.setText(selectMenuItem.getMenu());
						ctx.setObjectUi(selectMenuItem);
						Window.alert("Selected Menu Item Id"+selectMenuItem.getId());
						area.setHTML("");
					} else Window.alert("Select a Menu Item");
					// ctx.setObjectUi(selectMenuItem);
					ctx.setAction("SaveInLineText");
					// ctx.setObjectUi(obj);
					callPush(ctx);
				}  });
		    txtSaveHtml.addClickHandler(new ClickHandler() {
				@Override
			public void onClick(ClickEvent event) {
					ContextObject ctx = new ContextObject();
					ObjectUIMenu obj  = new  ObjectUIMenu();
					// obj.setInLine(area.getHTML());
					if(selectMenuItem != null)
					{   //selectMenuItem.setType("Menu");
						selectMenuItem.setInLine(area.getHTML());
						MenuSelect.setText(selectMenuItem.getMenu());
						ctx.setObjectUi(selectMenuItem);
						Window.alert("Selected Menu Item Id"+selectMenuItem.getId());
						area.setHTML("");
					} else Window.alert("Select a Menu Item");
					// ctx.setObjectUi(selectMenuItem);
					ctx.setAction("SaveInLineText");
					// ctx.setObjectUi(obj);
					callPush(ctx);
				}  });
		    
		    
		    txtCancel.addClickHandler(new ClickHandler() {
				@Override
			public void onClick(ClickEvent event) {
					area.setHTML(inLine.getHTML().toString());	}  });
		    
		    ContextObject ctx = new ContextObject();
			ctx.setAction("LoadMenu");
		//	ctx.setObjectUi(obj);
			callPush(ctx);  
			
			Command homeCmd = new Command() {
			      public void execute() {
			    	  selectMenuItem= null;
			    	  Window.Location.reload();
			          addMenuText.setText(""); } };
		Home.setCommand(homeCmd);
		
		//vp.insert(grid,1);
	svp.add(grid);  // Enable Richtext tool bar
	
	Image ig= new Image(image.logo());
	ig.setPixelSize(40, 40);
	// image.logo().getSafeUri();
	inLine.setHTML("<IMG src='./images/Logo_Banner.gif'  alt=" +ig.getUrl()+" height='1024' width='768'>" ) ;
	//inLine.set;
	svp.add(ig);
	Image ig2= new Image(image.bg());
	ig2.setStyleName("gwt-gano-inLine");
	svp.add(ig2);
	// vp.add(ig.asWidget());
// 	inLineig2.asWidget() );
	
	//inLine.setLayoutData(ig.asWidget());
//	Window.alert("Image URI"+image.bg().getSafeUri());

	
	}
	
		
	public void callPush(final ContextObject ctx)
	{
		PushService.pushUIObject(ctx, new AsyncCallback<List <ObjectUIMenu>> () {  

		    public void onFailure(Throwable caught) {
		    	Window.alert("RPC failed."+ctx.getAction());
			      Log.error("RPC failed." + ctx.getAction() +" "+caught.getMessage());
		    }

			@Override
			public void onSuccess(List <ObjectUIMenu> result) {
				
				callAction(ctx,result);
				 
			}


		  });
	}

	public PushButton createPushButton(final ObjectUIMenu obj)
    {
    final PushButton pushButton1 = new PushButton(obj.getMenu());
    //disable a push button
    pushButton1.setEnabled(true);
    pushButton1.setStyleName("gwt-gano-menuItem");
    //add a clickListener to the push button
    pushButton1.addClickHandler(new ClickHandler() {
       @Override
       public void onClick(ClickEvent event) {
    	   selectMenuItem=obj;
    	   
	    	  MenuSelect.setText(obj.getMenu());
	         Window.alert("You selected a Load menu item!"+obj.getMenu());
	         inLine.setHTML(obj.getInLine());
	         area.setText(obj.getInLine());
	         subMenuTxt.setText(obj.getMenu());
	         obj.setType("SubMenu");
	         ContextObject ctx = new ContextObject();
			 ctx.setAction("LoadSubMenu");
			 ctx.setObjectUi(obj);
			//  pushButton1.addStyleName("demo-PushButton-down-hovering");
			  mLabel.setText(obj.getMenu());
			  submenuIndex.setText(obj.getMIndex().toString());
			 
       }
    });
    return pushButton1; }
	
	public void loadSubMenu(ObjectUIMenu sub)
	{  System.out.println("You selected a Load Sub menu item!"+sub.getListMenu());
	//Implement SubMenuUpdate 
	subMenuGrid.clear();
	int i=1;
	List<ObjectUIMenu> subObjLst = sub.getListMenu();
	
	if(subObjLst!= null)
	{   	Collections.sort(subObjLst);
			 for(final ObjectUIMenu obj : subObjLst)
			 { subMenuGrid.setWidget(i++,0, createPushButton(obj));
			 System.out.println("Object Id"+obj.getId());
			 }
	}
	}	 
	
	public void loadMenu(List<ObjectUIMenu> objLst)
	{        int idx =-1; int idxL=0;
	
	Collections.sort(objLst);
	     
		for(final ObjectUIMenu obj : objLst)
		{  
			final String txt = obj.getInLine();
		Window.alert("You selected a Load menu item!"+txt + " Index" +obj.getMIndex());
			Command cmd = new Command() {
		      public void execute() {
		    	  selectMenuItem=obj;
		    	  MenuSelect.setText(selectMenuItem.getMenu());
		     //    Window.alert("You selected a Load menu item!"+txt);
		         inLine.setHTML(obj.getInLine());
		         area.setText(obj.getInLine());
		         menuIndex.setText(obj.getMIndex().toString());
		         mLabel.setText(obj.getMenu());
		         addMenuText.setText(obj.getMenu());
		         // obj.setType("SubMenu");
		         ContextObject ctx = new ContextObject();
				 ctx.setAction("LoadSubMenu");
				 ctx.setObjectUi(obj);
				 // ctx.setObjectUi(obj);/
			    //loadSubMenu(obj);
				 subMenuGrid.clear();
			//	 mStyle= "demo-PushButton-down-hovering";
				 callPush(ctx);
				
				 
			  }
		    };
		    MenuItem mn = new MenuItem(obj.getMenu(),cmd);
		   
		    mn.addStyleName("gwt-gano-menuItem");
		 //  int idex= (int) obj.getMIndex().trim();
		    
		    menubar.addItem(mn);
	
		}
	} 
	
	
public void callAction(ContextObject ctx,List<ObjectUIMenu> result)
{
	if(ctx.getAction().equals("SaveInLineText") && result.size() > 0 )
	inLine.setHTML(result.get(0).getInLine());
	if(ctx.getAction().equals("SaveMenu") && result.size() > 0 )
	{  final ObjectUIMenu obj = result.get(0);
	Window.alert("Menu item added!"+obj.getId());
		Command cmd = new Command() {
	      public void execute() {
	        Window.alert("You selected a menu item!"+obj.getId());
	        // selectMenuItem=null;	
	        selectMenuItem.SetObjectUIMenu(obj);
	        MenuSelect.setText(selectMenuItem.getMenu());
	        inLine.setHTML(obj.getInLine());
	        loadSubMenu(obj);
	        
	      }
	    };
	    MenuItem mn = new MenuItem(ctx.getObjectUi().getMenu(),cmd);
	    menubar.addItem(mn);
	}
	if(ctx.getAction().equals("LoadMenu")) 	
		{loadMenu(result);}
	if( ctx.getAction().equals("PurgeMenu"))
		{menubar.clearItems();subMenuGrid.clear();}
	if(ctx.getAction().equals("SaveSubMenu"))
		loadSubMenu(result.get(0));
	
	if(ctx.getAction().equals("LoadSubMenu"))
		{ if(result.size()>0)loadSubMenu(result.get(0));}
	// ctx.
}

	public String getText() {
		return null;
	}



	@UiHandler("addMenu")
	void onClick(ClickEvent e) {
		// Change the page : go to Comments create
		if(!addMenuText.getText().isEmpty())
		{ 
			Window.alert("You are adding Menu with Current Type !"+selectMenuItem.getType() +" Id "+selectMenuItem.getId());
			ContextObject ctx = new ContextObject();
			 ctx.setAction("SaveMenu");
			 Integer mIndex=  Integer.valueOf(menuIndex.getText()).intValue();
		if(selectMenuItem.getId() == 0)
		{  ObjectUIMenu obj  = new  ObjectUIMenu();
		//  obj.setInLine(area.getHTML());
		  obj.setMenu(addMenuText.getText());
		  obj.setType("Menu");
		  obj.setMIndex(mIndex);
		//  obj.setInLine(area.getHTML());
	//	  ctx.setType("Menu");
		 ctx.setObjectUi(obj);
		} else {selectMenuItem.setMIndex(mIndex);   selectMenuItem.setMenu(addMenuText.getText());ctx.setObjectUi(selectMenuItem);}
		  callPush(ctx);
			
		}

	}
	
	// Adding SubMenu
	@UiHandler("subMenuButton")
	void onSubMenuClick(ClickEvent eSubMenu) {
		// Change the page : go to Comments create
		//selectMenuItem
		
		if(!subMenuTxt.getText().isEmpty() && selectMenuItem.getId() > 0)
		{ ContextObject ctx = new ContextObject();
		 Integer mIndex=  Integer.valueOf(submenuIndex.getText()).intValue();
	//	Window.alert("You selected a Save Sub menu item!"+selectMenuItem.getType());
		if( selectMenuItem.getType().equals("Menu") ) 
		{ ObjectUIMenu obj  =  new  ObjectUIMenu();
		//  obj.setInLine(area.getHTML());
		// Window.alert("You selected a Save Sub menu item! List Menu "+selectMenuItem.getListMenu());
		  obj.setMenu(subMenuTxt.getText());
		
		  obj.setMIndex(mIndex);
		  obj.setType("SubMenu");
		  selectMenuItem.setSubMenu(obj);
		//  Window.alert("You selected a Save Sub menu item! List Menu "+selectMenuItem.getListMenu());
		} 
		else if(selectMenuItem.getType().equals("SubMenu")) 
			selectMenuItem.setMenu(subMenuTxt.getText());
		   selectMenuItem.setMIndex(mIndex);
		//  obj.setInLine(area.getHTML());
	//	  ctx.setType("Menu");
		  Window.alert("You selected a Change Sub menu item!"+selectMenuItem.getId());
		  ctx.setAction("SaveSubMenu");
		  ctx.setObjectUi(selectMenuItem); // Save the parent object
		  callPush(ctx);
			
		}

	}
	
	
	@UiHandler("Purge")
	void onPurgeClick(ClickEvent e)
	{ Window.alert("You clicked Purge");
		ContextObject ctx = new ContextObject();
		ctx.setType("Menu");
		  ctx.setAction("PurgeMenu");
		  ObjectUIMenu obj  = new  ObjectUIMenu();
		  ctx.setObjectUi(obj);
		  callPush(ctx);
		  
	}
	
	@UiHandler("ShowAll")
	void onShowAllClick(ClickEvent e)
	{ Window.alert("You clicked ShowAll");
		ContextObject ctx = new ContextObject();
		ctx.setType("Menu");
		  ctx.setAction("ShowObjects");
		  ObjectUIMenu obj  = new  ObjectUIMenu();
		  ctx.setObjectUi(obj);
		  callPush(ctx);
		  
	}


	@Override
	public void setText(String arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
