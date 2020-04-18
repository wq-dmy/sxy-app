package com.sxy.ibf.web;

import com.sxy.ibf.security.SecurityUtils;
import com.sxy.ibf.security.oauth2.OAuth2AuthenticationNew;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author sxydmy
 * @Date 2020/4/14
 **/
@RestController
public class TestController {


    Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/api/user")
    public String user(){
        OAuth2AuthenticationNew auth2AuthenticationNew = SecurityUtils.getAuthentication();

        if(auth2AuthenticationNew != null){

            logger.info("xing=" + auth2AuthenticationNew.getXing());
            logger.info("user=" + auth2AuthenticationNew.getUserAuthentication().getPrincipal());
            auth2AuthenticationNew.getAuthorities().stream().forEach((a)->{
                logger.info("Authority:"+a.getAuthority());
            });
            return auth2AuthenticationNew.getXing();
        }else {
            logger.warn("无用户登录信息！");
            return "无用户登录信息！";
        }



    }
}
