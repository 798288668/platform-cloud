package com.dsjk.platform.web.utils;

import com.google.common.collect.Lists;
import feign.Response;
import feign.Util;
import feign.codec.ErrorDecoder;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @author fengcheng
 * @version 2017/3/29
 */
@Component
public class FeignClientExceptionErrorDecoder implements ErrorDecoder {

    private final ErrorDecoder delegate = new ErrorDecoder.Default();
    @Override
    public Exception decode(String methodKey, Response response) {
        // Only decode 4xx errors.
        if (response.status() >= 500) {
            return delegate.decode(methodKey, response);
        }
        // Response content type must be json
        if (response.headers().getOrDefault("Content-Type", Lists.newArrayList()).stream()
                .filter(s -> s.toLowerCase().contains("json")).count() > 0) {
            try {
                String body = Util.toString(response.body().asReader());
                // TODO 转换并返回异常对象
            } catch (IOException ex) {
                throw new RuntimeException("Failed to process response body.", ex);
            }
        }
        return delegate.decode(methodKey, response);
    }

}
