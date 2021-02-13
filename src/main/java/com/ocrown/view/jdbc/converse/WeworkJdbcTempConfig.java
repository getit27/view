package com.ocrown.view.jdbc.converse;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import com.mysql.jdbc.Driver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

@Configuration
@ComponentScan(basePackageClasses = WeworkJdbcTemplate.class)
public class WeworkJdbcTempConfig {
    @Bean({"datasource"})
    public DataSource dataSource() throws FileNotFoundException, IOException, SQLException {
        Properties jdbcprops=new Properties();
        jdbcprops.load(new FileInputStream("src/main/resources/jdbc.properties"));
        return new SimpleDriverDataSource(new Driver(), 
            jdbcprops.getProperty("url"),
            jdbcprops.getProperty("username"),
            jdbcprops.getProperty("password"));
    }
}
