package com.example.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

//与数据库表结构相同
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudentInfo {
    private String id;
    private String sname;
    private String classId;
    private String birthday;
    private String email;
}
