package com.zhihu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TopicclassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TopicclassExample() {
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

        public Criteria andTopicclassidIsNull() {
            addCriterion("TopicClassId is null");
            return (Criteria) this;
        }

        public Criteria andTopicclassidIsNotNull() {
            addCriterion("TopicClassId is not null");
            return (Criteria) this;
        }

        public Criteria andTopicclassidEqualTo(String value) {
            addCriterion("TopicClassId =", value, "topicclassid");
            return (Criteria) this;
        }

        public Criteria andTopicclassidNotEqualTo(String value) {
            addCriterion("TopicClassId <>", value, "topicclassid");
            return (Criteria) this;
        }

        public Criteria andTopicclassidGreaterThan(String value) {
            addCriterion("TopicClassId >", value, "topicclassid");
            return (Criteria) this;
        }

        public Criteria andTopicclassidGreaterThanOrEqualTo(String value) {
            addCriterion("TopicClassId >=", value, "topicclassid");
            return (Criteria) this;
        }

        public Criteria andTopicclassidLessThan(String value) {
            addCriterion("TopicClassId <", value, "topicclassid");
            return (Criteria) this;
        }

        public Criteria andTopicclassidLessThanOrEqualTo(String value) {
            addCriterion("TopicClassId <=", value, "topicclassid");
            return (Criteria) this;
        }

        public Criteria andTopicclassidLike(String value) {
            addCriterion("TopicClassId like", value, "topicclassid");
            return (Criteria) this;
        }

        public Criteria andTopicclassidNotLike(String value) {
            addCriterion("TopicClassId not like", value, "topicclassid");
            return (Criteria) this;
        }

        public Criteria andTopicclassidIn(List<String> values) {
            addCriterion("TopicClassId in", values, "topicclassid");
            return (Criteria) this;
        }

        public Criteria andTopicclassidNotIn(List<String> values) {
            addCriterion("TopicClassId not in", values, "topicclassid");
            return (Criteria) this;
        }

        public Criteria andTopicclassidBetween(String value1, String value2) {
            addCriterion("TopicClassId between", value1, value2, "topicclassid");
            return (Criteria) this;
        }

        public Criteria andTopicclassidNotBetween(String value1, String value2) {
            addCriterion("TopicClassId not between", value1, value2, "topicclassid");
            return (Criteria) this;
        }

        public Criteria andTopicclassnameIsNull() {
            addCriterion("TopicClassName is null");
            return (Criteria) this;
        }

        public Criteria andTopicclassnameIsNotNull() {
            addCriterion("TopicClassName is not null");
            return (Criteria) this;
        }

        public Criteria andTopicclassnameEqualTo(String value) {
            addCriterion("TopicClassName =", value, "topicclassname");
            return (Criteria) this;
        }

        public Criteria andTopicclassnameNotEqualTo(String value) {
            addCriterion("TopicClassName <>", value, "topicclassname");
            return (Criteria) this;
        }

        public Criteria andTopicclassnameGreaterThan(String value) {
            addCriterion("TopicClassName >", value, "topicclassname");
            return (Criteria) this;
        }

        public Criteria andTopicclassnameGreaterThanOrEqualTo(String value) {
            addCriterion("TopicClassName >=", value, "topicclassname");
            return (Criteria) this;
        }

        public Criteria andTopicclassnameLessThan(String value) {
            addCriterion("TopicClassName <", value, "topicclassname");
            return (Criteria) this;
        }

        public Criteria andTopicclassnameLessThanOrEqualTo(String value) {
            addCriterion("TopicClassName <=", value, "topicclassname");
            return (Criteria) this;
        }

        public Criteria andTopicclassnameLike(String value) {
            addCriterion("TopicClassName like", value, "topicclassname");
            return (Criteria) this;
        }

        public Criteria andTopicclassnameNotLike(String value) {
            addCriterion("TopicClassName not like", value, "topicclassname");
            return (Criteria) this;
        }

        public Criteria andTopicclassnameIn(List<String> values) {
            addCriterion("TopicClassName in", values, "topicclassname");
            return (Criteria) this;
        }

        public Criteria andTopicclassnameNotIn(List<String> values) {
            addCriterion("TopicClassName not in", values, "topicclassname");
            return (Criteria) this;
        }

        public Criteria andTopicclassnameBetween(String value1, String value2) {
            addCriterion("TopicClassName between", value1, value2, "topicclassname");
            return (Criteria) this;
        }

        public Criteria andTopicclassnameNotBetween(String value1, String value2) {
            addCriterion("TopicClassName not between", value1, value2, "topicclassname");
            return (Criteria) this;
        }

        public Criteria andTopicclassdescribeIsNull() {
            addCriterion("TopicClassDescribe is null");
            return (Criteria) this;
        }

        public Criteria andTopicclassdescribeIsNotNull() {
            addCriterion("TopicClassDescribe is not null");
            return (Criteria) this;
        }

        public Criteria andTopicclassdescribeEqualTo(String value) {
            addCriterion("TopicClassDescribe =", value, "topicclassdescribe");
            return (Criteria) this;
        }

        public Criteria andTopicclassdescribeNotEqualTo(String value) {
            addCriterion("TopicClassDescribe <>", value, "topicclassdescribe");
            return (Criteria) this;
        }

        public Criteria andTopicclassdescribeGreaterThan(String value) {
            addCriterion("TopicClassDescribe >", value, "topicclassdescribe");
            return (Criteria) this;
        }

        public Criteria andTopicclassdescribeGreaterThanOrEqualTo(String value) {
            addCriterion("TopicClassDescribe >=", value, "topicclassdescribe");
            return (Criteria) this;
        }

        public Criteria andTopicclassdescribeLessThan(String value) {
            addCriterion("TopicClassDescribe <", value, "topicclassdescribe");
            return (Criteria) this;
        }

        public Criteria andTopicclassdescribeLessThanOrEqualTo(String value) {
            addCriterion("TopicClassDescribe <=", value, "topicclassdescribe");
            return (Criteria) this;
        }

        public Criteria andTopicclassdescribeLike(String value) {
            addCriterion("TopicClassDescribe like", value, "topicclassdescribe");
            return (Criteria) this;
        }

        public Criteria andTopicclassdescribeNotLike(String value) {
            addCriterion("TopicClassDescribe not like", value, "topicclassdescribe");
            return (Criteria) this;
        }

        public Criteria andTopicclassdescribeIn(List<String> values) {
            addCriterion("TopicClassDescribe in", values, "topicclassdescribe");
            return (Criteria) this;
        }

        public Criteria andTopicclassdescribeNotIn(List<String> values) {
            addCriterion("TopicClassDescribe not in", values, "topicclassdescribe");
            return (Criteria) this;
        }

        public Criteria andTopicclassdescribeBetween(String value1, String value2) {
            addCriterion("TopicClassDescribe between", value1, value2, "topicclassdescribe");
            return (Criteria) this;
        }

        public Criteria andTopicclassdescribeNotBetween(String value1, String value2) {
            addCriterion("TopicClassDescribe not between", value1, value2, "topicclassdescribe");
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