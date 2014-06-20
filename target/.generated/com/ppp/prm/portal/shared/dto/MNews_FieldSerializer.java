package com.ppp.prm.portal.shared.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class MNews_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native com.ppp.prm.portal.shared.dto.MKeyword getMKeyword(com.ppp.prm.portal.shared.dto.MNews instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.MNews::MKeyword;
  }-*/;
  
  private static native void setMKeyword(com.ppp.prm.portal.shared.dto.MNews instance, com.ppp.prm.portal.shared.dto.MKeyword value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.MNews::MKeyword = value;
  }-*/;
  
  private static native com.ppp.prm.portal.shared.dto.MTypeMain getMTypeMain(com.ppp.prm.portal.shared.dto.MNews instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.MNews::MTypeMain;
  }-*/;
  
  private static native void setMTypeMain(com.ppp.prm.portal.shared.dto.MNews instance, com.ppp.prm.portal.shared.dto.MTypeMain value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.MNews::MTypeMain = value;
  }-*/;
  
  private static native com.ppp.prm.portal.shared.dto.MUser getMUser(com.ppp.prm.portal.shared.dto.MNews instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.MNews::MUser;
  }-*/;
  
  private static native void setMUser(com.ppp.prm.portal.shared.dto.MNews instance, com.ppp.prm.portal.shared.dto.MUser value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.MNews::MUser = value;
  }-*/;
  
  private static native java.util.Date getCreated(com.ppp.prm.portal.shared.dto.MNews instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.MNews::created;
  }-*/;
  
  private static native void setCreated(com.ppp.prm.portal.shared.dto.MNews instance, java.util.Date value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.MNews::created = value;
  }-*/;
  
  private static native java.lang.String getDescr(com.ppp.prm.portal.shared.dto.MNews instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.MNews::descr;
  }-*/;
  
  private static native void setDescr(com.ppp.prm.portal.shared.dto.MNews instance, java.lang.String value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.MNews::descr = value;
  }-*/;
  
  private static native java.lang.String getId(com.ppp.prm.portal.shared.dto.MNews instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.MNews::id;
  }-*/;
  
  private static native void setId(com.ppp.prm.portal.shared.dto.MNews instance, java.lang.String value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.MNews::id = value;
  }-*/;
  
  private static native int getRid(com.ppp.prm.portal.shared.dto.MNews instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.MNews::rid;
  }-*/;
  
  private static native void setRid(com.ppp.prm.portal.shared.dto.MNews instance, int value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.MNews::rid = value;
  }-*/;
  
  private static native java.lang.String getType(com.ppp.prm.portal.shared.dto.MNews instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.MNews::type;
  }-*/;
  
  private static native void setType(com.ppp.prm.portal.shared.dto.MNews instance, java.lang.String value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.MNews::type = value;
  }-*/;
  
  private static native java.util.Date getUpdated(com.ppp.prm.portal.shared.dto.MNews instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.MNews::updated;
  }-*/;
  
  private static native void setUpdated(com.ppp.prm.portal.shared.dto.MNews instance, java.util.Date value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.MNews::updated = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.ppp.prm.portal.shared.dto.MNews instance) throws SerializationException {
    setMKeyword(instance, (com.ppp.prm.portal.shared.dto.MKeyword) streamReader.readObject());
    setMTypeMain(instance, (com.ppp.prm.portal.shared.dto.MTypeMain) streamReader.readObject());
    setMUser(instance, (com.ppp.prm.portal.shared.dto.MUser) streamReader.readObject());
    setCreated(instance, (java.util.Date) streamReader.readObject());
    setDescr(instance, streamReader.readString());
    setId(instance, streamReader.readString());
    setRid(instance, streamReader.readInt());
    setType(instance, streamReader.readString());
    setUpdated(instance, (java.util.Date) streamReader.readObject());
    
  }
  
  public static com.ppp.prm.portal.shared.dto.MNews instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.ppp.prm.portal.shared.dto.MNews();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.ppp.prm.portal.shared.dto.MNews instance) throws SerializationException {
    streamWriter.writeObject(getMKeyword(instance));
    streamWriter.writeObject(getMTypeMain(instance));
    streamWriter.writeObject(getMUser(instance));
    streamWriter.writeObject(getCreated(instance));
    streamWriter.writeString(getDescr(instance));
    streamWriter.writeString(getId(instance));
    streamWriter.writeInt(getRid(instance));
    streamWriter.writeString(getType(instance));
    streamWriter.writeObject(getUpdated(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.ppp.prm.portal.shared.dto.MNews_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.ppp.prm.portal.shared.dto.MNews_FieldSerializer.deserialize(reader, (com.ppp.prm.portal.shared.dto.MNews)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.ppp.prm.portal.shared.dto.MNews_FieldSerializer.serialize(writer, (com.ppp.prm.portal.shared.dto.MNews)object);
  }
  
}
