package com.sxy.ibf.repository.mybatis.dao;

/**
 * @Description
 * @Author sxydmy
 * @Date 2020/4/20
 **/
public class SystemResourcesDO {

    private String parentId;
    private String resourcesCode;
    private String resourcesCname;

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getResourcesCode() {
        return resourcesCode;
    }

    public void setResourcesCode(String resourcesCode) {
        this.resourcesCode = resourcesCode;
    }

    public String getResourcesCname() {
        return resourcesCname;
    }

    public void setResourcesCname(String resourcesCname) {
        this.resourcesCname = resourcesCname;
    }
}
