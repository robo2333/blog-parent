package com.robo.blog.vo;

import lombok.Data;

import java.util.List;

/**
 * @ClassName : ArticleVo  //类名
 * @Description :   //描述
 * @Author : Rui //作者
 * @Date: 2023/8/3  11:30
 */
@Data
public class ArticleVo {
    private Long id;

    private String title;

    private String summary;

    private int commentCounts;

    private int viewCounts;

    private int weight;
    /**
     * 创建时间
     */
    private String createDate;

    private String author;

    private ArticleBodyVo body;

    private List<TagVo> tags;

    private List<CategoryVo> categorys;
}
