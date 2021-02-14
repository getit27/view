package com.ocrown.view.controller;

import com.ocrown.view.jdbc.converse.WeworkJdbcTemplate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = TableController.class)
public class TableControllerConfig {
    @Bean({"wjt"})
    public WeworkJdbcTemplate weworkjdbctemplate(){
        return new WeworkJdbcTemplate();
    }
}
