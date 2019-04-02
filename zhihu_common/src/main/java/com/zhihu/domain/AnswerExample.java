package com.zhihu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AnswerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AnswerExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAnsweridIsNull() {
            addCriterion("AnswerId is null");
            return (Criteria) this;
        }

        public Criteria andAnsweridIsNotNull() {
            addCriterion("AnswerId is not null");
            return (Criteria) this;
        }

        public Criteria andAnsweridEqualTo(String value) {
            addCriterion("AnswerId =", value, "answerid");
            return (Criteria) this;
        }

        public Criteria andAnsweridNotEqualTo(String value) {
            addCriterion("AnswerId <>", value, "answerid");
            return (Criteria) this;
        }

        public Criteria andAnsweridGreaterThan(String value) {
            addCriterion("AnswerId >", value, "answerid");
            return (Criteria) this;
        }

        public Criteria andAnsweridGreaterThanOrEqualTo(String value) {
            addCriterion("AnswerId >=", value, "answerid");
            return (Criteria) this;
        }

        public Criteria andAnsweridLessThan(String value) {
            addCriterion("AnswerId <", value, "answerid");
            return (Criteria) this;
        }

        public Criteria andAnsweridLessThanOrEqualTo(String value) {
            addCriterion("AnswerId <=", value, "answerid");
            return (Criteria) this;
        }

        public Criteria andAnsweridLike(String value) {
            addCriterion("AnswerId like", value, "answerid");
            return (Criteria) this;
        }

        public Criteria andAnsweridNotLike(String value) {
            addCriterion("AnswerId not like", value, "answerid");
            return (Criteria) this;
        }

        public Criteria andAnsweridIn(List<String> values) {
            addCriterion("AnswerId in", values, "answerid");
            return (Criteria) this;
        }

        public Criteria andAnsweridNotIn(List<String> values) {
            addCriterion("AnswerId not in", values, "answerid");
            return (Criteria) this;
        }

        public Criteria andAnsweridBetween(String value1, String value2) {
            addCriterion("AnswerId between", value1, value2, "answerid");
            return (Criteria) this;
        }

        public Criteria andAnsweridNotBetween(String value1, String value2) {
            addCriterion("AnswerId not between", value1, value2, "answerid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("UserId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("UserId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("UserId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("UserId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("UserId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("UserId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("UserId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("UserId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("UserId like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("UserId not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("UserId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("UserId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("UserId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("UserId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andTopicidIsNull() {
            addCriterion("TopicId is null");
            return (Criteria) this;
        }

        public Criteria andTopicidIsNotNull() {
            addCriterion("TopicId is not null");
            return (Criteria) this;
        }

        public Criteria andTopicidEqualTo(String value) {
            addCriterion("TopicId =", value, "topicid");
            return (Criteria) this;
        }

        public Criteria andTopicidNotEqualTo(String value) {
            addCriterion("TopicId <>", value, "topicid");
            return (Criteria) this;
        }

        public Criteria andTopicidGreaterThan(String value) {
            addCriterion("TopicId >", value, "topicid");
            return (Criteria) this;
        }

        public Criteria andTopicidGreaterThanOrEqualTo(String value) {
            addCriterion("TopicId >=", value, "topicid");
            return (Criteria) this;
        }

        public Criteria andTopicidLessThan(String value) {
            addCriterion("TopicId <", value, "topicid");
            return (Criteria) this;
        }

        public Criteria andTopicidLessThanOrEqualTo(String value) {
            addCriterion("TopicId <=", value, "topicid");
            return (Criteria) this;
        }

        public Criteria andTopicidLike(String value) {
            addCriterion("TopicId like", value, "topicid");
            return (Criteria) this;
        }

        public Criteria andTopicidNotLike(String value) {
            addCriterion("TopicId not like", value, "topicid");
            return (Criteria) this;
        }

        public Criteria andTopicidIn(List<String> values) {
            addCriterion("TopicId in", values, "topicid");
            return (Criteria) this;
        }

        public Criteria andTopicidNotIn(List<String> values) {
            addCriterion("TopicId not in", values, "topicid");
            return (Criteria) this;
        }

        public Criteria andTopicidBetween(String value1, String value2) {
            addCriterion("TopicId between", value1, value2, "topicid");
            return (Criteria) this;
        }

        public Criteria andTopicidNotBetween(String value1, String value2) {
            addCriterion("TopicId not between", value1, value2, "topicid");
            return (Criteria) this;
        }

        public Criteria andQuesidIsNull() {
            addCriterion("QuesId is null");
            return (Criteria) this;
        }

        public Criteria andQuesidIsNotNull() {
            addCriterion("QuesId is not null");
            return (Criteria) this;
        }

        public Criteria andQuesidEqualTo(String value) {
            addCriterion("QuesId =", value, "quesid");
            return (Criteria) this;
        }

        public Criteria andQuesidNotEqualTo(String value) {
            addCriterion("QuesId <>", value, "quesid");
            return (Criteria) this;
        }

        public Criteria andQuesidGreaterThan(String value) {
            addCriterion("QuesId >", value, "quesid");
            return (Criteria) this;
        }

        public Criteria andQuesidGreaterThanOrEqualTo(String value) {
            addCriterion("QuesId >=", value, "quesid");
            return (Criteria) this;
        }

        public Criteria andQuesidLessThan(String value) {
            addCriterion("QuesId <", value, "quesid");
            return (Criteria) this;
        }

        public Criteria andQuesidLessThanOrEqualTo(String value) {
            addCriterion("QuesId <=", value, "quesid");
            return (Criteria) this;
        }

        public Criteria andQuesidLike(String value) {
            addCriterion("QuesId like", value, "quesid");
            return (Criteria) this;
        }

        public Criteria andQuesidNotLike(String value) {
            addCriterion("QuesId not like", value, "quesid");
            return (Criteria) this;
        }

        public Criteria andQuesidIn(List<String> values) {
            addCriterion("QuesId in", values, "quesid");
            return (Criteria) this;
        }

        public Criteria andQuesidNotIn(List<String> values) {
            addCriterion("QuesId not in", values, "quesid");
            return (Criteria) this;
        }

        public Criteria andQuesidBetween(String value1, String value2) {
            addCriterion("QuesId between", value1, value2, "quesid");
            return (Criteria) this;
        }

        public Criteria andQuesidNotBetween(String value1, String value2) {
            addCriterion("QuesId not between", value1, value2, "quesid");
            return (Criteria) this;
        }

        public Criteria andAnswercontentIsNull() {
            addCriterion("AnswerContent is null");
            return (Criteria) this;
        }

        public Criteria andAnswercontentIsNotNull() {
            addCriterion("AnswerContent is not null");
            return (Criteria) this;
        }

        public Criteria andAnswercontentEqualTo(String value) {
            addCriterion("AnswerContent =", value, "answercontent");
            return (Criteria) this;
        }

        public Criteria andAnswercontentNotEqualTo(String value) {
            addCriterion("AnswerContent <>", value, "answercontent");
            return (Criteria) this;
        }

        public Criteria andAnswercontentGreaterThan(String value) {
            addCriterion("AnswerContent >", value, "answercontent");
            return (Criteria) this;
        }

        public Criteria andAnswercontentGreaterThanOrEqualTo(String value) {
            addCriterion("AnswerContent >=", value, "answercontent");
            return (Criteria) this;
        }

        public Criteria andAnswercontentLessThan(String value) {
            addCriterion("AnswerContent <", value, "answercontent");
            return (Criteria) this;
        }

        public Criteria andAnswercontentLessThanOrEqualTo(String value) {
            addCriterion("AnswerContent <=", value, "answercontent");
            return (Criteria) this;
        }

        public Criteria andAnswercontentLike(String value) {
            addCriterion("AnswerContent like", value, "answercontent");
            return (Criteria) this;
        }

        public Criteria andAnswercontentNotLike(String value) {
            addCriterion("AnswerContent not like", value, "answercontent");
            return (Criteria) this;
        }

        public Criteria andAnswercontentIn(List<String> values) {
            addCriterion("AnswerContent in", values, "answercontent");
            return (Criteria) this;
        }

        public Criteria andAnswercontentNotIn(List<String> values) {
            addCriterion("AnswerContent not in", values, "answercontent");
            return (Criteria) this;
        }

        public Criteria andAnswercontentBetween(String value1, String value2) {
            addCriterion("AnswerContent between", value1, value2, "answercontent");
            return (Criteria) this;
        }

        public Criteria andAnswercontentNotBetween(String value1, String value2) {
            addCriterion("AnswerContent not between", value1, value2, "answercontent");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNull() {
            addCriterion("Photo is null");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNotNull() {
            addCriterion("Photo is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoEqualTo(String value) {
            addCriterion("Photo =", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotEqualTo(String value) {
            addCriterion("Photo <>", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThan(String value) {
            addCriterion("Photo >", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("Photo >=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThan(String value) {
            addCriterion("Photo <", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThanOrEqualTo(String value) {
            addCriterion("Photo <=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLike(String value) {
            addCriterion("Photo like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotLike(String value) {
            addCriterion("Photo not like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoIn(List<String> values) {
            addCriterion("Photo in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotIn(List<String> values) {
            addCriterion("Photo not in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoBetween(String value1, String value2) {
            addCriterion("Photo between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotBetween(String value1, String value2) {
            addCriterion("Photo not between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andAnonymityIsNull() {
            addCriterion("Anonymity is null");
            return (Criteria) this;
        }

        public Criteria andAnonymityIsNotNull() {
            addCriterion("Anonymity is not null");
            return (Criteria) this;
        }

        public Criteria andAnonymityEqualTo(String value) {
            addCriterion("Anonymity =", value, "anonymity");
            return (Criteria) this;
        }

        public Criteria andAnonymityNotEqualTo(String value) {
            addCriterion("Anonymity <>", value, "anonymity");
            return (Criteria) this;
        }

        public Criteria andAnonymityGreaterThan(String value) {
            addCriterion("Anonymity >", value, "anonymity");
            return (Criteria) this;
        }

        public Criteria andAnonymityGreaterThanOrEqualTo(String value) {
            addCriterion("Anonymity >=", value, "anonymity");
            return (Criteria) this;
        }

        public Criteria andAnonymityLessThan(String value) {
            addCriterion("Anonymity <", value, "anonymity");
            return (Criteria) this;
        }

        public Criteria andAnonymityLessThanOrEqualTo(String value) {
            addCriterion("Anonymity <=", value, "anonymity");
            return (Criteria) this;
        }

        public Criteria andAnonymityLike(String value) {
            addCriterion("Anonymity like", value, "anonymity");
            return (Criteria) this;
        }

        public Criteria andAnonymityNotLike(String value) {
            addCriterion("Anonymity not like", value, "anonymity");
            return (Criteria) this;
        }

        public Criteria andAnonymityIn(List<String> values) {
            addCriterion("Anonymity in", values, "anonymity");
            return (Criteria) this;
        }

        public Criteria andAnonymityNotIn(List<String> values) {
            addCriterion("Anonymity not in", values, "anonymity");
            return (Criteria) this;
        }

        public Criteria andAnonymityBetween(String value1, String value2) {
            addCriterion("Anonymity between", value1, value2, "anonymity");
            return (Criteria) this;
        }

        public Criteria andAnonymityNotBetween(String value1, String value2) {
            addCriterion("Anonymity not between", value1, value2, "anonymity");
            return (Criteria) this;
        }

        public Criteria andCommentnumbIsNull() {
            addCriterion("CommentNumb is null");
            return (Criteria) this;
        }

        public Criteria andCommentnumbIsNotNull() {
            addCriterion("CommentNumb is not null");
            return (Criteria) this;
        }

        public Criteria andCommentnumbEqualTo(Integer value) {
            addCriterion("CommentNumb =", value, "commentnumb");
            return (Criteria) this;
        }

        public Criteria andCommentnumbNotEqualTo(Integer value) {
            addCriterion("CommentNumb <>", value, "commentnumb");
            return (Criteria) this;
        }

        public Criteria andCommentnumbGreaterThan(Integer value) {
            addCriterion("CommentNumb >", value, "commentnumb");
            return (Criteria) this;
        }

        public Criteria andCommentnumbGreaterThanOrEqualTo(Integer value) {
            addCriterion("CommentNumb >=", value, "commentnumb");
            return (Criteria) this;
        }

        public Criteria andCommentnumbLessThan(Integer value) {
            addCriterion("CommentNumb <", value, "commentnumb");
            return (Criteria) this;
        }

        public Criteria andCommentnumbLessThanOrEqualTo(Integer value) {
            addCriterion("CommentNumb <=", value, "commentnumb");
            return (Criteria) this;
        }

        public Criteria andCommentnumbIn(List<Integer> values) {
            addCriterion("CommentNumb in", values, "commentnumb");
            return (Criteria) this;
        }

        public Criteria andCommentnumbNotIn(List<Integer> values) {
            addCriterion("CommentNumb not in", values, "commentnumb");
            return (Criteria) this;
        }

        public Criteria andCommentnumbBetween(Integer value1, Integer value2) {
            addCriterion("CommentNumb between", value1, value2, "commentnumb");
            return (Criteria) this;
        }

        public Criteria andCommentnumbNotBetween(Integer value1, Integer value2) {
            addCriterion("CommentNumb not between", value1, value2, "commentnumb");
            return (Criteria) this;
        }

        public Criteria andReportnumbIsNull() {
            addCriterion("ReportNumb is null");
            return (Criteria) this;
        }

        public Criteria andReportnumbIsNotNull() {
            addCriterion("ReportNumb is not null");
            return (Criteria) this;
        }

        public Criteria andReportnumbEqualTo(Integer value) {
            addCriterion("ReportNumb =", value, "reportnumb");
            return (Criteria) this;
        }

        public Criteria andReportnumbNotEqualTo(Integer value) {
            addCriterion("ReportNumb <>", value, "reportnumb");
            return (Criteria) this;
        }

        public Criteria andReportnumbGreaterThan(Integer value) {
            addCriterion("ReportNumb >", value, "reportnumb");
            return (Criteria) this;
        }

        public Criteria andReportnumbGreaterThanOrEqualTo(Integer value) {
            addCriterion("ReportNumb >=", value, "reportnumb");
            return (Criteria) this;
        }

        public Criteria andReportnumbLessThan(Integer value) {
            addCriterion("ReportNumb <", value, "reportnumb");
            return (Criteria) this;
        }

        public Criteria andReportnumbLessThanOrEqualTo(Integer value) {
            addCriterion("ReportNumb <=", value, "reportnumb");
            return (Criteria) this;
        }

        public Criteria andReportnumbIn(List<Integer> values) {
            addCriterion("ReportNumb in", values, "reportnumb");
            return (Criteria) this;
        }

        public Criteria andReportnumbNotIn(List<Integer> values) {
            addCriterion("ReportNumb not in", values, "reportnumb");
            return (Criteria) this;
        }

        public Criteria andReportnumbBetween(Integer value1, Integer value2) {
            addCriterion("ReportNumb between", value1, value2, "reportnumb");
            return (Criteria) this;
        }

        public Criteria andReportnumbNotBetween(Integer value1, Integer value2) {
            addCriterion("ReportNumb not between", value1, value2, "reportnumb");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CreateTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("CreateTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("CreateTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("CreateTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CreateTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterionForJDBCDate("CreateTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CreateTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("CreateTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("CreateTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CreateTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CreateTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}