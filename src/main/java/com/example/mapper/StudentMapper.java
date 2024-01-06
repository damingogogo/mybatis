package com.example.mapper;

import com.example.entity.StudentInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface StudentMapper{

    /**
     * 根据学生ID查询学生信息
     * @param id
     * @return
     */
    StudentInfo getInfo(int id);

    /**
     * 插入新学生信息
     * @param studentInfo
     */
    void insertInfo(StudentInfo studentInfo);


    /**
     * 根据ID删除学生信息
     * @param id
     */
    int deleteById(int id);


    /**
     * 根据id修改学生信息
     * @param studentInfo
     * @return
     */
    int updateById(StudentInfo studentInfo);

    /**
     * 查询全部学生信息
     * @return
     */
    List<StudentInfo> selectAll();


    List<StudentInfo> selectByName(String sname);
}
