package com.ocrown.view.jdbc.chatmsg;

import java.util.List;

import com.ocrown.view.jdbc.BeanTemplate;
import com.ocrown.view.mapper.chatmsg.AgreeMsgMapper;
import com.ocrown.view.model.chatmsg.AgreeMsg;

import org.springframework.stereotype.Component;

@Component
public class AgreeMsgTemplate extends BeanTemplate<AgreeMsg> {

    @Override
    public List<AgreeMsg> listT() {
        String sql="select * from agreemsgtable";
        return jdbctemp.query(sql,new AgreeMsgMapper());
    }

    @Override
    public List<AgreeMsg> getT(String id) {
        String sql="select * from agreemsgtable where msgid = ?";
        return jdbctemp.query(sql,new AgreeMsgMapper(),id);
    }

}
