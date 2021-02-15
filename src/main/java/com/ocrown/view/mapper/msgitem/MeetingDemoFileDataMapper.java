package com.ocrown.view.mapper.msgitem;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ocrown.view.model.msgitem.MeetingDemoFileData;

import org.springframework.jdbc.core.RowMapper;

public class MeetingDemoFileDataMapper implements RowMapper<MeetingDemoFileData> {

    @Override
    public MeetingDemoFileData mapRow(ResultSet rs, int rowNum) throws SQLException {
        MeetingDemoFileData mdfd=new MeetingDemoFileData();
        mdfd.setIndex(Integer.parseInt(rs.getString("index")));
        mdfd.setFilename(rs.getString("filename"));
        mdfd.setDemooperator(rs.getString("demooperator"));
        mdfd.setStarttime(rs.getString("starttime"));
        mdfd.setEndtime(rs.getString("endtime"));
        return mdfd;
    }
    
}
