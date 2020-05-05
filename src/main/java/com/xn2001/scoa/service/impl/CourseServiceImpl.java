package com.xn2001.scoa.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xn2001.scoa.entity.Course;
import com.xn2001.scoa.entity.CourseResult;
import com.xn2001.scoa.mapper.CourseMapper;
import com.xn2001.scoa.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 乐心湖 on 2020/4/23 11:13
 */
@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public List<CourseResult> selectCredit() {
        return courseMapper.selectCredit();
    }

    @Override
    public List<CourseResult> selectCreditPage(Page<CourseResult> page) {
        return courseMapper.selectCredit(page);
    }

    @Override
    public int insert(List<Course> courses) {
        return courseMapper.insert(courses);
    }

}
