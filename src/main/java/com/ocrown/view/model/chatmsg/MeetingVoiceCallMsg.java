package com.ocrown.view.model.chatmsg;

import lombok.Data;

@Data
public class MeetingVoiceCallMsg {
    private int index;
    private String voiceid;
    private String endtime;
    private String filepath;
}
