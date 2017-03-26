package com.dsjk.platform.user.controller;

import com.dsjk.platform.common.bean.user.SysUser;
import com.dsjk.platform.user.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author fengcheng
 * @version 2017/3/25
 */
@RestController
@RequestMapping("/sys/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public SysUser getUser(@PathVariable String id) {
        return userService.getById(id);
    }

    @GetMapping("/list")
    public PageInfo<SysUser> getList(SysUser user) {
        List<SysUser> userList = userService.selectPage(1, 9);
        return new PageInfo<>(userList);
    }
}
