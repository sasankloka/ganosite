package com.ppp.prm.portal.shared.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class MUser_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.util.Date getCreated(com.ppp.prm.portal.shared.dto.MUser instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.MUser::created;
  }-*/;
  
  private static native void setCreated(com.ppp.prm.portal.shared.dto.MUser instance, java.util.Date value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.MUser::created = value;
  }-*/;
  
  private static native java.lang.String getFstName(com.ppp.prm.portal.shared.dto.MUser instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.MUser::fstName;
  }-*/;
  
  private static native void setFstName(com.ppp.prm.portal.shared.dto.MUser instance, java.lang.String value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.MUser::fstName = value;
  }-*/;
  
  private static native java.lang.String getId(com.ppp.prm.portal.shared.dto.MUser instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.MUser::id;
  }-*/;
  
  private static native void setId(com.ppp.prm.portal.shared.dto.MUser instance, java.lang.String value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.MUser::id = value;
  }-*/;
  
  private static native java.lang.String getLastName(com.ppp.prm.portal.shared.dto.MUser instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.MUser::lastName;
  }-*/;
  
  private static native void setLastName(com.ppp.prm.portal.shared.dto.MUser instance, java.lang.String value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.MUser::lastName = value;
  }-*/;
  
  private static native java.lang.String getLogin(com.ppp.prm.portal.shared.dto.MUser instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.MUser::login;
  }-*/;
  
  private static native void setLogin(com.ppp.prm.portal.shared.dto.MUser instance, java.lang.String value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.MUser::login = value;
  }-*/;
  
  private static native java.lang.String getPasswd(com.ppp.prm.portal.shared.dto.MUser instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.MUser::passwd;
  }-*/;
  
  private static native void setPasswd(com.ppp.prm.portal.shared.dto.MUser instance, java.lang.String value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.MUser::passwd = value;
  }-*/;
  
  private static native int getRid(com.ppp.prm.portal.shared.dto.MUser instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.MUser::rid;
  }-*/;
  
  private static native void setRid(com.ppp.prm.portal.shared.dto.MUser instance, int value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.MUser::rid = value;
  }-*/;
  
  private static native java.util.Date getUpdated(com.ppp.prm.portal.shared.dto.MUser instance) /*-{
    return instance.@com.ppp.prm.portal.shared.dto.MUser::updated;
  }-*/;
  
  private static native void setUpdated(com.ppp.prm.portal.shared.dto.MUser instance, java.util.Date value) 
  /*-{
    instance.@com.ppp.prm.portal.shared.dto.MUser::updated = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.ppp.prm.portal.shared.dto.MUser instance) throws SerializationException {
    setCreated(instance, (java.util.Date) streamReader.readObject());
    setFstName(instance, streamReader.readString());
    setId(instance, streamReader.readString());
    setLastName(instance, streamReader.readString());
    setLogin(instance, streamReader.readString());
    setPasswd(instance, streamReader.readString());
    setRid(instance, streamReader.readInt());
    setUpdated(instance, (java.util.Date) streamReader.readObject());
    
  }
  
  public static com.ppp.prm.portal.shared.dto.MUser instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.ppp.prm.portal.shared.dto.MUser();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.ppp.prm.portal.shared.dto.MUser instance) throws SerializationException {
    streamWriter.writeObject(getCreated(instance));
    streamWriter.writeString(getFstName(instance));
    streamWriter.writeString(getId(instance));
    streamWriter.writeString(getLastName(instance));
    streamWriter.writeString(getLogin(instance));
    streamWriter.writeString(getPasswd(instance));
    streamWriter.writeInt(getRid(instance));
    streamWriter.writeObject(getUpdated(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.ppp.prm.portal.shared.dto.MUser_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.ppp.prm.portal.shared.dto.MUser_FieldSerializer.deserialize(reader, (com.ppp.prm.portal.shared.dto.MUser)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.ppp.prm.portal.shared.dto.MUser_FieldSerializer.serialize(writer, (com.ppp.prm.portal.shared.dto.MUser)object);
  }
  
}
