package com.zhihu.domain;

import java.util.Date;

public class Specialcolumn {
    private Integer id;

    private String userid;

    private String title;

    private Integer attentioncount;

    private Integer labelid;

    private Date createtime;

    private String topicclassid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getAttentioncount() {
        return attentioncount;
    }

    public void setAttentioncount(Integer attentioncount) {
        this.attentioncount = attentioncount;
    }

    public Integer getLabelid() {
        return labelid;
    }

    public void setLabelid(Integer labelid) {
        this.labelid = labelid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getTopicclassid() {
        return topicclassid;
    }

    public void setTopicclassid(String topicclassid) {
        this.topicclassid = topicclassid == null ? null : topicclassid.trim();
    }
}