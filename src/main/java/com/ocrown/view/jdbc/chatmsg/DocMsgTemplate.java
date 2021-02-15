package com.ocrown.view.jdbc.chatmsg;

import java.util.List;

import com.ocrown.view.jdbc.BeanTemplate;
import com.ocrown.view.mapper.chatmsg.DocMsgMapper;
import com.ocrown.view.model.chatmsg.DocMsg;

import org.springframework.stereotype.Component;

@Component
public class DocMsgTemplate extends BeanTemplate<DocMsg> {

    @Override
    public List<DocMsg> listT() {
        String sql="select * from docmsgtable";
        return jdbctemp.query(sql,new DocMsgMapper());
    }

    @Override
    public List<DocMsg> getT(String id) {
        String sql="select * from docmsgtable where msgid = ?";
        return jdbctemp.query(sql,new DocMsgMapper(),id);
    }
    
}
