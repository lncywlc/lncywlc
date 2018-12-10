package com.lncywlc.rio.config.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;

/**
 * @author wuliangchao
 * @create 2018-12-10 11:49
 */
public class DataSourceConfiguration {
    @Bean(name="dateSource")
    public ComboPooledDataSource createDateSource(){

    }
}
