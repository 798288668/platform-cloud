package com.cheng.platform.cms.resource;

import com.cheng.platform.cms.service.ArticleService;
import com.cheng.platform.common.bean.cms.CmsArticle;
import com.cheng.platform.common.service.user.IArticleClient;
import com.cheng.platform.common.utils.BeanMapper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author fengcheng
 * @version 2017/3/25
 */
@RestController
public class ArticleResource implements IArticleClient {

    private final ArticleService articleService;

    @Autowired
    public ArticleResource(ArticleService articleService) {
        this.articleService = articleService;
    }

    @Override
    public CmsArticle get(String id) {
        return articleService.get(id);
    }

    @Override
    public PageInfo<CmsArticle> getPage(Map map) {
        CmsArticle article = BeanMapper.map(map, CmsArticle.class);
        return articleService.getPage(article);
    }
}
