//package com.robo.blog.controller;
//
//import com.robo.blog.service.ArticleService;
//import com.robo.blog.vo.params.PageParams;
//import com.robo.blog.vo.Result;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * @ClassName : ArticleController  //类名
// * @Description :   //描述
// * @Author : Rui //作者
// * @Date: 2023/8/3  10:44
// */
//@RestController
//@RequestMapping("articles")
//public class ArticleController {
//    @Autowired
//    private ArticleService articleService;
//    @PostMapping
//    public Result listArticle(@RequestBody PageParams pageParams){
//        return articleService.listArticle(pageParams);
//    }
//}
