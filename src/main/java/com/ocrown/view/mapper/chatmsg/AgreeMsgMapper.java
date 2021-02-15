package com.ocrown.view.mapper.chatmsg;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ocrown.view.model.chatmsg.AgreeMsg;

import org.springframework.jdbc.core.RowMapper;

public class AgreeMsgMapper implements RowMapper<AgreeMsg> {

    @Override
    public AgreeMsg mapRow(ResultSet rs, int rowNum) throws SQLException {
        AgreeMsg am=new AgreeMsg();
        am.setIndex(Integer.parseInt(rs.getString("index")));
        am.setAgreetime(rs.getString("agree_time"));
        am.setUserid(rs.getString("userid"));
        return am;
    }
    
}
