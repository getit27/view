package com.ocrown.view.model.chatmsg;

import lombok.Data;

@Data
public class RedpacketMsg {
    private int index;
    private String type;
    private String wish;
    private String totalcnt;
    private String totalamount;
}
