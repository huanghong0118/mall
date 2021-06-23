package com.zhh.mall.config;

import com.zhh.mall.common.config.BaseSwaggerConfig;
import com.zhh.mall.common.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger API文档相关配置
 * Created by zhh on 2018/4/26.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.zhh.mall.controller")
                .title("mall后台系统")
                .description("mall后台相关接口文档")
                .contactName("zhh")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }
}
