package com.ocrown.view.controller;

import java.util.Collection;
import java.util.Map;

import com.ocrown.view.jdbc.converse.WeworkJdbcTemplate;

import com.ocrown.view.model.converse.WeworkConverse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
class ConverseController{

    WeworkJdbcTemplate wjt;

    @Autowired
    public ConverseController(WeworkJdbcTemplate wjt){
        this.wjt=wjt;
    }

    public WeworkJdbcTemplate getWjt() {
        return wjt;
    }
    public void setWjt(WeworkJdbcTemplate wjt) {
        this.wjt = wjt;
    }
    @GetMapping(value="/converse")
    public String getMethodName(Map<String,Object>model) {
        Collection<WeworkConverse>results=wjt.listT();
        model.put("selections", results);
        return "converse/conversesList";
    }
    

}