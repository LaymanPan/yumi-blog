package com.yumi.blog.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author panym
 * @Description: ${}
 * @date 11:48  2020/6/30
 */
@Getter
@Setter
public class BaseModel {

    /**
     * id
     */
    private Long id;
    /**
     * 名称
     */
    private String name;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 创建人
     */
    private String creator;

}
