package com.ocrown.view.jdbc.chatmsg;

import java.util.List;

import com.ocrown.view.jdbc.BeanTemplate;
import com.ocrown.view.mapper.chatmsg.FileMsgMapper;
import com.ocrown.view.model.chatmsg.FileMsg;

import org.springframework.stereotype.Component;

@Component
public class FileMsgTemplate extends BeanTemplate<FileMsg> {

    @Override
    public List<FileMsg> listT() {
        String sql="select * from filemsgtable";
        return jdbctemp.query(sql,new FileMsgMapper());
    }

    @Override
    public List<FileMsg> getT(String id) {
        String sql="select * from filemsgtable where msgid = ?";
        return jdbctemp.query(sql,new FileMsgMapper(),id);
    }
    
}
