package com.xn2001.scoa.service;

import com.xn2001.scoa.entity.Student;
import com.xn2001.scoa.entity.StudentResult;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

/**
 * Created by 乐心湖 on 2020/4/20 22:02
 */
public interface StudentService {
    List<StudentResult> getSelf(String number);
    int insert(List<Student> students);
}
