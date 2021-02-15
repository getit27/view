package com.ocrown.view.jdbc.chatmsg;

import java.util.List;

import com.ocrown.view.jdbc.BeanTemplate;
import com.ocrown.view.mapper.chatmsg.TodoMsgMapper;
import com.ocrown.view.model.chatmsg.TodoMsg;


import org.springframework.stereotype.Component;

@Component
public class TodoMsgTemplate extends BeanTemplate<TodoMsg> {

    @Override
    public List<TodoMsg> listT() {
        String sql="select * from todomsgtable";
        return jdbctemp.query(sql,new TodoMsgMapper());
    }

    @Override
    public List<TodoMsg> getT(String id) {
        String sql="select * from todomsgtable where msgid = ?";
        return jdbctemp.query(sql,new TodoMsgMapper(),id);
    }
    
}
