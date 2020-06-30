package com.yumi.blog.controller;

import com.yumi.blog.model.UserInfo;
import com.yumi.blog.service.UserInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author panym
 * @Description: ${blog用户接口}
 * @date 15:42  2020/6/23
 */
@Api(tags = "userInfoController", description = "管理平台用户信息接口")
@RestController
@RequestMapping("/mgmt/userInfo")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;


    @ApiOperation(value = "获取所有用户信息")
    @GetMapping("/findAll")
    public List<UserInfo> findAllUserInfo(){
        return userInfoService.findAllUserInfo();
    }

}
