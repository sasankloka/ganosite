package com.allen_sauer.gwt.log.client.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class LogClientBundle_default_InlineClientBundleGenerator implements com.allen_sauer.gwt.log.client.impl.LogClientBundle {
  private static LogClientBundle_default_InlineClientBundleGenerator _instance0 = new LogClientBundle_default_InlineClientBundleGenerator();
  private void cssInitializer() {
    css = new com.allen_sauer.gwt.log.client.impl.LogClientBundle.LogCssResource() {
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
        return "css";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".log-panel{background-color:" + ("#ecf2fc")  + ";border:" + ("1px"+ " " +"solid"+ " " +"red")  + ";margin:" + ("0")  + ";filter:" + ("alpha(" + "opacity"+ " " +"\\="+ " " +"95" + ")")  + ";opacity:" + ("0.95")  + ";z-index:" + ("1000")  + ";}.log-panel .GFWEFX-I{font-size:" + ("10pt")  + ";margin:" + ("0")  + ";text-align:" + ("right")  + ";}.log-panel BUTTON{font-size:" + ("10pt")  + ";margin:") + (("0")  + ";}.log-panel .GFWEFX-J{cursor:" + ("move")  + ";font-weight:" + ("bold")  + ";}.log-panel .GFWEFX-B{margin:" + ("0"+ " " +"1.2em")  + ";}.log-panel BUTTON.GFWEFX-A{color:" + ("#444")  + " !important;}.log-panel .GFWEFX-H{white-space:" + ("nowrap")  + ";}.log-panel .GFWEFX-C{white-space:" + ("pre")  + ";font-family:" + ("monospace")  + ";cursor:" + ("help")  + ";}.log-panel .GFWEFX-D{background-color:" + ("#f0f0f0")  + ";}.log-panel .GFWEFX-G{background-color:" + ("#fff") ) + (";}.log-panel .GFWEFX-F{cursor:" + ("sw-resize")  + ";}")) : ((".log-panel{background-color:" + ("#ecf2fc")  + ";border:" + ("1px"+ " " +"solid"+ " " +"red")  + ";margin:" + ("0")  + ";filter:" + ("alpha(" + "opacity"+ " " +"\\="+ " " +"95" + ")")  + ";opacity:" + ("0.95")  + ";z-index:" + ("1000")  + ";}.log-panel .GFWEFX-I{font-size:" + ("10pt")  + ";margin:" + ("0")  + ";text-align:" + ("left")  + ";}.log-panel BUTTON{font-size:" + ("10pt")  + ";margin:") + (("0")  + ";}.log-panel .GFWEFX-J{cursor:" + ("move")  + ";font-weight:" + ("bold")  + ";}.log-panel .GFWEFX-B{margin:" + ("0"+ " " +"1.2em")  + ";}.log-panel BUTTON.GFWEFX-A{color:" + ("#444")  + " !important;}.log-panel .GFWEFX-H{white-space:" + ("nowrap")  + ";}.log-panel .GFWEFX-C{white-space:" + ("pre")  + ";font-family:" + ("monospace")  + ";cursor:" + ("help")  + ";}.log-panel .GFWEFX-D{background-color:" + ("#f0f0f0")  + ";}.log-panel .GFWEFX-G{background-color:" + ("#fff") ) + (";}.log-panel .GFWEFX-F{cursor:" + ("se-resize")  + ";}"));
      }
      public java.lang.String logClearAbout() {
        return "GFWEFX-A";
      }
      public java.lang.String logClearButton() {
        return "GFWEFX-B";
      }
      public java.lang.String logMessage() {
        return "GFWEFX-C";
      }
      public java.lang.String logMessageHover() {
        return "GFWEFX-D";
      }
      public java.lang.String logPanel() {
        return "log-panel";
      }
      public java.lang.String logResizeSe() {
        return "GFWEFX-F";
      }
      public java.lang.String logScrollPanel() {
        return "GFWEFX-G";
      }
      public java.lang.String logStacktrace() {
        return "GFWEFX-H";
      }
      public java.lang.String logTextArea() {
        return "GFWEFX-I";
      }
      public java.lang.String logTitle() {
        return "GFWEFX-J";
      }
    }
    ;
  }
  private static class cssInitializer {
    static {
      _instance0.cssInitializer();
    }
    static com.allen_sauer.gwt.log.client.impl.LogClientBundle.LogCssResource get() {
      return css;
    }
  }
  public com.allen_sauer.gwt.log.client.impl.LogClientBundle.LogCssResource css() {
    return cssInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.allen_sauer.gwt.log.client.impl.LogClientBundle.LogCssResource css;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      css(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("css", css());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'css': return this.@com.allen_sauer.gwt.log.client.impl.LogClientBundle::css()();
    }
    return null;
  }-*/;
}
