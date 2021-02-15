package com.ocrown.view.jdbc.chatmsg;

import java.util.List;

import com.ocrown.view.jdbc.BeanTemplate;
import com.ocrown.view.mapper.chatmsg.ChatRecordMsgMapper;
import com.ocrown.view.model.chatmsg.ChatRecordMsg;

import org.springframework.stereotype.Component;

@Component
public class ChatRecordMsgTemplate extends BeanTemplate<ChatRecordMsg> {

    @Override
    public List<ChatRecordMsg> listT() {
        String sql="select * from chatrecordmsgtable";
        return jdbctemp.query(sql,new ChatRecordMsgMapper());
    }

    @Override
    public List<ChatRecordMsg> getT(String id) {
        String sql="select * from chatrecordmsgtable where msgid = ?";
        return jdbctemp.query(sql,new ChatRecordMsgMapper(),id);
    }
    
}
