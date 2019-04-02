package com.zhihu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
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

        public Criteria andCommentatoridIsNull() {
            addCriterion("CommentatorId is null");
            return (Criteria) this;
        }

        public Criteria andCommentatoridIsNotNull() {
            addCriterion("CommentatorId is not null");
            return (Criteria) this;
        }

        public Criteria andCommentatoridEqualTo(String value) {
            addCriterion("CommentatorId =", value, "commentatorid");
            return (Criteria) this;
        }

        public Criteria andCommentatoridNotEqualTo(String value) {
            addCriterion("CommentatorId <>", value, "commentatorid");
            return (Criteria) this;
        }

        public Criteria andCommentatoridGreaterThan(String value) {
            addCriterion("CommentatorId >", value, "commentatorid");
            return (Criteria) this;
        }

        public Criteria andCommentatoridGreaterThanOrEqualTo(String value) {
            addCriterion("CommentatorId >=", value, "commentatorid");
            return (Criteria) this;
        }

        public Criteria andCommentatoridLessThan(String value) {
            addCriterion("CommentatorId <", value, "commentatorid");
            return (Criteria) this;
        }

        public Criteria andCommentatoridLessThanOrEqualTo(String value) {
            addCriterion("CommentatorId <=", value, "commentatorid");
            return (Criteria) this;
        }

        public Criteria andCommentatoridLike(String value) {
            addCriterion("CommentatorId like", value, "commentatorid");
            return (Criteria) this;
        }

        public Criteria andCommentatoridNotLike(String value) {
            addCriterion("CommentatorId not like", value, "commentatorid");
            return (Criteria) this;
        }

        public Criteria andCommentatoridIn(List<String> values) {
            addCriterion("CommentatorId in", values, "commentatorid");
            return (Criteria) this;
        }

        public Criteria andCommentatoridNotIn(List<String> values) {
            addCriterion("CommentatorId not in", values, "commentatorid");
            return (Criteria) this;
        }

        public Criteria andCommentatoridBetween(String value1, String value2) {
            addCriterion("CommentatorId between", value1, value2, "commentatorid");
            return (Criteria) this;
        }

        public Criteria andCommentatoridNotBetween(String value1, String value2) {
            addCriterion("CommentatorId not between", value1, value2, "commentatorid");
            return (Criteria) this;
        }

        public Criteria andCommentcontentIsNull() {
            addCriterion("CommentContent is null");
            return (Criteria) this;
        }

        public Criteria andCommentcontentIsNotNull() {
            addCriterion("CommentContent is not null");
            return (Criteria) this;
        }

        public Criteria andCommentcontentEqualTo(String value) {
            addCriterion("CommentContent =", value, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentNotEqualTo(String value) {
            addCriterion("CommentContent <>", value, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentGreaterThan(String value) {
            addCriterion("CommentContent >", value, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentGreaterThanOrEqualTo(String value) {
            addCriterion("CommentContent >=", value, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentLessThan(String value) {
            addCriterion("CommentContent <", value, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentLessThanOrEqualTo(String value) {
            addCriterion("CommentContent <=", value, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentLike(String value) {
            addCriterion("CommentContent like", value, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentNotLike(String value) {
            addCriterion("CommentContent not like", value, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentIn(List<String> values) {
            addCriterion("CommentContent in", values, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentNotIn(List<String> values) {
            addCriterion("CommentContent not in", values, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentBetween(String value1, String value2) {
            addCriterion("CommentContent between", value1, value2, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentNotBetween(String value1, String value2) {
            addCriterion("CommentContent not between", value1, value2, "commentcontent");
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