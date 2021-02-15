package com.ocrown.view.mapper.chatmsg;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ocrown.view.model.chatmsg.MeetingMsg;

import org.springframework.jdbc.core.RowMapper;

public class MeetingMsgMapper implements RowMapper<MeetingMsg> {

    @Override
    public MeetingMsg mapRow(ResultSet rs, int arg1) throws SQLException {
        MeetingMsg mm =new MeetingMsg();
        mm.setIndex(Integer.parseInt(rs.getString("index")));
        mm.setAddress(rs.getString("address"));
        mm.setEndtime(rs.getString("endtime"));
        mm.setMeetingid(rs.getString("meetingid"));
        mm.setMeetingtype(rs.getString("meetingtype"));
        mm.setRemarks(rs.getString("setremarks"));
        mm.setStarttime(rs.getString("starttime"));
        mm.setStatus(rs.getString("status"));
        mm.setTopic(rs.getString("topic"));
        return mm;
    }
    
}
