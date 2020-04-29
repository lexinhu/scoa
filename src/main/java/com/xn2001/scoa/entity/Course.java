package com.xn2001.scoa.entity;

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
 * Created by 乐心湖 on 2020/4/20 21:13
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course implements Serializable {

    @ExcelProperty("课程代码")
    @TableId(type = IdType.INPUT)
    private Long id;
    @ExcelProperty("课程名称")
    private String name;
    @ExcelProperty("开课学院")
    private String college;
    @ExcelProperty("学分")
    private String credit;
    @ExcelProperty("课程类别")
    private String sort;
    @ExcelProperty("课程标记")
    private String sign;

}
