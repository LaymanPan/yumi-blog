package com.yumi.blog.service;

import com.yumi.blog.model.UserInfo;

import java.util.List;

/**
 * @author panym
 * @Description: ${todo}
 * @date 16:03  2020/6/23
 */
public interface UserInfoService {
    void register(UserInfo userInfo);

    List<UserInfo> findAllUserInfo();
}
