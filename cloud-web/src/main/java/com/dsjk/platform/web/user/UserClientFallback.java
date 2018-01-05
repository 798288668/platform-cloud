package com.dsjk.platform.web.user;

import com.dsjk.platform.common.bean.user.SysUser;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * @author fengcheng
 * @version 2017/3/28
 */
@Component
public class UserClientFallback implements UserClient {
    @Override
    public SysUser getBySql(@PathVariable String id) {
        System.out.println("调用服务失败");
        //return new ResponseResult("-1", "调用服务失败");
        return null;
    }

    @Override
    public SysUser get(@RequestParam(value = "id") String id) {
        return null;
    }

    @Override
    public SysUser get(@RequestParam Map map){
        throw null;
    }

    @Override
    public List<SysUser> getList(@RequestParam Map map) {
        return null;
    }

    @Override
    public PageInfo<SysUser> getPage(@RequestParam Map map) {
        return null;
    }

    @Override
    public String save(@RequestBody SysUser user) {
        return null;
    }

    @Override
    public String delete(@RequestBody SysUser user) {
        return null;
    }
}
