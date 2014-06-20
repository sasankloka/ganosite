package com.ppp.prm.portal.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.safehtml.shared.SafeUri;
import com.google.gwt.safehtml.shared.UriUtils;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class LayoutPage_LayoutPageUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.ppp.prm.portal.client.view.LayoutPage>, com.ppp.prm.portal.client.view.LayoutPage.LayoutPageUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("Welcome to Ganosys LLC..,")
    SafeHtml html1();
     
    @Template("<span id='{0}'></span>")
    SafeHtml html2(String arg0);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.ppp.prm.portal.client.view.LayoutPage owner) {


    return new Widgets(owner).get_f_SplitLayoutPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.ppp.prm.portal.client.view.LayoutPage owner;


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onClick((com.google.gwt.event.dom.client.ClickEvent) event);
      }
    };

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onSubMenuClick((com.google.gwt.event.dom.client.ClickEvent) event);
      }
    };

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onPurgeClick((com.google.gwt.event.dom.client.ClickEvent) event);
      }
    };

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames4 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onShowAllClick((com.google.gwt.event.dom.client.ClickEvent) event);
      }
    };

    public Widgets(final com.ppp.prm.portal.client.view.LayoutPage owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_menubar();  // more than one getter call detected. Type: DEFAULT, precedence: 3
    }

    SafeHtml template_html1() {
      return template.html1();
    }
    SafeHtml template_html2() {
      return template.html2(get_domId0());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.ppp.prm.portal.client.view.LayoutPage_LayoutPageUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.ppp.prm.portal.client.view.LayoutPage_LayoutPageUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.ppp.prm.portal.client.view.LayoutPage_LayoutPageUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.ppp.prm.portal.client.view.LayoutPage_LayoutPageUiBinderImpl_GenBundle) GWT.create(com.ppp.prm.portal.client.view.LayoutPage_LayoutPageUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for res called 0 times. Type: IMPORTED. Build precedence: 1.
     */
    private com.ppp.prm.portal.shared.Resource get_res() {
      return build_res();
    }
    private com.ppp.prm.portal.shared.Resource build_res() {
      // Creation section.
      final com.ppp.prm.portal.shared.Resource res = (com.ppp.prm.portal.shared.Resource) GWT.create(com.ppp.prm.portal.shared.Resource.class);
      // Setup section.


      return res;
    }

    /**
     * Getter for imageRes called 0 times. Type: IMPORTED. Build precedence: 1.
     */
    private com.ppp.prm.portal.client.view.SiteClientBundle get_imageRes() {
      return build_imageRes();
    }
    private com.ppp.prm.portal.client.view.SiteClientBundle build_imageRes() {
      // Creation section.
      final com.ppp.prm.portal.client.view.SiteClientBundle imageRes = (com.ppp.prm.portal.client.view.SiteClientBundle) GWT.create(com.ppp.prm.portal.client.view.SiteClientBundle.class);
      // Setup section.


      return imageRes;
    }

    /**
     * Getter for style called 0 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.ppp.prm.portal.client.view.LayoutPage_LayoutPageUiBinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private com.ppp.prm.portal.client.view.LayoutPage_LayoutPageUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      final com.ppp.prm.portal.client.view.LayoutPage_LayoutPageUiBinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();


      return style;
    }

    /**
     * Getter for f_SplitLayoutPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.SplitLayoutPanel get_f_SplitLayoutPanel1() {
      return build_f_SplitLayoutPanel1();
    }
    private com.google.gwt.user.client.ui.SplitLayoutPanel build_f_SplitLayoutPanel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.SplitLayoutPanel f_SplitLayoutPanel1 = (com.google.gwt.user.client.ui.SplitLayoutPanel) GWT.create(com.google.gwt.user.client.ui.SplitLayoutPanel.class);
      // Setup section.
      f_SplitLayoutPanel1.addWest(get_f_AbsolutePanel2(), 162.0);
      f_SplitLayoutPanel1.addEast(get_f_Label3(), .1);
      f_SplitLayoutPanel1.addSouth(get_f_Label4(), .1);
      f_SplitLayoutPanel1.addNorth(get_f_VerticalPanel5(), 115.0);
      f_SplitLayoutPanel1.addSouth(get_svp(), 218.0);
      f_SplitLayoutPanel1.add(get_vp());
      f_SplitLayoutPanel1.setStyleName("Split-Layout");
      f_SplitLayoutPanel1.setHeight("1000px");
      f_SplitLayoutPanel1.setWidth("100%");


      return f_SplitLayoutPanel1;
    }

    /**
     * Getter for f_AbsolutePanel2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.AbsolutePanel get_f_AbsolutePanel2() {
      return build_f_AbsolutePanel2();
    }
    private com.google.gwt.user.client.ui.AbsolutePanel build_f_AbsolutePanel2() {
      // Creation section.
      final com.google.gwt.user.client.ui.AbsolutePanel f_AbsolutePanel2 = (com.google.gwt.user.client.ui.AbsolutePanel) GWT.create(com.google.gwt.user.client.ui.AbsolutePanel.class);
      // Setup section.
      f_AbsolutePanel2.add(get_mLabel(), 7, 10);
      f_AbsolutePanel2.add(get_Purge(), 0, 0);
      f_AbsolutePanel2.add(get_MenuSelect(), 7, 68);
      f_AbsolutePanel2.add(get_subMenuTxt(), 33, 87);
      f_AbsolutePanel2.add(get_subMenuGrid(), 27, 144);
      f_AbsolutePanel2.add(get_subMenuButton(), 7, 108);
      f_AbsolutePanel2.add(get_addMenuText(), 27, 43);
      f_AbsolutePanel2.add(get_addMenu(), 7, 68);
      f_AbsolutePanel2.add(get_ShowAll(), 96, 0);
      f_AbsolutePanel2.add(get_menuIndex(), 7, 43);
      f_AbsolutePanel2.add(get_submenuIndex(), 7, 87);
      f_AbsolutePanel2.setStyleName("gWest-Ga");
      f_AbsolutePanel2.setHeight("100%");
      f_AbsolutePanel2.setWidth("100%");


      return f_AbsolutePanel2;
    }

    /**
     * Getter for mLabel called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Label get_mLabel() {
      return build_mLabel();
    }
    private com.google.gwt.user.client.ui.Label build_mLabel() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label mLabel = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      mLabel.setText("Left");
      mLabel.setStyleName("gwt-Label-Left");
      mLabel.setHeight("34px");
      mLabel.setWidth("68px");


      this.owner.mLabel = mLabel;

      return mLabel;
    }

    /**
     * Getter for Purge called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Button get_Purge() {
      return build_Purge();
    }
    private com.google.gwt.user.client.ui.Button build_Purge() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button Purge = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      Purge.setText("Purge");
      Purge.setHeight("45");
      Purge.setWidth("45");
      Purge.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3);


      this.owner.Purge = Purge;

      return Purge;
    }

    /**
     * Getter for MenuSelect called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Label get_MenuSelect() {
      return build_MenuSelect();
    }
    private com.google.gwt.user.client.ui.Label build_MenuSelect() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label MenuSelect = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      MenuSelect.setText("Default");
      MenuSelect.setHeight("18px");
      MenuSelect.setWidth("71px");


      this.owner.MenuSelect = MenuSelect;

      return MenuSelect;
    }

    /**
     * Getter for subMenuTxt called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.TextBox get_subMenuTxt() {
      return build_subMenuTxt();
    }
    private com.google.gwt.user.client.ui.TextBox build_subMenuTxt() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox subMenuTxt = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      subMenuTxt.setHeight("16px");
      subMenuTxt.setWidth("113px");


      this.owner.subMenuTxt = subMenuTxt;

      return subMenuTxt;
    }

    /**
     * Getter for subMenuGrid called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Grid get_subMenuGrid() {
      return build_subMenuGrid();
    }
    private com.google.gwt.user.client.ui.Grid build_subMenuGrid() {
      // Creation section.
      final com.google.gwt.user.client.ui.Grid subMenuGrid = (com.google.gwt.user.client.ui.Grid) GWT.create(com.google.gwt.user.client.ui.Grid.class);
      // Setup section.
      subMenuGrid.resize(1, 0);
      subMenuGrid.setStyleName("gwt-Abs-West");
      subMenuGrid.setHeight("90");
      subMenuGrid.setWidth("70%");
      subMenuGrid.setCellSpacing(1);
      subMenuGrid.setCellPadding(1);


      this.owner.subMenuGrid = subMenuGrid;

      return subMenuGrid;
    }

    /**
     * Getter for subMenuButton called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Button get_subMenuButton() {
      return build_subMenuButton();
    }
    private com.google.gwt.user.client.ui.Button build_subMenuButton() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button subMenuButton = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      subMenuButton.setStyleName("h1");
      subMenuButton.setText("AddSubMenu");
      subMenuButton.setHeight("18px");
      subMenuButton.setWidth("129px");
      subMenuButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);


      this.owner.subMenuButton = subMenuButton;

      return subMenuButton;
    }

    /**
     * Getter for addMenuText called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.TextBox get_addMenuText() {
      return build_addMenuText();
    }
    private com.google.gwt.user.client.ui.TextBox build_addMenuText() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox addMenuText = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      addMenuText.setHeight("12px");
      addMenuText.setMaxLength(100);
      addMenuText.setWidth("96px");


      this.owner.addMenuText = addMenuText;

      return addMenuText;
    }

    /**
     * Getter for addMenu called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Button get_addMenu() {
      return build_addMenu();
    }
    private com.google.gwt.user.client.ui.Button build_addMenu() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button addMenu = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      addMenu.setText("Add Menu");
      addMenu.setHeight("18px");
      addMenu.setWidth("145px");
      addMenu.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);


      this.owner.addMenu = addMenu;

      return addMenu;
    }

    /**
     * Getter for ShowAll called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Button get_ShowAll() {
      return build_ShowAll();
    }
    private com.google.gwt.user.client.ui.Button build_ShowAll() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button ShowAll = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      ShowAll.setText("Show All");
      ShowAll.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames4);


      this.owner.ShowAll = ShowAll;

      return ShowAll;
    }

    /**
     * Getter for menuIndex called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.TextBox get_menuIndex() {
      return build_menuIndex();
    }
    private com.google.gwt.user.client.ui.TextBox build_menuIndex() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox menuIndex = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      menuIndex.setHeight("13px");
      menuIndex.setWidth("13px");


      this.owner.menuIndex = menuIndex;

      return menuIndex;
    }

    /**
     * Getter for submenuIndex called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.TextBox get_submenuIndex() {
      return build_submenuIndex();
    }
    private com.google.gwt.user.client.ui.TextBox build_submenuIndex() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox submenuIndex = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      submenuIndex.setHeight("13px");
      submenuIndex.setWidth("20px");


      this.owner.submenuIndex = submenuIndex;

      return submenuIndex;
    }

    /**
     * Getter for f_Label3 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label3() {
      return build_f_Label3();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label3() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label3 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label3.setText("Left");


      return f_Label3;
    }

    /**
     * Getter for f_Label4 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label4() {
      return build_f_Label4();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label4() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label4 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label4.setText("Bottom");


      return f_Label4;
    }

    /**
     * Getter for vp called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_vp() {
      return build_vp();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_vp() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel vp = new com.google.gwt.user.client.ui.HTMLPanel(template_html2().asString());
      // Setup section.
      vp.setStyleName("gwt-inLine-Pannel");
      vp.setHeight("100%");
      vp.setWidth("90%");

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(vp.getElement());
      get_domId0Element().get();

      // Detach section.
      attachRecord0.detach();
      vp.addAndReplaceElement(get_inLine(), get_domId0Element().get());

      this.owner.vp = vp;

      return vp;
    }

    /**
     * Getter for domId0 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId0;
    private java.lang.String get_domId0() {
      return domId0;
    }
    private java.lang.String build_domId0() {
      // Creation section.
      domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId0;
    }

    /**
     * Getter for inLine called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.HTML get_inLine() {
      return build_inLine();
    }
    private com.google.gwt.user.client.ui.HTML build_inLine() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTML inLine = (com.google.gwt.user.client.ui.HTML) GWT.create(com.google.gwt.user.client.ui.HTML.class);
      // Setup section.
      inLine.setHTML(template_html1().asString());
      inLine.setStyleName("gwt-gano-inLine");
      inLine.setHeight("100%");
      inLine.setWidth("100%");


      this.owner.inLine = inLine;

      return inLine;
    }

    /**
     * Getter for domId0Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId0Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId0Element() {
      return domId0Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId0Element() {
      // Creation section.
      domId0Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId0());
      // Setup section.


      return domId0Element;
    }

    /**
     * Getter for f_VerticalPanel5 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.VerticalPanel get_f_VerticalPanel5() {
      return build_f_VerticalPanel5();
    }
    private com.google.gwt.user.client.ui.VerticalPanel build_f_VerticalPanel5() {
      // Creation section.
      final com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel5 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
      // Setup section.
      f_VerticalPanel5.add(get_f_Image6());
      f_VerticalPanel5.add(get_menubar());
      f_VerticalPanel5.setCellWidth(get_menubar(), "90%");
      f_VerticalPanel5.setCellHeight(get_menubar(), "20%");
      f_VerticalPanel5.setStyleName("gwt-North");
      f_VerticalPanel5.setHeight("50%");
      f_VerticalPanel5.setBorderWidth(0);
      f_VerticalPanel5.setWidth("90%");


      return f_VerticalPanel5;
    }

    /**
     * Getter for f_Image6 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Image get_f_Image6() {
      return build_f_Image6();
    }
    private com.google.gwt.user.client.ui.Image build_f_Image6() {
      // Creation section.
      final com.google.gwt.user.client.ui.Image f_Image6 = (com.google.gwt.user.client.ui.Image) GWT.create(com.google.gwt.user.client.ui.Image.class);
      // Setup section.
      f_Image6.setStyleName("gwt-Image-Banner");
      f_Image6.setHeight("63px");
      f_Image6.setWidth("300px");
      f_Image6.setUrl("images/Logo_White_300_65.jpg");


      return f_Image6;
    }

    /**
     * Getter for menubar called 3 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.MenuBar menubar;
    private com.google.gwt.user.client.ui.MenuBar get_menubar() {
      return menubar;
    }
    private com.google.gwt.user.client.ui.MenuBar build_menubar() {
      // Creation section.
      menubar = (com.google.gwt.user.client.ui.MenuBar) GWT.create(com.google.gwt.user.client.ui.MenuBar.class);
      // Setup section.
      menubar.addItem(get_Home());
      menubar.setStyleName("gwt-SubMenu");
      menubar.setHeight("8px");
      menubar.setWidth("99%");


      this.owner.menubar = menubar;

      return menubar;
    }

    /**
     * Getter for Home called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.MenuItem get_Home() {
      return build_Home();
    }
    private com.google.gwt.user.client.ui.MenuItem build_Home() {
      // Creation section.
      final com.google.gwt.user.client.ui.MenuItem Home = new com.google.gwt.user.client.ui.MenuItem("", (com.google.gwt.user.client.Command) null);
      // Setup section.
      Home.setStyleName("gwt-gano-menuItem");
      Home.setText("Home");
      Home.setHeight("38");
      Home.setWidth("90");


      this.owner.Home = Home;

      return Home;
    }

    /**
     * Getter for svp called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.VerticalPanel get_svp() {
      return build_svp();
    }
    private com.google.gwt.user.client.ui.VerticalPanel build_svp() {
      // Creation section.
      final com.google.gwt.user.client.ui.VerticalPanel svp = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
      // Setup section.
      svp.setVerticalAlignment(com.google.gwt.user.client.ui.HasVerticalAlignment.ALIGN_BOTTOM);
      svp.setStyleName("gwt-south-ga");
      svp.setHeight("100%");
      svp.setWidth("90%");
      svp.setSpacing(30);


      this.owner.svp = svp;

      return svp;
    }
  }
}
