package com.yumi.blog.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author panym
 * @Description: ${文章}
 * @date 11:30  2020/6/30
 */
@Getter
@Setter
public class Article extends  BaseModel{

    /**
     * 简介
     */
    private String brief;
    /**
     * 内容
     */
    private String content;
    /**
     * 副标题
     */
    private String subTitle;
    /**
     * 标题
     */
    private String title;
    /**
     * 可见性 1 可见 0 不可见
     */
    private Integer visible;
    /**
     * 作者Id
     */
    private Long userId;
    /**
     * 类型Id
     */
    private Integer typeId;
    /**
     * 二级类型Id
     */
    private Integer subTypeId;


}
