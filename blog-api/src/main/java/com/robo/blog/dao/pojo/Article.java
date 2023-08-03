package com.robo.blog.dao.pojo;

import lombok.Data;

@Data
public class Article {
  public static final int Article_TOP = 1;
  public static final int Article_Common = 0;
  private Long id;
  private int commentCounts;
  private Long createDate;
  private String summary;
  private String title;
  private int viewCounts;
  private Long authorId;
  /**
   * 内容id
   */
  private Long bodyId;
  private Long categoryId;
  /**
   * 置顶
   */
  private int weight = Article_Common;



}
