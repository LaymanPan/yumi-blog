package com.yumi.blog.mapper;

import java.util.List;

/**
 * @author panym
 * @Description: ${todo}
 * @date 12:53  2020/6/30
 */
public interface BaseMapper <T> {

    void create(T t);

    void update(T t);

    List<T> findAll();

    void removeById(long id);

}
