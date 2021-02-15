package com.ocrown.view.jdbc.chatmsg;

import java.util.List;

import com.ocrown.view.jdbc.BeanTemplate;
import com.ocrown.view.mapper.chatmsg.VoiceMsgMapper;
import com.ocrown.view.model.chatmsg.VoiceMsg;

import org.springframework.stereotype.Component;

@Component
public class VoiceMsgTemplate extends BeanTemplate<VoiceMsg> {

    @Override
    public List<VoiceMsg> listT() {
        String sql="select * from vociemsgtable";
        return jdbctemp.query(sql,new VoiceMsgMapper());
    }

    @Override
    public List<VoiceMsg> getT(String id) {
        String sql="select * from voicemsgtable where msgid = ?";
        return jdbctemp.query(sql,new VoiceMsgMapper(),id);
    }
    
}
