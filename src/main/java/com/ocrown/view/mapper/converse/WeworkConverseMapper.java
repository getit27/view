package com.ocrown.view.mapper.converse;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ocrown.view.model.converse.WeworkConverse;
import com.ocrown.view.model.converse.SendConverse;
import com.ocrown.view.model.converse.SwitchConverse;

public class WeworkConverseMapper implements RowMapper<WeworkConverse> {

    @Override
    public WeworkConverse mapRow(ResultSet rs, int rowNum) throws SQLException {
        String action=rs.getString("action");
        WeworkConverse wc;
        if(action.equals("send")||action.equals("recall")){
            SendConverse sc=new SendConverse(rs.getString("msgid"),action);
            sc.setFrom(rs.getString("from"));
            sc.setTolist(rs.getString("tolist"));
            sc.setRoomid(rs.getString("roomid"));
            sc.setMsgtime(rs.getString("msgtime"));
            sc.setMsgtype(rs.getString("msgtype"));
            wc=sc;
        }else{
            SwitchConverse swc=new SwitchConverse(rs.getString("msgid"), action);
            swc.setTime(rs.getString("time"));
            swc.setUser(rs.getString("user"));
            wc=swc;
        }
        return wc;
    }
    
}
