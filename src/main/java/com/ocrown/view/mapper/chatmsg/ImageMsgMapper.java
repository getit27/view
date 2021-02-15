package com.ocrown.view.mapper.chatmsg;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ocrown.view.model.chatmsg.ImageMsg;

import org.springframework.jdbc.core.RowMapper;

public class ImageMsgMapper implements RowMapper<ImageMsg> {

    @Override
    public ImageMsg mapRow(ResultSet rs, int rowNum) throws SQLException {
        ImageMsg im=new ImageMsg();
        im.setIndex(Integer.parseInt(rs.getString("index")));
        im.setFilepath(rs.getString("filepath"));
        return im;
    }
    
}
