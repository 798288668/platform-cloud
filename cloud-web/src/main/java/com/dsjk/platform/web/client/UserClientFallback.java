package com.dsjk.platform.web.client;

import com.dsjk.platform.common.bean.user.SysUser;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author fengcheng
 * @version 2017/3/28
 */
@Component
public class UserClientFallback implements UserClient {

    @Override
    public SysUser getBySql(String id) {
        return null;
    }

    @Override
    public SysUser get(String id) {
        return null;
    }

    @Override
    public SysUser get(Map map) {
        return null;
    }

    @Override
    public List<SysUser> getList(Map map) {
        return null;
    }

    @Override
    public PageInfo<SysUser> getPage(Map map) {
        return null;
    }

    @Override
    public String save(SysUser user) {
        return null;
    }

    @Override
    public String delete(SysUser user) {
        return null;
    }
}
