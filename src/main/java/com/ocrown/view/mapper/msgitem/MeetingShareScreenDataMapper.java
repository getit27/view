package com.ocrown.view.mapper.msgitem;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ocrown.view.model.msgitem.MeetingShareScreenData;

import org.springframework.jdbc.core.RowMapper;

public class MeetingShareScreenDataMapper implements RowMapper<MeetingShareScreenData> {

    @Override
    public MeetingShareScreenData mapRow(ResultSet rs, int rowNum) throws SQLException {
        MeetingShareScreenData mssd=new MeetingShareScreenData();
        mssd.setIndex(Integer.parseInt(rs.getString("index")));
        mssd.setShare(rs.getString("share"));
        mssd.setStarttime(rs.getString("starttime"));
        mssd.setEndtime(rs.getString("endtime"));
        return mssd;
    }

    
}
