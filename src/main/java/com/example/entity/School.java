package com.example.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * school
 */
@Data
public class School implements Serializable {
    /**
     * ID
     */
    private Integer id;

    /**
     * 学校名称
     */
    private String name;

    /**
     * 学校代码
     */
    private String code;

    /**
     * 排序
     */
    private String sort;

    /**
     * 学校地址
     */
    private String address;

    /**
     * 学校图片
     */
    private String images;

    /**
     * 年级总人数
     */
    private String njNumber;

    /**
     * 班级总人数
     */
    private String bjNumber;

    /**
     * 学校总人数
     */
    private String schoolNumber;

    private static final long serialVersionUID = 1L;
}