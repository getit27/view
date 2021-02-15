package com.ocrown.view.model.chatmsg;

import lombok.Data;

@Data 
public class ExternalRedpacketMsg {
    private int index;
    private String type;
    private String wish;
    private String totalcnt;
    private String totalamount;
}
