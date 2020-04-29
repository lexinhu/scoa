package com.xn2001.scoa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by 乐心湖 on 2020/4/21 14:28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RespBean {

    private Integer status;
    private String msg;
    private Object object;

    public static RespBean ok(String msg){
        return new RespBean(200,msg,null);
    }
    public static RespBean ok(String msg,Object obj){
        return new RespBean(200,msg,obj);
    }
    public static RespBean error(String msg){
        return new RespBean(500,msg,null);
    }
    public static RespBean error(String msg,Object obj){
        return new RespBean(500,msg,obj);
    }

}
