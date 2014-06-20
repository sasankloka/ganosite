package com.ppp.prm.portal.shared.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ALstVal_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.util.Date getCreated(com.ppp.prm.portal.shared.dto.ALstVal instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.ALstVal::created;
  }-*/;
  
  private static native void setCreated(com.ppp.prm.portal.shared.dto.ALstVal instance, java.util.Date value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.ALstVal::created = value;
  }-*/;
  
  private static native java.lang.String getDescription(com.ppp.prm.portal.shared.dto.ALstVal instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.ALstVal::description;
  }-*/;
  
  private static native void setDescription(com.ppp.prm.portal.shared.dto.ALstVal instance, java.lang.String value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.ALstVal::description = value;
  }-*/;
  
  private static native int getId(com.ppp.prm.portal.shared.dto.ALstVal instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.ALstVal::id;
  }-*/;
  
  private static native void setId(com.ppp.prm.portal.shared.dto.ALstVal instance, int value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.ALstVal::id = value;
  }-*/;
  
  private static native java.lang.String getName(com.ppp.prm.portal.shared.dto.ALstVal instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.ALstVal::name;
  }-*/;
  
  private static native void setName(com.ppp.prm.portal.shared.dto.ALstVal instance, java.lang.String value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.ALstVal::name = value;
  }-*/;
  
  private static native java.lang.Integer getParentId(com.ppp.prm.portal.shared.dto.ALstVal instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.ALstVal::parentId;
  }-*/;
  
  private static native void setParentId(com.ppp.prm.portal.shared.dto.ALstVal instance, java.lang.Integer value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.ALstVal::parentId = value;
  }-*/;
  
  private static native java.lang.String getRid(com.ppp.prm.portal.shared.dto.ALstVal instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.ALstVal::rid;
  }-*/;
  
  private static native void setRid(com.ppp.prm.portal.shared.dto.ALstVal instance, java.lang.String value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.ALstVal::rid = value;
  }-*/;
  
  private static native java.lang.String getSubType(com.ppp.prm.portal.shared.dto.ALstVal instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.ALstVal::subType;
  }-*/;
  
  private static native void setSubType(com.ppp.prm.portal.shared.dto.ALstVal instance, java.lang.String value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.ALstVal::subType = value;
  }-*/;
  
  private static native java.lang.String getType(com.ppp.prm.portal.shared.dto.ALstVal instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.ALstVal::type;
  }-*/;
  
  private static native void setType(com.ppp.prm.portal.shared.dto.ALstVal instance, java.lang.String value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.ALstVal::type = value;
  }-*/;
  
  private static native java.util.Date getUpdated(com.ppp.prm.portal.shared.dto.ALstVal instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.ALstVal::updated;
  }-*/;
  
  private static native void setUpdated(com.ppp.prm.portal.shared.dto.ALstVal instance, java.util.Date value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.ALstVal::updated = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.ppp.prm.portal.shared.dto.ALstVal instance) throws SerializationException {
    setCreated(instance, (java.util.Date) streamReader.readObject());
    setDescription(instance, streamReader.readString());
    setId(instance, streamReader.readInt());
    setName(instance, streamReader.readString());
    setParentId(instance, (java.lang.Integer) streamReader.readObject());
    setRid(instance, streamReader.readString());
    setSubType(instance, streamReader.readString());
    setType(instance, streamReader.readString());
    setUpdated(instance, (java.util.Date) streamReader.readObject());
    
  }
  
  public static com.ppp.prm.portal.shared.dto.ALstVal instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.ppp.prm.portal.shared.dto.ALstVal();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.ppp.prm.portal.shared.dto.ALstVal instance) throws SerializationException {
    streamWriter.writeObject(getCreated(instance));
    streamWriter.writeString(getDescription(instance));
    streamWriter.writeInt(getId(instance));
    streamWriter.writeString(getName(instance));
    streamWriter.writeObject(getParentId(instance));
    streamWriter.writeString(getRid(instance));
    streamWriter.writeString(getSubType(instance));
    streamWriter.writeString(getType(instance));
    streamWriter.writeObject(getUpdated(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.ppp.prm.portal.shared.dto.ALstVal_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.ppp.prm.portal.shared.dto.ALstVal_FieldSerializer.deserialize(reader, (com.ppp.prm.portal.shared.dto.ALstVal)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.ppp.prm.portal.shared.dto.ALstVal_FieldSerializer.serialize(writer, (com.ppp.prm.portal.shared.dto.ALstVal)object);
  }
  
}
