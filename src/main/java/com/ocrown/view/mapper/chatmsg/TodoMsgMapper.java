package com.ocrown.view.mapper.chatmsg;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ocrown.view.model.chatmsg.TodoMsg;

import org.springframework.jdbc.core.RowMapper;

public class TodoMsgMapper implements RowMapper<TodoMsg> {

    @Override
    public TodoMsg mapRow(ResultSet rs, int arg1) throws SQLException {
        TodoMsg tm=new TodoMsg();
        tm.setIndex(Integer.parseInt(rs.getString("index")));
        tm.setContent(rs.getString("content"));
        tm.setTitle(rs.getString("title"));
        return tm;
    }
    
}
