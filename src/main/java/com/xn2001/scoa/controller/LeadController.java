package com.xn2001.scoa.controller;

import com.alibaba.excel.EasyExcel;
import com.xn2001.scoa.config.CourseListener;
import com.xn2001.scoa.config.GradeListener;
import com.xn2001.scoa.config.StudentListener;
import com.xn2001.scoa.entity.Course;
import com.xn2001.scoa.entity.Grade;
import com.xn2001.scoa.entity.RespBean;
import com.xn2001.scoa.entity.Student;
import com.xn2001.scoa.service.CourseService;
import com.xn2001.scoa.service.GradeService;
import com.xn2001.scoa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by 乐心湖 on 2020/4/28 22:38
 */
@RestController
public class LeadController {

    @Autowired
    private StudentService studentService;
    @Autowired
    private CourseService courseService;
    @Autowired
    private GradeService gradeService;

    @PostMapping("/lead/import")
    public RespBean importData(MultipartFile file) throws IOException {
        InputStream inputStream1 = file.getInputStream();
        EasyExcel.read(inputStream1, Student.class, new StudentListener(studentService)).sheet().doRead();
        InputStream inputStream2 = file.getInputStream();
        EasyExcel.read(inputStream2, Course.class, new CourseListener(courseService)).sheet().doRead();
        InputStream inputStream3 = file.getInputStream();
        EasyExcel.read(inputStream3, Grade.class, new GradeListener(gradeService)).sheet().doRead();
        return RespBean.ok("上传成功！");
    }
}
