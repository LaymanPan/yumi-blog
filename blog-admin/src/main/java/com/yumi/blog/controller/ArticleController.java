package com.yumi.blog.controller;

import com.yumi.blog.model.Article;
import com.yumi.blog.service.ArticleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author panym
 * @Description: ${文章管理接口}
 * @date 13:01  2020/6/30
 */
@Api(tags = "articleController", description = "管理平台文章信息接口")
@RestController
@RequestMapping("/mgmt/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;


    @ApiOperation(value = "获取所有文章信息")
    @GetMapping("/findAll")
    public List<Article> findAllArticle(){return articleService.findAll();}

}
