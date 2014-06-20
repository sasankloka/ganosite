package com.ppp.prm.portal.server.service;
import com.ppp.prm.portal.shared.dto.*;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
public class Db4oLoadClass {
	
	private static Logger log = Logger.getLogger(Db4oLoadClass.class);
	
		public static void examineFields(Object object)  
		{  
			Class clazz = object.getClass();
		    Field fieldList[] = clazz.getDeclaredFields();
		    log.log(Level.INFO,"Examining Class: " + clazz.getName());
			try {
				log.log(Level.INFO,"Examining Class:FieldLength"+fieldList.length);
		    for (int i = 0; i < fieldList.length; i++) {
		    	 
			      Field fld = fieldList[i];
			      log.log(Level.INFO,"Examining Class:Field " + fld.getName()+ " "+fld.getType().getName());
			      
			       
			      if(fld.getType().isArray() && fld.getType().getName().equals("java.util.List")){
			    	  log.log(Level.INFO,"Examining Array Object"+fld.getType());
			    	  Object obj = fld.getType().getClass().newInstance();
			    	  Object[] object1=(Object[])fld.get(obj);  
			    	  for(int j=0;j<object1.length;j++){  
			    	  System.out.println(object1[j].toString());  
			    	                                       }  
			                  }
	/* Not in use		      
			      if( 1<0 && !fld.getType().isPrimitive()  && !fld.getType().getName().equals("java.lang.String")&& !fld.getType().getName().equals("java.util.Date"))
			    	  { log.log(Level.INFO,"Examining Object"+fld.getType().getName());
			    	  Class clz = fld.getType();
			    	  Object objp = fld.getType().newInstance();
			    	  Object objectp1=(Object)fld.get(objp);  
			    	  log.log(Level.INFO,"Examining Non Primitive Object - "+objectp1.toString());
			    	  
			    	 if(clz.getName().equals("com.db4o.internal.query.result.StatefulQueryResult"))
			    	   {  // Class<?> clz = new (fld.getType());
			    		//  com.db4o.internal.query.ObjectSetFacade setObj = null;
			    		 
			    	  
			    		//  Method method = clz.getMethod("Size");
			    		  for(Method m1 : clz.getMethods())
			    		  log.log(Level.INFO,"Examining Object - All Methods"+m1.toString()+"    Name:"+m1.getName());
			    		  Method m = clz.getMethod("get",new Class[] {int.class});
			    		  log.log(Level.INFO,"Examining Object - Method"+ m.toString());
			    		  int f=0;
			    		  Object[] params = {f};
			    		  Object ins= clz.newInstance();
			    	//	  m.invoke(obj, args)
			    		  log.log(Level.INFO,"Examining Object - Method" +m.invoke(fld.get(ins),params));
			    		  examineFields(m.invoke(fld,params));  
			    	  }
			    	//  Class c= new Class(fld.getType());
			    	 //  Object O = new Object();
			    	  //  clz.cast(O);
			    	 //  O=fld.get(O);
			    	 // Object object1=fld.;  
			    	  log.log(Level.INFO,"Examined Object"+ fld.getType().toString());
			    	  //examineFields(fld.get(object1));
			    	  }
			    	  Not in use */
			      
			      
			      else { String fieldName = fld.getName();
			      Method meth;
		
					meth = clazz.getMethod("get"
														            + fieldName.substring(0, 1).toUpperCase()
														            + fieldName.substring(1));
			
					 if( fld.getType().getName().equals("java.util.List") && meth.invoke(object) != null)
					 { List<Object> O= (List<Object>) meth.invoke(object);
					   //int io=0;
					 log.log(Level.INFO,"Invloking Subclass" + fieldName);
						 for(Object o: O)
						 { log.log(Level.INFO," << Invloking Subclass" + fieldName + " = " +o.toString() ); examineFields(o); log.log(Level.INFO,">> Invloking Subclass End" + fieldName + " = " +o.toString() );}
					 }
					log.log(Level.INFO,"Invoke method "+ meth.getName()+" " + fieldName + "=" + meth.invoke(object));
			      }
				}
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					log.log(Level.ERROR," IllegalArgumentException "+e.getMessage() );
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					log.log(Level.ERROR," IllegalAccessException "+e.getMessage());
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					log.log(Level.ERROR,"InvocationTargetException "+e.getMessage());
					e.printStackTrace();
				}
     		catch (SecurityException e) {
			// TODO Auto-generated catch block
     			log.log(Level.ERROR,"SecurityException "+e.getMessage());
     			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			log.log(Level.ERROR,"NoSuchMethodException "+e.getMessage());
			e.printStackTrace();
		}
		catch (InstantiationException e) {
			// TODO Auto-generated catch block
			log.log(Level.ERROR,"InstantiationException "+e.getMessage());
			e.printStackTrace();
			}
		
		}		
}



