package com.dsjk.platform.web.user;

import com.dsjk.platform.common.bean.user.SysUser;
import com.dsjk.platform.user.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author fengcheng
 * @version 2017/2/28
 */
@RestController
@RequestMapping("/sys/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping
    public PageInfo<SysUser> getAll(SysUser user) {
        List<SysUser> userList = userService.getUserList(user);
        return new PageInfo<>(userList);
    }

    @RequestMapping(value = "/{id}")
    public SysUser view(@PathVariable Integer id) {
        return userService.getById(id);
    }

}
