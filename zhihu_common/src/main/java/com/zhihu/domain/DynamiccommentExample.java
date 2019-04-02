package com.zhihu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DynamiccommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DynamiccommentExample() {
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

        public Criteria andDynamicIdIsNull() {
            addCriterion("dynamic_Id is null");
            return (Criteria) this;
        }

        public Criteria andDynamicIdIsNotNull() {
            addCriterion("dynamic_Id is not null");
            return (Criteria) this;
        }

        public Criteria andDynamicIdEqualTo(Integer value) {
            addCriterion("dynamic_Id =", value, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdNotEqualTo(Integer value) {
            addCriterion("dynamic_Id <>", value, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdGreaterThan(Integer value) {
            addCriterion("dynamic_Id >", value, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dynamic_Id >=", value, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdLessThan(Integer value) {
            addCriterion("dynamic_Id <", value, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdLessThanOrEqualTo(Integer value) {
            addCriterion("dynamic_Id <=", value, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdIn(List<Integer> values) {
            addCriterion("dynamic_Id in", values, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdNotIn(List<Integer> values) {
            addCriterion("dynamic_Id not in", values, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdBetween(Integer value1, Integer value2) {
            addCriterion("dynamic_Id between", value1, value2, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dynamic_Id not between", value1, value2, "dynamicId");
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

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andCommentcontentIsNull() {
            addCriterion("commentContent is null");
            return (Criteria) this;
        }

        public Criteria andCommentcontentIsNotNull() {
            addCriterion("commentContent is not null");
            return (Criteria) this;
        }

        public Criteria andCommentcontentEqualTo(String value) {
            addCriterion("commentContent =", value, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentNotEqualTo(String value) {
            addCriterion("commentContent <>", value, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentGreaterThan(String value) {
            addCriterion("commentContent >", value, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentGreaterThanOrEqualTo(String value) {
            addCriterion("commentContent >=", value, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentLessThan(String value) {
            addCriterion("commentContent <", value, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentLessThanOrEqualTo(String value) {
            addCriterion("commentContent <=", value, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentLike(String value) {
            addCriterion("commentContent like", value, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentNotLike(String value) {
            addCriterion("commentContent not like", value, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentIn(List<String> values) {
            addCriterion("commentContent in", values, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentNotIn(List<String> values) {
            addCriterion("commentContent not in", values, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentBetween(String value1, String value2) {
            addCriterion("commentContent between", value1, value2, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentNotBetween(String value1, String value2) {
            addCriterion("commentContent not between", value1, value2, "commentcontent");
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

        public Criteria andThankcountIsNull() {
            addCriterion("thankCount is null");
            return (Criteria) this;
        }

        public Criteria andThankcountIsNotNull() {
            addCriterion("thankCount is not null");
            return (Criteria) this;
        }

        public Criteria andThankcountEqualTo(Integer value) {
            addCriterion("thankCount =", value, "thankcount");
            return (Criteria) this;
        }

        public Criteria andThankcountNotEqualTo(Integer value) {
            addCriterion("thankCount <>", value, "thankcount");
            return (Criteria) this;
        }

        public Criteria andThankcountGreaterThan(Integer value) {
            addCriterion("thankCount >", value, "thankcount");
            return (Criteria) this;
        }

        public Criteria andThankcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("thankCount >=", value, "thankcount");
            return (Criteria) this;
        }

        public Criteria andThankcountLessThan(Integer value) {
            addCriterion("thankCount <", value, "thankcount");
            return (Criteria) this;
        }

        public Criteria andThankcountLessThanOrEqualTo(Integer value) {
            addCriterion("thankCount <=", value, "thankcount");
            return (Criteria) this;
        }

        public Criteria andThankcountIn(List<Integer> values) {
            addCriterion("thankCount in", values, "thankcount");
            return (Criteria) this;
        }

        public Criteria andThankcountNotIn(List<Integer> values) {
            addCriterion("thankCount not in", values, "thankcount");
            return (Criteria) this;
        }

        public Criteria andThankcountBetween(Integer value1, Integer value2) {
            addCriterion("thankCount between", value1, value2, "thankcount");
            return (Criteria) this;
        }

        public Criteria andThankcountNotBetween(Integer value1, Integer value2) {
            addCriterion("thankCount not between", value1, value2, "thankcount");
            return (Criteria) this;
        }

        public Criteria andCommenttimeIsNull() {
            addCriterion("commentTime is null");
            return (Criteria) this;
        }

        public Criteria andCommenttimeIsNotNull() {
            addCriterion("commentTime is not null");
            return (Criteria) this;
        }

        public Criteria andCommenttimeEqualTo(Date value) {
            addCriterion("commentTime =", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeNotEqualTo(Date value) {
            addCriterion("commentTime <>", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeGreaterThan(Date value) {
            addCriterion("commentTime >", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("commentTime >=", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeLessThan(Date value) {
            addCriterion("commentTime <", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeLessThanOrEqualTo(Date value) {
            addCriterion("commentTime <=", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeIn(List<Date> values) {
            addCriterion("commentTime in", values, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeNotIn(List<Date> values) {
            addCriterion("commentTime not in", values, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeBetween(Date value1, Date value2) {
            addCriterion("commentTime between", value1, value2, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeNotBetween(Date value1, Date value2) {
            addCriterion("commentTime not between", value1, value2, "commenttime");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andHuifuidIsNull() {
            addCriterion("huifuId is null");
            return (Criteria) this;
        }

        public Criteria andHuifuidIsNotNull() {
            addCriterion("huifuId is not null");
            return (Criteria) this;
        }

        public Criteria andHuifuidEqualTo(Integer value) {
            addCriterion("huifuId =", value, "huifuid");
            return (Criteria) this;
        }

        public Criteria andHuifuidNotEqualTo(Integer value) {
            addCriterion("huifuId <>", value, "huifuid");
            return (Criteria) this;
        }

        public Criteria andHuifuidGreaterThan(Integer value) {
            addCriterion("huifuId >", value, "huifuid");
            return (Criteria) this;
        }

        public Criteria andHuifuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("huifuId >=", value, "huifuid");
            return (Criteria) this;
        }

        public Criteria andHuifuidLessThan(Integer value) {
            addCriterion("huifuId <", value, "huifuid");
            return (Criteria) this;
        }

        public Criteria andHuifuidLessThanOrEqualTo(Integer value) {
            addCriterion("huifuId <=", value, "huifuid");
            return (Criteria) this;
        }

        public Criteria andHuifuidIn(List<Integer> values) {
            addCriterion("huifuId in", values, "huifuid");
            return (Criteria) this;
        }

        public Criteria andHuifuidNotIn(List<Integer> values) {
            addCriterion("huifuId not in", values, "huifuid");
            return (Criteria) this;
        }

        public Criteria andHuifuidBetween(Integer value1, Integer value2) {
            addCriterion("huifuId between", value1, value2, "huifuid");
            return (Criteria) this;
        }

        public Criteria andHuifuidNotBetween(Integer value1, Integer value2) {
            addCriterion("huifuId not between", value1, value2, "huifuid");
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