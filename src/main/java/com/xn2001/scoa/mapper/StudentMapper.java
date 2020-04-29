package com.xn2001.scoa.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xn2001.scoa.entity.Student;
import com.xn2001.scoa.entity.StudentResult;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * Created by 乐心湖 on 2020/4/20 21:54
 */
@Mapper
public interface StudentMapper extends BaseMapper<Student> {
    List<StudentResult> getSelf(String number);
    int insert(List<Student> students);
}
