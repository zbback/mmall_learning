package com.mmall.common;

public class OrderEnum {
    public enum OrderSendAdress{

        BEIJING(1,"北京"),
        SHANGHAI(2,"上海");

        private int code;
        private String value;
        OrderSendAdress(int code,String value){
            this.code = code;
            this.value = value;
        }
        public int getCode(){return code;}
        public String getValue(){return value;}
    }
}
