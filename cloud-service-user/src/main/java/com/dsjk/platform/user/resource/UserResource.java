package com.dsjk.platform.user.resource;

import com.dsjk.platform.common.bean.user.SysUser;
import com.dsjk.platform.user.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author fengcheng
 * @version 2017/3/25
 */
@RestController
@RequestMapping("/sys/user")
public class UserResource {

    private final UserService userService;

    @Autowired
    public UserResource(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public SysUser get(@PathVariable String id) {
        return userService.get(id);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public PageInfo<SysUser> getPage(SysUser user) {
        return userService.getPage(user);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public void save(SysUser user) {
        userService.save(user);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable String id) {
        userService.delete(id);
    }
}
