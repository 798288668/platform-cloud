package com.dsjk.platform.web.user;


import com.dsjk.platform.common.bean.user.SysUser;
import com.github.pagehelper.PageInfo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author fengcheng
 * @version 2017/3/26
 */
@FeignClient(name = "service-user")
public interface UserClient {

    @RequestMapping(value = "/sys/user/{id}", method = RequestMethod.GET)
    SysUser get(@RequestParam(value = "id") String id);

    @RequestMapping(value = "/sys/user", method = RequestMethod.GET)
    PageInfo<SysUser> getPage(@RequestParam Map map);

    @RequestMapping(value = "/sys/user/save", method = RequestMethod.POST)
    void save(SysUser user);

    @RequestMapping(value = "/sys/user/delete/{id}", method = RequestMethod.DELETE)
    void delete(@RequestParam(value = "id") String id);
}

