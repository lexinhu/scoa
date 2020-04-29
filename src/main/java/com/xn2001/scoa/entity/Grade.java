package com.xn2001.scoa.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by 乐心湖 on 2020/4/22 21:20
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Grade implements Serializable {

    @TableId(type = IdType.AUTO)
    @ExcelIgnore
    private Long id;
    @ExcelProperty("课程代码")
    @TableField("c_id")
    private Long cid;
    @ExcelProperty("任课教师")
    @TableField("t_name")
    private String tname;
    @ExcelProperty("学号")
    @TableField("s_num")
    private String num;
    @ExcelProperty("成绩")
    private Integer gd;
    @ExcelProperty("学年")
    private String year;
    @ExcelProperty("学期")
    private String term;
    @ExcelProperty("绩点")
    private String gpa;
    @ExcelProperty("成绩备注")
    private String sign;

}
