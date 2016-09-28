package com.mypack.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class InitApplication implements ServletContextListener{

	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {
		 ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext
		 	(servletContextEvent.getServletContext());
	        ctx.getBean("setUp");
	        System.out.println("ApplicationContext is initailized....");    
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}

	
}
