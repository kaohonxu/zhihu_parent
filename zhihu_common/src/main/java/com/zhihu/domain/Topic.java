package com.zhihu.domain;

import java.util.Date;

public class Topic {
    private Integer id;

    private String topicid;

    private String topicclassid;

    private String topicname;

    private String topicdescribe;

    private String photo;

    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTopicid() {
        return topicid;
    }

    public void setTopicid(String topicid) {
        this.topicid = topicid == null ? null : topicid.trim();
    }

    public String getTopicclassid() {
        return topicclassid;
    }

    public void setTopicclassid(String topicclassid) {
        this.topicclassid = topicclassid == null ? null : topicclassid.trim();
    }

    public String getTopicname() {
        return topicname;
    }

    public void setTopicname(String topicname) {
        this.topicname = topicname == null ? null : topicname.trim();
    }

    public String getTopicdescribe() {
        return topicdescribe;
    }

    public void setTopicdescribe(String topicdescribe) {
        this.topicdescribe = topicdescribe == null ? null : topicdescribe.trim();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}