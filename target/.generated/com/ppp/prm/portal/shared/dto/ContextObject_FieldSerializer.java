package com.ppp.prm.portal.shared.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ContextObject_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getAction(com.ppp.prm.portal.shared.dto.ContextObject instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.ContextObject::action;
  }-*/;
  
  private static native void setAction(com.ppp.prm.portal.shared.dto.ContextObject instance, java.lang.String value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.ContextObject::action = value;
  }-*/;
  
  private static native java.util.Date getCreated(com.ppp.prm.portal.shared.dto.ContextObject instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.ContextObject::created;
  }-*/;
  
  private static native void setCreated(com.ppp.prm.portal.shared.dto.ContextObject instance, java.util.Date value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.ContextObject::created = value;
  }-*/;
  
  private static native int getId(com.ppp.prm.portal.shared.dto.ContextObject instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.ContextObject::id;
  }-*/;
  
  private static native void setId(com.ppp.prm.portal.shared.dto.ContextObject instance, int value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.ContextObject::id = value;
  }-*/;
  
  private static native com.ppp.prm.portal.shared.dto.ObjectUIMenu getObjUi(com.ppp.prm.portal.shared.dto.ContextObject instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.ContextObject::objUi;
  }-*/;
  
  private static native void setObjUi(com.ppp.prm.portal.shared.dto.ContextObject instance, com.ppp.prm.portal.shared.dto.ObjectUIMenu value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.ContextObject::objUi = value;
  }-*/;
  
  private static native java.lang.Integer getParentId(com.ppp.prm.portal.shared.dto.ContextObject instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.ContextObject::parentId;
  }-*/;
  
  private static native void setParentId(com.ppp.prm.portal.shared.dto.ContextObject instance, java.lang.Integer value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.ContextObject::parentId = value;
  }-*/;
  
  private static native java.lang.String getRid(com.ppp.prm.portal.shared.dto.ContextObject instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.ContextObject::rid;
  }-*/;
  
  private static native void setRid(com.ppp.prm.portal.shared.dto.ContextObject instance, java.lang.String value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.ContextObject::rid = value;
  }-*/;
  
  private static native java.lang.String getType(com.ppp.prm.portal.shared.dto.ContextObject instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.ContextObject::type;
  }-*/;
  
  private static native void setType(com.ppp.prm.portal.shared.dto.ContextObject instance, java.lang.String value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.ContextObject::type = value;
  }-*/;
  
  private static native java.util.Date getUpdated(com.ppp.prm.portal.shared.dto.ContextObject instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.ContextObject::updated;
  }-*/;
  
  private static native void setUpdated(com.ppp.prm.portal.shared.dto.ContextObject instance, java.util.Date value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.ContextObject::updated = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.ppp.prm.portal.shared.dto.ContextObject instance) throws SerializationException {
    setAction(instance, streamReader.readString());
    setCreated(instance, (java.util.Date) streamReader.readObject());
    setId(instance, streamReader.readInt());
    setObjUi(instance, (com.ppp.prm.portal.shared.dto.ObjectUIMenu) streamReader.readObject());
    setParentId(instance, (java.lang.Integer) streamReader.readObject());
    setRid(instance, streamReader.readString());
    setType(instance, streamReader.readString());
    setUpdated(instance, (java.util.Date) streamReader.readObject());
    
  }
  
  public static com.ppp.prm.portal.shared.dto.ContextObject instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.ppp.prm.portal.shared.dto.ContextObject();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.ppp.prm.portal.shared.dto.ContextObject instance) throws SerializationException {
    streamWriter.writeString(getAction(instance));
    streamWriter.writeObject(getCreated(instance));
    streamWriter.writeInt(getId(instance));
    streamWriter.writeObject(getObjUi(instance));
    streamWriter.writeObject(getParentId(instance));
    streamWriter.writeString(getRid(instance));
    streamWriter.writeString(getType(instance));
    streamWriter.writeObject(getUpdated(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.ppp.prm.portal.shared.dto.ContextObject_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.ppp.prm.portal.shared.dto.ContextObject_FieldSerializer.deserialize(reader, (com.ppp.prm.portal.shared.dto.ContextObject)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.ppp.prm.portal.shared.dto.ContextObject_FieldSerializer.serialize(writer, (com.ppp.prm.portal.shared.dto.ContextObject)object);
  }
  
}
