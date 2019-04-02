package com.zhihu.domain;

import java.util.Date;

public class Topicclass {
    private Integer id;

    private String topicclassid;

    private String topicclassname;

    private String topicclassdescribe;

    private String photo;

    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTopicclassid() {
        return topicclassid;
    }

    public void setTopicclassid(String topicclassid) {
        this.topicclassid = topicclassid == null ? null : topicclassid.trim();
    }

    public String getTopicclassname() {
        return topicclassname;
    }

    public void setTopicclassname(String topicclassname) {
        this.topicclassname = topicclassname == null ? null : topicclassname.trim();
    }

    public String getTopicclassdescribe() {
        return topicclassdescribe;
    }

    public void setTopicclassdescribe(String topicclassdescribe) {
        this.topicclassdescribe = topicclassdescribe == null ? null : topicclassdescribe.trim();
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