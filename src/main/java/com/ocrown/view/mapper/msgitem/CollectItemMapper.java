package com.ocrown.view.mapper.msgitem;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ocrown.view.model.msgitem.CollectItem;

import org.springframework.jdbc.core.RowMapper;

public class CollectItemMapper implements RowMapper<CollectItem> {

    @Override
    public CollectItem mapRow(ResultSet rs, int rowNum) throws SQLException {
        CollectItem clcti=new CollectItem();
        clcti.setMsgid(rs.getString("msgid"));
        clcti.setIndex(Integer.parseInt(rs.getString("index")));
        clcti.setId(rs.getString("is"));
        clcti.setQue(rs.getString("que"));
        clcti.setType(rs.getString("type"));
        return clcti;
    }
    
}
