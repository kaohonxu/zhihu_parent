package com.zhihu.domain;

public class BookCatalogue {
    private Integer catalogueid;

    private String name;

    private Integer sectionid;

    public Integer getCatalogueid() {
        return catalogueid;
    }

    public void setCatalogueid(Integer catalogueid) {
        this.catalogueid = catalogueid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSectionid() {
        return sectionid;
    }

    public void setSectionid(Integer sectionid) {
        this.sectionid = sectionid;
    }
}