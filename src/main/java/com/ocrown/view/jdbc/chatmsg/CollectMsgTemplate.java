package com.ocrown.view.jdbc.chatmsg;

import java.util.List;

import com.ocrown.view.jdbc.BeanTemplate;
import com.ocrown.view.mapper.chatmsg.CollectMsgMapper;
import com.ocrown.view.model.chatmsg.CollectMsg;

import org.springframework.stereotype.Component;

@Component
public class CollectMsgTemplate extends BeanTemplate<CollectMsg> {

    @Override
    public List<CollectMsg> listT() {
        String sql="select * from collectmsgtable";
        return jdbctemp.query(sql,new CollectMsgMapper());
    }

    @Override
    public List<CollectMsg> getT(String id) {
        String sql="select * from collectmsgtable where msgid = ?";
        return jdbctemp.query(sql,new CollectMsgMapper(),id);
    }
    
}
