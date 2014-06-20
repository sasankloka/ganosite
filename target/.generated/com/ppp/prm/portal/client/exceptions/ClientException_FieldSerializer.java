package com.ppp.prm.portal.client.exceptions;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ClientException_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getMessage(com.ppp.prm.portal.client.exceptions.ClientException instance) /*-{
    return instance.@com.ppp.prm.portal.client.exceptions.ClientException::message;
  }-*/;
  
  private static native void setMessage(com.ppp.prm.portal.client.exceptions.ClientException instance, java.lang.String value) 
  /*-{
    instance.@com.ppp.prm.portal.client.exceptions.ClientException::message = value;
  }-*/;
  
  private static native java.lang.String getStackTrace(com.ppp.prm.portal.client.exceptions.ClientException instance) /*-{
    return instance.@com.ppp.prm.portal.client.exceptions.ClientException::stackTrace;
  }-*/;
  
  private static native void setStackTrace(com.ppp.prm.portal.client.exceptions.ClientException instance, java.lang.String value) 
  /*-{
    instance.@com.ppp.prm.portal.client.exceptions.ClientException::stackTrace = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.ppp.prm.portal.client.exceptions.ClientException instance) throws SerializationException {
    setMessage(instance, streamReader.readString());
    setStackTrace(instance, streamReader.readString());
    
    com.google.gwt.user.client.rpc.core.java.lang.Exception_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.ppp.prm.portal.client.exceptions.ClientException instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.ppp.prm.portal.client.exceptions.ClientException();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.ppp.prm.portal.client.exceptions.ClientException instance) throws SerializationException {
    streamWriter.writeString(getMessage(instance));
    streamWriter.writeString(getStackTrace(instance));
    
    com.google.gwt.user.client.rpc.core.java.lang.Exception_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.ppp.prm.portal.client.exceptions.ClientException_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.ppp.prm.portal.client.exceptions.ClientException_FieldSerializer.deserialize(reader, (com.ppp.prm.portal.client.exceptions.ClientException)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.ppp.prm.portal.client.exceptions.ClientException_FieldSerializer.serialize(writer, (com.ppp.prm.portal.client.exceptions.ClientException)object);
  }
  
}
