package com.ocrown.view.model.chatmsg;

import lombok.Data;

@Data
public class CalendarMsg {
    private int index;
    private String creatorname;
    private String attendeename;
    private String starttime;
    private String endtime;
    private String place;
    private String remarks;
}
