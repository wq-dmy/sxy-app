package com.sxy.ibf.repository.mybatis.mapper;

import com.sxy.ibf.repository.mybatis.dao.SystemResourcesDO;

import java.util.List;

/**
 * @Description
 * @Author sxydmy
 * @Date 2020/4/20
 **/
public interface SystemResourcesMapper {


    List<SystemResourcesDO>  findByPidSystemResource();
}
