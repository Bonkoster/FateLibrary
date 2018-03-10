package com.lukashman.FateLibrary.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@Configuration
public class FileBeans {

	@Bean(name = "multipartResolver")
	public CommonsMultipartResolver multipartResolver() {
		final CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
		multipartResolver.setDefaultEncoding("uft-8");
		multipartResolver.setMaxUploadSize(10000000);
		return multipartResolver;
	}
	
}
