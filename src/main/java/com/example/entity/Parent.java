package com.example.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * parent
 */
@Data
public class Parent implements Serializable {
    /**
     * ID
     */
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 学校
     */
    private Integer shoolId;

    private static final long serialVersionUID = 1L;
}