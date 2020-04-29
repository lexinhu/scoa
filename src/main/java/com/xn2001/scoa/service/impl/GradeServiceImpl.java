package com.xn2001.scoa.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xn2001.scoa.entity.Course;
import com.xn2001.scoa.entity.Grade;
import com.xn2001.scoa.mapper.GradeMapper;
import com.xn2001.scoa.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 乐心湖 on 2020/4/28 19:53
 */
@Service
public class GradeServiceImpl implements GradeService {

    @Autowired
    private GradeMapper gradeMapper;

    @Override
    public Integer selectCount(Grade grade) {
        QueryWrapper<Grade> wrapper = new QueryWrapper<>();
        wrapper.eq("s_num", grade.getNum());
        wrapper.eq("c_id", grade.getCid());
        Integer integer = gradeMapper.selectCount(wrapper);
        return integer;
    }

    @Override
    public int insert(List<Grade> grades) {
        return gradeMapper.insert(grades);
    }


}
