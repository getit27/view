package com.ocrown.view.jdbc.chatmsg;

import java.util.List;

import com.ocrown.view.jdbc.BeanTemplate;
import com.ocrown.view.mapper.chatmsg.MeetingVoiceCallMsgMapper;
import com.ocrown.view.model.chatmsg.MeetingVoiceCallMsg;

import org.springframework.stereotype.Component;

@Component
public class MeetingVoiceCallMsgTemplate extends BeanTemplate<MeetingVoiceCallMsg> {

    @Override
    public List<MeetingVoiceCallMsg> listT() {
        String sql="select * from meetingvoicecalltable";
        return jdbctemp.query(sql,new MeetingVoiceCallMsgMapper());
    }

    @Override
    public List<MeetingVoiceCallMsg> getT(String id) {
        String sql="select * from meetingvoicecalltable where msgid =? ";
        return jdbctemp.query(sql,new MeetingVoiceCallMsgMapper(),id);
    }
}
