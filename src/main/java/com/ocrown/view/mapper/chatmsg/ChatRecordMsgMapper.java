package com.ocrown.view.mapper.chatmsg;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ocrown.view.model.chatmsg.ChatRecordMsg;

import org.springframework.jdbc.core.RowMapper;

public class ChatRecordMsgMapper implements RowMapper<ChatRecordMsg>{

	@Override
	public ChatRecordMsg mapRow(ResultSet rs, int rowNum) throws SQLException {
        ChatRecordMsg crm=new ChatRecordMsg();
        crm.setMsgid(rs.getString("msgid"));
        crm.setIndex(Integer.parseInt(rs.getString("index")));
        crm.setTitle(rs.getString("title"));
		return crm;
	}
    
}
