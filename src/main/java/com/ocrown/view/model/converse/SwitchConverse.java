package com.ocrown.view.model.converse;

public class SwitchConverse extends WeworkConverse {
    String time;
    String user;
    
    public SwitchConverse(String msgid,String action){
        super(msgid,action);
    }
    public SwitchConverse(String msgid,String action,String time,String user){
        super(msgid, action);
        this.time=time;
        this.user=user;
    }
    public String getTime() {
        return time;
    }
    public String getUser() {
        return user;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public void setUser(String user) {
        this.user = user;
    }
}
