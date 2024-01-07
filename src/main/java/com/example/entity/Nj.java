package com.example.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * nj
 */
@Data
public class Nj implements Serializable {
    /**
     * ID
     */
    private Integer id;

    /**
     * 年级名称
     */
    private String name;

    /**
     * 班级总数
     */
    private String bjNumber;

    /**
     * 年级总人数
     */
    private String njNumber;

    /**
     * 学校id
     */
    private Integer schoolId;

    private static final long serialVersionUID = 1L;
}