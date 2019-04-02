package com.zhihu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsersExample() {
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

        public Criteria andEmailIsNull() {
            addCriterion("Email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("Email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("Email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("Email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("Email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("Email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("Email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("Email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("Email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("Email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("Email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("Email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("Email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("Email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("Password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("Password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("Password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("Password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("Password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("Password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("Password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("Password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("Password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("Password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("Password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("Password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("Password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("Password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andSurnameIsNull() {
            addCriterion("SurName is null");
            return (Criteria) this;
        }

        public Criteria andSurnameIsNotNull() {
            addCriterion("SurName is not null");
            return (Criteria) this;
        }

        public Criteria andSurnameEqualTo(String value) {
            addCriterion("SurName =", value, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameNotEqualTo(String value) {
            addCriterion("SurName <>", value, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameGreaterThan(String value) {
            addCriterion("SurName >", value, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameGreaterThanOrEqualTo(String value) {
            addCriterion("SurName >=", value, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameLessThan(String value) {
            addCriterion("SurName <", value, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameLessThanOrEqualTo(String value) {
            addCriterion("SurName <=", value, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameLike(String value) {
            addCriterion("SurName like", value, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameNotLike(String value) {
            addCriterion("SurName not like", value, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameIn(List<String> values) {
            addCriterion("SurName in", values, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameNotIn(List<String> values) {
            addCriterion("SurName not in", values, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameBetween(String value1, String value2) {
            addCriterion("SurName between", value1, value2, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameNotBetween(String value1, String value2) {
            addCriterion("SurName not between", value1, value2, "surname");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("Name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("Name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("Name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("Name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("Name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("Name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("Name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("Name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("Name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("Name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("Name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("Name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("Name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("Name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("Gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("Gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("Gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("Gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("Gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("Gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("Gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("Gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("Gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("Gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("Gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("Gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("Gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("Gender not between", value1, value2, "gender");
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

        public Criteria andAutographIsNull() {
            addCriterion("Autograph is null");
            return (Criteria) this;
        }

        public Criteria andAutographIsNotNull() {
            addCriterion("Autograph is not null");
            return (Criteria) this;
        }

        public Criteria andAutographEqualTo(String value) {
            addCriterion("Autograph =", value, "autograph");
            return (Criteria) this;
        }

        public Criteria andAutographNotEqualTo(String value) {
            addCriterion("Autograph <>", value, "autograph");
            return (Criteria) this;
        }

        public Criteria andAutographGreaterThan(String value) {
            addCriterion("Autograph >", value, "autograph");
            return (Criteria) this;
        }

        public Criteria andAutographGreaterThanOrEqualTo(String value) {
            addCriterion("Autograph >=", value, "autograph");
            return (Criteria) this;
        }

        public Criteria andAutographLessThan(String value) {
            addCriterion("Autograph <", value, "autograph");
            return (Criteria) this;
        }

        public Criteria andAutographLessThanOrEqualTo(String value) {
            addCriterion("Autograph <=", value, "autograph");
            return (Criteria) this;
        }

        public Criteria andAutographLike(String value) {
            addCriterion("Autograph like", value, "autograph");
            return (Criteria) this;
        }

        public Criteria andAutographNotLike(String value) {
            addCriterion("Autograph not like", value, "autograph");
            return (Criteria) this;
        }

        public Criteria andAutographIn(List<String> values) {
            addCriterion("Autograph in", values, "autograph");
            return (Criteria) this;
        }

        public Criteria andAutographNotIn(List<String> values) {
            addCriterion("Autograph not in", values, "autograph");
            return (Criteria) this;
        }

        public Criteria andAutographBetween(String value1, String value2) {
            addCriterion("Autograph between", value1, value2, "autograph");
            return (Criteria) this;
        }

        public Criteria andAutographNotBetween(String value1, String value2) {
            addCriterion("Autograph not between", value1, value2, "autograph");
            return (Criteria) this;
        }

        public Criteria andIntroduceIsNull() {
            addCriterion("Introduce is null");
            return (Criteria) this;
        }

        public Criteria andIntroduceIsNotNull() {
            addCriterion("Introduce is not null");
            return (Criteria) this;
        }

        public Criteria andIntroduceEqualTo(String value) {
            addCriterion("Introduce =", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotEqualTo(String value) {
            addCriterion("Introduce <>", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceGreaterThan(String value) {
            addCriterion("Introduce >", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("Introduce >=", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLessThan(String value) {
            addCriterion("Introduce <", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLessThanOrEqualTo(String value) {
            addCriterion("Introduce <=", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLike(String value) {
            addCriterion("Introduce like", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotLike(String value) {
            addCriterion("Introduce not like", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceIn(List<String> values) {
            addCriterion("Introduce in", values, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotIn(List<String> values) {
            addCriterion("Introduce not in", values, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceBetween(String value1, String value2) {
            addCriterion("Introduce between", value1, value2, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotBetween(String value1, String value2) {
            addCriterion("Introduce not between", value1, value2, "introduce");
            return (Criteria) this;
        }

        public Criteria andPrivacyprotectionIsNull() {
            addCriterion("PrivacyProtection is null");
            return (Criteria) this;
        }

        public Criteria andPrivacyprotectionIsNotNull() {
            addCriterion("PrivacyProtection is not null");
            return (Criteria) this;
        }

        public Criteria andPrivacyprotectionEqualTo(String value) {
            addCriterion("PrivacyProtection =", value, "privacyprotection");
            return (Criteria) this;
        }

        public Criteria andPrivacyprotectionNotEqualTo(String value) {
            addCriterion("PrivacyProtection <>", value, "privacyprotection");
            return (Criteria) this;
        }

        public Criteria andPrivacyprotectionGreaterThan(String value) {
            addCriterion("PrivacyProtection >", value, "privacyprotection");
            return (Criteria) this;
        }

        public Criteria andPrivacyprotectionGreaterThanOrEqualTo(String value) {
            addCriterion("PrivacyProtection >=", value, "privacyprotection");
            return (Criteria) this;
        }

        public Criteria andPrivacyprotectionLessThan(String value) {
            addCriterion("PrivacyProtection <", value, "privacyprotection");
            return (Criteria) this;
        }

        public Criteria andPrivacyprotectionLessThanOrEqualTo(String value) {
            addCriterion("PrivacyProtection <=", value, "privacyprotection");
            return (Criteria) this;
        }

        public Criteria andPrivacyprotectionLike(String value) {
            addCriterion("PrivacyProtection like", value, "privacyprotection");
            return (Criteria) this;
        }

        public Criteria andPrivacyprotectionNotLike(String value) {
            addCriterion("PrivacyProtection not like", value, "privacyprotection");
            return (Criteria) this;
        }

        public Criteria andPrivacyprotectionIn(List<String> values) {
            addCriterion("PrivacyProtection in", values, "privacyprotection");
            return (Criteria) this;
        }

        public Criteria andPrivacyprotectionNotIn(List<String> values) {
            addCriterion("PrivacyProtection not in", values, "privacyprotection");
            return (Criteria) this;
        }

        public Criteria andPrivacyprotectionBetween(String value1, String value2) {
            addCriterion("PrivacyProtection between", value1, value2, "privacyprotection");
            return (Criteria) this;
        }

        public Criteria andPrivacyprotectionNotBetween(String value1, String value2) {
            addCriterion("PrivacyProtection not between", value1, value2, "privacyprotection");
            return (Criteria) this;
        }

        public Criteria andPraisenumbIsNull() {
            addCriterion("PraiseNumb is null");
            return (Criteria) this;
        }

        public Criteria andPraisenumbIsNotNull() {
            addCriterion("PraiseNumb is not null");
            return (Criteria) this;
        }

        public Criteria andPraisenumbEqualTo(Integer value) {
            addCriterion("PraiseNumb =", value, "praisenumb");
            return (Criteria) this;
        }

        public Criteria andPraisenumbNotEqualTo(Integer value) {
            addCriterion("PraiseNumb <>", value, "praisenumb");
            return (Criteria) this;
        }

        public Criteria andPraisenumbGreaterThan(Integer value) {
            addCriterion("PraiseNumb >", value, "praisenumb");
            return (Criteria) this;
        }

        public Criteria andPraisenumbGreaterThanOrEqualTo(Integer value) {
            addCriterion("PraiseNumb >=", value, "praisenumb");
            return (Criteria) this;
        }

        public Criteria andPraisenumbLessThan(Integer value) {
            addCriterion("PraiseNumb <", value, "praisenumb");
            return (Criteria) this;
        }

        public Criteria andPraisenumbLessThanOrEqualTo(Integer value) {
            addCriterion("PraiseNumb <=", value, "praisenumb");
            return (Criteria) this;
        }

        public Criteria andPraisenumbIn(List<Integer> values) {
            addCriterion("PraiseNumb in", values, "praisenumb");
            return (Criteria) this;
        }

        public Criteria andPraisenumbNotIn(List<Integer> values) {
            addCriterion("PraiseNumb not in", values, "praisenumb");
            return (Criteria) this;
        }

        public Criteria andPraisenumbBetween(Integer value1, Integer value2) {
            addCriterion("PraiseNumb between", value1, value2, "praisenumb");
            return (Criteria) this;
        }

        public Criteria andPraisenumbNotBetween(Integer value1, Integer value2) {
            addCriterion("PraiseNumb not between", value1, value2, "praisenumb");
            return (Criteria) this;
        }

        public Criteria andThanknumbIsNull() {
            addCriterion("ThankNumb is null");
            return (Criteria) this;
        }

        public Criteria andThanknumbIsNotNull() {
            addCriterion("ThankNumb is not null");
            return (Criteria) this;
        }

        public Criteria andThanknumbEqualTo(Integer value) {
            addCriterion("ThankNumb =", value, "thanknumb");
            return (Criteria) this;
        }

        public Criteria andThanknumbNotEqualTo(Integer value) {
            addCriterion("ThankNumb <>", value, "thanknumb");
            return (Criteria) this;
        }

        public Criteria andThanknumbGreaterThan(Integer value) {
            addCriterion("ThankNumb >", value, "thanknumb");
            return (Criteria) this;
        }

        public Criteria andThanknumbGreaterThanOrEqualTo(Integer value) {
            addCriterion("ThankNumb >=", value, "thanknumb");
            return (Criteria) this;
        }

        public Criteria andThanknumbLessThan(Integer value) {
            addCriterion("ThankNumb <", value, "thanknumb");
            return (Criteria) this;
        }

        public Criteria andThanknumbLessThanOrEqualTo(Integer value) {
            addCriterion("ThankNumb <=", value, "thanknumb");
            return (Criteria) this;
        }

        public Criteria andThanknumbIn(List<Integer> values) {
            addCriterion("ThankNumb in", values, "thanknumb");
            return (Criteria) this;
        }

        public Criteria andThanknumbNotIn(List<Integer> values) {
            addCriterion("ThankNumb not in", values, "thanknumb");
            return (Criteria) this;
        }

        public Criteria andThanknumbBetween(Integer value1, Integer value2) {
            addCriterion("ThankNumb between", value1, value2, "thanknumb");
            return (Criteria) this;
        }

        public Criteria andThanknumbNotBetween(Integer value1, Integer value2) {
            addCriterion("ThankNumb not between", value1, value2, "thanknumb");
            return (Criteria) this;
        }

        public Criteria andQuestionnumbIsNull() {
            addCriterion("QuestionNumb is null");
            return (Criteria) this;
        }

        public Criteria andQuestionnumbIsNotNull() {
            addCriterion("QuestionNumb is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionnumbEqualTo(Integer value) {
            addCriterion("QuestionNumb =", value, "questionnumb");
            return (Criteria) this;
        }

        public Criteria andQuestionnumbNotEqualTo(Integer value) {
            addCriterion("QuestionNumb <>", value, "questionnumb");
            return (Criteria) this;
        }

        public Criteria andQuestionnumbGreaterThan(Integer value) {
            addCriterion("QuestionNumb >", value, "questionnumb");
            return (Criteria) this;
        }

        public Criteria andQuestionnumbGreaterThanOrEqualTo(Integer value) {
            addCriterion("QuestionNumb >=", value, "questionnumb");
            return (Criteria) this;
        }

        public Criteria andQuestionnumbLessThan(Integer value) {
            addCriterion("QuestionNumb <", value, "questionnumb");
            return (Criteria) this;
        }

        public Criteria andQuestionnumbLessThanOrEqualTo(Integer value) {
            addCriterion("QuestionNumb <=", value, "questionnumb");
            return (Criteria) this;
        }

        public Criteria andQuestionnumbIn(List<Integer> values) {
            addCriterion("QuestionNumb in", values, "questionnumb");
            return (Criteria) this;
        }

        public Criteria andQuestionnumbNotIn(List<Integer> values) {
            addCriterion("QuestionNumb not in", values, "questionnumb");
            return (Criteria) this;
        }

        public Criteria andQuestionnumbBetween(Integer value1, Integer value2) {
            addCriterion("QuestionNumb between", value1, value2, "questionnumb");
            return (Criteria) this;
        }

        public Criteria andQuestionnumbNotBetween(Integer value1, Integer value2) {
            addCriterion("QuestionNumb not between", value1, value2, "questionnumb");
            return (Criteria) this;
        }

        public Criteria andAnswernumbIsNull() {
            addCriterion("AnswerNumb is null");
            return (Criteria) this;
        }

        public Criteria andAnswernumbIsNotNull() {
            addCriterion("AnswerNumb is not null");
            return (Criteria) this;
        }

        public Criteria andAnswernumbEqualTo(Integer value) {
            addCriterion("AnswerNumb =", value, "answernumb");
            return (Criteria) this;
        }

        public Criteria andAnswernumbNotEqualTo(Integer value) {
            addCriterion("AnswerNumb <>", value, "answernumb");
            return (Criteria) this;
        }

        public Criteria andAnswernumbGreaterThan(Integer value) {
            addCriterion("AnswerNumb >", value, "answernumb");
            return (Criteria) this;
        }

        public Criteria andAnswernumbGreaterThanOrEqualTo(Integer value) {
            addCriterion("AnswerNumb >=", value, "answernumb");
            return (Criteria) this;
        }

        public Criteria andAnswernumbLessThan(Integer value) {
            addCriterion("AnswerNumb <", value, "answernumb");
            return (Criteria) this;
        }

        public Criteria andAnswernumbLessThanOrEqualTo(Integer value) {
            addCriterion("AnswerNumb <=", value, "answernumb");
            return (Criteria) this;
        }

        public Criteria andAnswernumbIn(List<Integer> values) {
            addCriterion("AnswerNumb in", values, "answernumb");
            return (Criteria) this;
        }

        public Criteria andAnswernumbNotIn(List<Integer> values) {
            addCriterion("AnswerNumb not in", values, "answernumb");
            return (Criteria) this;
        }

        public Criteria andAnswernumbBetween(Integer value1, Integer value2) {
            addCriterion("AnswerNumb between", value1, value2, "answernumb");
            return (Criteria) this;
        }

        public Criteria andAnswernumbNotBetween(Integer value1, Integer value2) {
            addCriterion("AnswerNumb not between", value1, value2, "answernumb");
            return (Criteria) this;
        }

        public Criteria andCollectnumbIsNull() {
            addCriterion("CollectNumb is null");
            return (Criteria) this;
        }

        public Criteria andCollectnumbIsNotNull() {
            addCriterion("CollectNumb is not null");
            return (Criteria) this;
        }

        public Criteria andCollectnumbEqualTo(Integer value) {
            addCriterion("CollectNumb =", value, "collectnumb");
            return (Criteria) this;
        }

        public Criteria andCollectnumbNotEqualTo(Integer value) {
            addCriterion("CollectNumb <>", value, "collectnumb");
            return (Criteria) this;
        }

        public Criteria andCollectnumbGreaterThan(Integer value) {
            addCriterion("CollectNumb >", value, "collectnumb");
            return (Criteria) this;
        }

        public Criteria andCollectnumbGreaterThanOrEqualTo(Integer value) {
            addCriterion("CollectNumb >=", value, "collectnumb");
            return (Criteria) this;
        }

        public Criteria andCollectnumbLessThan(Integer value) {
            addCriterion("CollectNumb <", value, "collectnumb");
            return (Criteria) this;
        }

        public Criteria andCollectnumbLessThanOrEqualTo(Integer value) {
            addCriterion("CollectNumb <=", value, "collectnumb");
            return (Criteria) this;
        }

        public Criteria andCollectnumbIn(List<Integer> values) {
            addCriterion("CollectNumb in", values, "collectnumb");
            return (Criteria) this;
        }

        public Criteria andCollectnumbNotIn(List<Integer> values) {
            addCriterion("CollectNumb not in", values, "collectnumb");
            return (Criteria) this;
        }

        public Criteria andCollectnumbBetween(Integer value1, Integer value2) {
            addCriterion("CollectNumb between", value1, value2, "collectnumb");
            return (Criteria) this;
        }

        public Criteria andCollectnumbNotBetween(Integer value1, Integer value2) {
            addCriterion("CollectNumb not between", value1, value2, "collectnumb");
            return (Criteria) this;
        }

        public Criteria andEditnumbIsNull() {
            addCriterion("EditNumb is null");
            return (Criteria) this;
        }

        public Criteria andEditnumbIsNotNull() {
            addCriterion("EditNumb is not null");
            return (Criteria) this;
        }

        public Criteria andEditnumbEqualTo(Integer value) {
            addCriterion("EditNumb =", value, "editnumb");
            return (Criteria) this;
        }

        public Criteria andEditnumbNotEqualTo(Integer value) {
            addCriterion("EditNumb <>", value, "editnumb");
            return (Criteria) this;
        }

        public Criteria andEditnumbGreaterThan(Integer value) {
            addCriterion("EditNumb >", value, "editnumb");
            return (Criteria) this;
        }

        public Criteria andEditnumbGreaterThanOrEqualTo(Integer value) {
            addCriterion("EditNumb >=", value, "editnumb");
            return (Criteria) this;
        }

        public Criteria andEditnumbLessThan(Integer value) {
            addCriterion("EditNumb <", value, "editnumb");
            return (Criteria) this;
        }

        public Criteria andEditnumbLessThanOrEqualTo(Integer value) {
            addCriterion("EditNumb <=", value, "editnumb");
            return (Criteria) this;
        }

        public Criteria andEditnumbIn(List<Integer> values) {
            addCriterion("EditNumb in", values, "editnumb");
            return (Criteria) this;
        }

        public Criteria andEditnumbNotIn(List<Integer> values) {
            addCriterion("EditNumb not in", values, "editnumb");
            return (Criteria) this;
        }

        public Criteria andEditnumbBetween(Integer value1, Integer value2) {
            addCriterion("EditNumb between", value1, value2, "editnumb");
            return (Criteria) this;
        }

        public Criteria andEditnumbNotBetween(Integer value1, Integer value2) {
            addCriterion("EditNumb not between", value1, value2, "editnumb");
            return (Criteria) this;
        }

        public Criteria andAttentionnumbIsNull() {
            addCriterion("AttentionNumb is null");
            return (Criteria) this;
        }

        public Criteria andAttentionnumbIsNotNull() {
            addCriterion("AttentionNumb is not null");
            return (Criteria) this;
        }

        public Criteria andAttentionnumbEqualTo(Integer value) {
            addCriterion("AttentionNumb =", value, "attentionnumb");
            return (Criteria) this;
        }

        public Criteria andAttentionnumbNotEqualTo(Integer value) {
            addCriterion("AttentionNumb <>", value, "attentionnumb");
            return (Criteria) this;
        }

        public Criteria andAttentionnumbGreaterThan(Integer value) {
            addCriterion("AttentionNumb >", value, "attentionnumb");
            return (Criteria) this;
        }

        public Criteria andAttentionnumbGreaterThanOrEqualTo(Integer value) {
            addCriterion("AttentionNumb >=", value, "attentionnumb");
            return (Criteria) this;
        }

        public Criteria andAttentionnumbLessThan(Integer value) {
            addCriterion("AttentionNumb <", value, "attentionnumb");
            return (Criteria) this;
        }

        public Criteria andAttentionnumbLessThanOrEqualTo(Integer value) {
            addCriterion("AttentionNumb <=", value, "attentionnumb");
            return (Criteria) this;
        }

        public Criteria andAttentionnumbIn(List<Integer> values) {
            addCriterion("AttentionNumb in", values, "attentionnumb");
            return (Criteria) this;
        }

        public Criteria andAttentionnumbNotIn(List<Integer> values) {
            addCriterion("AttentionNumb not in", values, "attentionnumb");
            return (Criteria) this;
        }

        public Criteria andAttentionnumbBetween(Integer value1, Integer value2) {
            addCriterion("AttentionNumb between", value1, value2, "attentionnumb");
            return (Criteria) this;
        }

        public Criteria andAttentionnumbNotBetween(Integer value1, Integer value2) {
            addCriterion("AttentionNumb not between", value1, value2, "attentionnumb");
            return (Criteria) this;
        }

        public Criteria andFollowernumbIsNull() {
            addCriterion("FollowerNumb is null");
            return (Criteria) this;
        }

        public Criteria andFollowernumbIsNotNull() {
            addCriterion("FollowerNumb is not null");
            return (Criteria) this;
        }

        public Criteria andFollowernumbEqualTo(Integer value) {
            addCriterion("FollowerNumb =", value, "followernumb");
            return (Criteria) this;
        }

        public Criteria andFollowernumbNotEqualTo(Integer value) {
            addCriterion("FollowerNumb <>", value, "followernumb");
            return (Criteria) this;
        }

        public Criteria andFollowernumbGreaterThan(Integer value) {
            addCriterion("FollowerNumb >", value, "followernumb");
            return (Criteria) this;
        }

        public Criteria andFollowernumbGreaterThanOrEqualTo(Integer value) {
            addCriterion("FollowerNumb >=", value, "followernumb");
            return (Criteria) this;
        }

        public Criteria andFollowernumbLessThan(Integer value) {
            addCriterion("FollowerNumb <", value, "followernumb");
            return (Criteria) this;
        }

        public Criteria andFollowernumbLessThanOrEqualTo(Integer value) {
            addCriterion("FollowerNumb <=", value, "followernumb");
            return (Criteria) this;
        }

        public Criteria andFollowernumbIn(List<Integer> values) {
            addCriterion("FollowerNumb in", values, "followernumb");
            return (Criteria) this;
        }

        public Criteria andFollowernumbNotIn(List<Integer> values) {
            addCriterion("FollowerNumb not in", values, "followernumb");
            return (Criteria) this;
        }

        public Criteria andFollowernumbBetween(Integer value1, Integer value2) {
            addCriterion("FollowerNumb between", value1, value2, "followernumb");
            return (Criteria) this;
        }

        public Criteria andFollowernumbNotBetween(Integer value1, Integer value2) {
            addCriterion("FollowerNumb not between", value1, value2, "followernumb");
            return (Criteria) this;
        }

        public Criteria andConcerntopicnumbIsNull() {
            addCriterion("ConcernTopicNumb is null");
            return (Criteria) this;
        }

        public Criteria andConcerntopicnumbIsNotNull() {
            addCriterion("ConcernTopicNumb is not null");
            return (Criteria) this;
        }

        public Criteria andConcerntopicnumbEqualTo(Integer value) {
            addCriterion("ConcernTopicNumb =", value, "concerntopicnumb");
            return (Criteria) this;
        }

        public Criteria andConcerntopicnumbNotEqualTo(Integer value) {
            addCriterion("ConcernTopicNumb <>", value, "concerntopicnumb");
            return (Criteria) this;
        }

        public Criteria andConcerntopicnumbGreaterThan(Integer value) {
            addCriterion("ConcernTopicNumb >", value, "concerntopicnumb");
            return (Criteria) this;
        }

        public Criteria andConcerntopicnumbGreaterThanOrEqualTo(Integer value) {
            addCriterion("ConcernTopicNumb >=", value, "concerntopicnumb");
            return (Criteria) this;
        }

        public Criteria andConcerntopicnumbLessThan(Integer value) {
            addCriterion("ConcernTopicNumb <", value, "concerntopicnumb");
            return (Criteria) this;
        }

        public Criteria andConcerntopicnumbLessThanOrEqualTo(Integer value) {
            addCriterion("ConcernTopicNumb <=", value, "concerntopicnumb");
            return (Criteria) this;
        }

        public Criteria andConcerntopicnumbIn(List<Integer> values) {
            addCriterion("ConcernTopicNumb in", values, "concerntopicnumb");
            return (Criteria) this;
        }

        public Criteria andConcerntopicnumbNotIn(List<Integer> values) {
            addCriterion("ConcernTopicNumb not in", values, "concerntopicnumb");
            return (Criteria) this;
        }

        public Criteria andConcerntopicnumbBetween(Integer value1, Integer value2) {
            addCriterion("ConcernTopicNumb between", value1, value2, "concerntopicnumb");
            return (Criteria) this;
        }

        public Criteria andConcerntopicnumbNotBetween(Integer value1, Integer value2) {
            addCriterion("ConcernTopicNumb not between", value1, value2, "concerntopicnumb");
            return (Criteria) this;
        }

        public Criteria andPersonalityurlIsNull() {
            addCriterion("PersonalityUrl is null");
            return (Criteria) this;
        }

        public Criteria andPersonalityurlIsNotNull() {
            addCriterion("PersonalityUrl is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalityurlEqualTo(String value) {
            addCriterion("PersonalityUrl =", value, "personalityurl");
            return (Criteria) this;
        }

        public Criteria andPersonalityurlNotEqualTo(String value) {
            addCriterion("PersonalityUrl <>", value, "personalityurl");
            return (Criteria) this;
        }

        public Criteria andPersonalityurlGreaterThan(String value) {
            addCriterion("PersonalityUrl >", value, "personalityurl");
            return (Criteria) this;
        }

        public Criteria andPersonalityurlGreaterThanOrEqualTo(String value) {
            addCriterion("PersonalityUrl >=", value, "personalityurl");
            return (Criteria) this;
        }

        public Criteria andPersonalityurlLessThan(String value) {
            addCriterion("PersonalityUrl <", value, "personalityurl");
            return (Criteria) this;
        }

        public Criteria andPersonalityurlLessThanOrEqualTo(String value) {
            addCriterion("PersonalityUrl <=", value, "personalityurl");
            return (Criteria) this;
        }

        public Criteria andPersonalityurlLike(String value) {
            addCriterion("PersonalityUrl like", value, "personalityurl");
            return (Criteria) this;
        }

        public Criteria andPersonalityurlNotLike(String value) {
            addCriterion("PersonalityUrl not like", value, "personalityurl");
            return (Criteria) this;
        }

        public Criteria andPersonalityurlIn(List<String> values) {
            addCriterion("PersonalityUrl in", values, "personalityurl");
            return (Criteria) this;
        }

        public Criteria andPersonalityurlNotIn(List<String> values) {
            addCriterion("PersonalityUrl not in", values, "personalityurl");
            return (Criteria) this;
        }

        public Criteria andPersonalityurlBetween(String value1, String value2) {
            addCriterion("PersonalityUrl between", value1, value2, "personalityurl");
            return (Criteria) this;
        }

        public Criteria andPersonalityurlNotBetween(String value1, String value2) {
            addCriterion("PersonalityUrl not between", value1, value2, "personalityurl");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("Company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("Company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("Company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("Company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("Company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("Company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("Company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("Company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("Company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("Company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("Company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("Company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("Company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("Company not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("Position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("Position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("Position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("Position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("Position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("Position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("Position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("Position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("Position like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("Position not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("Position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("Position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("Position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("Position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNull() {
            addCriterion("School is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNotNull() {
            addCriterion("School is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolEqualTo(String value) {
            addCriterion("School =", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotEqualTo(String value) {
            addCriterion("School <>", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThan(String value) {
            addCriterion("School >", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("School >=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThan(String value) {
            addCriterion("School <", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThanOrEqualTo(String value) {
            addCriterion("School <=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLike(String value) {
            addCriterion("School like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotLike(String value) {
            addCriterion("School not like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolIn(List<String> values) {
            addCriterion("School in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotIn(List<String> values) {
            addCriterion("School not in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolBetween(String value1, String value2) {
            addCriterion("School between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotBetween(String value1, String value2) {
            addCriterion("School not between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("Major is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("Major is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("Major =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("Major <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("Major >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("Major >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("Major <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("Major <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("Major like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("Major not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("Major in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("Major not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("Major between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("Major not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andEmailactivateIsNull() {
            addCriterion("EmailActivate is null");
            return (Criteria) this;
        }

        public Criteria andEmailactivateIsNotNull() {
            addCriterion("EmailActivate is not null");
            return (Criteria) this;
        }

        public Criteria andEmailactivateEqualTo(String value) {
            addCriterion("EmailActivate =", value, "emailactivate");
            return (Criteria) this;
        }

        public Criteria andEmailactivateNotEqualTo(String value) {
            addCriterion("EmailActivate <>", value, "emailactivate");
            return (Criteria) this;
        }

        public Criteria andEmailactivateGreaterThan(String value) {
            addCriterion("EmailActivate >", value, "emailactivate");
            return (Criteria) this;
        }

        public Criteria andEmailactivateGreaterThanOrEqualTo(String value) {
            addCriterion("EmailActivate >=", value, "emailactivate");
            return (Criteria) this;
        }

        public Criteria andEmailactivateLessThan(String value) {
            addCriterion("EmailActivate <", value, "emailactivate");
            return (Criteria) this;
        }

        public Criteria andEmailactivateLessThanOrEqualTo(String value) {
            addCriterion("EmailActivate <=", value, "emailactivate");
            return (Criteria) this;
        }

        public Criteria andEmailactivateLike(String value) {
            addCriterion("EmailActivate like", value, "emailactivate");
            return (Criteria) this;
        }

        public Criteria andEmailactivateNotLike(String value) {
            addCriterion("EmailActivate not like", value, "emailactivate");
            return (Criteria) this;
        }

        public Criteria andEmailactivateIn(List<String> values) {
            addCriterion("EmailActivate in", values, "emailactivate");
            return (Criteria) this;
        }

        public Criteria andEmailactivateNotIn(List<String> values) {
            addCriterion("EmailActivate not in", values, "emailactivate");
            return (Criteria) this;
        }

        public Criteria andEmailactivateBetween(String value1, String value2) {
            addCriterion("EmailActivate between", value1, value2, "emailactivate");
            return (Criteria) this;
        }

        public Criteria andEmailactivateNotBetween(String value1, String value2) {
            addCriterion("EmailActivate not between", value1, value2, "emailactivate");
            return (Criteria) this;
        }

        public Criteria andForbiddenIsNull() {
            addCriterion("Forbidden is null");
            return (Criteria) this;
        }

        public Criteria andForbiddenIsNotNull() {
            addCriterion("Forbidden is not null");
            return (Criteria) this;
        }

        public Criteria andForbiddenEqualTo(String value) {
            addCriterion("Forbidden =", value, "forbidden");
            return (Criteria) this;
        }

        public Criteria andForbiddenNotEqualTo(String value) {
            addCriterion("Forbidden <>", value, "forbidden");
            return (Criteria) this;
        }

        public Criteria andForbiddenGreaterThan(String value) {
            addCriterion("Forbidden >", value, "forbidden");
            return (Criteria) this;
        }

        public Criteria andForbiddenGreaterThanOrEqualTo(String value) {
            addCriterion("Forbidden >=", value, "forbidden");
            return (Criteria) this;
        }

        public Criteria andForbiddenLessThan(String value) {
            addCriterion("Forbidden <", value, "forbidden");
            return (Criteria) this;
        }

        public Criteria andForbiddenLessThanOrEqualTo(String value) {
            addCriterion("Forbidden <=", value, "forbidden");
            return (Criteria) this;
        }

        public Criteria andForbiddenLike(String value) {
            addCriterion("Forbidden like", value, "forbidden");
            return (Criteria) this;
        }

        public Criteria andForbiddenNotLike(String value) {
            addCriterion("Forbidden not like", value, "forbidden");
            return (Criteria) this;
        }

        public Criteria andForbiddenIn(List<String> values) {
            addCriterion("Forbidden in", values, "forbidden");
            return (Criteria) this;
        }

        public Criteria andForbiddenNotIn(List<String> values) {
            addCriterion("Forbidden not in", values, "forbidden");
            return (Criteria) this;
        }

        public Criteria andForbiddenBetween(String value1, String value2) {
            addCriterion("Forbidden between", value1, value2, "forbidden");
            return (Criteria) this;
        }

        public Criteria andForbiddenNotBetween(String value1, String value2) {
            addCriterion("Forbidden not between", value1, value2, "forbidden");
            return (Criteria) this;
        }

        public Criteria andForbiddentimeIsNull() {
            addCriterion("ForbiddenTime is null");
            return (Criteria) this;
        }

        public Criteria andForbiddentimeIsNotNull() {
            addCriterion("ForbiddenTime is not null");
            return (Criteria) this;
        }

        public Criteria andForbiddentimeEqualTo(Date value) {
            addCriterionForJDBCDate("ForbiddenTime =", value, "forbiddentime");
            return (Criteria) this;
        }

        public Criteria andForbiddentimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ForbiddenTime <>", value, "forbiddentime");
            return (Criteria) this;
        }

        public Criteria andForbiddentimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ForbiddenTime >", value, "forbiddentime");
            return (Criteria) this;
        }

        public Criteria andForbiddentimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ForbiddenTime >=", value, "forbiddentime");
            return (Criteria) this;
        }

        public Criteria andForbiddentimeLessThan(Date value) {
            addCriterionForJDBCDate("ForbiddenTime <", value, "forbiddentime");
            return (Criteria) this;
        }

        public Criteria andForbiddentimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ForbiddenTime <=", value, "forbiddentime");
            return (Criteria) this;
        }

        public Criteria andForbiddentimeIn(List<Date> values) {
            addCriterionForJDBCDate("ForbiddenTime in", values, "forbiddentime");
            return (Criteria) this;
        }

        public Criteria andForbiddentimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ForbiddenTime not in", values, "forbiddentime");
            return (Criteria) this;
        }

        public Criteria andForbiddentimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ForbiddenTime between", value1, value2, "forbiddentime");
            return (Criteria) this;
        }

        public Criteria andForbiddentimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ForbiddenTime not between", value1, value2, "forbiddentime");
            return (Criteria) this;
        }

        public Criteria andRoleIsNull() {
            addCriterion("role is null");
            return (Criteria) this;
        }

        public Criteria andRoleIsNotNull() {
            addCriterion("role is not null");
            return (Criteria) this;
        }

        public Criteria andRoleEqualTo(String value) {
            addCriterion("role =", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotEqualTo(String value) {
            addCriterion("role <>", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThan(String value) {
            addCriterion("role >", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThanOrEqualTo(String value) {
            addCriterion("role >=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThan(String value) {
            addCriterion("role <", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThanOrEqualTo(String value) {
            addCriterion("role <=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLike(String value) {
            addCriterion("role like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotLike(String value) {
            addCriterion("role not like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleIn(List<String> values) {
            addCriterion("role in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotIn(List<String> values) {
            addCriterion("role not in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleBetween(String value1, String value2) {
            addCriterion("role between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotBetween(String value1, String value2) {
            addCriterion("role not between", value1, value2, "role");
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
            addCriterion("CreateTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CreateTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CreateTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CreateTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CreateTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CreateTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CreateTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CreateTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CreateTime not between", value1, value2, "createtime");
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