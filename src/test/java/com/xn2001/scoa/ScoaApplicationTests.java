package com.xn2001.scoa;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xn2001.scoa.entity.Course;
import com.xn2001.scoa.entity.CourseResult;
import com.xn2001.scoa.entity.Student;
import com.xn2001.scoa.entity.StudentResult;
import com.xn2001.scoa.mapper.CourseMapper;
import com.xn2001.scoa.mapper.StudentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class ScoaApplicationTests {

    @Test
    void contextLoads() {
    }

    @Resource
    private StudentMapper studentMapper;

    @Resource
    private CourseMapper courseMapper;

    @Test
    public void t1(){
        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("number","1901010347");
        Student student = studentMapper.selectOne(queryWrapper);
        System.out.println(student);
    }

    @Test
    public void t2(){
        List<CourseResult> results = courseMapper.selectCredit();
        for (CourseResult result : results) {
            System.out.println(result);
        }
    }

    @Test
    public void t3(){
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String encode = bCryptPasswordEncoder.encode("123456");
        System.out.println(encode);

    }

    @Test
    public void t4(){
        List<StudentResult> self = studentMapper.getSelf("1901010447");
        System.out.println(self);
    }

}
