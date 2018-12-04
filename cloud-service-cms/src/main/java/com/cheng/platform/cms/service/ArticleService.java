package com.cheng.platform.cms.service;

import com.cheng.platform.cms.mapper.ArticleMapper;
import com.cheng.platform.common.base.BaseService;
import com.cheng.platform.common.bean.cms.CmsArticle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author fengcheng
 * @version 2017/2/28
 */
@Service
public class ArticleService extends BaseService<CmsArticle> {

    private final ArticleMapper articleMapper;

    @Autowired
    public ArticleService(ArticleMapper articleMapper) {
        this.articleMapper = articleMapper;
    }


}
