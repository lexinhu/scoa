package com.xn2001.scoa.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by 乐心湖 on 2020/4/20 21:06
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements UserDetails, Serializable {
    @ExcelIgnore
    private Long id;
    @ExcelProperty("学号")
    @TableId(type = IdType.INPUT)
    private String number;
    @ExcelProperty("姓名")
    private String name;
    @ExcelIgnore
    private String password;
    @ExcelProperty("性别")
    private String sex;
    @ExcelProperty("学院")
    private String college;
    @ExcelProperty("专业")
    private String major;
    @ExcelProperty("年级")
    private String year;
    @ExcelProperty("班级")
    private String claee;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getUsername() {
        return number;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
