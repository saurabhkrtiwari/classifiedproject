package com.classifiedproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.classifiedproject.beans.Advertisement;
import com.classifiedproject.beans.Contact;

@Configuration
@ComponentScan("com.classifiedproject.comtrollers")
public class AdConfig {
	@Bean
	public Advertisement createAdvertisement() {
		
		return new Advertisement();
	}

	@Bean
	public Contact createContact() {
		
		return new Contact();
	}

}
