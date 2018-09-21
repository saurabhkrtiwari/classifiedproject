package com.classifiedproject.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer  {

	public AppInitializer()
	{
		System.out.println("AppInitiazer Started");
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return new Class[] {SecurityConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		return new Class[] { SetupConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		
		return new String[] {"/"};
	}
	
	
		
	}
	


