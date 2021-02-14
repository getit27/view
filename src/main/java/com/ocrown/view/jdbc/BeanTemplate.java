package com.ocrown.view.jdbc;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public abstract class BeanTemplate<T> implements Dao<T> {

    protected DataSource datasource;
    protected JdbcTemplate jdbctemp;

    @Autowired
    public void setDatasource(DataSource datasource) {
        this.datasource = datasource;
        jdbctemp=new JdbcTemplate(this.datasource);
    }
}
