package com.classifiedproject.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.classifiedproject.controllers")
public class SetupConfig implements WebMvcConfigurer{
	
public SetupConfig() {
	System.out.println("SetUpConfig Started");
}
@Override
public void configureViewResolvers(ViewResolverRegistry registry)
{
	InternalResourceViewResolver view = new InternalResourceViewResolver();
	view.setPrefix("/WEB-INF/jsps/");
	view.setSuffix(".jsp");
	registry.viewResolver(view);
	
}
@Override
public void addInterceptors(InterceptorRegistry intercept)
{
	intercept.addInterceptor(new URLInterceptor());
}
}
