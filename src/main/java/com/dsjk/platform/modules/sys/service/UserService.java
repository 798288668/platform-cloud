package com.dsjk.platform.modules.sys.service;

import com.dsjk.platform.modules.sys.bean.SysUser;
import com.dsjk.platform.modules.sys.mapper.UserMapper;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author fengcheng
 * @version 2017/2/28
 */
@Service
public class UserService {

    private final UserMapper userMapper;

    @Autowired
    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<SysUser> getUserList(SysUser user) {
        PageHelper.startPage(user.getPageNum(), user.getPageSize());
        return userMapper.selectAll();
    }

}
