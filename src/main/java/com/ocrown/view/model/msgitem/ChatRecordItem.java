package com.ocrown.view.model.msgitem;

import lombok.Data;

@Data
public class ChatRecordItem {
    private String msgid;
    private int index;
    private String type;
    private String msgtime;
    private String fromchatroom;
}
