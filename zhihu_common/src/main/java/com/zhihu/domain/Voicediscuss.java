package com.zhihu.domain;

import java.util.Date;

public class Voicediscuss {
    private Integer id;

    private String retext;

    private Integer appraise;

    private String userid;

    private Integer voiceid;

    private Date date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRetext() {
        return retext;
    }

    public void setRetext(String retext) {
        this.retext = retext == null ? null : retext.trim();
    }

    public Integer getAppraise() {
        return appraise;
    }

    public void setAppraise(Integer appraise) {
        this.appraise = appraise;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Integer getVoiceid() {
        return voiceid;
    }

    public void setVoiceid(Integer voiceid) {
        this.voiceid = voiceid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}