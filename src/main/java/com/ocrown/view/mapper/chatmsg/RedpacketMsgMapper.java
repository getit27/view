package com.ocrown.view.mapper.chatmsg;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.ocrown.view.model.chatmsg.RedpacketMsg;

public class RedpacketMsgMapper implements RowMapper<RedpacketMsg> {

    @Override
    public RedpacketMsg mapRow(ResultSet rs, int arg1) throws SQLException {
        RedpacketMsg rm =new RedpacketMsg();
        rm.setIndex(Integer.parseInt(rs.getString("index")));
        rm.setTotalamount(rs.getString("topalamount"));
        rm.setTotalcnt(rs.getString("totalcnt"));
        rm.setType(rs.getString("type"));
        rm.setWish(rs.getString("wish"));
        return rm;
    }
    
}
