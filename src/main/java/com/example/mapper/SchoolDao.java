package com.example.mapper;

import com.example.entity.School;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolDao {
    int deleteByPrimaryKey(Integer id);

    int insert(School record);

    int insertSelective(School record);

    School selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(School record);

    int updateByPrimaryKey(School record);
}