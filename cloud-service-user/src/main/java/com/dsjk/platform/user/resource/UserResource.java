package com.dsjk.platform.user.resource;

import com.dsjk.platform.common.bean.user.SysUser;
import com.dsjk.platform.user.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author fengcheng
 * @version 2017/3/25
 */
@RestController
public class UserResource {

    private final UserService userService;

    @Autowired
    public UserResource(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/sys/user/{id}", method = RequestMethod.GET)
    public SysUser get(@PathVariable String id) {
        return userService.get(id);
    }

    @RequestMapping(value = "/sys/user", method = RequestMethod.GET)
    public SysUser get(SysUser user) {
        return userService.get(user);
    }

    @RequestMapping(value = "/sys/user/list", method = RequestMethod.GET)
    public List<SysUser> getList(SysUser user) {
        return userService.getList(user);
    }

    @RequestMapping(value = "/sys/user/page", method = RequestMethod.GET)
    public PageInfo<SysUser> getPage(SysUser user) {
        return userService.getPage(user);
    }

    @RequestMapping(value = "/sys/user/save", method = RequestMethod.POST)
    public String save(@RequestBody SysUser user) {
        userService.save(user);
        return "";
    }

    @RequestMapping(value = "/sys/user/delete", method = RequestMethod.POST)
    public String delete(@RequestBody SysUser user) {
        userService.delete(user);
        return "";
    }
}
