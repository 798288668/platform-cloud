package com.cheng.platform.web.controller;

import com.cheng.platform.common.bean.cms.CmsArticle;
import com.cheng.platform.common.service.user.IArticleClient;
import com.cheng.platform.common.utils.BeanMapper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author fengcheng
 * @version 2017/2/28
 */
@RestController
@RequestMapping("/cms/article")
public class ArticleController {

	private final IArticleClient articleClient;

    @Autowired
	public ArticleController(IArticleClient articleClient) {
        this.articleClient = articleClient;
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public CmsArticle get(@PathVariable String id) {
        return articleClient.get(id);
    }


    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public PageInfo<CmsArticle> getPage(CmsArticle article) {
        Map map = BeanMapper.map(article, Map.class);
        return articleClient.getPage(map);
    }

}
