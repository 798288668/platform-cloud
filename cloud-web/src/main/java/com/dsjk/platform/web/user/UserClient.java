package com.dsjk.platform.web.user;


import com.dsjk.platform.common.bean.user.SysUser;
import com.github.pagehelper.PageInfo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author fengcheng
 * @version 2017/3/26
 */
@FeignClient(name = "service-user", fallback = UserClientFallback.class)
public interface UserClient {

    @RequestMapping(value = "/sys/user/{id}", method = RequestMethod.GET)
    SysUser get(@RequestParam(value = "id") String id);

    @RequestMapping(value = "/sys/user", method = RequestMethod.GET)
    SysUser get(@RequestParam Map map);

    @RequestMapping(value = "/sys/user/list", method = RequestMethod.GET)
    List<SysUser> getList(@RequestParam Map map);

    @RequestMapping(value = "/sys/user/page", method = RequestMethod.GET)
    PageInfo<SysUser> getPage(@RequestParam Map map);

    @RequestMapping(value = "/sys/user/save", method = RequestMethod.POST)
    String save(@RequestBody SysUser user);

    @RequestMapping(value = "/sys/user/delete", method = RequestMethod.POST)
    String delete(@RequestBody SysUser user);
}

