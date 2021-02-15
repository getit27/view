package com.ocrown.view.jdbc.chatmsg;

import java.util.List;

import com.ocrown.view.jdbc.BeanTemplate;
import com.ocrown.view.mapper.chatmsg.ImageMsgMapper;
import com.ocrown.view.model.chatmsg.ImageMsg;

import org.springframework.stereotype.Component;

@Component
public class ImageMsgTemplate extends BeanTemplate<ImageMsg> {

    @Override
    public List<ImageMsg> listT() {
        String sql="select * from imagemsgtable";
        return jdbctemp.query(sql,new ImageMsgMapper());
    }

    @Override
    public List<ImageMsg> getT(String id) {
        String sql="select * from imagemsgtable where msgid = ?";
        return jdbctemp.query(sql,new ImageMsgMapper(),id);
    }
    
}
