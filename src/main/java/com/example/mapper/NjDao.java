package com.example.mapper;

import com.example.entity.Nj;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface NjDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Nj record);

    int insertSelective(Nj record);

    Nj selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Nj record);

    int updateByPrimaryKey(Nj record);

    List<Nj> listAll();
}