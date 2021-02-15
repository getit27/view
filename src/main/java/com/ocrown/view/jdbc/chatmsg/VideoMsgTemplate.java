package com.ocrown.view.jdbc.chatmsg;

import java.util.List;

import com.ocrown.view.jdbc.BeanTemplate;
import com.ocrown.view.mapper.chatmsg.VideoMsgMapper;
import com.ocrown.view.model.chatmsg.VideoMsg;

import org.springframework.stereotype.Component;

@Component
public class VideoMsgTemplate extends BeanTemplate<VideoMsg> {

    @Override
    public List<VideoMsg> listT() {
        String sql="select * from videomsgtable";
        return jdbctemp.query(sql,new VideoMsgMapper());
    }

    @Override
    public List<VideoMsg> getT(String id) {
        String sql="select * from videomsgtable where msgid = ?";
        return jdbctemp.query(sql,new VideoMsgMapper(),id);
    }
    
}
