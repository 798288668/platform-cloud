package com.dsjk.security.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author fengcheng
 * @version 2017/5/26
 */
@Configuration
@EnableOAuth2Sso
@EnableAutoConfiguration
public class SsoConfiguration extends WebSecurityConfigurerAdapter {



}
