package com.example.addressservice.errorHandler;

public class AddressNotFoundException extends RuntimeException {
    private Integer code;

    public AddressNotFoundException(String msg){
        super(msg);
    }

    public AddressNotFoundException(String msg, int code){
        super(msg);
        this.code = code;
    }

    public Integer getCode(){
        return code;
    }
}
