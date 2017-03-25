package com.dsjk.platform.user.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author fengcheng
 * @version 2017/2/28
 */
public interface CommonMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
