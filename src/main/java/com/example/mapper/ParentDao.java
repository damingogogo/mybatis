package com.example.mapper;

import com.example.entity.Parent;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ParentDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Parent record);

    int insertSelective(Parent record);

    Parent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Parent record);

    int updateByPrimaryKey(Parent record);

    List<Parent> selectAll();
}