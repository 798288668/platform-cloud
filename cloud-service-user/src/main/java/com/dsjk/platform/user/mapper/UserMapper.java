package com.dsjk.platform.user.mapper;

import com.dsjk.platform.common.base.CommonMapper;
import com.dsjk.platform.common.bean.user.SysUser;
import org.springframework.stereotype.Repository;

/**
 * @author fengcheng
 * @version 2017/2/28
 */
@Repository
public interface UserMapper extends CommonMapper<SysUser> {

    SysUser getUserBySql(String id);
}
