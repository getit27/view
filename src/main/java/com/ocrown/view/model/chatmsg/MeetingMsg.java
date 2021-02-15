package com.ocrown.view.model.chatmsg;

import lombok.Data;

@Data   
public class MeetingMsg {
    private int index;
    private String topic;
    private String starttime;
    private String endtime;
    private String address;
    private String remarks;
    private String meetingtype;
    private String meetingid;
    private String status;
}
