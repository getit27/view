package com.ocrown.view.controller;

import java.util.Collection;
import java.util.Map;

import com.ocrown.view.jdbc.chatmsg.TextMsgTemplate;
import com.ocrown.view.jdbc.converse.WeworkJdbcTemplate;
import com.ocrown.view.model.chatmsg.TextMsg;
import com.ocrown.view.model.converse.WeworkConverse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@Controller
class TableController{

    WeworkJdbcTemplate wjt;
    TextMsgTemplate tmt;

    @Autowired
    public void setWjt(WeworkJdbcTemplate wjt) {
        this.wjt = wjt;
    }
    @Autowired
    public void setTmt(TextMsgTemplate tmt) {
        this.tmt = tmt;
    }
    @GetMapping(value="/converse")
    public String getMethodName(Map<String,Object>model) {
        Collection<WeworkConverse>results=wjt.listT();
        model.put("selections", results);
        return "converse/converseslist";
    }
    @GetMapping(value="textmsg/{id}")
    public String getMethodName(@PathVariable("id") int id,Map<String,Object>model) {
        Collection<TextMsg>results=tmt.getT(String.valueOf(id));
        model.put("selections", results);
        return "chatmsg/textmsglist";
    }
    

}