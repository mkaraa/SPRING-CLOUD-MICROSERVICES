package com.example.studentservice.errorHandler;

public class StudentNotFoundException extends RuntimeException {
    private Integer code;

    public StudentNotFoundException(String msg){
        super(msg);
    }

    public StudentNotFoundException(String msg, int code){
        super(msg);
        this.code = code;
    }


    public Integer getCode(){
        return code;
    }
}
