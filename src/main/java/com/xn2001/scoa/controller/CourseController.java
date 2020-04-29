package com.xn2001.scoa.controller;

import com.xn2001.scoa.entity.CourseResult;
import com.xn2001.scoa.entity.RespBean;
import com.xn2001.scoa.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 乐心湖 on 2020/4/23 11:16
 */
@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/select/credit")
    public RespBean selectCredit(){
        List<CourseResult> results = courseService.selectCredit();
        return RespBean.ok("查询成功",results);
    }
}
