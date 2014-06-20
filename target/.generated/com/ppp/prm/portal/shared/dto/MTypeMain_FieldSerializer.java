package com.ppp.prm.portal.shared.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class MTypeMain_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.util.Date getCreated(com.ppp.prm.portal.shared.dto.MTypeMain instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.MTypeMain::created;
  }-*/;
  
  private static native void setCreated(com.ppp.prm.portal.shared.dto.MTypeMain instance, java.util.Date value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.MTypeMain::created = value;
  }-*/;
  
  private static native java.lang.String getId(com.ppp.prm.portal.shared.dto.MTypeMain instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.MTypeMain::id;
  }-*/;
  
  private static native void setId(com.ppp.prm.portal.shared.dto.MTypeMain instance, java.lang.String value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.MTypeMain::id = value;
  }-*/;
  
  private static native java.lang.String getName(com.ppp.prm.portal.shared.dto.MTypeMain instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.MTypeMain::name;
  }-*/;
  
  private static native void setName(com.ppp.prm.portal.shared.dto.MTypeMain instance, java.lang.String value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.MTypeMain::name = value;
  }-*/;
  
  private static native int getRid(com.ppp.prm.portal.shared.dto.MTypeMain instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.MTypeMain::rid;
  }-*/;
  
  private static native void setRid(com.ppp.prm.portal.shared.dto.MTypeMain instance, int value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.MTypeMain::rid = value;
  }-*/;
  
  private static native java.util.Date getUpdated(com.ppp.prm.portal.shared.dto.MTypeMain instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.MTypeMain::updated;
  }-*/;
  
  private static native void setUpdated(com.ppp.prm.portal.shared.dto.MTypeMain instance, java.util.Date value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.MTypeMain::updated = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.ppp.prm.portal.shared.dto.MTypeMain instance) throws SerializationException {
    setCreated(instance, (java.util.Date) streamReader.readObject());
    setId(instance, streamReader.readString());
    setName(instance, streamReader.readString());
    setRid(instance, streamReader.readInt());
    setUpdated(instance, (java.util.Date) streamReader.readObject());
    
  }
  
  public static com.ppp.prm.portal.shared.dto.MTypeMain instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.ppp.prm.portal.shared.dto.MTypeMain();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.ppp.prm.portal.shared.dto.MTypeMain instance) throws SerializationException {
    streamWriter.writeObject(getCreated(instance));
    streamWriter.writeString(getId(instance));
    streamWriter.writeString(getName(instance));
    streamWriter.writeInt(getRid(instance));
    streamWriter.writeObject(getUpdated(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.ppp.prm.portal.shared.dto.MTypeMain_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.ppp.prm.portal.shared.dto.MTypeMain_FieldSerializer.deserialize(reader, (com.ppp.prm.portal.shared.dto.MTypeMain)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.ppp.prm.portal.shared.dto.MTypeMain_FieldSerializer.serialize(writer, (com.ppp.prm.portal.shared.dto.MTypeMain)object);
  }
  
}
