package com.project.finalpoint.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    private Integer code;//0代表失败，1代表成功
    private String msg;//相应的信息
    private Object data;//返回的数据

    //各种相应的详细信息
    public static Result success(){
        return new Result(1,"success",null);
    }

    public static Result success(Object object){
        return new Result(1,"success",object);
    }

    public static Result error(String msg){
        return new Result(0,msg,null);
    }
}
