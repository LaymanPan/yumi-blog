package com.yumi.blog.service.impl;

import com.yumi.blog.mapper.ArticleMapper;
import com.yumi.blog.model.Article;
import com.yumi.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author panym
 * @Description: ${todo}
 * @date 13:03  2020/6/30
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public List<Article> findAll() {
        return articleMapper.findAll();
    }
}
