package com.ocrown.view.jdbc.chatmsg;

import com.ocrown.view.model.chatmsg.TextMsg;

import java.util.List;

import javax.sql.DataSource;

import com.ocrown.view.jdbc.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class TextMsgTemplate implements Dao<TextMsg> {
    private DataSource datasource;
    private JdbcTemplate jdbctemp;

    @Autowired
    public void setDatasource(DataSource datasource) {
        this.datasource = datasource;
        jdbctemp=new JdbcTemplate(this.datasource);
    }

    @Override
    public List<TextMsg> listT() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public TextMsg getT(String id) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
