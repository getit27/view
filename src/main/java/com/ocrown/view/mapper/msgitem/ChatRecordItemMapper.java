package com.ocrown.view.mapper.msgitem;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ocrown.view.model.msgitem.ChatRecordItem;

import org.springframework.jdbc.core.RowMapper;

public class ChatRecordItemMapper implements RowMapper<ChatRecordItem> {

    @Override
    public ChatRecordItem mapRow(ResultSet rs, int rowNum) throws SQLException {
        ChatRecordItem cri=new ChatRecordItem();
        cri.setMsgid(rs.getString("msgid"));
        cri.setIndex(Integer.parseInt(rs.getString("index")));
        cri.setType(rs.getString("type"));
        cri.setMsgtime(rs.getString("msgtime"));
        cri.setFromchatroom(rs.getString("fromchatroom"));
        return cri;
    }
    
}
