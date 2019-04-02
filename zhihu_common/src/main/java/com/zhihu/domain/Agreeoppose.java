package com.zhihu.domain;

public class Agreeoppose {
    private Integer id;

    private String userid;

    private String answerid;

    private String agropp;

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

    public String getAnswerid() {
        return answerid;
    }

    public void setAnswerid(String answerid) {
        this.answerid = answerid == null ? null : answerid.trim();
    }

    public String getAgropp() {
        return agropp;
    }

    public void setAgropp(String agropp) {
        this.agropp = agropp == null ? null : agropp.trim();
    }
}