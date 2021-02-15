package com.ocrown.view.mapper.chatmsg;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ocrown.view.model.chatmsg.WeappMsg;

import org.springframework.jdbc.core.RowMapper;

public class WeappMsgMapper implements RowMapper<WeappMsg>{

	@Override
	public WeappMsg mapRow(ResultSet rs, int arg1) throws SQLException {
		WeappMsg wm=new WeappMsg();
		wm.setIndex(Integer.parseInt(rs.getString("index")));
		wm.setDescription(rs.getString("description"));
		wm.setDisplayname(rs.getString("displayname"));
		wm.setTitle(rs.getString("title"));
		wm.setUsername(rs.getString("username"));
		return wm;
	}
    
}
