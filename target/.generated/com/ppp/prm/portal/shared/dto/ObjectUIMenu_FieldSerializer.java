package com.ppp.prm.portal.shared.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ObjectUIMenu_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.util.Date getCreated(com.ppp.prm.portal.shared.dto.ObjectUIMenu instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.ObjectUIMenu::created;
  }-*/;
  
  private static native void setCreated(com.ppp.prm.portal.shared.dto.ObjectUIMenu instance, java.util.Date value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.ObjectUIMenu::created = value;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native long getId(com.ppp.prm.portal.shared.dto.ObjectUIMenu instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.ObjectUIMenu::id;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native void setId(com.ppp.prm.portal.shared.dto.ObjectUIMenu instance, long value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.ObjectUIMenu::id = value;
  }-*/;
  
  private static native java.lang.String getInLine(com.ppp.prm.portal.shared.dto.ObjectUIMenu instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.ObjectUIMenu::inLine;
  }-*/;
  
  private static native void setInLine(com.ppp.prm.portal.shared.dto.ObjectUIMenu instance, java.lang.String value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.ObjectUIMenu::inLine = value;
  }-*/;
  
  private static native java.util.List getListMenu(com.ppp.prm.portal.shared.dto.ObjectUIMenu instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.ObjectUIMenu::listMenu;
  }-*/;
  
  private static native void setListMenu(com.ppp.prm.portal.shared.dto.ObjectUIMenu instance, java.util.List value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.ObjectUIMenu::listMenu = value;
  }-*/;
  
  private static native java.lang.Integer getMIndex(com.ppp.prm.portal.shared.dto.ObjectUIMenu instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.ObjectUIMenu::mIndex;
  }-*/;
  
  private static native void setMIndex(com.ppp.prm.portal.shared.dto.ObjectUIMenu instance, java.lang.Integer value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.ObjectUIMenu::mIndex = value;
  }-*/;
  
  private static native java.lang.String getMenu(com.ppp.prm.portal.shared.dto.ObjectUIMenu instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.ObjectUIMenu::menu;
  }-*/;
  
  private static native void setMenu(com.ppp.prm.portal.shared.dto.ObjectUIMenu instance, java.lang.String value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.ObjectUIMenu::menu = value;
  }-*/;
  
  private static native java.lang.Integer getParentId(com.ppp.prm.portal.shared.dto.ObjectUIMenu instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.ObjectUIMenu::parentId;
  }-*/;
  
  private static native void setParentId(com.ppp.prm.portal.shared.dto.ObjectUIMenu instance, java.lang.Integer value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.ObjectUIMenu::parentId = value;
  }-*/;
  
  private static native java.lang.String getRid(com.ppp.prm.portal.shared.dto.ObjectUIMenu instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.ObjectUIMenu::rid;
  }-*/;
  
  private static native void setRid(com.ppp.prm.portal.shared.dto.ObjectUIMenu instance, java.lang.String value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.ObjectUIMenu::rid = value;
  }-*/;
  
  private static native com.ppp.prm.portal.shared.dto.ObjectUIMenu getSubMenu(com.ppp.prm.portal.shared.dto.ObjectUIMenu instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.ObjectUIMenu::subMenu;
  }-*/;
  
  private static native void setSubMenu(com.ppp.prm.portal.shared.dto.ObjectUIMenu instance, com.ppp.prm.portal.shared.dto.ObjectUIMenu value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.ObjectUIMenu::subMenu = value;
  }-*/;
  
  private static native java.lang.String getType(com.ppp.prm.portal.shared.dto.ObjectUIMenu instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.ObjectUIMenu::type;
  }-*/;
  
  private static native void setType(com.ppp.prm.portal.shared.dto.ObjectUIMenu instance, java.lang.String value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.ObjectUIMenu::type = value;
  }-*/;
  
  private static native java.util.Date getUpdated(com.ppp.prm.portal.shared.dto.ObjectUIMenu instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.ObjectUIMenu::updated;
  }-*/;
  
  private static native void setUpdated(com.ppp.prm.portal.shared.dto.ObjectUIMenu instance, java.util.Date value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.ObjectUIMenu::updated = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.ppp.prm.portal.shared.dto.ObjectUIMenu instance) throws SerializationException {
    setCreated(instance, (java.util.Date) streamReader.readObject());
    setId(instance, streamReader.readLong());
    setInLine(instance, streamReader.readString());
    setListMenu(instance, (java.util.List) streamReader.readObject());
    setMIndex(instance, (java.lang.Integer) streamReader.readObject());
    setMenu(instance, streamReader.readString());
    setParentId(instance, (java.lang.Integer) streamReader.readObject());
    setRid(instance, streamReader.readString());
    setSubMenu(instance, (com.ppp.prm.portal.shared.dto.ObjectUIMenu) streamReader.readObject());
    setType(instance, streamReader.readString());
    setUpdated(instance, (java.util.Date) streamReader.readObject());
    
  }
  
  public static com.ppp.prm.portal.shared.dto.ObjectUIMenu instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.ppp.prm.portal.shared.dto.ObjectUIMenu();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.ppp.prm.portal.shared.dto.ObjectUIMenu instance) throws SerializationException {
    streamWriter.writeObject(getCreated(instance));
    streamWriter.writeLong(getId(instance));
    streamWriter.writeString(getInLine(instance));
    streamWriter.writeObject(getListMenu(instance));
    streamWriter.writeObject(getMIndex(instance));
    streamWriter.writeString(getMenu(instance));
    streamWriter.writeObject(getParentId(instance));
    streamWriter.writeString(getRid(instance));
    streamWriter.writeObject(getSubMenu(instance));
    streamWriter.writeString(getType(instance));
    streamWriter.writeObject(getUpdated(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.ppp.prm.portal.shared.dto.ObjectUIMenu_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.ppp.prm.portal.shared.dto.ObjectUIMenu_FieldSerializer.deserialize(reader, (com.ppp.prm.portal.shared.dto.ObjectUIMenu)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.ppp.prm.portal.shared.dto.ObjectUIMenu_FieldSerializer.serialize(writer, (com.ppp.prm.portal.shared.dto.ObjectUIMenu)object);
  }
  
}
