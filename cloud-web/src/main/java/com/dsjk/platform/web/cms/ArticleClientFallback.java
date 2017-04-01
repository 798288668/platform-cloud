package com.dsjk.platform.web.cms;

import com.dsjk.platform.common.bean.cms.CmsArticle;
import com.dsjk.platform.common.bean.user.SysUser;
import com.dsjk.platform.web.user.UserClient;
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
public class ArticleClientFallback implements ArticleClient {

    @Override
    public CmsArticle get(@RequestParam(value = "id") String id) {
        return null;
    }

    @Override
    public PageInfo<CmsArticle> getPage(@RequestParam Map map) {
        return null;
    }
}
