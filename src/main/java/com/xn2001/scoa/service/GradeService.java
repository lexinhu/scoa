package com.xn2001.scoa.service;

import com.xn2001.scoa.entity.Course;
import com.xn2001.scoa.entity.Grade;

import java.util.List;

/**
 * Created by 乐心湖 on 2020/4/22 21:31
 */
public interface GradeService {

    /**
     * 查询用户是否存在过成绩
     * @param grade
     * @return 数量
     */
    Integer selectCount(Grade grade);

    int insert(List<Grade> grades);
}
