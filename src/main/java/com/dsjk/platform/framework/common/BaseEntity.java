package com.dsjk.platform.framework.common;

import javax.persistence.Transient;
import java.io.Serializable;

/**
 * @author fengcheng
 * @version 2017/2/28
 */
public abstract class BaseEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    @Transient
    protected Integer pageNum = 1;
    @Transient
    protected Integer pageSize = 10;

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
}
