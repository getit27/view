package com.ocrown.view.mapper.msgitem;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ocrown.view.model.msgitem.MixedItem;

import org.springframework.jdbc.core.RowMapper;

public class MixedItemMapper implements RowMapper<MixedItem> {

    @Override
    public MixedItem mapRow(ResultSet rs, int rowNum) throws SQLException {
        MixedItem mi=new MixedItem();
        mi.setMsgid(rs.getString("msgid"));
        mi.setIndex(Integer.parseInt(rs.getString("index")));
        mi.setType(rs.getString("type"));
        return mi;
    }
    
}
