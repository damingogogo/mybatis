package com.example.service.impl;

import com.example.entity.StudentInfo;
import com.example.mapper.StudentMapper;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired(required = false)
    private StudentMapper studentMapper;

    @Override
    public StudentInfo getStudentInfo(int id){
        return studentMapper.getInfo(id);
    }

    @Override
    public StudentInfo insertInfo(StudentInfo studentInfo){
        studentMapper.insertInfo(studentInfo);
        return studentInfo;
    }

    @Override
    public int deleteById(int id){
        return studentMapper.deleteById(id);
    }

    @Override
    public int updateById(StudentInfo studentInfo){
        return studentMapper.updateById(studentInfo);
    }

    @Override
    public List<StudentInfo> selectAll(){
        return studentMapper.selectAll();
    }
}

