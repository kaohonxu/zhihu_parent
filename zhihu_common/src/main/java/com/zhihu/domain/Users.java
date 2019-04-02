package com.zhihu.domain;

import java.util.Date;

public class Users {
    private Integer id;

    private String userid;

    private String email;

    private String password;

    private String surname;

    private String name;

    private String gender;

    private String photo;

    private String autograph;

    private String introduce;

    private String privacyprotection;

    private Integer praisenumb;

    private Integer thanknumb;

    private Integer questionnumb;

    private Integer answernumb;

    private Integer collectnumb;

    private Integer editnumb;

    private Integer attentionnumb;

    private Integer followernumb;

    private Integer concerntopicnumb;

    private String personalityurl;

    private String company;

    private String position;

    private String school;

    private String major;

    private String emailactivate;

    private String forbidden;

    private Date forbiddentime;

    private String role;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname == null ? null : surname.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public String getAutograph() {
        return autograph;
    }

    public void setAutograph(String autograph) {
        this.autograph = autograph == null ? null : autograph.trim();
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    public String getPrivacyprotection() {
        return privacyprotection;
    }

    public void setPrivacyprotection(String privacyprotection) {
        this.privacyprotection = privacyprotection == null ? null : privacyprotection.trim();
    }

    public Integer getPraisenumb() {
        return praisenumb;
    }

    public void setPraisenumb(Integer praisenumb) {
        this.praisenumb = praisenumb;
    }

    public Integer getThanknumb() {
        return thanknumb;
    }

    public void setThanknumb(Integer thanknumb) {
        this.thanknumb = thanknumb;
    }

    public Integer getQuestionnumb() {
        return questionnumb;
    }

    public void setQuestionnumb(Integer questionnumb) {
        this.questionnumb = questionnumb;
    }

    public Integer getAnswernumb() {
        return answernumb;
    }

    public void setAnswernumb(Integer answernumb) {
        this.answernumb = answernumb;
    }

    public Integer getCollectnumb() {
        return collectnumb;
    }

    public void setCollectnumb(Integer collectnumb) {
        this.collectnumb = collectnumb;
    }

    public Integer getEditnumb() {
        return editnumb;
    }

    public void setEditnumb(Integer editnumb) {
        this.editnumb = editnumb;
    }

    public Integer getAttentionnumb() {
        return attentionnumb;
    }

    public void setAttentionnumb(Integer attentionnumb) {
        this.attentionnumb = attentionnumb;
    }

    public Integer getFollowernumb() {
        return followernumb;
    }

    public void setFollowernumb(Integer followernumb) {
        this.followernumb = followernumb;
    }

    public Integer getConcerntopicnumb() {
        return concerntopicnumb;
    }

    public void setConcerntopicnumb(Integer concerntopicnumb) {
        this.concerntopicnumb = concerntopicnumb;
    }

    public String getPersonalityurl() {
        return personalityurl;
    }

    public void setPersonalityurl(String personalityurl) {
        this.personalityurl = personalityurl == null ? null : personalityurl.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getEmailactivate() {
        return emailactivate;
    }

    public void setEmailactivate(String emailactivate) {
        this.emailactivate = emailactivate == null ? null : emailactivate.trim();
    }

    public String getForbidden() {
        return forbidden;
    }

    public void setForbidden(String forbidden) {
        this.forbidden = forbidden == null ? null : forbidden.trim();
    }

    public Date getForbiddentime() {
        return forbiddentime;
    }

    public void setForbiddentime(Date forbiddentime) {
        this.forbiddentime = forbiddentime;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}