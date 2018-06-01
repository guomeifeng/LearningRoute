package com.guo.bos.service.configuration;  
  
import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;  
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.request.RequestContextListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;  
import org.springframework.web.filter.CharacterEncodingFilter;  
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.util.Log4jConfigListener;

import javax.servlet.DispatcherType;  
import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;  
import javax.servlet.ServletRegistration;  
import java.util.EnumSet;  
/**
 * 该类实现WebApplicationInitializer接口，替代web.xml配置文件
 * @author KellyGuo
 * /**
     * Configure the given {@link ServletContext} with any servlets, filters, listeners
     * context-params and attributes necessary for initializing this web application. See
     * examples {@linkplain WebApplicationInitializer above}.
     * @param servletContext the {@code ServletContext} to initialize
     * @throws ServletException if any call against the given {@code ServletContext}
     * throws a {@code ServletException}
     */
public class WebInitializer implements WebApplicationInitializer {  
  
    @Override  
    public void onStartup(ServletContext container) {
    	
        initializeSpringConfig(container);

        initializeLog4jConfig(container);

        initializeSpringMVCConfig(container);


//        registerServlet(container);

        registerListener(container);

        registerFilter(container);

    }
    
    private void initializeSpringConfig(ServletContext container) {
        // Create the 'root' Spring application context
        AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
    	rootContext.register(AppConfiguration.class);
        // Manage the life cycle of the root application context
        container.addListener(new ContextLoaderListener(rootContext));
    }

    private void initializeSpringMVCConfig(ServletContext container) {
        // Create the spring rest servlet's Spring application context
        AnnotationConfigWebApplicationContext dispatcherContext = new AnnotationConfigWebApplicationContext();
        dispatcherContext.register(RestServiceConfiguration.class);

        // Register and map the spring rest servlet
        ServletRegistration.Dynamic dispatcher = container.addServlet("IndexController",
                new DispatcherServlet(dispatcherContext));
        dispatcher.setLoadOnStartup(2);
        dispatcher.setAsyncSupported(true);
        dispatcher.addMapping("/");
    }
    
    private void initializeLog4jConfig(ServletContext container) {
        // Log4jConfigListener
        container.setInitParameter("log4jConfigLocation", "classpath:log4j.properties");
        container.addListener(Log4jConfigListener.class);
        PropertyConfigurator.configureAndWatch("classpath:log4jConfigLocation", 60);
    }

//    private void registerServlet(ServletContext container) {
//
//        initializeStaggingServlet(container);
//    }

    private void registerFilter(ServletContext container) {
//        initializeSAMLFilter(container);
    	initializeCharacterEncodingFilter(container);
    }

    private void registerListener(ServletContext container) {
        container.addListener(RequestContextListener.class);
    }

//    private void initializeSAMLFilter(ServletContext container) {
//        FilterRegistration.Dynamic filterRegistration = container.addFilter("SAMLFilter", DelegatingFilterProxy.class);
//        filterRegistration.addMappingForUrlPatterns(null, false, "/*");
//        filterRegistration.setAsyncSupported(true);
//    }
    private void initializeCharacterEncodingFilter(ServletContext container) {
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();  
        characterEncodingFilter.setEncoding("utf-8");  
        FilterRegistration filterRegistration =  
                container.addFilter("characterEncodingFilter", characterEncodingFilter);  
        filterRegistration.addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST), false, "/");  

    }

//    private void initializeStaggingServlet(ServletContext container) {
//        StaggingServlet staggingServlet = new StaggingServlet();
//        ServletRegistration.Dynamic dynamic = container.addServlet("staggingServlet", staggingServlet);
//        dynamic.setLoadOnStartup(3);
//        dynamic.addMapping("*.stagging");
//    }

   
}  