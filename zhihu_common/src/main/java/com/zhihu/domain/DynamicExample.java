package com.zhihu.domain;

import java.util.ArrayList;
import java.util.List;

public class DynamicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DynamicExample() {
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

        public Criteria andOfIsNull() {
            addCriterion("of is null");
            return (Criteria) this;
        }

        public Criteria andOfIsNotNull() {
            addCriterion("of is not null");
            return (Criteria) this;
        }

        public Criteria andOfEqualTo(Integer value) {
            addCriterion("of =", value, "of");
            return (Criteria) this;
        }

        public Criteria andOfNotEqualTo(Integer value) {
            addCriterion("of <>", value, "of");
            return (Criteria) this;
        }

        public Criteria andOfGreaterThan(Integer value) {
            addCriterion("of >", value, "of");
            return (Criteria) this;
        }

        public Criteria andOfGreaterThanOrEqualTo(Integer value) {
            addCriterion("of >=", value, "of");
            return (Criteria) this;
        }

        public Criteria andOfLessThan(Integer value) {
            addCriterion("of <", value, "of");
            return (Criteria) this;
        }

        public Criteria andOfLessThanOrEqualTo(Integer value) {
            addCriterion("of <=", value, "of");
            return (Criteria) this;
        }

        public Criteria andOfIn(List<Integer> values) {
            addCriterion("of in", values, "of");
            return (Criteria) this;
        }

        public Criteria andOfNotIn(List<Integer> values) {
            addCriterion("of not in", values, "of");
            return (Criteria) this;
        }

        public Criteria andOfBetween(Integer value1, Integer value2) {
            addCriterion("of between", value1, value2, "of");
            return (Criteria) this;
        }

        public Criteria andOfNotBetween(Integer value1, Integer value2) {
            addCriterion("of not between", value1, value2, "of");
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

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andGoodcountIsNull() {
            addCriterion("goodCount is null");
            return (Criteria) this;
        }

        public Criteria andGoodcountIsNotNull() {
            addCriterion("goodCount is not null");
            return (Criteria) this;
        }

        public Criteria andGoodcountEqualTo(Integer value) {
            addCriterion("goodCount =", value, "goodcount");
            return (Criteria) this;
        }

        public Criteria andGoodcountNotEqualTo(Integer value) {
            addCriterion("goodCount <>", value, "goodcount");
            return (Criteria) this;
        }

        public Criteria andGoodcountGreaterThan(Integer value) {
            addCriterion("goodCount >", value, "goodcount");
            return (Criteria) this;
        }

        public Criteria andGoodcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodCount >=", value, "goodcount");
            return (Criteria) this;
        }

        public Criteria andGoodcountLessThan(Integer value) {
            addCriterion("goodCount <", value, "goodcount");
            return (Criteria) this;
        }

        public Criteria andGoodcountLessThanOrEqualTo(Integer value) {
            addCriterion("goodCount <=", value, "goodcount");
            return (Criteria) this;
        }

        public Criteria andGoodcountIn(List<Integer> values) {
            addCriterion("goodCount in", values, "goodcount");
            return (Criteria) this;
        }

        public Criteria andGoodcountNotIn(List<Integer> values) {
            addCriterion("goodCount not in", values, "goodcount");
            return (Criteria) this;
        }

        public Criteria andGoodcountBetween(Integer value1, Integer value2) {
            addCriterion("goodCount between", value1, value2, "goodcount");
            return (Criteria) this;
        }

        public Criteria andGoodcountNotBetween(Integer value1, Integer value2) {
            addCriterion("goodCount not between", value1, value2, "goodcount");
            return (Criteria) this;
        }

        public Criteria andBadcountIsNull() {
            addCriterion("badCount is null");
            return (Criteria) this;
        }

        public Criteria andBadcountIsNotNull() {
            addCriterion("badCount is not null");
            return (Criteria) this;
        }

        public Criteria andBadcountEqualTo(Integer value) {
            addCriterion("badCount =", value, "badcount");
            return (Criteria) this;
        }

        public Criteria andBadcountNotEqualTo(Integer value) {
            addCriterion("badCount <>", value, "badcount");
            return (Criteria) this;
        }

        public Criteria andBadcountGreaterThan(Integer value) {
            addCriterion("badCount >", value, "badcount");
            return (Criteria) this;
        }

        public Criteria andBadcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("badCount >=", value, "badcount");
            return (Criteria) this;
        }

        public Criteria andBadcountLessThan(Integer value) {
            addCriterion("badCount <", value, "badcount");
            return (Criteria) this;
        }

        public Criteria andBadcountLessThanOrEqualTo(Integer value) {
            addCriterion("badCount <=", value, "badcount");
            return (Criteria) this;
        }

        public Criteria andBadcountIn(List<Integer> values) {
            addCriterion("badCount in", values, "badcount");
            return (Criteria) this;
        }

        public Criteria andBadcountNotIn(List<Integer> values) {
            addCriterion("badCount not in", values, "badcount");
            return (Criteria) this;
        }

        public Criteria andBadcountBetween(Integer value1, Integer value2) {
            addCriterion("badCount between", value1, value2, "badcount");
            return (Criteria) this;
        }

        public Criteria andBadcountNotBetween(Integer value1, Integer value2) {
            addCriterion("badCount not between", value1, value2, "badcount");
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