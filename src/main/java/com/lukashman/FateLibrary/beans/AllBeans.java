package com.lukashman.FateLibrary.beans;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({TestBeans.class, FileBeans.class})
public class AllBeans {

}
