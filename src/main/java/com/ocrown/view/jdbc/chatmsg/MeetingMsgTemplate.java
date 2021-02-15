package com.ocrown.view.jdbc.chatmsg;

import java.util.List;

import com.ocrown.view.jdbc.BeanTemplate;
import com.ocrown.view.mapper.chatmsg.MeetingMsgMapper;
import com.ocrown.view.model.chatmsg.MeetingMsg;

import org.springframework.stereotype.Component;

@Component
public class MeetingMsgTemplate extends BeanTemplate<MeetingMsg> {

    @Override
    public List<MeetingMsg> listT() {
        String sql="select * from meetingmsgtable";
        return jdbctemp.query(sql,new MeetingMsgMapper());
    }

    @Override
    public List<MeetingMsg> getT(String id) {
        String sql="select * from meetingmsgtable where msgid = ?";
        return jdbctemp.query(sql,new MeetingMsgMapper(),id);
    }
    
}
