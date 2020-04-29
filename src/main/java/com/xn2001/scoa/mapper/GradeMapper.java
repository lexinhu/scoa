package com.xn2001.scoa.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xn2001.scoa.entity.Grade;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by 乐心湖 on 2020/4/22 21:31
 */
@Mapper
public interface GradeMapper extends BaseMapper<Grade> {
    int insert(List<Grade> grades);
}
