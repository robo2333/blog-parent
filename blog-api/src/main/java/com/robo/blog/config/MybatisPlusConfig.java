package com.robo.blog.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName : MybatisPlusConfig  //类名
 * @Description :   //描述
 * @Author : Rui //作者
 * @Date: 2023/8/2  20:37
 */
@Configuration
@MapperScan("com.robo.blog.mapper")
public class MybatisPlusConfig {
    //分页插件
    public MybatisPlusInterceptor mybatisPlusInterceptor(){
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor());
        return interceptor;
    }
}
