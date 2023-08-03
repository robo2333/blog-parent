//package com.robo.blog.service.Impl;
//
//import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
//import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
//import com.robo.blog.dao.mapper.ArticleMapper;
//import com.robo.blog.dao.pojo.Article;
//import com.robo.blog.service.ArticleService;
//import com.robo.blog.vo.ArticleVo;
//import com.robo.blog.vo.params.PageParams;
//import com.robo.blog.vo.Result;
//import org.joda.time.DateTime;
//import org.springframework.beans.BeanUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * @ClassName : ArticleServiceImpl  //类名
// * @Description :   //描述
// * @Author : Rui //作者
// * @Date: 2023/8/3  11:31
// */
//@Service
//public class ArticleServiceImpl implements ArticleService {
//    @Autowired
//    private ArticleMapper articleMapper;
//
//
//    @Override
//    public Result listArticle(PageParams pageParams) {
//        Page<Article> page = new Page<>(pageParams.getPage(), pageParams.getPageSize());
//        LambdaQueryWrapper<Article> wrapper = new LambdaQueryWrapper<>();
//
//        wrapper.orderByDesc(Article::getWeight, Article::getCreateDate);
//        Page<Article> articlePage = articleMapper.selectPage(page, wrapper);
//        List<Article> records = articlePage.getRecords();
//        List<ArticleVo> articleVoList = copyList(records);
//        return Result.success(articleVoList);
//    }
//
//    private List<ArticleVo> copyList(List<Article> records) {
//        ArrayList<ArticleVo> articleVoList = new ArrayList<>();
//        for (Article record : records) {
//            articleVoList.add(copy(record));
//        }
//        return articleVoList;
//    }
//    private ArticleVo copy(Article article){
//        ArticleVo articleVo = new ArticleVo();
//        articleVo.setCreateDate(new DateTime(article.getCreateDate()).toString("yyyy-MM-dd HH:mm"));
//        BeanUtils.copyProperties(article,articleVo);
//        return articleVo;
//    }
//}
