package com.ocrown.view.jdbc.chatmsg;

import java.util.List;

import com.ocrown.view.jdbc.BeanTemplate;
import com.ocrown.view.mapper.chatmsg.MixedMsgMapper;
import com.ocrown.view.model.chatmsg.MixedMsg;

import org.springframework.stereotype.Component;

@Component
public class MixedMsgTemplate extends BeanTemplate<MixedMsg> {

    @Override
    public List<MixedMsg> listT() {
        String sql="select * from mixedmsgtable";
        return jdbctemp.query(sql,new MixedMsgMapper());
    }

    @Override
    public List<MixedMsg> getT(String id) {
        String sql="select * from mixedmsgtable where msgid = ?";
        return jdbctemp.query(sql,new MixedMsgMapper(),id);
    }
    
}
