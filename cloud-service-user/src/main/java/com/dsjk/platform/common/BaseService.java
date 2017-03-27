package com.dsjk.platform.common;

import com.dsjk.platform.common.base.DataEntity;
import com.dsjk.platform.common.bean.user.SysUser;
import com.dsjk.platform.common.utils.IdWorker;
import com.dsjk.platform.common.utils.StringUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author fengcheng
 * @version 2017/3/26
 */
@Service
public abstract class BaseService<T extends DataEntity<T>> {

    @Autowired
    protected Mapper<T> mapper;

    public T get(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    public T get(T entity) {
        return mapper.selectOne(entity);
    }

    public List<T> getList(T entity) {
        return mapper.select(entity);
    }

    public PageInfo<T> getPage(T entity) {
        PageHelper.startPage(entity.getPageNum(), entity.getPageSize());
        List<T> list = mapper.select(entity);
        return new PageInfo<>(list);
    }

    public int save(T entity) {
        if (StringUtils.isEmpty(entity.getId())) {
            entity.setId(IdWorker.getId() + "");
            return mapper.insertSelective(entity);
        } else {
            return mapper.updateByPrimaryKeySelective(entity);
        }
    }

    public int delete(T entity) {
        return mapper.delete(entity);
    }
}
