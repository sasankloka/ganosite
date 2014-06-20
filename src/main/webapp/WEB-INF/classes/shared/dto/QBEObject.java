package com.ppp.prm.portal.shared.dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;


public class QBEObject implements Serializable{
	/**
	 * 
	 */

	
	
	HashMap<String,String> bQuery = new HashMap();
	HashSet<String> bQuerySet = new HashSet();
//	Array bQuery = new mHashMap();
	String priUser; 
	String userClause;
	String mainClause;
	String keyClause;
	String typeClause;
  //  HashMap sMap = new HashMap();
    
   // public final static HashMap consts = new HashMap();
	
	
    
    public static enum entity {  
    	 User,Main,Keyword,NewsType
    	} 

	
	public boolean setQBE(String key,String value)
	{ 
	if(bQuerySet.add(key) == true)
    { bQuery.put(key, value);
   System.out.println("setQBE Key :"+key+" Value:"+value);
    switch(entity.valueOf(value))
    {
    case User: System.out.println("setQBE Swtich Key :"+key+" Value:"+value + "Is User Clause Empty "+ userClause);
              {if(userClause == null)
                 	userClause = "'"+key+"'";
                    else userClause = userClause+",'"+key+"'";
              System.out.println("setQBE Swtich :"+key+" Value:"+value + " User Clause "+userClause);
                 break; 
                 }
    case Main: { if(mainClause == null)
    	             mainClause = "'"+key+"'";
	                 else mainClause = mainClause+",'"+key+"'";
                  break; }
    
    case Keyword: { if(keyClause == null)
    	           keyClause = "'"+key+"'";
                   else keyClause = keyClause+",'"+key+"'";
                   break; }
    
    case NewsType: { if(typeClause == null)
    	typeClause = "'"+key+"'";
        else typeClause = typeClause+",'"+key+"'";
        break; }
    
    
    
     default: break;
     
     }
	
    return true;
    }
	else return false;
	}
	
	public String getQBE(String key)
	{
	return bQuery.get(key).toString();
	}
	
	public String getUserClause()
	{
		if(userClause == null)
			return("NoObjectFound");
		else
		    return(userClause);
	}
	
	public String getMainClause()
	{
		if(mainClause == null)
			return("NoObjectFound");
		else    
		return(mainClause);
	}
	
	
	public String removeAll()
	{
		userClause=null;
		mainClause=null;
		keyClause=null;
		bQuery = null;
		bQuerySet = null;
		bQuery = new HashMap();
		bQuerySet = new HashSet();
		return(mainClause);
	}
	
	
	public String getTypeClause()
	{
		if(typeClause == null)
			return("NoObjectFound");
		else    
		return(typeClause);
	}
	
	public String getKeyClause()
	{
		if(keyClause == null)
			return("NoObjectFound");
		else    
		return(keyClause);
	}
	
		public QBEObject(){}
		
	
}
