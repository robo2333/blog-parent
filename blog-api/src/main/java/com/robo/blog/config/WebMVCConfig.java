package com.robo.blog.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName : WebMVCConfig  //类名
 * @Description :   //描述
 * @Author : Rui //作者
 * @Date: 2023/8/2  20:39
 */
@Configuration
public class WebMVCConfig implements WebMvcConfigurer {
    //跨域配置
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedOrigins("http://localhost:8080");

    }
}
