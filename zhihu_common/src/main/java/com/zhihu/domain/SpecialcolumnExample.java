package com.zhihu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SpecialcolumnExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpecialcolumnExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userId like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userId not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andAttentioncountIsNull() {
            addCriterion("attentionCount is null");
            return (Criteria) this;
        }

        public Criteria andAttentioncountIsNotNull() {
            addCriterion("attentionCount is not null");
            return (Criteria) this;
        }

        public Criteria andAttentioncountEqualTo(Integer value) {
            addCriterion("attentionCount =", value, "attentioncount");
            return (Criteria) this;
        }

        public Criteria andAttentioncountNotEqualTo(Integer value) {
            addCriterion("attentionCount <>", value, "attentioncount");
            return (Criteria) this;
        }

        public Criteria andAttentioncountGreaterThan(Integer value) {
            addCriterion("attentionCount >", value, "attentioncount");
            return (Criteria) this;
        }

        public Criteria andAttentioncountGreaterThanOrEqualTo(Integer value) {
            addCriterion("attentionCount >=", value, "attentioncount");
            return (Criteria) this;
        }

        public Criteria andAttentioncountLessThan(Integer value) {
            addCriterion("attentionCount <", value, "attentioncount");
            return (Criteria) this;
        }

        public Criteria andAttentioncountLessThanOrEqualTo(Integer value) {
            addCriterion("attentionCount <=", value, "attentioncount");
            return (Criteria) this;
        }

        public Criteria andAttentioncountIn(List<Integer> values) {
            addCriterion("attentionCount in", values, "attentioncount");
            return (Criteria) this;
        }

        public Criteria andAttentioncountNotIn(List<Integer> values) {
            addCriterion("attentionCount not in", values, "attentioncount");
            return (Criteria) this;
        }

        public Criteria andAttentioncountBetween(Integer value1, Integer value2) {
            addCriterion("attentionCount between", value1, value2, "attentioncount");
            return (Criteria) this;
        }

        public Criteria andAttentioncountNotBetween(Integer value1, Integer value2) {
            addCriterion("attentionCount not between", value1, value2, "attentioncount");
            return (Criteria) this;
        }

        public Criteria andLabelidIsNull() {
            addCriterion("labelId is null");
            return (Criteria) this;
        }

        public Criteria andLabelidIsNotNull() {
            addCriterion("labelId is not null");
            return (Criteria) this;
        }

        public Criteria andLabelidEqualTo(Integer value) {
            addCriterion("labelId =", value, "labelid");
            return (Criteria) this;
        }

        public Criteria andLabelidNotEqualTo(Integer value) {
            addCriterion("labelId <>", value, "labelid");
            return (Criteria) this;
        }

        public Criteria andLabelidGreaterThan(Integer value) {
            addCriterion("labelId >", value, "labelid");
            return (Criteria) this;
        }

        public Criteria andLabelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("labelId >=", value, "labelid");
            return (Criteria) this;
        }

        public Criteria andLabelidLessThan(Integer value) {
            addCriterion("labelId <", value, "labelid");
            return (Criteria) this;
        }

        public Criteria andLabelidLessThanOrEqualTo(Integer value) {
            addCriterion("labelId <=", value, "labelid");
            return (Criteria) this;
        }

        public Criteria andLabelidIn(List<Integer> values) {
            addCriterion("labelId in", values, "labelid");
            return (Criteria) this;
        }

        public Criteria andLabelidNotIn(List<Integer> values) {
            addCriterion("labelId not in", values, "labelid");
            return (Criteria) this;
        }

        public Criteria andLabelidBetween(Integer value1, Integer value2) {
            addCriterion("labelId between", value1, value2, "labelid");
            return (Criteria) this;
        }

        public Criteria andLabelidNotBetween(Integer value1, Integer value2) {
            addCriterion("labelId not between", value1, value2, "labelid");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
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