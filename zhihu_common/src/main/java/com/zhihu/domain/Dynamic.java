package com.zhihu.domain;

public class Dynamic {
    private Integer id;

    private String userid;

    private Integer of;

    private String title;

    private String content;

    private Integer goodcount;

    private Integer badcount;

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

    public Integer getOf() {
        return of;
    }

    public void setOf(Integer of) {
        this.of = of;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
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
}