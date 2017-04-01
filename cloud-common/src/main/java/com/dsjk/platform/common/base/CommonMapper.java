package com.dsjk.platform.common.base;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author fengcheng
 * @version 2017/2/28
 */
public interface CommonMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
