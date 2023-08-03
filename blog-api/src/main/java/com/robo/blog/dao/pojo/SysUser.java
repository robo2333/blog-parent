package com.robo.blog.dao.pojo;

import lombok.Data;

/**
 * @ClassName : SysUser  //类名
 * @Description :   //描述
 * @Author : Rui //作者
 * @Date: 2023/8/3  10:42
 */
@Data
public class SysUser {
    private Long id;

    private String account;

    private Integer admin;

    private String avatar;

    private Long createDate;

    private Integer deleted;

    private String email;

    private Long lastLogin;

    private String mobilePhoneNumber;

    private String nickname;

    private String password;

    private String salt;

    private String status;
}
