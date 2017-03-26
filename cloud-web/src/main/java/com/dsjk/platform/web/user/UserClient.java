package com.dsjk.platform.web.user;


import com.dsjk.platform.common.bean.user.SysUser;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author fengcheng
 * @version 2017/3/26
 */
@FeignClient("service-user")
public interface UserClient {

    @RequestMapping(value = "/sys/user/{id}", method = RequestMethod.GET)
    SysUser getUser(@PathVariable(value = "id") String id);
}
