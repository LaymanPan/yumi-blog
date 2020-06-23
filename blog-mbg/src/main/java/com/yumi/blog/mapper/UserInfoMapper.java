package com.yumi.blog.mapper;

import com.yumi.blog.model.UserInfo;

import java.util.List;

/**
 * @author panym
 * @Description: ${todo}
 * @date 16:30  2020/6/23
 */
public interface UserInfoMapper {
    void create(UserInfo userInfo);

    List<UserInfo> findAll();
}
