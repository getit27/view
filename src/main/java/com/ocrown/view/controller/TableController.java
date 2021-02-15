package com.ocrown.view.controller;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import com.ocrown.view.jdbc.chatmsg.AgreeMsgTemplate;
import com.ocrown.view.jdbc.chatmsg.CalendarMsgTemplate;
import com.ocrown.view.jdbc.chatmsg.CardMsgTemplate;
import com.ocrown.view.jdbc.chatmsg.ChatRecordMsgTemplate;
import com.ocrown.view.jdbc.chatmsg.CollectMsgTemplate;
import com.ocrown.view.jdbc.chatmsg.EmotionMsgTemplate;
import com.ocrown.view.jdbc.chatmsg.FileMsgTemplate;
import com.ocrown.view.jdbc.chatmsg.ImageMsgTemplate;
import com.ocrown.view.jdbc.chatmsg.MeetingVoiceCallMsgTemplate;
import com.ocrown.view.jdbc.chatmsg.MixedMsgTemplate;
import com.ocrown.view.jdbc.chatmsg.TextMsgTemplate;
import com.ocrown.view.jdbc.chatmsg.VideoMsgTemplate;
import com.ocrown.view.jdbc.chatmsg.VoiceMsgTemplate;
import com.ocrown.view.jdbc.chatmsg.VoipDocShareMsgTemplate;
import com.ocrown.view.jdbc.converse.WeworkJdbcTemplate;
import com.ocrown.view.jdbc.msgitem.ChatRecordItemTemplate;
import com.ocrown.view.jdbc.msgitem.CollectItemTemplate;
import com.ocrown.view.jdbc.msgitem.MeetingDemoFileDataTemplate;
import com.ocrown.view.jdbc.msgitem.MeetingShareScreenDataTemplate;
import com.ocrown.view.jdbc.msgitem.MixedItemTemp;
import com.ocrown.view.model.chatmsg.AgreeMsg;
import com.ocrown.view.model.chatmsg.CalendarMsg;
import com.ocrown.view.model.chatmsg.CardMsg;
import com.ocrown.view.model.chatmsg.ChatRecordMsg;
import com.ocrown.view.model.chatmsg.CollectMsg;
import com.ocrown.view.model.chatmsg.EmotionMsg;
import com.ocrown.view.model.chatmsg.FileMsg;
import com.ocrown.view.model.chatmsg.ImageMsg;
import com.ocrown.view.model.chatmsg.MeetingVoiceCallMsg;
import com.ocrown.view.model.chatmsg.MixedMsg;
import com.ocrown.view.model.chatmsg.TextMsg;
import com.ocrown.view.model.chatmsg.VideoMsg;
import com.ocrown.view.model.chatmsg.VoiceMsg;
import com.ocrown.view.model.chatmsg.VoipDocShareMsg;
import com.ocrown.view.model.converse.WeworkConverse;
import com.ocrown.view.model.msgitem.ChatRecordItem;
import com.ocrown.view.model.msgitem.CollectItem;
import com.ocrown.view.model.msgitem.MeetingDemoFileData;
import com.ocrown.view.model.msgitem.MeetingShareScreenData;
import com.ocrown.view.model.msgitem.MixedItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@Controller
class TableController{

    WeworkJdbcTemplate wjt;
    AgreeMsgTemplate amt;
    CalendarMsgTemplate cdarmt;
    CardMsgTemplate cardmt;
    ChatRecordMsgTemplate cremt;
    ChatRecordItemTemplate creit;
    CollectMsgTemplate clctmt;
    CollectItemTemplate clctit;
    // DocMsgTemplate dcmt;
    EmotionMsgTemplate emomt;
    FileMsgTemplate fmt;
    ImageMsgTemplate imt;
    MeetingVoiceCallMsgTemplate mvcmt;
    MeetingDemoFileDataTemplate mdfdt;
    MeetingShareScreenDataTemplate mssdt;
    MixedMsgTemplate mmt;
    MixedItemTemp mit;
    TextMsgTemplate tmt;
    VideoMsgTemplate vdomt;
    VoiceMsgTemplate vicmt;
    VoipDocShareMsgTemplate vdsmt;
    

    @Autowired
    public void setWjt(WeworkJdbcTemplate wjt) {
        this.wjt = wjt;
    }
    @Autowired
    public void setAmt(AgreeMsgTemplate amt) {
        this.amt = amt;
    }
    @Autowired
    public void setCdarmt(CalendarMsgTemplate cdarmt) {
        this.cdarmt = cdarmt;
    }
    @Autowired
    public void setCardmt(CardMsgTemplate cardmt) {
        this.cardmt = cardmt;
    }
    @Autowired
    public void setCremt(ChatRecordMsgTemplate cremt) {
        this.cremt = cremt;
    }
    @Autowired
    public void setCreit(ChatRecordItemTemplate creit) {
        this.creit = creit;
    }
    @Autowired
    public void setClctmt(CollectMsgTemplate clctmt) {
        this.clctmt = clctmt;
    }
    @Autowired
    public void setClctit(CollectItemTemplate clctit) {
        this.clctit = clctit;
    }

    @Autowired
    public void setEmomt(EmotionMsgTemplate emomt) {
        this.emomt = emomt;
    }

    @Autowired
    public void setFmt(FileMsgTemplate fmt) {
        this.fmt = fmt;
    }

    @Autowired
    public void setImt(ImageMsgTemplate imt) {
        this.imt = imt;
    }

    @Autowired
    public void setMvcmt(MeetingVoiceCallMsgTemplate mvcmt) {
        this.mvcmt = mvcmt;
    }

    @Autowired
    public void setMdfdt(MeetingDemoFileDataTemplate mdfdt) {
        this.mdfdt = mdfdt;
    }

    @Autowired
    public void setMssdt(MeetingShareScreenDataTemplate mssdt) {
        this.mssdt = mssdt;
    }

    @Autowired
    public void setMmt(MixedMsgTemplate mmt) {
        this.mmt = mmt;
    }
    @Autowired
    public void setMit(MixedItemTemp mit) {
        this.mit = mit;
    }

    @Autowired
    public void setTmt(TextMsgTemplate tmt) {
        this.tmt = tmt;
    }

    @Autowired
    public void setVdomt(VideoMsgTemplate vdomt) {
        this.vdomt = vdomt;
    }

    @Autowired
    public void setVicmt(VoiceMsgTemplate vicmt) {
        this.vicmt = vicmt;
    }

    @Autowired
    public void setVdsmt(VoipDocShareMsgTemplate vdsmt) {
        this.vdsmt = vdsmt;
    }


    @GetMapping(value="/converse")
    public String showConverse(Map<String,Object>model) {
        Collection<WeworkConverse>results=wjt.listT();
        model.put("selections", results);
        return "converse/converseslist";
    }

    @GetMapping(value="agreemsg/{id}")
    public String findAgreeMsg(@PathVariable("id")int id,Map<String,Object>model){
        Collection<AgreeMsg>results=amt.getT(String.valueOf(id));
        model.put("selections", results);
        return "chatmsg/agreemsglist";
    }

    @GetMapping(value="calendarmsg/{id}")
    public String findCalendarMsg(@PathVariable("id")int id,Map<String,Object>model){
        Collection<CalendarMsg>results=cdarmt.getT(String.valueOf(id));
        model.put("selections", results);
        return "chatmsg/calendarmsglist";
    }

    @GetMapping(value="cardmsg/{id}")
    public String findCardMsg(@PathVariable("id")int id,Map<String,Object>model){
        Collection<CardMsg>results=cardmt.getT(String.valueOf(id));
        model.put("selections", results);
        return "chatmsg/cardmsglist";
    }
    
    @GetMapping(value="chatrecordmsg/{id}")
    public String findChatRecordMsg(@PathVariable("id") int id,Map<String,Object>model) {
        Collection<ChatRecordMsg>results=cremt.getT(String.valueOf(id));
        model.put("selections", results);
        return "chatmsg/chatrecordmsglist";
    }
    
    @GetMapping(value="chatrecorditem/{id}")
    public String findChatRecordItem(@PathVariable("id") int id,Map<String,Object>model) {
        Collection<ChatRecordItem>results=creit.getT(String.valueOf(id));
        model.put("selections", results);
        return "msgitem/chatrecorditemlist";
    }

    @GetMapping(value="collectmsg/{id}")
    public String findCollectMsg(@PathVariable("id") int id,Map<String,Object>model) {
        Collection<CollectMsg>results=clctmt.getT(String.valueOf(id));
        model.put("selections", results);
        return "chatmsg/collectmsglist";
    }

    @GetMapping(value="collectitem/{id}")
    public String findCollectItem(@PathVariable("id") int id,Map<String,Object>model) {
        Collection<CollectItem>results=clctit.getT(String.valueOf(id));
        model.put("selections", results);
        return "msgitem/collectitemlist";
    }


    @GetMapping(value="emotionmsg/{id}")
    public String findEmotionMsg(@PathVariable("id") int id,Map<String,Object>model) {
        Collection<EmotionMsg>results=emomt.getT(String.valueOf(id));
        model.put("selections", results);
        return "chatmsg/emotionmsglist";
    }


    @GetMapping(value="filemsg/{id}")
    public String findFileMsg(@PathVariable("id") int id,Map<String,Object>model) {
        Collection<FileMsg>results=fmt.getT(String.valueOf(id));
        model.put("selections", results);
        return "chatmsg/filemsglist";
    }

    
    @GetMapping(value="imagemsg/{id}")
    public String findImageMsg(@PathVariable("id") int id,Map<String,Object>model) {
        Collection<ImageMsg>results=imt.getT(String.valueOf(id));
        model.put("selections", results);
        return "chatmsg/imagemsglist";
    }

    @GetMapping(value="meetingvoicecallmsg/{id}")
    public String findMeetingVoiceCallMsg(@PathVariable("id") int id,Map<String,Object>model) {
        Collection<MeetingVoiceCallMsg>results=mvcmt.getT(String.valueOf(id));
        model.put("selections", results);
        return "chatmsg/meetingvoicecallmsglist";
    }
    
    @GetMapping(value="meetingdemofiledata/{id}")
    public String findMeetingDemoFileData(@PathVariable("id") int id,Map<String,Object>model) {
        Collection<MeetingDemoFileData>results=mdfdt.getT(String.valueOf(id));
        model.put("selections", results);
        return "msgitem/meetingdemofliedatalist";
    }
    
    @GetMapping(value="meetingsharescreendata/{id}")
    public String findMeetingShareScreenData(@PathVariable("id") int id,Map<String,Object>model) {
        Collection<MeetingShareScreenData>results=mssdt.getT(String.valueOf(id));
        model.put("selections", results);
        return "msgitem/meetingsharescreendatalist";
    }

    @GetMapping(value="mixedmsg/{id}")
    public String findMixedMsg(@PathVariable("id") int id,Map<String,Object>model) {
        Collection<MixedMsg>results=mmt.getT(String.valueOf(id));
        model.put("selections", results);
        return "chatmsg/mixedmsglist";
    }

    @GetMapping(value="mixeditem/{id}")
    public String findMixedItem(@PathVariable("id") int id,Map<String,Object>model) {
        Collection<MixedItem>results=mit.getT(String.valueOf(id));
        model.put("selections", results);
        return "msgitem/mixeditemlist";
    }


    @GetMapping(value="textmsg/{id}")
    public String findTextMsg(@PathVariable("id") int id,Map<String,Object>model) {
        Collection<TextMsg>results=tmt.getT(String.valueOf(id));
        model.put("selections", results);
        return "chatmsg/textmsglist";
    }

    @GetMapping(value="videomsg/{id}")
    public String findVideoMsg(@PathVariable("id") int id,Map<String,Object>model) {
        Collection<VideoMsg>results=vdomt.getT(String.valueOf(id));
        model.put("selections", results);
        return "chatmsg/videomsglist";
    }
    
    @GetMapping(value="voicemsg/{id}")
    public String findVoiceMsg(@PathVariable("id") int id,Map<String,Object>model) {
        Collection<VoiceMsg>results=vicmt.getT(String.valueOf(id));
        model.put("selections", results);
        return "chatmsg/voicemsglist";
    }
    
    @GetMapping(value="voipdocsharemsg/{id}")
    public String findVoipDocShareMsg(@PathVariable("id") int id,Map<String,Object>model) {
        Collection<VoipDocShareMsg>results=vdsmt.getT(String.valueOf(id));
        model.put("selections", results);
        return "chatmsg/voipdocsharemsglist";
    }
}