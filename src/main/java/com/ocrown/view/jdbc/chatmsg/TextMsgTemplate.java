package com.ocrown.view.jdbc.chatmsg;

import java.util.List;

import com.ocrown.view.jdbc.BeanTemplate;
import com.ocrown.view.mapper.chatmsg.TextMsgMapper;
import com.ocrown.view.model.chatmsg.TextMsg;

import org.springframework.stereotype.Component;

@Component
public class TextMsgTemplate extends BeanTemplate<TextMsg> {

    @Override
    public List<TextMsg> listT() {
        String sql="select * from textmsgtable";
        return jdbctemp.query(sql,new TextMsgMapper());
    }

    @Override
    public List<TextMsg> getT(String id) {
        String sql="select * from textmsgtable where msgid = ?";
        return jdbctemp.query(sql,new TextMsgMapper(),id);
    }
    
}
