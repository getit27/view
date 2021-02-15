package com.ocrown.view.jdbc.chatmsg;

import java.util.List;

import com.ocrown.view.jdbc.BeanTemplate;
import com.ocrown.view.mapper.chatmsg.LocationMsgMapper;
import com.ocrown.view.model.chatmsg.LocationMsg;

import org.springframework.stereotype.Component;

@Component
public class LocationMsgTemplate extends BeanTemplate<LocationMsg> {

    @Override
    public List<LocationMsg> listT() {
        String sql="select * from locationmsgtable";
        return jdbctemp.query(sql,new LocationMsgMapper());
    }

    @Override
    public List<LocationMsg> getT(String id) {
        String sql="select * from locationmsgtable where msgid = ?";
        return jdbctemp.query(sql,new LocationMsgMapper(),id);
    }
    
}
