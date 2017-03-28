package com.dsjk.platform.web.user;


import com.dsjk.platform.common.service.user.IUserClient;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @author fengcheng
 * @version 2017/3/26
 */
@FeignClient(name = "service-user", fallback = UserClientFallback.class)
public interface UserClient extends IUserClient {

}

