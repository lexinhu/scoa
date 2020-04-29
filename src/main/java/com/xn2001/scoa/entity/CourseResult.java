package com.xn2001.scoa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by 乐心湖 on 2020/4/22 23:22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseResult implements Serializable {

    private String name;
    private String number;
    private Integer year;

    /**
     专业支撑课(27)
     */
    private BigDecimal pSc;
    /**
     公共必修课(32)
     */
    private BigDecimal pCc;
    /**
     集中实践课(31)
     */
    private BigDecimal iPu;
    /**
     素质拓展课(8)
     */
    private BigDecimal qDs;
    /**
     专业拓展课(15)
     */
    private BigDecimal pD;
    /**
     专业核心课(18)
     */
    private BigDecimal cC;

}
