package com.zhihu.domain;

public class Officialtopic {
    private Integer id;

    private String title;

    private Integer count;

    private String info;

    private String photo;

    private Integer attentioncount;

    private Integer answer;

    private String topicclassid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public Integer getAttentioncount() {
        return attentioncount;
    }

    public void setAttentioncount(Integer attentioncount) {
        this.attentioncount = attentioncount;
    }

    public Integer getAnswer() {
        return answer;
    }

    public void setAnswer(Integer answer) {
        this.answer = answer;
    }

    public String getTopicclassid() {
        return topicclassid;
    }

    public void setTopicclassid(String topicclassid) {
        this.topicclassid = topicclassid == null ? null : topicclassid.trim();
    }
}