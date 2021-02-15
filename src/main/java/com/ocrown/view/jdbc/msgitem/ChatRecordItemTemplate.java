package com.ocrown.view.jdbc.msgitem;

import java.util.List;

import com.ocrown.view.jdbc.BeanTemplate;
import com.ocrown.view.mapper.msgitem.ChatRecordItemMapper;
import com.ocrown.view.model.msgitem.ChatRecordItem;

import org.springframework.stereotype.Component;

@Component
public class ChatRecordItemTemplate extends BeanTemplate<ChatRecordItem> {

    @Override
    public List<ChatRecordItem> listT() {
        String sql = "select * from chatrecorditemtable";
        return jdbctemp.query(sql,new ChatRecordItemMapper());
    }

    @Override
    public List<ChatRecordItem> getT(String id) {
        String sql="select * from chatrecorditemtable where msgid = ?";
        return jdbctemp.query(sql,new ChatRecordItemMapper(),id);
    }
    
}
