package com.dsjk.platform.common.service.user;

import com.dsjk.platform.common.bean.cms.CmsArticle;
import com.dsjk.platform.common.bean.user.SysUser;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @author fengcheng
 * @version 2017/3/28
 */
public interface IArticleClient {

    @RequestMapping(value = "/cms/article/{id}", method = RequestMethod.GET)
    CmsArticle get(@RequestParam(value = "id") String id);

    @RequestMapping(value = "/cms/article/page", method = RequestMethod.GET)
    PageInfo<CmsArticle> getPage(@RequestParam Map map);

}
