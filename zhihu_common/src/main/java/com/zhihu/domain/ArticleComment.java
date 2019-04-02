package com.zhihu.domain;

import java.util.Date;

public class ArticleComment {
    private Integer id;

    private Integer dynamicid;

    private Integer userid;

    private String content;

    private Integer goodcount;

    private Integer badcount;

    private Integer thankcount;

    private Date commenttime;

    private String type;

    private Integer hfid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDynamicid() {
        return dynamicid;
    }

    public void setDynamicid(Integer dynamicid) {
        this.dynamicid = dynamicid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getGoodcount() {
        return goodcount;
    }

    public void setGoodcount(Integer goodcount) {
        this.goodcount = goodcount;
    }

    public Integer getBadcount() {
        return badcount;
    }

    public void setBadcount(Integer badcount) {
        this.badcount = badcount;
    }

    public Integer getThankcount() {
        return thankcount;
    }

    public void setThankcount(Integer thankcount) {
        this.thankcount = thankcount;
    }

    public Date getCommenttime() {
        return commenttime;
    }

    public void setCommenttime(Date commenttime) {
        this.commenttime = commenttime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getHfid() {
        return hfid;
    }

    public void setHfid(Integer hfid) {
        this.hfid = hfid;
    }
}