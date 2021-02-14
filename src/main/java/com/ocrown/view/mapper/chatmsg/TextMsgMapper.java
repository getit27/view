package com.ocrown.view.mapper.chatmsg;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ocrown.view.model.chatmsg.TextMsg;

import org.springframework.jdbc.core.RowMapper;

public class TextMsgMapper implements RowMapper<TextMsg> {

    @Override
    public TextMsg mapRow(ResultSet rs, int rowNum) throws SQLException {
        TextMsg tm=new TextMsg();
        tm.setIndex(Integer.parseInt(rs.getString("index")));
        tm.setContent(rs.getString("content"));
        return tm;
    }
    
}
