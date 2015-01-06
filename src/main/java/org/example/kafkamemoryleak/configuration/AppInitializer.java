package org.example.kafkamemoryleak.configuration;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.session.web.context.AbstractHttpSessionApplicationInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.util.Log4jConfigListener;

public class AppInitializer extends AbstractHttpSessionApplicationInitializer
{

	@Override
	public void onStartup(ServletContext container) throws ServletException
	{
		container.setInitParameter("log4jConfigLocation", "/WEB-INF/properties/log4j.xml");
		container.addListener(Log4jConfigListener.class);
		
		super.onStartup(container);

		XmlWebApplicationContext dispatcherContext = new XmlWebApplicationContext();
		dispatcherContext.setConfigLocation("/WEB-INF/mvc-config.xml");

		ServletRegistration.Dynamic dispatcher = container.addServlet("dispatcher", new DispatcherServlet(dispatcherContext));
		dispatcher.setLoadOnStartup(1);
		dispatcher.setAsyncSupported(true);
		dispatcher.addMapping("/");
		
		FilterRegistration.Dynamic securityFilter = container.addFilter("springSecurityFilterChain", DelegatingFilterProxy.class);
	    securityFilter.addMappingForUrlPatterns(null, false, "/*");
	}
}
