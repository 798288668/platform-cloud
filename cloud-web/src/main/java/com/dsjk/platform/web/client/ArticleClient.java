package com.dsjk.platform.web.client;


import com.dsjk.platform.common.service.user.IArticleClient;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @author fengcheng
 * @version 2017/3/26
 */
@FeignClient(name = "service-cms", fallback = ArticleClientFallback.class)
public interface ArticleClient extends IArticleClient {

}
