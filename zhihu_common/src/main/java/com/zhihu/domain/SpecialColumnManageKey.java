package com.zhihu.domain;

public class SpecialColumnManageKey {
    private String manageid;

    private String editid;

    private Integer specialcolumnid;

    public String getManageid() {
        return manageid;
    }

    public void setManageid(String manageid) {
        this.manageid = manageid == null ? null : manageid.trim();
    }

    public String getEditid() {
        return editid;
    }

    public void setEditid(String editid) {
        this.editid = editid == null ? null : editid.trim();
    }

    public Integer getSpecialcolumnid() {
        return specialcolumnid;
    }

    public void setSpecialcolumnid(Integer specialcolumnid) {
        this.specialcolumnid = specialcolumnid;
    }
}