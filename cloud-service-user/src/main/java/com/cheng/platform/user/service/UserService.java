package com.cheng.platform.user.service;

import com.cheng.platform.common.base.BaseService;
import com.cheng.platform.common.bean.user.SysUser;
import com.cheng.platform.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author fengcheng
 * @version 2017/2/28
 */
@Service
public class UserService extends BaseService<SysUser> {

    private final UserMapper userMapper;

    @Autowired
    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public SysUser getUserBySql(String id) {
        return userMapper.getUserBySql(id);
    }
}
