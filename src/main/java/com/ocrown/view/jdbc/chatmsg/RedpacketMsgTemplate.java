package com.ocrown.view.jdbc.chatmsg;

import java.util.List;

import com.ocrown.view.jdbc.BeanTemplate;
import com.ocrown.view.mapper.chatmsg.RedpacketMsgMapper;
import com.ocrown.view.model.chatmsg.RedpacketMsg;

import org.springframework.stereotype.Component;

@Component
public class RedpacketMsgTemplate extends BeanTemplate<RedpacketMsg> {

    @Override
    public List<RedpacketMsg> listT() {
        String sql="select * from redpacketmsgtable";
        return jdbctemp.query(sql,new RedpacketMsgMapper());
    }

    @Override
    public List<RedpacketMsg> getT(String id) {
        String sql="select * from redpacketmsgtable where msgid = ?";
        return jdbctemp.query(sql,new RedpacketMsgMapper(),id);
    }
    
}
