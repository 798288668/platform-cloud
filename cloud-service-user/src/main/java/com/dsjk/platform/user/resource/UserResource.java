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
    @RequestMapping(value = "/sys/user/sql/{id}", method = RequestMethod.GET)
    public SysUser getBySql(@PathVariable String id) {
        return userService.getUserBySql(id);
    }

    @Override
    @RequestMapping(value = "/sys/user/{id}", method = RequestMethod.GET)
    public SysUser get(@PathVariable String id) {
        return userService.get(id);
    }

    @Override
    @RequestMapping(value = "/sys/user", method = RequestMethod.GET)
    public SysUser get(@RequestParam Map map) {
        SysUser user = BeanMapper.map(map, SysUser.class);
        return userService.get(user);
    }

    @Override
    @RequestMapping(value = "/sys/user/list", method = RequestMethod.GET)
    public List<SysUser> getList(@RequestParam Map map) {
        SysUser user = BeanMapper.map(map, SysUser.class);
        return userService.getList(user);
    }

    @Override
    @RequestMapping(value = "/sys/user/page", method = RequestMethod.GET)
    public PageInfo<SysUser> getPage(@RequestParam Map map) {
        SysUser user = BeanMapper.map(map, SysUser.class);
        return userService.getPage(user);
    }

    @Override
    @RequestMapping(value = "/sys/user/save", method = RequestMethod.POST)
    public String save(@RequestBody SysUser user) {
        userService.save(user);
        return "";
    }

    @Override
    @RequestMapping(value = "/sys/user/delete", method = RequestMethod.POST)
    public String delete(@RequestBody SysUser user) {
        userService.delete(user);
        return "";
    }
}
