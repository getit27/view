package com.ocrown.view.mapper.chatmsg;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ocrown.view.model.chatmsg.VideoMsg;

import org.springframework.jdbc.core.RowMapper;

public class VideoMsgMapper implements RowMapper<VideoMsg> {

    @Override
    public VideoMsg mapRow(ResultSet rs, int rowNum) throws SQLException {
        VideoMsg vm=new VideoMsg();
        vm.setIndex(Integer.parseInt(rs.getString("index")));
        vm.setFilepath(rs.getString("filepath"));
        vm.setPlaylenth(rs.getString("paly_lenth"));
        return vm;
    }

    
}
