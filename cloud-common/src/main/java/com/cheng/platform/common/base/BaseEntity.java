package com.cheng.platform.common.base;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.persistence.Id;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * @author fengcheng
 * @version 2017/2/28
 */
public abstract class BaseEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 实体编号（唯一标识）
     */
    @Id
    protected String id;

    @Transient
    protected Integer pageNum = 1;

    @Transient
    protected Integer pageSize = 10;

    public BaseEntity() {

    }

    public BaseEntity(String id) {
        this();
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    /**
     * 删除标记（0：正常；1：删除；2：审核；）
     */
    public static final String DEL_FLAG_NORMAL = "0";
    public static final String DEL_FLAG_DELETE = "1";
    public static final String DEL_FLAG_AUDIT = "2";
}
