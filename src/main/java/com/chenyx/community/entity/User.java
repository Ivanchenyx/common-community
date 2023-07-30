package com.chenyx.community.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Project: common-community
 * @Package: com.chenyx.community.entity
 * @Author: chenyanxi
 * @Version: 1.0
 * @Description: 用户实体类
 */
@SuppressWarnings("all")
@Data
public class User {
    private int id;
    private String username;
    private String password;
    private String salt;
    private String email;
    private int type;  // 0-普通用户; 1-超级管理员; 2-版主;
    private int status;  // 0-未激活; 1-已激活;
    private String activationCode;  // 激活码
    private String headerUrl;  // 头像图片地址
    private Date createTime;  // 注册时间
}
