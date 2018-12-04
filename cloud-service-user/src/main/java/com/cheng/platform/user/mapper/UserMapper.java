package com.cheng.platform.user.mapper;

import com.cheng.platform.common.base.BaseMapper;
import com.cheng.platform.common.bean.user.SysUser;
import org.springframework.stereotype.Repository;

/**
 * @author fengcheng
 * @version 2017/2/28
 */
@Repository
public interface UserMapper extends BaseMapper<SysUser> {

    SysUser getUserBySql(String id);
}
