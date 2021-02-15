package com.ocrown.view.mapper.chatmsg;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ocrown.view.model.chatmsg.MarkdownMsg;

import org.springframework.jdbc.core.RowMapper;

public class MarkdownMsgMapper implements RowMapper<MarkdownMsg> {

    @Override
    public MarkdownMsg mapRow(ResultSet rs, int arg1) throws SQLException {
        MarkdownMsg mm =new MarkdownMsg();
        mm.setIndex(Integer.parseInt(rs.getString("index")));
        mm.setContent(rs.getString("content"));
        return mm;
    }
    
}
