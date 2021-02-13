package com.ocrown.view.mapper.converse;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ocrown.view.model.converse.WeworkConverse;

public class WeworkConverseMapper implements RowMapper<WeworkConverse> {

    @Override
    public WeworkConverse mapRow(ResultSet rs, int rowNum) throws SQLException {
        String action=rs.getString("action");
        WeworkConverse wc=new WeworkConverse(rs.getString("msgid"),action);
        if(action.equals("send")||action.equals("recall")){
            wc.setFrom(rs.getString("from"));
            wc.setTolist(rs.getString("tolist"));
            wc.setRoomid(rs.getString("roomid"));
            wc.setMsgtime(rs.getString("msgtime"));
            wc.setMsgtype(rs.getString("msgtype"));
            wc.setTime("");
            wc.setUser("");
        }else{
            wc.setFrom("");
            wc.setTolist("");
            wc.setRoomid("");
            wc.setMsgtime("");
            wc.setMsgtype("");
            wc.setTime(rs.getString("time"));
            wc.setUser(rs.getString("user"));
        }
        return wc;
    }
    
}
