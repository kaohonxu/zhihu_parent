package com.zhihu.domain;

import java.util.Date;

public class Dynamiccomment {
    private Integer id;

    private Integer dynamicId;

    private Integer userid;

    private String commentcontent;

    private Integer goodcount;

    private Integer badcount;

    private Integer thankcount;

    private Date commenttime;

    private String type;

    private Integer huifuid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDynamicId() {
        return dynamicId;
    }

    public void setDynamicId(Integer dynamicId) {
        this.dynamicId = dynamicId;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getCommentcontent() {
        return commentcontent;
    }

    public void setCommentcontent(String commentcontent) {
        this.commentcontent = commentcontent == null ? null : commentcontent.trim();
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

    public Integer getHuifuid() {
        return huifuid;
    }

    public void setHuifuid(Integer huifuid) {
        this.huifuid = huifuid;
    }
}