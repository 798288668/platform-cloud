package com.cheng.platform.user.resource;

import com.cheng.platform.common.bean.user.SysUser;
import com.cheng.platform.common.service.user.IUserClient;
import com.cheng.platform.common.utils.BeanMapper;
import com.cheng.platform.user.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
	public SysUser get(String id, String test) {
        return userService.get(id);
    }

    @Override
	public SysUser get(SysUser user) {
        return userService.get(user);
    }

    @Override
	public List<SysUser> getList(@RequestBody SysUser user, String test) {
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
