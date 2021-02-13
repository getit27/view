package com.ocrown.view.model.converse;

public class SendConverse extends WeworkConverse {
    String from;
    String tolist;
    String roomid;
    String msgtime;
    String msgtype;
    // ChatMsg typemsg;

    public SendConverse(String msgid, String action) {
        super(msgid, action);
    }

    public SendConverse(String from, String tolist, String roomid, String msgtime, String msgtype) {
        super();
        this.from = from;
        this.tolist = tolist;
        this.roomid = roomid;
        this.msgtime = msgtime;
        this.msgtype = msgtype;
        // this.typemsg = typemsg;
    }
    public String getFrom() {
        return from;
    }
    public String getTolist() {
        return tolist;
    }
    public String getRoomid() {
        return roomid;
    }
    public String getMsgtime() {
        return msgtime;
    }
    public String getMsgtype() {
        return msgtype;
    }
    public void setFrom(String from) {
        this.from = from;
    }
    public void setTolist(String tolist) {
        this.tolist = tolist;
    }
    public void setRoomid(String roomid) {
        this.roomid = roomid;
    }
    public void setMsgtime(String msgtime) {
        this.msgtime = msgtime;
    }
    public void setMsgtype(String msgtype) {
        this.msgtype = msgtype;
    }
}
