package com.ocrown.view.mapper.chatmsg;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ocrown.view.model.chatmsg.LocationMsg;

import org.springframework.jdbc.core.RowMapper;

public class LocationMsgMapper implements RowMapper<LocationMsg> {

    @Override
    public LocationMsg mapRow(ResultSet rs, int arg1) throws SQLException {
        LocationMsg lm =new LocationMsg();
        lm.setIndex(Integer.parseInt(rs.getString("index")));
        lm.setAdress(rs.getString("adress"));
        lm.setLatitude(rs.getString("latitude"));
        lm.setLongitude(rs.getString("longitude"));
        lm.setTitle(rs.getString("title"));
        return lm;
    }
    
}
