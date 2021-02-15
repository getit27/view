package com.ocrown.view.mapper.chatmsg;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ocrown.view.model.chatmsg.EmotionMsg;

import org.springframework.jdbc.core.RowMapper;

public class EmotionMsgMapper implements RowMapper<EmotionMsg> {

    @Override
    public EmotionMsg mapRow(ResultSet rs, int rowNum) throws SQLException {
        EmotionMsg em=new EmotionMsg();
        em.setIndex(Integer.parseInt(rs.getString("index")));
        em.setFilename(rs.getString("filename"));
        em.setFilepath(rs.getString("filepath"));
        return em;
    }
    
}
