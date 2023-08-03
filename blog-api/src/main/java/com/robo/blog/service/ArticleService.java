package com.robo.blog.service;

import com.robo.blog.vo.params.PageParams;
import com.robo.blog.vo.Result;

/**
 * @ClassName : ArticleService  //类名
 * @Description :   //描述
 * @Author : Rui //作者
 * @Date: 2023/8/3  11:26
 */
//分页查询 文章列表
public interface ArticleService {
    Result listArticle(PageParams pageParams);
}
