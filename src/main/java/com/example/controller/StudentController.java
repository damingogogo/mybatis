package com.example.controller;

import com.example.entity.StudentInfo;
import com.example.mapper.StudentMapper;
import com.example.service.StudentService;
import com.example.util.RedisUtil;
import com.xiaoleilu.hutool.json.JSONObject;
import com.xiaoleilu.hutool.json.JSONUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;


@Controller
//@RequestMapping("/stu")
public class StudentController {

    @Autowired(required = false)
    private StudentService studentService;

    @Autowired
    private StudentMapper studentMapper;


    /**
     * 查询全部信息
     *
     * @return
     */
    @GetMapping("/list")
    public List<StudentInfo> getAllStudent() {
        return studentService.selectAll();
    }

    private RedisUtil redisUtil;

    @Autowired
    public void setRedisUtil(RedisUtil redisUtil) {
        this.redisUtil = redisUtil;
    }

    /**
     * 根据名称查询
     * @param sname
     * @return
     */
    @PostMapping("/listByCon")
    public List<StudentInfo> getStuByCon(@RequestBody JSONObject ... sname) {
        redisUtil.setValue("test", sname[2]);
        System.out.println(redisUtil.getValue("test"));
        return studentMapper.selectByName("123");
    }

//    @PostMapping("/listByCon")
//    public List<StudentInfo> getStuByCon(@RequestBody HashMap<String,String> map) {
//        String sname=map.get("sname");
//        System.out.println(sname);
//        return studentMapper.selectByName(sname);
//    }


    /**
     * 通过id查询学生信息
     *
     * @param id
     * @return
     */
    @RequestMapping("getInfo/{id}")
    public StudentInfo getInfo(@PathVariable int id) {

        return studentService.getStudentInfo(id);
    }

    /**
     * 插入新学生信息
     *
     * @param studentInfo
     * @return
     */
    @RequestMapping("/insert/*")
    public StudentInfo insert(StudentInfo studentInfo) {
        return studentService.insertInfo(studentInfo);
    }


    /**
     * 根据id删除学生信息
     *
     * @param id
     * @return
     */
    @RequestMapping("/delete")
    public String deleteInfo(int id) {
        int result = studentService.deleteById(id);
        if (result >= 1) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }

    /**
     * 根据id修改学生信息
     *
     * @param studentInfo
     * @return
     */
    @RequestMapping("/update/*")
    public String updateById(StudentInfo studentInfo) {
        int result = studentService.updateById(studentInfo);
        if (result >= 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }
    }

    /**
     * 查看全部学生信息
     *
     * @return
     */
    @RequestMapping("/selectAll")
    public List<StudentInfo> ListStudent() {
        return studentService.selectAll();
    }


    @GetMapping("/index")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;


    }

}

