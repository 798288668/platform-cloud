package com.dsjk.platform.web.client;

import com.dsjk.platform.common.bean.cms.CmsArticle;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author fengcheng
 * @version 2017/3/28
 */
@Component
public class ArticleClientFallback implements ArticleClient {

    @Override
    public CmsArticle get(String id) {
        return null;
    }

    @Override
    public PageInfo<CmsArticle> getPage(Map map) {
        return null;
    }
}
