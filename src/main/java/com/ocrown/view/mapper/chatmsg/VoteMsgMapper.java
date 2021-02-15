package com.ocrown.view.mapper.chatmsg;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ocrown.view.model.chatmsg.VoteMsg;

import org.springframework.jdbc.core.RowMapper;

public class VoteMsgMapper implements RowMapper<VoteMsg> {

    @Override
    public VoteMsg mapRow(ResultSet rs, int arg1) throws SQLException {
        VoteMsg vm=new VoteMsg();
        vm.setIndex(Integer.parseInt(rs.getString("index")));
        vm.setId(rs.getString("id"));
        vm.setItem(rs.getString("item"));
        vm.setTitle(rs.getString("title"));
        vm.setType(rs.getString("type"));
        return vm;
    }
    
}
