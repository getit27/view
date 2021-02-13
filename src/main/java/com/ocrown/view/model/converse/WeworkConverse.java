package com.ocrown.view.model.converse;

public abstract class WeworkConverse {
    String msgid;
    String action;

    public WeworkConverse() {

    }

    public WeworkConverse(String msgid, String action) {
        this.msgid = msgid;
        this.action = action;
    }

    public String getAction() {
        return action;
    }
    public String getMsgid() {
        return msgid;
    }
    public void setAction(String action) {
        this.action = action;
    }
    public void setMsgid(String msgid) {
        this.msgid = msgid;
    }
}
