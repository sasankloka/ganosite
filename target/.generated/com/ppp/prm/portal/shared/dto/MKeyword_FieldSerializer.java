package com.ppp.prm.portal.shared.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class MKeyword_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native com.ppp.prm.portal.shared.dto.MKeyword getMKeyword(com.ppp.prm.portal.shared.dto.MKeyword instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.MKeyword::MKeyword;
  }-*/;
  
  private static native void setMKeyword(com.ppp.prm.portal.shared.dto.MKeyword instance, com.ppp.prm.portal.shared.dto.MKeyword value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.MKeyword::MKeyword = value;
  }-*/;
  
  private static native com.ppp.prm.portal.shared.dto.MTypeMain getMTypeMain(com.ppp.prm.portal.shared.dto.MKeyword instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.MKeyword::MTypeMain;
  }-*/;
  
  private static native void setMTypeMain(com.ppp.prm.portal.shared.dto.MKeyword instance, com.ppp.prm.portal.shared.dto.MTypeMain value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.MKeyword::MTypeMain = value;
  }-*/;
  
  private static native java.util.Date getCreated(com.ppp.prm.portal.shared.dto.MKeyword instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.MKeyword::created;
  }-*/;
  
  private static native void setCreated(com.ppp.prm.portal.shared.dto.MKeyword instance, java.util.Date value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.MKeyword::created = value;
  }-*/;
  
  private static native java.lang.String getId(com.ppp.prm.portal.shared.dto.MKeyword instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.MKeyword::id;
  }-*/;
  
  private static native void setId(com.ppp.prm.portal.shared.dto.MKeyword instance, java.lang.String value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.MKeyword::id = value;
  }-*/;
  
  private static native java.lang.String getItem(com.ppp.prm.portal.shared.dto.MKeyword instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.MKeyword::item;
  }-*/;
  
  private static native void setItem(com.ppp.prm.portal.shared.dto.MKeyword instance, java.lang.String value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.MKeyword::item = value;
  }-*/;
  
  private static native int getRid(com.ppp.prm.portal.shared.dto.MKeyword instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.MKeyword::rid;
  }-*/;
  
  private static native void setRid(com.ppp.prm.portal.shared.dto.MKeyword instance, int value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.MKeyword::rid = value;
  }-*/;
  
  private static native java.util.Date getUpdated(com.ppp.prm.portal.shared.dto.MKeyword instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.MKeyword::updated;
  }-*/;
  
  private static native void setUpdated(com.ppp.prm.portal.shared.dto.MKeyword instance, java.util.Date value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.MKeyword::updated = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.ppp.prm.portal.shared.dto.MKeyword instance) throws SerializationException {
    setMKeyword(instance, (com.ppp.prm.portal.shared.dto.MKeyword) streamReader.readObject());
    setMTypeMain(instance, (com.ppp.prm.portal.shared.dto.MTypeMain) streamReader.readObject());
    setCreated(instance, (java.util.Date) streamReader.readObject());
    setId(instance, streamReader.readString());
    setItem(instance, streamReader.readString());
    setRid(instance, streamReader.readInt());
    setUpdated(instance, (java.util.Date) streamReader.readObject());
    
  }
  
  public static com.ppp.prm.portal.shared.dto.MKeyword instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.ppp.prm.portal.shared.dto.MKeyword();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.ppp.prm.portal.shared.dto.MKeyword instance) throws SerializationException {
    streamWriter.writeObject(getMKeyword(instance));
    streamWriter.writeObject(getMTypeMain(instance));
    streamWriter.writeObject(getCreated(instance));
    streamWriter.writeString(getId(instance));
    streamWriter.writeString(getItem(instance));
    streamWriter.writeInt(getRid(instance));
    streamWriter.writeObject(getUpdated(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.ppp.prm.portal.shared.dto.MKeyword_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.ppp.prm.portal.shared.dto.MKeyword_FieldSerializer.deserialize(reader, (com.ppp.prm.portal.shared.dto.MKeyword)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.ppp.prm.portal.shared.dto.MKeyword_FieldSerializer.serialize(writer, (com.ppp.prm.portal.shared.dto.MKeyword)object);
  }
  
}
