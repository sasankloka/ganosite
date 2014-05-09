/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppp.prm.portal.server.service.gwt;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.ppp.prm.portal.server.dao.DB4oDao;
import com.ppp.prm.portal.server.dao.NewsDao;
import com.ppp.prm.portal.server.service.PushBeanService;


/**
 *Class Parent of all the GWT services
 */
@Transactional
public class GWTServiceRemoteImpl extends RemoteServiceServlet {

    /**
     * serviceFactory.
     */
    protected NewsDao newsDao;
    protected DB4oDao db4oDao;
    protected PushBeanService pushBeanService;
    
    
    private Logger logger = Logger.getLogger(GWTServiceRemoteImpl.class);
    
    /**
     * @return serviceFactory
     */
        protected final NewsDao getNewsDao() {

        return newsDao;
    }
    
        protected final DB4oDao getDb4oDao() {

            return db4oDao;
        }
      
    protected final PushBeanService getPushBeanService() {
    	logger.log(Level.INFO, "Service.GWT : GWTServiceRemoteImpl Method");
        return pushBeanService;
    }
    
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        super.init(servletConfig);
        /* serviceFactory = (ServiceFactory) WebApplicationContextUtils.
                getWebApplicationContext(servletConfig.getServletContext()).
                getBean("serviceFactory"); */
        
//        rainCommentService = (RainCommentsService) WebApplicationContextUtils.
//        getWebApplicationContext(servletConfig.getServletContext()).
//        getBean("rainForestCommentService");
        
        
        newsDao = (NewsDao)WebApplicationContextUtils.
        getWebApplicationContext(servletConfig.getServletContext()).
        getBean("newsDaoRef");
        
        db4oDao = (DB4oDao)WebApplicationContextUtils.
        getWebApplicationContext(servletConfig.getServletContext()).
        getBean("db4oDaoRef");
        
        logger.log(Level.INFO, "GWTServiceRemoteImpl Method - init pushbeanservice");
        pushBeanService=(PushBeanService) WebApplicationContextUtils.
        getWebApplicationContext(servletConfig.getServletContext()).
        getBean("PushBeanService");     
        logger.log(Level.INFO, "GWTServiceRemoteImpl Method - init pushbeanservice end");
        
    }  
/*public class GWTServiceRemoteImpl  {

    *//**
	 * @param serviceFactory the serviceFactory to set
	 *//*
	public void setServiceFactory(ServiceFactory serviceFactory) {
		this.serviceFactory = serviceFactory;
	}

	*//**
     * serviceFactory.
     *//*
    private  ServiceFactory serviceFactory;

    *//**
     * @return serviceFactory
     *//*
    public  ServiceFactory getServiceFactory() {

        return serviceFactory;
    }
   
*//**
 * 
Load serviceFactory class from the spring context
 *//*

    GWTServiceRemoteImpl() {
      ClassPathXmlApplicationContext  classPathXmlApplicationContext = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
   serviceFactory = (ServiceFactory) classPathXmlApplicationContext.getBean("serviceFactory");
  //  WebApplicationContextUtils
   //   .getWebApplicationContext(ServetContext).getBean("serviceFactory");
    	//   RemoteServiceDispatcher.this.getServletContext();
         
//        ClassPathXmlApplicationContext  ff = WebApplicationContextUtils.getRequiredWebApplicationContext(this	.getServletContext());
    

    }     
      */
      
    /**
     * Get value from session 
     */
    public Object getFromSession (String key)
      {
    HttpServletRequest request = this.getThreadLocalRequest();
    HttpSession session = request.getSession();
      
    	 return   session.getAttribute(key);

    	 }

    	  
      
    /**
     * save value in the  session 
     */
    public void saveToSession (String key, Object value)
      {
    HttpServletRequest request = this.getThreadLocalRequest();
    HttpSession session = request.getSession();
      
    	 session.setAttribute(key, value);

    	 }



      
      
}
