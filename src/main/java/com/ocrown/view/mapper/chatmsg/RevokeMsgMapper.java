package com.ocrown.view.mapper.chatmsg;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ocrown.view.model.chatmsg.RevokeMsg;

import org.springframework.jdbc.core.RowMapper;

public class RevokeMsgMapper implements RowMapper<RevokeMsg> {

    @Override
    public RevokeMsg mapRow(ResultSet rs, int arg1) throws SQLException {
        RevokeMsg rm =new RevokeMsg();
        rm.setIndex(Integer.parseInt(rs.getString("index")));
        rm.setPremsgid(rs.getString("premsgid"));
        return rm;
    }
    
}
