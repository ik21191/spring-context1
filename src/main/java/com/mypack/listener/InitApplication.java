package com.mypack.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import mypack.beans.A;
import mypack.beans.B;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class InitApplication implements ServletContextListener{

	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {
		System.out.println("context is initailized....");
		 ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext
		 	(servletContextEvent.getServletContext());
	        A a = (A)ctx.getBean("a");
	        B b = (B)ctx.getBean("b"); 
	        System.out.println(a.getName());
	        System.out.println(b.getName() + " " + b.getLocation());
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}

	
}
