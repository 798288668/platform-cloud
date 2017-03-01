package com.dsjk.platform.modules.sys.mapper;

import com.dsjk.platform.framework.common.CommonMapper;
import com.dsjk.platform.modules.sys.bean.SysUser;
import org.springframework.stereotype.Repository;

/**
 * @author fengcheng
 * @version 2017/2/28
 */
@Repository
public interface UserMapper extends CommonMapper<SysUser> {
    SysUser getById(Integer id);

}
