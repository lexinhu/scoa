package com.xn2001.scoa.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xn2001.scoa.entity.Course;
import com.xn2001.scoa.entity.CourseResult;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by 乐心湖 on 2020/4/23 0:07
 */
@Mapper
public interface CourseMapper extends BaseMapper<CourseResult> {
    List<CourseResult> selectCredit();
    List<CourseResult> selectCredit(Page<CourseResult> page);
    int insert(List<Course> courses);
}
