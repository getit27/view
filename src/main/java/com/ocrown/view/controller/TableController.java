package com.ocrown.view.controller;

import java.util.Collection;
import java.util.Map;

import com.ocrown.view.jdbc.chatmsg.AgreeMsgTemplate;
import com.ocrown.view.jdbc.chatmsg.CalendarMsgTemplate;
import com.ocrown.view.jdbc.chatmsg.CardMsgTemplate;
import com.ocrown.view.jdbc.chatmsg.TextMsgTemplate;
import com.ocrown.view.jdbc.converse.WeworkJdbcTemplate;
import com.ocrown.view.model.chatmsg.AgreeMsg;
import com.ocrown.view.model.chatmsg.CalendarMsg;
import com.ocrown.view.model.chatmsg.CardMsg;
import com.ocrown.view.model.chatmsg.TextMsg;
import com.ocrown.view.model.converse.WeworkConverse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@Controller
class TableController{

    WeworkJdbcTemplate wjt;
    AgreeMsgTemplate amt;
    TextMsgTemplate tmt;
    CalendarMsgTemplate cdarmt;
    CardMsgTemplate cardmt;

    @Autowired
    public void setWjt(WeworkJdbcTemplate wjt) {
        this.wjt = wjt;
    }
    @Autowired
    public void setAmt(AgreeMsgTemplate amt) {
        this.amt = amt;
    }
    @Autowired
    public void setCdarmt(CalendarMsgTemplate cdarmt) {
        this.cdarmt = cdarmt;
    }
    @Autowired
    public void setCardmt(CardMsgTemplate cardmt) {
        this.cardmt = cardmt;
    }
    @Autowired
    public void setTmt(TextMsgTemplate tmt) {
        this.tmt = tmt;
    }
    @GetMapping(value="/converse")
    public String showConverse(Map<String,Object>model) {
        Collection<WeworkConverse>results=wjt.listT();
        model.put("selections", results);
        return "converse/converseslist";
    }

    @GetMapping(value="agreemsg/{id}")
    public String findAgreeMsg(@PathVariable("id")int id,Map<String,Object>model){
        Collection<AgreeMsg>results=amt.getT(String.valueOf(id));
        model.put("selections", results);
        return "chatmsg/agreemsglist";
    }

    @GetMapping(value="calendarmsg/{id}")
    public String findCalendarMsg(@PathVariable("id")int id,Map<String,Object>model){
        Collection<CalendarMsg>results=cdarmt.getT(String.valueOf(id));
        model.put("selections", results);
        return "chatmsg/calendarmsglist";
    }

    @GetMapping(value="cardmsg/{id}")
    public String findCardMsg(@PathVariable("id")int id,Map<String,Object>model){
        Collection<CardMsg>results=cardmt.getT(String.valueOf(id));
        model.put("selections", results);
        return "chatmsg/cardmsglist";
    }

    @GetMapping(value="textmsg/{id}")
    public String findTextMsg(@PathVariable("id") int id,Map<String,Object>model) {
        Collection<TextMsg>results=tmt.getT(String.valueOf(id));
        model.put("selections", results);
        return "chatmsg/textmsglist";
    }

    

}