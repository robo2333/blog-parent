package com.robo.blog.vo.params;

import lombok.Data;

/**
 * @ClassName : PageParams  //类名
 * @Description :   //描述
 * @Author : Rui //作者
 * @Date: 2023/8/3  10:47
 */
@Data
public class PageParams {
    private int page = 1;
    private int pageSize = 10;
}
