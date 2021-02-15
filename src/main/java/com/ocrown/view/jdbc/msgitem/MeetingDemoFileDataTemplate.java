package com.ocrown.view.jdbc.msgitem;

import java.util.List;

import com.ocrown.view.jdbc.BeanTemplate;
import com.ocrown.view.mapper.msgitem.MeetingDemoFileDataMapper;
import com.ocrown.view.model.msgitem.MeetingDemoFileData;

import org.springframework.stereotype.Component;

@Component
public class MeetingDemoFileDataTemplate extends BeanTemplate<MeetingDemoFileData> {

    @Override
    public List<MeetingDemoFileData> listT() {
        String sql="select * from meetingdemofiledatatable";
        return jdbctemp.query(sql,new MeetingDemoFileDataMapper());
    }

    @Override
    public List<MeetingDemoFileData> getT(String id) {
        String sql="select * from meeingdemofiledatatable where msgid = ?";
        return jdbctemp.query(sql,new MeetingDemoFileDataMapper(),id);
    }
    
}
