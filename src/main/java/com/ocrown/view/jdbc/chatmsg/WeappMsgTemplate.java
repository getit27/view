package com.ocrown.view.jdbc.chatmsg;

import java.util.List;

import com.ocrown.view.jdbc.BeanTemplate;
import com.ocrown.view.mapper.chatmsg.WeappMsgMapper;
import com.ocrown.view.model.chatmsg.WeappMsg;

import org.springframework.stereotype.Component;

@Component
public class WeappMsgTemplate extends BeanTemplate<WeappMsg> {

    @Override
    public List<WeappMsg> listT() {
        String sql="select * from weappmsgtable";
        return jdbctemp.query(sql,new WeappMsgMapper());

    }

    @Override
    public List<WeappMsg> getT(String id) {
        String sql="select * from weappmsgtable where msgid = ?";
        return jdbctemp.query(sql,new WeappMsgMapper(),id);

    }
    
}
