package com.sxy.ibf.security.oauth2;

import com.sxy.ibf.security.SecurityUtils;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @Description 接口访问授权检查过滤器
 * @Author sxydmy
 * @Date 2020/4/16
 **/
@Component
@WebFilter(urlPatterns = "/api/**", filterName = "AuthenticatedFilter")
@ConditionalOnProperty(name = "authenticated.filterEnabled", havingValue = "true")
public class AuthenticatedFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        // 未授权拦截
        if(SecurityUtils.isAuthenticated()){
            filterChain.doFilter(servletRequest,servletResponse);
        }
    }
}
