 package com.ppp.prm.portal.shared.dto;
// Generated May 9, 2012 10:13:17 PM by Hibernate Tools 3.4.0.CR1


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//import org.mortbay.log.Log;

/**
 * ALstVal generated by hbm2java
 */
public class ObjectUIMenu  implements java.io.Serializable ,Comparable<ObjectUIMenu>{


     private long id;
     private Date created;
     private Date updated;
     private String rid;
     private Integer mIndex;
     private String menu;
     private String type;
     private ObjectUIMenu subMenu;
     private List<ObjectUIMenu> listMenu;
     private String inLine;
     private Integer parentId;

    public ObjectUIMenu() {
    }

    public void SetObjectUIMenu(ObjectUIMenu obj) {
    	 this.id = obj.id;
         this.created = obj.created;
         this.updated = obj.updated;
         this.rid = obj.rid;
         this.menu = obj.menu;
         this.type = obj.type;
         this.inLine = obj.inLine;
         this.parentId = obj.parentId;
    }
    
    public ObjectUIMenu(int id, Date created, Date updated) {
        this.id = id;
        this.created = created;
        this.updated = updated;
    }
    public ObjectUIMenu(int id, Date created, Date updated, String rid, String name, String type, String subType, String description, Integer parentId) {
       this.id = id;
       this.created = created;
       this.updated = updated;
       this.rid = rid;
       this.menu = name;
       this.type = type;
    //    this.subMenu = subType;
       this.inLine = description;
       this.parentId = parentId;
    }
   
    public long getId() {
        return this.id;
    }
    
    public void setId(long l) {
        this.id = l;
    }
    public Date getCreated() {
        return this.created;
    }
    
    public void setCreated(Date created) {
        this.created = created;
    }
    public Date getUpdated() {
        return this.updated;
    }
    
    public void setUpdated(Date updated) {
        this.updated = updated;
    }
    public String getRid() {
        return this.rid;
    }
    
    public void setRid(String rid) {
        this.rid = rid;
    }
    public String getMenu() {
        return this.menu;
    }
    
    public void setMenu(String name) {
        this.menu = name;
    }
    public String getType() {
        return this.type;
    }
    
    
    public void setType(String type) {
        this.type = type;
    }
    public ObjectUIMenu getSubMenu() {
        return this.subMenu;
    }
    
    
    public void setSubMenu(ObjectUIMenu subMenu) {
    	System.out.println("ObjectUI setSubMenu DTO" + this.listMenu+ (int) subMenu.getId()+ subMenu );
    	// subMenu.setP
    	 this.subMenu = subMenu;
    	if(this.listMenu == null)
    		this.listMenu = new ArrayList<ObjectUIMenu>();
    	if (this.subMenu != null )
        	 if(this.subMenu.getId()<1)
                this.listMenu.add(subMenu);
                else {int idx = (int) subMenu.getId(); 
                        this.listMenu.add( idx,subMenu); 
                        }
         this.subMenu = subMenu;
         System.out.println("ObjectUI setSubMenu DTO" + this.listMenu.size()+ (int) subMenu.getId()+ subMenu );
           }
    
    public List<ObjectUIMenu> getListMenu() {
    	
        return this.listMenu;
    }
    
    
    public void setListMenu(List<ObjectUIMenu> listMenu) {
        this.listMenu = listMenu;
    }
    
    
    public String getInLine() {
        return this.inLine;
    }
    
    public void setInLine(String description) {
        this.inLine=description ;
    }
    
        public Integer getParentId() {
        return this.parentId;
    }
    
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

	public void setMIndex(Integer mIndex) {
		if(!mIndex.toString().isEmpty())
		this.mIndex = mIndex;
		else mIndex=0;
	}

	public Integer getMIndex() {
		return mIndex;
	}

	public int compareTo(ObjectUIMenu obj) {
		int compareIndex = 0 ; // ((ObjectUIMenu) obj).getMIndex(); 
		
		
		
		if(((ObjectUIMenu) obj).getMIndex() != null)
			compareIndex=((ObjectUIMenu) obj).getMIndex();
		else compareIndex=0;
      if(this.mIndex == null)
    	  this.mIndex=0;
		//ascending order
      int ret =this.mIndex - compareIndex;
		return ret;
	}
 
 

}


