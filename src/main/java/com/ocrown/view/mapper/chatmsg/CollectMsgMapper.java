package com.ocrown.view.mapper.chatmsg;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ocrown.view.model.chatmsg.CollectMsg;

import org.springframework.jdbc.core.RowMapper;

public class CollectMsgMapper implements RowMapper<CollectMsg> {

    @Override
    public CollectMsg mapRow(ResultSet rs, int rowNum) throws SQLException {
        CollectMsg cm=new CollectMsg();
        cm.setMsgid(rs.getString("msgid"));
        cm.setIndex(Integer.parseInt(rs.getString("index")));
        cm.setCreatetime(rs.getString("createtime"));
        cm.setCreator(rs.getString("creator"));
        cm.setRoomname(rs.getString("roomname"));
        cm.setTitle(rs.getString("title"));
        return cm;
    }
    
}
