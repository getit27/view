package com.ocrown.view.mapper.chatmsg;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ocrown.view.model.chatmsg.MixedMsg;

import org.springframework.jdbc.core.RowMapper;

public class MixedMsgMapper implements RowMapper<MixedMsg> {

    @Override
    public MixedMsg mapRow(ResultSet rs, int rowNum) throws SQLException {
        MixedMsg mm=new MixedMsg();
        mm.setMsgid(rs.getString("msgid"));
        mm.setIndex(Integer.parseInt(rs.getString("index")));
        return null;
    }
    
}
