package com.sxy.ibf.web;

import com.sxy.ibf.security.SecurityUtils;
import com.sxy.ibf.security.oauth2.AuthoritiesConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description
 * @Author sxydmy
 * @Date 2020/4/14
 **/
@RestController
public class TestController {


    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/api/test")
    public String test(){

        return "{\"description\": \""+SecurityUtils.getCurrentUserLogin()+" isAuthenticated="+SecurityUtils.isAuthenticated()+" UserInRole="+ SecurityUtils.isCurrentUserInRole(AuthoritiesConstants.ADMIN)+"\", \"status\": \"UP\" }";
    }



    @RequestMapping("/api/user")
    public String user(){
        return SecurityUtils.getCurrentUserLogin();
    }
}
