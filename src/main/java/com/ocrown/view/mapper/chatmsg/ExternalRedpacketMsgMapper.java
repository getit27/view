package com.ocrown.view.mapper.chatmsg;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ocrown.view.model.chatmsg.ExternalRedpacketMsg;

import org.springframework.jdbc.core.RowMapper;

public class ExternalRedpacketMsgMapper implements RowMapper<ExternalRedpacketMsg> {

    @Override
    public ExternalRedpacketMsg mapRow(ResultSet rs, int arg1) throws SQLException {
        ExternalRedpacketMsg erm =new ExternalRedpacketMsg();
        erm.setIndex(Integer.parseInt(rs.getString("index")));
        erm.setTotalamount(rs.getString("totalamount"));
        erm.setTotalcnt(rs.getString("totalcnt"));
        erm.setType(rs.getString("type"));
        erm.setWish(rs.getString("wish"));
        return erm;
    }
    
}
