package com.mmall.common;

/**
 * Created by Administrator on 2019/5/12.
 */
public class Const {
    public  static final String CERRENT_USER = "currentUser";

    public static final String EMAIL = "email";
    public static final String USERNAME = "username";

    public interface Role{
        int ROLE_CUSTOMENT = 0;//普通用户
        int ROLE_ADMIN = 1;//管理员
    }
}
