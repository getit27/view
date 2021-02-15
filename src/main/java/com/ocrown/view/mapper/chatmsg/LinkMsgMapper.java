package com.ocrown.view.mapper.chatmsg;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ocrown.view.model.chatmsg.LinkMsg;

import org.springframework.jdbc.core.RowMapper;

public class LinkMsgMapper implements RowMapper<LinkMsg> {

    @Override
    public LinkMsg mapRow(ResultSet rs, int arg1) throws SQLException {
        LinkMsg lm =new LinkMsg();
        lm.setIndex(Integer.parseInt(rs.getString("index")));
        lm.setDescription(rs.getString("description"));
        lm.setImageurl(rs.getString("image_url"));
        lm.setLinkurl(rs.getString("link_url"));
        lm.setTitle(rs.getString("title"));
        return lm;
    }
    
}
