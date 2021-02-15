package com.ocrown.view.mapper.chatmsg;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ocrown.view.model.chatmsg.FileMsg;

import org.springframework.jdbc.core.RowMapper;

public class FileMsgMapper implements RowMapper<FileMsg> {

    @Override
    public FileMsg mapRow(ResultSet rs, int rowNum) throws SQLException {
        FileMsg fm=new FileMsg();
        fm.setIndex(Integer.parseInt(rs.getString("index")));
        fm.setFilename(rs.getString("filename"));
        return fm;
    }
    
}
