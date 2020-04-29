package com.xn2001.scoa.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xn2001.scoa.entity.Student;
import com.xn2001.scoa.entity.StudentResult;
import com.xn2001.scoa.mapper.StudentMapper;
import com.xn2001.scoa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 乐心湖 on 2020/4/20 22:08
 */
@Service
public class StudentServiceImpl implements StudentService,UserDetailsService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("number",s);
        Student student = studentMapper.selectOne(queryWrapper);
        if (student == null){
            throw new UsernameNotFoundException("学号不存在");
        }
        return student;
    }

    @Override
    public List<StudentResult> getSelf(String number){
        return studentMapper.getSelf(number);
    }

    @Override
    public int insert(List<Student> students) {
        return studentMapper.insert(students);
    }
}
