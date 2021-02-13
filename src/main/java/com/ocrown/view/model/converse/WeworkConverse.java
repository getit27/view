package com.ocrown.view.model.converse;

import lombok.Data;

@Data
public class WeworkConverse {
    String msgid;
    String action;

    String from;
    String tolist;
    String roomid;
    String msgtime;
    String msgtype;

    String time;
    String user;

    public WeworkConverse() {

    }

    public WeworkConverse(String msgid, String action) {
        this.msgid = msgid;
        this.action = action;
    }

}
