package com.ocrown.view.mapper.chatmsg;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ocrown.view.model.chatmsg.MeetingVoiceCallMsg;

import org.springframework.jdbc.core.RowMapper;

public class MeetingVoiceCallMsgMapper implements RowMapper<MeetingVoiceCallMsg> {

    @Override
    public MeetingVoiceCallMsg mapRow(ResultSet rs, int rowNum) throws SQLException {
        MeetingVoiceCallMsg mvcm=new MeetingVoiceCallMsg();
        mvcm.setIndex(Integer.parseInt(rs.getString("index")));
        mvcm.setVoiceid(rs.getString("voiceid"));
        mvcm.setEndtime(rs.getString("endtime"));
        mvcm.setFilepath(rs.getString("filepath"));
        return mvcm;
    }
    
}
