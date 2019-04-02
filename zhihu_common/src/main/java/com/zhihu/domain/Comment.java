package com.zhihu.domain;

import java.util.Date;

public class Comment {
    private Integer id;

    private String quesid;

    private String answerid;

    private String commentatorid;

    private String commentcontent;

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

    public String getAnswerid() {
        return answerid;
    }

    public void setAnswerid(String answerid) {
        this.answerid = answerid == null ? null : answerid.trim();
    }

    public String getCommentatorid() {
        return commentatorid;
    }

    public void setCommentatorid(String commentatorid) {
        this.commentatorid = commentatorid == null ? null : commentatorid.trim();
    }

    public String getCommentcontent() {
        return commentcontent;
    }

    public void setCommentcontent(String commentcontent) {
        this.commentcontent = commentcontent == null ? null : commentcontent.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}