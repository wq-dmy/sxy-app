package com.sxy.ibf.repository.mybatis.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @ClassName: MyBatisMapperConfig
 * @Description:
 * @author sxyzla
 * @date 2020年02月17日 15:00:06
 *
 */
@Configuration
@EnableCaching
@EnableScheduling
@MapperScan(basePackages = { "com.sxy.ibf.repository.mybatis.mapper" })
public class MyBatisMapperConfig {

    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        return paginationInterceptor;
    }
}
