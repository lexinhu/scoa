package com.xn2001.scoa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by 乐心湖 on 2020/4/23 19:40
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentResult {

    private Long id;
    private String name;
    private String number;
    private String claee;
    private Course course;
    private Grade grade;

}
