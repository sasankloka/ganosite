package com.ppp.prm.portal.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class LayoutPage_LayoutPageUiBinderImpl_GenBundle_default_InlineClientBundleGenerator implements com.ppp.prm.portal.client.view.LayoutPage_LayoutPageUiBinderImpl_GenBundle {
  private static LayoutPage_LayoutPageUiBinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new LayoutPage_LayoutPageUiBinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.ppp.prm.portal.client.view.LayoutPage_LayoutPageUiBinderImpl_GenCss_style() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "style";
      }
      public String getText() {
        return (".GFWEFX-AJ{font-weight:" + ("bold")  + ";margin:" + ("center")  + ";}");
      }
      public java.lang.String demoPushButtonDownHovering() {
        return "GFWEFX-OI";
      }
      public java.lang.String gridLayout() {
        return "GFWEFX-PI";
      }
      public java.lang.String important() {
        return "GFWEFX-AJ";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.ppp.prm.portal.client.view.LayoutPage_LayoutPageUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public com.ppp.prm.portal.client.view.LayoutPage_LayoutPageUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.ppp.prm.portal.client.view.LayoutPage_LayoutPageUiBinderImpl_GenCss_style style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'style': return this.@com.ppp.prm.portal.client.view.LayoutPage_LayoutPageUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
