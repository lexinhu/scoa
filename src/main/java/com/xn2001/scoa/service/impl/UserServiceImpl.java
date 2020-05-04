package com.xn2001.scoa.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xn2001.scoa.entity.User;
import com.xn2001.scoa.mapper.UserMapper;
import com.xn2001.scoa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by 乐心湖 on 2020/5/4 13:36
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username",s);
        User user = userMapper.selectOne(queryWrapper);
        if (user == null){
            throw new UsernameNotFoundException("用户不存在");
        }
        return user;
    }
}
