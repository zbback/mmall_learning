package com.mmall.common;

public class Conts2 {
    public enum PersonImfo{
        LIKENAN(1,"男的"),
        LIKEWOMAN(2,"女的");

        private String value;
        private int code;

        PersonImfo(int code,String value){
            this.code = code;
            this.value = value;
        }

        public String getValue(){return value;}
        public int getCode(){return code;}

    }
}
