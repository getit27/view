package com.ocrown.view.model.chatmsg;

import lombok.Data;

@Data
public class CollectMsg {
    private String msgid;
    private int index;
    private String roomname;
    private String creator;
    private String createtime;
    private String title;
}
