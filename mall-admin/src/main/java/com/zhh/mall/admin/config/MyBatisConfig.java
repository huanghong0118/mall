package com.zhh.mall.admin.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis相关配置
 * Created by zhh on 2019/4/8.
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.zhh.mall.mapper","com.zhh.mall.dao"})
public class MyBatisConfig {
}
