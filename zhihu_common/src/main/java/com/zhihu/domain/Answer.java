package com.zhihu.domain;

import java.util.Date;

public class Answer {
    private Integer id;

    private String answerid;

    private String userid;

    private String topicid;

    private String quesid;

    private String answercontent;

    private String photo;

    private String anonymity;

    private Integer commentnumb;

    private Integer reportnumb;

    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAnswerid() {
        return answerid;
    }

    public void setAnswerid(String answerid) {
        this.answerid = answerid == null ? null : answerid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getTopicid() {
        return topicid;
    }

    public void setTopicid(String topicid) {
        this.topicid = topicid == null ? null : topicid.trim();
    }

    public String getQuesid() {
        return quesid;
    }

    public void setQuesid(String quesid) {
        this.quesid = quesid == null ? null : quesid.trim();
    }

    public String getAnswercontent() {
        return answercontent;
    }

    public void setAnswercontent(String answercontent) {
        this.answercontent = answercontent == null ? null : answercontent.trim();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public String getAnonymity() {
        return anonymity;
    }

    public void setAnonymity(String anonymity) {
        this.anonymity = anonymity == null ? null : anonymity.trim();
    }

    public Integer getCommentnumb() {
        return commentnumb;
    }

    public void setCommentnumb(Integer commentnumb) {
        this.commentnumb = commentnumb;
    }

    public Integer getReportnumb() {
        return reportnumb;
    }

    public void setReportnumb(Integer reportnumb) {
        this.reportnumb = reportnumb;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}