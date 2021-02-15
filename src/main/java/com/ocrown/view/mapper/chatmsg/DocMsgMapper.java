package com.ocrown.view.mapper.chatmsg;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ocrown.view.model.chatmsg.DocMsg;

import org.springframework.jdbc.core.RowMapper;

public class DocMsgMapper implements RowMapper<DocMsg> {

    @Override
    public DocMsg mapRow(ResultSet rs, int rowNum) throws SQLException {
        DocMsg dm=new DocMsg();
        dm.setIndex(Integer.parseInt(rs.getString("index")));
        dm.setCreator(rs.getString("creator"));
        dm.setLinkurl(rs.getString("link_url"));
        dm.setTitle(rs.getString("title"));
        return dm;
    }
    
}
