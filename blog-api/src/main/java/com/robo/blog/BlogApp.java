package com.robo.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName : BlogApp  //类名
 * @Description :   //描述
 * @Author : Rui //作者
 * @Date: 2023/8/2  20:34
 */
@SpringBootApplication
//@ComponentScan(basePackages = {"com.robo.blog.dao.mapper"})
//@MapperScan("com.robo.*.mapper")
public class BlogApp {
    public static void main(String[] args) {
        SpringApplication.run(BlogApp.class,args);
    }
}
