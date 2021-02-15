package com.ocrown.view.jdbc.chatmsg;

import java.util.List;

import com.ocrown.view.jdbc.BeanTemplate;
import com.ocrown.view.mapper.chatmsg.LinkMsgMapper;
import com.ocrown.view.model.chatmsg.LinkMsg;

import org.springframework.stereotype.Component;

@Component
public class LinkMsgTemplate extends BeanTemplate<LinkMsg> {

    @Override
    public List<LinkMsg> listT() {
        String sql="select * from linkmsgtable";
        return jdbctemp.query(sql,new LinkMsgMapper());
    }

    @Override
    public List<LinkMsg> getT(String id) {
        String sql="select * from linkmsgtable where msgid = ?";
        return jdbctemp.query(sql,new LinkMsgMapper(),id);
    }
    
}
