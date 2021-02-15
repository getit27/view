package com.ocrown.view.mapper.chatmsg;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ocrown.view.model.chatmsg.CalendarMsg;

import org.springframework.jdbc.core.RowMapper;

public class CalendarMsgMapper implements RowMapper<CalendarMsg> {

    @Override
    public CalendarMsg mapRow(ResultSet rs, int rowNum) throws SQLException {
        CalendarMsg cm=new CalendarMsg();
        cm.setIndex(Integer.parseInt(rs.getString("index")));
        cm.setAttendeename(rs.getString("attendeename"));
        cm.setCreatorname(rs.getString("creatorname"));
        cm.setEndtime(rs.getString("endtime"));
        cm.setPlace(rs.getString("place"));
        cm.setRemarks(rs.getString("remarks"));
        cm.setStarttime(rs.getString("starttime"));
        return cm;
    }
    
}
