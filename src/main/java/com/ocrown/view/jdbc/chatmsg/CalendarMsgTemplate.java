package com.ocrown.view.jdbc.chatmsg;

import java.util.List;

import com.ocrown.view.jdbc.BeanTemplate;
import com.ocrown.view.mapper.chatmsg.CalendarMsgMapper;
import com.ocrown.view.model.chatmsg.CalendarMsg;

import org.springframework.stereotype.Component;

@Component
public class CalendarMsgTemplate extends BeanTemplate<CalendarMsg> {

    @Override
    public List<CalendarMsg> listT() {
        String sql="select * from calendarmsgtable";
        return jdbctemp.query(sql,new CalendarMsgMapper());
    }

    @Override
    public List<CalendarMsg> getT(String id) {
        String sql="select * from calendarmsgtable where msgid = ?";
        return jdbctemp.query(sql,new CalendarMsgMapper(),id);
    }
    
}
