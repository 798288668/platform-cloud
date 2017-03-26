package com.dsjk.platform.web.user;

import com.dsjk.platform.common.bean.user.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fengcheng
 * @version 2017/2/28
 */
@RestController
@RequestMapping("/sys/user")
public class UserController {

    private final UserClient userClient;

    @Autowired
    public UserController(UserClient userClient) {
        this.userClient = userClient;
    }


    @GetMapping("/{id}")
    public SysUser getUser(@PathVariable String id) {
        return userClient.getUser(id);
    }

}
