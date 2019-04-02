package com.zhihu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RoundtableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoundtableExample() {
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

        public Criteria andForwardIsNull() {
            addCriterion("forward is null");
            return (Criteria) this;
        }

        public Criteria andForwardIsNotNull() {
            addCriterion("forward is not null");
            return (Criteria) this;
        }

        public Criteria andForwardEqualTo(String value) {
            addCriterion("forward =", value, "forward");
            return (Criteria) this;
        }

        public Criteria andForwardNotEqualTo(String value) {
            addCriterion("forward <>", value, "forward");
            return (Criteria) this;
        }

        public Criteria andForwardGreaterThan(String value) {
            addCriterion("forward >", value, "forward");
            return (Criteria) this;
        }

        public Criteria andForwardGreaterThanOrEqualTo(String value) {
            addCriterion("forward >=", value, "forward");
            return (Criteria) this;
        }

        public Criteria andForwardLessThan(String value) {
            addCriterion("forward <", value, "forward");
            return (Criteria) this;
        }

        public Criteria andForwardLessThanOrEqualTo(String value) {
            addCriterion("forward <=", value, "forward");
            return (Criteria) this;
        }

        public Criteria andForwardLike(String value) {
            addCriterion("forward like", value, "forward");
            return (Criteria) this;
        }

        public Criteria andForwardNotLike(String value) {
            addCriterion("forward not like", value, "forward");
            return (Criteria) this;
        }

        public Criteria andForwardIn(List<String> values) {
            addCriterion("forward in", values, "forward");
            return (Criteria) this;
        }

        public Criteria andForwardNotIn(List<String> values) {
            addCriterion("forward not in", values, "forward");
            return (Criteria) this;
        }

        public Criteria andForwardBetween(String value1, String value2) {
            addCriterion("forward between", value1, value2, "forward");
            return (Criteria) this;
        }

        public Criteria andForwardNotBetween(String value1, String value2) {
            addCriterion("forward not between", value1, value2, "forward");
            return (Criteria) this;
        }

        public Criteria andBrowseconuntIsNull() {
            addCriterion("browseConunt is null");
            return (Criteria) this;
        }

        public Criteria andBrowseconuntIsNotNull() {
            addCriterion("browseConunt is not null");
            return (Criteria) this;
        }

        public Criteria andBrowseconuntEqualTo(Integer value) {
            addCriterion("browseConunt =", value, "browseconunt");
            return (Criteria) this;
        }

        public Criteria andBrowseconuntNotEqualTo(Integer value) {
            addCriterion("browseConunt <>", value, "browseconunt");
            return (Criteria) this;
        }

        public Criteria andBrowseconuntGreaterThan(Integer value) {
            addCriterion("browseConunt >", value, "browseconunt");
            return (Criteria) this;
        }

        public Criteria andBrowseconuntGreaterThanOrEqualTo(Integer value) {
            addCriterion("browseConunt >=", value, "browseconunt");
            return (Criteria) this;
        }

        public Criteria andBrowseconuntLessThan(Integer value) {
            addCriterion("browseConunt <", value, "browseconunt");
            return (Criteria) this;
        }

        public Criteria andBrowseconuntLessThanOrEqualTo(Integer value) {
            addCriterion("browseConunt <=", value, "browseconunt");
            return (Criteria) this;
        }

        public Criteria andBrowseconuntIn(List<Integer> values) {
            addCriterion("browseConunt in", values, "browseconunt");
            return (Criteria) this;
        }

        public Criteria andBrowseconuntNotIn(List<Integer> values) {
            addCriterion("browseConunt not in", values, "browseconunt");
            return (Criteria) this;
        }

        public Criteria andBrowseconuntBetween(Integer value1, Integer value2) {
            addCriterion("browseConunt between", value1, value2, "browseconunt");
            return (Criteria) this;
        }

        public Criteria andBrowseconuntNotBetween(Integer value1, Integer value2) {
            addCriterion("browseConunt not between", value1, value2, "browseconunt");
            return (Criteria) this;
        }

        public Criteria andMasteridIsNull() {
            addCriterion("masterId is null");
            return (Criteria) this;
        }

        public Criteria andMasteridIsNotNull() {
            addCriterion("masterId is not null");
            return (Criteria) this;
        }

        public Criteria andMasteridEqualTo(Integer value) {
            addCriterion("masterId =", value, "masterid");
            return (Criteria) this;
        }

        public Criteria andMasteridNotEqualTo(Integer value) {
            addCriterion("masterId <>", value, "masterid");
            return (Criteria) this;
        }

        public Criteria andMasteridGreaterThan(Integer value) {
            addCriterion("masterId >", value, "masterid");
            return (Criteria) this;
        }

        public Criteria andMasteridGreaterThanOrEqualTo(Integer value) {
            addCriterion("masterId >=", value, "masterid");
            return (Criteria) this;
        }

        public Criteria andMasteridLessThan(Integer value) {
            addCriterion("masterId <", value, "masterid");
            return (Criteria) this;
        }

        public Criteria andMasteridLessThanOrEqualTo(Integer value) {
            addCriterion("masterId <=", value, "masterid");
            return (Criteria) this;
        }

        public Criteria andMasteridIn(List<Integer> values) {
            addCriterion("masterId in", values, "masterid");
            return (Criteria) this;
        }

        public Criteria andMasteridNotIn(List<Integer> values) {
            addCriterion("masterId not in", values, "masterid");
            return (Criteria) this;
        }

        public Criteria andMasteridBetween(Integer value1, Integer value2) {
            addCriterion("masterId between", value1, value2, "masterid");
            return (Criteria) this;
        }

        public Criteria andMasteridNotBetween(Integer value1, Integer value2) {
            addCriterion("masterId not between", value1, value2, "masterid");
            return (Criteria) this;
        }

        public Criteria andGuestidIsNull() {
            addCriterion("guestId is null");
            return (Criteria) this;
        }

        public Criteria andGuestidIsNotNull() {
            addCriterion("guestId is not null");
            return (Criteria) this;
        }

        public Criteria andGuestidEqualTo(String value) {
            addCriterion("guestId =", value, "guestid");
            return (Criteria) this;
        }

        public Criteria andGuestidNotEqualTo(String value) {
            addCriterion("guestId <>", value, "guestid");
            return (Criteria) this;
        }

        public Criteria andGuestidGreaterThan(String value) {
            addCriterion("guestId >", value, "guestid");
            return (Criteria) this;
        }

        public Criteria andGuestidGreaterThanOrEqualTo(String value) {
            addCriterion("guestId >=", value, "guestid");
            return (Criteria) this;
        }

        public Criteria andGuestidLessThan(String value) {
            addCriterion("guestId <", value, "guestid");
            return (Criteria) this;
        }

        public Criteria andGuestidLessThanOrEqualTo(String value) {
            addCriterion("guestId <=", value, "guestid");
            return (Criteria) this;
        }

        public Criteria andGuestidLike(String value) {
            addCriterion("guestId like", value, "guestid");
            return (Criteria) this;
        }

        public Criteria andGuestidNotLike(String value) {
            addCriterion("guestId not like", value, "guestid");
            return (Criteria) this;
        }

        public Criteria andGuestidIn(List<String> values) {
            addCriterion("guestId in", values, "guestid");
            return (Criteria) this;
        }

        public Criteria andGuestidNotIn(List<String> values) {
            addCriterion("guestId not in", values, "guestid");
            return (Criteria) this;
        }

        public Criteria andGuestidBetween(String value1, String value2) {
            addCriterion("guestId between", value1, value2, "guestid");
            return (Criteria) this;
        }

        public Criteria andGuestidNotBetween(String value1, String value2) {
            addCriterion("guestId not between", value1, value2, "guestid");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("startTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("startTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("startTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("startTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("startTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("startTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("startTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("startTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("startTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("startTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("startTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("startTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endTime not between", value1, value2, "endtime");
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