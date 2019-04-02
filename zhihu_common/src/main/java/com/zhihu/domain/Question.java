package com.zhihu.domain;

import java.util.Date;

public class Question {
    private Integer id;

    private String quesid;

    private String topicid;

    private String quesname;

    private String quesdescribe;

    private String photo;

    private Integer answernumb;

    private Integer attentionnumb;

    private Integer browsenumb;

    private String anonymity;

    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuesid() {
        return quesid;
    }

    public void setQuesid(String quesid) {
        this.quesid = quesid == null ? null : quesid.trim();
    }

    public String getTopicid() {
        return topicid;
    }

    public void setTopicid(String topicid) {
        this.topicid = topicid == null ? null : topicid.trim();
    }

    public String getQuesname() {
        return quesname;
    }

    public void setQuesname(String quesname) {
        this.quesname = quesname == null ? null : quesname.trim();
    }

    public String getQuesdescribe() {
        return quesdescribe;
    }

    public void setQuesdescribe(String quesdescribe) {
        this.quesdescribe = quesdescribe == null ? null : quesdescribe.trim();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public Integer getAnswernumb() {
        return answernumb;
    }

    public void setAnswernumb(Integer answernumb) {
        this.answernumb = answernumb;
    }

    public Integer getAttentionnumb() {
        return attentionnumb;
    }

    public void setAttentionnumb(Integer attentionnumb) {
        this.attentionnumb = attentionnumb;
    }

    public Integer getBrowsenumb() {
        return browsenumb;
    }

    public void setBrowsenumb(Integer browsenumb) {
        this.browsenumb = browsenumb;
    }

    public String getAnonymity() {
        return anonymity;
    }

    public void setAnonymity(String anonymity) {
        this.anonymity = anonymity == null ? null : anonymity.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}