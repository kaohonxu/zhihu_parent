package com.zhihu.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Ontheway
 * @Date 2019/3/27
 **/
@Configuration
public class CustomConfig implements WebMvcConfigurer{

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/ueditor").setViewName("/ueditor.html");
        registry.addViewController("/writeArticle").setViewName("/writeArticle.html");
    }
    
}