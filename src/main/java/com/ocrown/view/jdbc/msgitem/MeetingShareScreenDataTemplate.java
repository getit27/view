package com.ocrown.view.jdbc.msgitem;

import java.util.List;

import com.ocrown.view.jdbc.BeanTemplate;
import com.ocrown.view.mapper.msgitem.MeetingShareScreenDataMapper;
import com.ocrown.view.model.msgitem.MeetingShareScreenData;

import org.springframework.stereotype.Component;

@Component
public class MeetingShareScreenDataTemplate extends BeanTemplate<MeetingShareScreenData> {

    @Override
    public List<MeetingShareScreenData> listT() {
        String sql="select * from meetingsharescreendatatable";
        return jdbctemp.query(sql,new MeetingShareScreenDataMapper());
    }

    @Override
    public List<MeetingShareScreenData> getT(String id) {
        String sql="select * from meetingsharescreendatatable where msgid = ?";
        return jdbctemp.query(sql,new MeetingShareScreenDataMapper(),id);
    }
    
}
