package com.zhihu.domain;

import java.util.Date;

public class AttentionQuestion {
    private Integer id;

    private String userid;

    private String quesid;

    private Date createtime;

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

    public String getQuesid() {
        return quesid;
    }

    public void setQuesid(String quesid) {
        this.quesid = quesid == null ? null : quesid.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}