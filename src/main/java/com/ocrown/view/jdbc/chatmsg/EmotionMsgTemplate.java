package com.ocrown.view.jdbc.chatmsg;

import java.util.List;

import com.ocrown.view.jdbc.BeanTemplate;
import com.ocrown.view.mapper.chatmsg.EmotionMsgMapper;
import com.ocrown.view.model.chatmsg.EmotionMsg;

import org.springframework.stereotype.Component;

@Component
public class EmotionMsgTemplate extends BeanTemplate<EmotionMsg> {

    @Override
    public List<EmotionMsg> listT() {
        String sql="select * from emotionmsgtable";
        return jdbctemp.query(sql,new EmotionMsgMapper());
    }

    @Override
    public List<EmotionMsg> getT(String id) {
        String sql="select * from emotionmsgtable where msgid = ?";
        return jdbctemp.query(sql,new EmotionMsgMapper(),id);
    }
    
}
