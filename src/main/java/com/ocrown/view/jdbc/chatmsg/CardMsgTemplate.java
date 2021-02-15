package com.ocrown.view.jdbc.chatmsg;

import java.util.List;

import com.ocrown.view.jdbc.BeanTemplate;
import com.ocrown.view.mapper.chatmsg.CardMsgMapper;
import com.ocrown.view.model.chatmsg.CardMsg;

import org.springframework.stereotype.Component;

@Component
public class CardMsgTemplate extends BeanTemplate<CardMsg> {

    @Override
    public List<CardMsg> listT() {
        String sql="select * from cardmsgtable";
        return jdbctemp.query(sql,new CardMsgMapper());
    }

    @Override
    public List<CardMsg> getT(String id) {
        String sql="select * from cardmsgtable where msgid = ?";
        return jdbctemp.query(sql,new CardMsgMapper(),id);
    }
    
}
