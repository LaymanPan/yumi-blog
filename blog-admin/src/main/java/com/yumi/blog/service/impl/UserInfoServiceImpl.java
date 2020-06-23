package com.yumi.blog.service.impl;

import com.yumi.blog.mapper.UserInfoMapper;
import com.yumi.blog.model.UserInfo;
import com.yumi.blog.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author panym
 * @Description: ${todo}
 * @date 16:03  2020/6/23
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;


    @Override
    public void register(UserInfo userInfo) {
        userInfoMapper.create(userInfo);
    }

    @Override
    public List<UserInfo> findAllUserInfo() {
        return userInfoMapper.findAll();
    }
}
