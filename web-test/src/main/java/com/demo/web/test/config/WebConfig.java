package com.demo.web.test.config;

import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.servlet.MultipartConfigElement;

/**
 * WebConfig
 *
 * @author LLH
 * @since 四月/01/2021 星期四
 */
@Component
public class WebConfig {
    
    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        factory.setLocation("./tmp");
        return factory.createMultipartConfig();
    }
    
    /*@Bean
    public MultipartResolver multipartResolver() throws IOException {
        CommonsMultipartResolver commonsMultipartResolver = new CommonsMultipartResolver();
        // 设置接收的文件流名称字符集为UTF-8
        commonsMultipartResolver.setDefaultEncoding(StandardCharsets.UTF_8.displayName());
        commonsMultipartResolver.setMaxUploadSize(81920000000L);
        commonsMultipartResolver.setUploadTempDir(new FileSystemResource("./tmp"));
        commonsMultipartResolver.setResolveLazily(true);
        return commonsMultipartResolver;
    }*/
    
}
