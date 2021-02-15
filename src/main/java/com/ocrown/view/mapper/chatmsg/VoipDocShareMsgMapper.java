package com.ocrown.view.mapper.chatmsg;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ocrown.view.model.chatmsg.VoipDocShareMsg;

import org.springframework.jdbc.core.RowMapper;

public class VoipDocShareMsgMapper implements RowMapper<VoipDocShareMsg> {

    @Override
    public VoipDocShareMsg mapRow(ResultSet rs, int rowNum) throws SQLException {
        VoipDocShareMsg im=new VoipDocShareMsg();
        im.setIndex(Integer.parseInt(rs.getString("index")));
        im.setFilepath(rs.getString("filepath"));
        return im;
    }
    
}
