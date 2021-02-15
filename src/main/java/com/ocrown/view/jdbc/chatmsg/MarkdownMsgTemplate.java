package com.ocrown.view.jdbc.chatmsg;

import java.util.List;

import com.ocrown.view.jdbc.BeanTemplate;
import com.ocrown.view.mapper.chatmsg.MarkdownMsgMapper;
import com.ocrown.view.model.chatmsg.MarkdownMsg;

import org.springframework.stereotype.Component;

@Component
public class MarkdownMsgTemplate extends BeanTemplate<MarkdownMsg> {

    @Override
    public List<MarkdownMsg> listT() {
        String sql="select * from markdownmsgtable";
        return jdbctemp.query(sql,new MarkdownMsgMapper());
    }

    @Override
    public List<MarkdownMsg> getT(String id) {
        String sql="select * from markdownmsgtable where msgid = ?";
        return jdbctemp.query(sql,new MarkdownMsgMapper(),id);
    }
    
}
