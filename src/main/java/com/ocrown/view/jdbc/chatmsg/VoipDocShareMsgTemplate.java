package com.ocrown.view.jdbc.chatmsg;

import java.util.List;

import com.ocrown.view.jdbc.BeanTemplate;
import com.ocrown.view.mapper.chatmsg.VoipDocShareMsgMapper;
import com.ocrown.view.model.chatmsg.VoipDocShareMsg;

import org.springframework.stereotype.Component;

@Component
public class VoipDocShareMsgTemplate extends BeanTemplate<VoipDocShareMsg> {

    @Override
    public List<VoipDocShareMsg> listT() {
        String sql="select * from voipdocsharemsgtable";
        return jdbctemp.query(sql,new VoipDocShareMsgMapper());
    }

    @Override
    public List<VoipDocShareMsg> getT(String id) {
        String sql="select * from voipdocsharemsgtable where msgid = ?";
        return jdbctemp.query(sql,new VoipDocShareMsgMapper(),id);
    }
    
}
