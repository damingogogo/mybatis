package com.example.service;


import com.example.entity.StudentInfo;

import java.util.List;

public interface StudentService {

    StudentInfo getStudentInfo(int id);

    StudentInfo insertInfo(StudentInfo studentInfo);

    int deleteById(int id);

    int updateById(StudentInfo studentInfo);

    List<StudentInfo> selectAll();
}

