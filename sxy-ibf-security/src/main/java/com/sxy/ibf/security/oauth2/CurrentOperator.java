package com.sxy.ibf.security.oauth2;

import com.sxy.ibf.security.SecurityUtils;

/**
 * Created by zhw on 2017-11-07.
 */
public final class CurrentOperator {

    public static String getName(){
        return SecurityUtils.getCurrentUserLogin().split("_")[1];
    }
    public static Integer getId(){

        return new Integer(SecurityUtils.getCurrentUserLogin().split("_")[0]);
    }
    public static String getSystemName(){
        return "System";
    }
    public static Integer getSystemId(){
        return new Integer(1);
    }
    public static String getIp(){
        return "192.168.3.24";
    }
    public static String getUserName(){
        String userName = SecurityUtils.getCurrentUserLogin().split("_")[1];
        if("xxJob".equals(userName)){
            return null;
        }else{
            return userName;
        }
    }
    public static Integer getUserId(){
        String userName = SecurityUtils.getCurrentUserLogin().split("_")[1];
        if("xxJob".equals(userName)){
            return null;
        }else{
            return new Integer(SecurityUtils.getCurrentUserLogin().split("_")[0]);
        }
    }
    public static Long getUserIdByLong(){
        String userName = SecurityUtils.getCurrentUserLogin().split("_")[1];
        if("xxJob".equals(userName)){
            return 10086L;
        }else{
            return new Long(SecurityUtils.getCurrentUserLogin().split("_")[0]);
        }
    }
}
