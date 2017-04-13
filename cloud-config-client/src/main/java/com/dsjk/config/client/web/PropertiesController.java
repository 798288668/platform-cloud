package com.dsjk.config.client.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fengcheng
 * @version 2017/4/13
 */
@RefreshScope
@RestController
public class PropertiesController {

    @Value("${projectName}")
    private String projectName;

    @RequestMapping("/projectName")
    public String from() {
        return this.projectName;
    }

}
