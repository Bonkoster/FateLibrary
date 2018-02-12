package com.lukashman.FateLibrary.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({TestBeans.class})
public class AllBeans {

}
