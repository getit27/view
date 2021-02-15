package com.ocrown.view.mapper.chatmsg;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ocrown.view.model.chatmsg.CardMsg;

import org.springframework.jdbc.core.RowMapper;

public class CardMsgMapper implements RowMapper<CardMsg> {

    @Override
    public CardMsg mapRow(ResultSet rs, int rowNum) throws SQLException {
        CardMsg cm=new CardMsg();
        cm.setIndex(Integer.parseInt(rs.getString("index")));
        cm.setUserid(rs.getString("userid"));
        cm.setCorpname(rs.getString("corpname"));
        return cm;
    }
    
}