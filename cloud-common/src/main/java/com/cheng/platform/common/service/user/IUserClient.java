package com.cheng.platform.common.service.user;

import com.cheng.platform.common.bean.user.SysUser;
import com.github.pagehelper.PageInfo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * @author fengcheng
 * @version 2017/3/28
 */
@FeignClient(name = "service-user")
public interface IUserClient {

	@PostMapping(value = "/sys/user/sql/{id}")
	SysUser getBySql(@RequestParam(value = "id") String id);

	@PostMapping(value = "/sys/user/{id}")
	SysUser get(@RequestParam(value = "id") String id, @RequestParam("test") String test);

	@PostMapping(value = "/sys/user")
	SysUser get(@RequestBody SysUser user);

	@PostMapping(value = "/sys/user/list", consumes = "application/json")
	List<SysUser> getList(@RequestBody SysUser user, @RequestParam("test") String test);

	@PostMapping(value = "/sys/user/page")
	PageInfo<SysUser> getPage(@RequestParam Map map);

	@PostMapping(value = "/sys/user/save")
	String save(@RequestBody SysUser user);

	@PostMapping(value = "/sys/user/delete")
	String delete(@RequestBody SysUser user);

}
