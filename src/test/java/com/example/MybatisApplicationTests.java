package com.example;

import com.example.entity.StudentInfo;
import com.example.mapper.StudentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisApplicationTests {
    @Autowired
    private StudentMapper studentMapper;

    @Test
    void testgetall() {
        List<StudentInfo> studentInfos = studentMapper.selectAll();
        assert studentInfos.size()>0;
    }

}
