package com.ocrown.view.jdbc.converse;

import java.util.List;

import javax.sql.DataSource;

import com.ocrown.view.jdbc.Dao;
import com.ocrown.view.mapper.converse.WeworkConverseMapper;
import com.ocrown.view.model.converse.WeworkConverse;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class WeworkJdbcTemplate implements Dao<WeworkConverse> {

    private DataSource datasource;
    private JdbcTemplate jdbctemplate;
    public void setDatasource(DataSource datasource) {
        this.datasource = datasource;
        jdbctemplate=new JdbcTemplate(this.datasource);
    }
    @Override
    public List<WeworkConverse> listT() {
        String sql="select * from weworkconversetable";
        return jdbctemplate.query(sql,new WeworkConverseMapper());
    }

    @Override
    public WeworkConverse getT(String id) {
        String sql="select * from weworkconversetable where msgid = ?";
        return jdbctemplate.queryForObject(sql,new Object[]{id},new WeworkConverseMapper());
    }
    
}
