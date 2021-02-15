package com.ocrown.view.mapper.chatmsg;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ocrown.view.model.chatmsg.VoiceMsg;

import org.springframework.jdbc.core.RowMapper;

public class VoiceMsgMapper implements RowMapper<VoiceMsg> {

    @Override
    public VoiceMsg mapRow(ResultSet rs, int rowNum) throws SQLException {
        VoiceMsg vm=new VoiceMsg();
        vm.setIndex(Integer.parseInt(rs.getString("index")));
        vm.setFilepath(rs.getString("filepath"));
        vm.setPlaylenth(rs.getString("paly_lenth"));
        return vm;
    }

    
}
