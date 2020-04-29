package com.xn2001.scoa.controller;

import com.xn2001.scoa.entity.RespBean;
import com.xn2001.scoa.entity.StudentResult;
import com.xn2001.scoa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 乐心湖 on 2020/4/21 11:27
 */
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/getSelf/{number}")
    public RespBean getSelf(@PathVariable("number") String number){
        List<StudentResult> results = studentService.getSelf(number);
        return RespBean.ok("查询成功",results);
    }
}
