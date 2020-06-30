package com.yumi.blog.model;


import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author panym
 * @Description: ${用户信息}
 * @date 16:04  2020/6/23
 */
@Getter
@Setter
public class UserInfo extends BaseModel{

    /**
     * 头像地址
     */
    private String avatarUrl;
    /**
     * 出生日期
     */
    private Date birth;
    /**
     * email地址
     */
    private String email;
    /**
     * 个人简介
     */
    private String intro;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 登录账号
     */
    private String username;
    /**
     * 登录密码（MD5加密）
     */
    private String password;
    /**
     * 性别 1 男 0 女
     */
    private int sex;
    /**
     * 用户状态
     */
    private int status;

}
