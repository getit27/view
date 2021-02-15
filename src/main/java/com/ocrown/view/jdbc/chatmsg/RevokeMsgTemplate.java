package com.ocrown.view.jdbc.chatmsg;

import java.util.List;

import com.ocrown.view.jdbc.BeanTemplate;
import com.ocrown.view.mapper.chatmsg.RevokeMsgMapper;
import com.ocrown.view.model.chatmsg.RevokeMsg;

import org.springframework.stereotype.Component;

@Component
public class RevokeMsgTemplate extends BeanTemplate<RevokeMsg> {

    @Override
    public List<RevokeMsg> listT() {
        String sql="select * from revokemsgtable";
        return jdbctemp.query(sql,new RevokeMsgMapper());
    }

    @Override
    public List<RevokeMsg> getT(String id) {
        String sql="select * from revokemsgtable where msgid = ?";
        return jdbctemp.query(sql,new RevokeMsgMapper(),id);
    }
    
}
