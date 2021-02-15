package com.ocrown.view.jdbc.chatmsg;

import java.util.List;

import com.ocrown.view.jdbc.BeanTemplate;
import com.ocrown.view.mapper.chatmsg.VoteMsgMapper;
import com.ocrown.view.model.chatmsg.VoteMsg;

import org.springframework.stereotype.Component;

@Component
public class VoteMsgTemplate extends BeanTemplate<VoteMsg> {

    @Override
    public List<VoteMsg> listT() {
        String sql="select * from votemsgtable";
        return jdbctemp.query(sql,new VoteMsgMapper());

    }

    @Override
    public List<VoteMsg> getT(String id) {
        String sql="select * from votemsgtable where msgid = ?";
        return jdbctemp.query(sql,new VoteMsgMapper(),id);

    }
    
}
