package com.ocrown.view.jdbc.chatmsg;

import org.springframework.stereotype.Component;

import java.util.List;

import com.ocrown.view.jdbc.BeanTemplate;
import com.ocrown.view.mapper.chatmsg.ExternalRedpacketMsgMapper;
import com.ocrown.view.model.chatmsg.ExternalRedpacketMsg;

@Component
public class ExternalRedpacketMsgTemplate extends BeanTemplate<ExternalRedpacketMsg> {

    @Override
    public List<ExternalRedpacketMsg> listT() {
        String sql="select * from  externalredpacketmsgtable";
        return jdbctemp.query(sql,new ExternalRedpacketMsgMapper());
    }

    @Override
    public List<ExternalRedpacketMsg> getT(String id) {
        String sql="select * from externalredpacketmsgtable where msgid = ?";
        return jdbctemp.query(sql,new ExternalRedpacketMsgMapper(),id);
    }
    
}
