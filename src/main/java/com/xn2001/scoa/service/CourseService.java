package com.xn2001.scoa.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xn2001.scoa.entity.Course;
import com.xn2001.scoa.entity.CourseResult;

import java.util.List;

/**
 * Created by 乐心湖 on 2020/4/23 11:11
 */
public interface CourseService {
    List<CourseResult> selectCredit();
    List<CourseResult> selectCreditPage(Page<CourseResult> page);
    int insert(List<Course> courses);
}
