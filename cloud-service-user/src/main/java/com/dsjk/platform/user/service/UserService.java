package com.dsjk.platform.user.service;

import com.dsjk.platform.common.BaseService;
import com.dsjk.platform.common.bean.user.SysUser;
import com.dsjk.platform.user.mapper.UserMapper;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


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


    public List<SysUser> getUserList(SysUser user) {
        PageHelper.startPage(user.getPageNum(), user.getPageSize());
        return userMapper.select(user);
    }

    public SysUser getById(String id) {
        return userMapper.getById(id);
    }

}
