package com.dsjk.platform.user.resource;

import com.dsjk.platform.common.bean.user.SysUser;
import com.dsjk.platform.common.service.user.IUserClient;
import com.dsjk.platform.common.utils.BeanMapper;
import com.dsjk.platform.user.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author fengcheng
 * @version 2017/3/25
 */
@RestController
public class UserResource implements IUserClient {

    private final UserService userService;

    @Autowired
    public UserResource(UserService userService) {
        this.userService = userService;
    }

    @Override
    public SysUser getBySql(String id) {
        return userService.getUserBySql(id);
    }

    @Override
    public SysUser get(String id) {
        return userService.get(id);
    }

    @Override
    public SysUser get(Map map) {
        SysUser user = BeanMapper.map(map, SysUser.class);
        return userService.get(user);
    }

    @Override
    public List<SysUser> getList(Map map) {
        SysUser user = BeanMapper.map(map, SysUser.class);
        return userService.getList(user);
    }

    @Override
    public PageInfo<SysUser> getPage(Map map) {
        SysUser user = BeanMapper.map(map, SysUser.class);
        return userService.getPage(user);
    }

    @Override
    public String save(SysUser user) {
        userService.save(user);
        return "";
    }

    @Override
    public String delete(SysUser user) {
        userService.delete(user);
        return "";
    }
}
