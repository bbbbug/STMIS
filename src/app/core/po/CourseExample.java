package app.core.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseExample() {
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

        public Criteria andKcbhIsNull() {
            addCriterion("KCBH is null");
            return (Criteria) this;
        }

        public Criteria andKcbhIsNotNull() {
            addCriterion("KCBH is not null");
            return (Criteria) this;
        }

        public Criteria andKcbhEqualTo(String value) {
            addCriterion("KCBH =", value, "kcbh");
            return (Criteria) this;
        }

        public Criteria andKcbhNotEqualTo(String value) {
            addCriterion("KCBH <>", value, "kcbh");
            return (Criteria) this;
        }

        public Criteria andKcbhGreaterThan(String value) {
            addCriterion("KCBH >", value, "kcbh");
            return (Criteria) this;
        }

        public Criteria andKcbhGreaterThanOrEqualTo(String value) {
            addCriterion("KCBH >=", value, "kcbh");
            return (Criteria) this;
        }

        public Criteria andKcbhLessThan(String value) {
            addCriterion("KCBH <", value, "kcbh");
            return (Criteria) this;
        }

        public Criteria andKcbhLessThanOrEqualTo(String value) {
            addCriterion("KCBH <=", value, "kcbh");
            return (Criteria) this;
        }

        public Criteria andKcbhLike(String value) {
            addCriterion("KCBH like", value, "kcbh");
            return (Criteria) this;
        }

        public Criteria andKcbhNotLike(String value) {
            addCriterion("KCBH not like", value, "kcbh");
            return (Criteria) this;
        }

        public Criteria andKcbhIn(List<String> values) {
            addCriterion("KCBH in", values, "kcbh");
            return (Criteria) this;
        }

        public Criteria andKcbhNotIn(List<String> values) {
            addCriterion("KCBH not in", values, "kcbh");
            return (Criteria) this;
        }

        public Criteria andKcbhBetween(String value1, String value2) {
            addCriterion("KCBH between", value1, value2, "kcbh");
            return (Criteria) this;
        }

        public Criteria andKcbhNotBetween(String value1, String value2) {
            addCriterion("KCBH not between", value1, value2, "kcbh");
            return (Criteria) this;
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andKcmcIsNull() {
            addCriterion("KCMC is null");
            return (Criteria) this;
        }

        public Criteria andKcmcIsNotNull() {
            addCriterion("KCMC is not null");
            return (Criteria) this;
        }

        public Criteria andKcmcEqualTo(String value) {
            addCriterion("KCMC =", value, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcNotEqualTo(String value) {
            addCriterion("KCMC <>", value, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcGreaterThan(String value) {
            addCriterion("KCMC >", value, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcGreaterThanOrEqualTo(String value) {
            addCriterion("KCMC >=", value, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcLessThan(String value) {
            addCriterion("KCMC <", value, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcLessThanOrEqualTo(String value) {
            addCriterion("KCMC <=", value, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcLike(String value) {
            addCriterion("KCMC like", value, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcNotLike(String value) {
            addCriterion("KCMC not like", value, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcIn(List<String> values) {
            addCriterion("KCMC in", values, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcNotIn(List<String> values) {
            addCriterion("KCMC not in", values, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcBetween(String value1, String value2) {
            addCriterion("KCMC between", value1, value2, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcNotBetween(String value1, String value2) {
            addCriterion("KCMC not between", value1, value2, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKclbIsNull() {
            addCriterion("KCLB is null");
            return (Criteria) this;
        }

        public Criteria andKclbIsNotNull() {
            addCriterion("KCLB is not null");
            return (Criteria) this;
        }

        public Criteria andKclbEqualTo(String value) {
            addCriterion("KCLB =", value, "kclb");
            return (Criteria) this;
        }

        public Criteria andKclbNotEqualTo(String value) {
            addCriterion("KCLB <>", value, "kclb");
            return (Criteria) this;
        }

        public Criteria andKclbGreaterThan(String value) {
            addCriterion("KCLB >", value, "kclb");
            return (Criteria) this;
        }

        public Criteria andKclbGreaterThanOrEqualTo(String value) {
            addCriterion("KCLB >=", value, "kclb");
            return (Criteria) this;
        }

        public Criteria andKclbLessThan(String value) {
            addCriterion("KCLB <", value, "kclb");
            return (Criteria) this;
        }

        public Criteria andKclbLessThanOrEqualTo(String value) {
            addCriterion("KCLB <=", value, "kclb");
            return (Criteria) this;
        }

        public Criteria andKclbLike(String value) {
            addCriterion("KCLB like", value, "kclb");
            return (Criteria) this;
        }

        public Criteria andKclbNotLike(String value) {
            addCriterion("KCLB not like", value, "kclb");
            return (Criteria) this;
        }

        public Criteria andKclbIn(List<String> values) {
            addCriterion("KCLB in", values, "kclb");
            return (Criteria) this;
        }

        public Criteria andKclbNotIn(List<String> values) {
            addCriterion("KCLB not in", values, "kclb");
            return (Criteria) this;
        }

        public Criteria andKclbBetween(String value1, String value2) {
            addCriterion("KCLB between", value1, value2, "kclb");
            return (Criteria) this;
        }

        public Criteria andKclbNotBetween(String value1, String value2) {
            addCriterion("KCLB not between", value1, value2, "kclb");
            return (Criteria) this;
        }

        public Criteria andKcjjIsNull() {
            addCriterion("KCJJ is null");
            return (Criteria) this;
        }

        public Criteria andKcjjIsNotNull() {
            addCriterion("KCJJ is not null");
            return (Criteria) this;
        }

        public Criteria andKcjjEqualTo(String value) {
            addCriterion("KCJJ =", value, "kcjj");
            return (Criteria) this;
        }

        public Criteria andKcjjNotEqualTo(String value) {
            addCriterion("KCJJ <>", value, "kcjj");
            return (Criteria) this;
        }

        public Criteria andKcjjGreaterThan(String value) {
            addCriterion("KCJJ >", value, "kcjj");
            return (Criteria) this;
        }

        public Criteria andKcjjGreaterThanOrEqualTo(String value) {
            addCriterion("KCJJ >=", value, "kcjj");
            return (Criteria) this;
        }

        public Criteria andKcjjLessThan(String value) {
            addCriterion("KCJJ <", value, "kcjj");
            return (Criteria) this;
        }

        public Criteria andKcjjLessThanOrEqualTo(String value) {
            addCriterion("KCJJ <=", value, "kcjj");
            return (Criteria) this;
        }

        public Criteria andKcjjLike(String value) {
            addCriterion("KCJJ like", value, "kcjj");
            return (Criteria) this;
        }

        public Criteria andKcjjNotLike(String value) {
            addCriterion("KCJJ not like", value, "kcjj");
            return (Criteria) this;
        }

        public Criteria andKcjjIn(List<String> values) {
            addCriterion("KCJJ in", values, "kcjj");
            return (Criteria) this;
        }

        public Criteria andKcjjNotIn(List<String> values) {
            addCriterion("KCJJ not in", values, "kcjj");
            return (Criteria) this;
        }

        public Criteria andKcjjBetween(String value1, String value2) {
            addCriterion("KCJJ between", value1, value2, "kcjj");
            return (Criteria) this;
        }

        public Criteria andKcjjNotBetween(String value1, String value2) {
            addCriterion("KCJJ not between", value1, value2, "kcjj");
            return (Criteria) this;
        }

        public Criteria andKcjsIsNull() {
            addCriterion("KCJS is null");
            return (Criteria) this;
        }

        public Criteria andKcjsIsNotNull() {
            addCriterion("KCJS is not null");
            return (Criteria) this;
        }

        public Criteria andKcjsEqualTo(String value) {
            addCriterion("KCJS =", value, "kcjs");
            return (Criteria) this;
        }

        public Criteria andKcjsNotEqualTo(String value) {
            addCriterion("KCJS <>", value, "kcjs");
            return (Criteria) this;
        }

        public Criteria andKcjsGreaterThan(String value) {
            addCriterion("KCJS >", value, "kcjs");
            return (Criteria) this;
        }

        public Criteria andKcjsGreaterThanOrEqualTo(String value) {
            addCriterion("KCJS >=", value, "kcjs");
            return (Criteria) this;
        }

        public Criteria andKcjsLessThan(String value) {
            addCriterion("KCJS <", value, "kcjs");
            return (Criteria) this;
        }

        public Criteria andKcjsLessThanOrEqualTo(String value) {
            addCriterion("KCJS <=", value, "kcjs");
            return (Criteria) this;
        }

        public Criteria andKcjsLike(String value) {
            addCriterion("KCJS like", value, "kcjs");
            return (Criteria) this;
        }

        public Criteria andKcjsNotLike(String value) {
            addCriterion("KCJS not like", value, "kcjs");
            return (Criteria) this;
        }

        public Criteria andKcjsIn(List<String> values) {
            addCriterion("KCJS in", values, "kcjs");
            return (Criteria) this;
        }

        public Criteria andKcjsNotIn(List<String> values) {
            addCriterion("KCJS not in", values, "kcjs");
            return (Criteria) this;
        }

        public Criteria andKcjsBetween(String value1, String value2) {
            addCriterion("KCJS between", value1, value2, "kcjs");
            return (Criteria) this;
        }

        public Criteria andKcjsNotBetween(String value1, String value2) {
            addCriterion("KCJS not between", value1, value2, "kcjs");
            return (Criteria) this;
        }

        public Criteria andKcztIsNull() {
            addCriterion("KCZT is null");
            return (Criteria) this;
        }

        public Criteria andKcztIsNotNull() {
            addCriterion("KCZT is not null");
            return (Criteria) this;
        }

        public Criteria andKcztEqualTo(Integer value) {
            addCriterion("KCZT =", value, "kczt");
            return (Criteria) this;
        }

        public Criteria andKcztNotEqualTo(Integer value) {
            addCriterion("KCZT <>", value, "kczt");
            return (Criteria) this;
        }

        public Criteria andKcztGreaterThan(Integer value) {
            addCriterion("KCZT >", value, "kczt");
            return (Criteria) this;
        }

        public Criteria andKcztGreaterThanOrEqualTo(Integer value) {
            addCriterion("KCZT >=", value, "kczt");
            return (Criteria) this;
        }

        public Criteria andKcztLessThan(Integer value) {
            addCriterion("KCZT <", value, "kczt");
            return (Criteria) this;
        }

        public Criteria andKcztLessThanOrEqualTo(Integer value) {
            addCriterion("KCZT <=", value, "kczt");
            return (Criteria) this;
        }

        public Criteria andKcztIn(List<Integer> values) {
            addCriterion("KCZT in", values, "kczt");
            return (Criteria) this;
        }

        public Criteria andKcztNotIn(List<Integer> values) {
            addCriterion("KCZT not in", values, "kczt");
            return (Criteria) this;
        }

        public Criteria andKcztBetween(Integer value1, Integer value2) {
            addCriterion("KCZT between", value1, value2, "kczt");
            return (Criteria) this;
        }

        public Criteria andKcztNotBetween(Integer value1, Integer value2) {
            addCriterion("KCZT not between", value1, value2, "kczt");
            return (Criteria) this;
        }

        public Criteria andKcxfIsNull() {
            addCriterion("KCXF is null");
            return (Criteria) this;
        }

        public Criteria andKcxfIsNotNull() {
            addCriterion("KCXF is not null");
            return (Criteria) this;
        }

        public Criteria andKcxfEqualTo(Integer value) {
            addCriterion("KCXF =", value, "kcxf");
            return (Criteria) this;
        }

        public Criteria andKcxfNotEqualTo(Integer value) {
            addCriterion("KCXF <>", value, "kcxf");
            return (Criteria) this;
        }

        public Criteria andKcxfGreaterThan(Integer value) {
            addCriterion("KCXF >", value, "kcxf");
            return (Criteria) this;
        }

        public Criteria andKcxfGreaterThanOrEqualTo(Integer value) {
            addCriterion("KCXF >=", value, "kcxf");
            return (Criteria) this;
        }

        public Criteria andKcxfLessThan(Integer value) {
            addCriterion("KCXF <", value, "kcxf");
            return (Criteria) this;
        }

        public Criteria andKcxfLessThanOrEqualTo(Integer value) {
            addCriterion("KCXF <=", value, "kcxf");
            return (Criteria) this;
        }

        public Criteria andKcxfIn(List<Integer> values) {
            addCriterion("KCXF in", values, "kcxf");
            return (Criteria) this;
        }

        public Criteria andKcxfNotIn(List<Integer> values) {
            addCriterion("KCXF not in", values, "kcxf");
            return (Criteria) this;
        }

        public Criteria andKcxfBetween(Integer value1, Integer value2) {
            addCriterion("KCXF between", value1, value2, "kcxf");
            return (Criteria) this;
        }

        public Criteria andKcxfNotBetween(Integer value1, Integer value2) {
            addCriterion("KCXF not between", value1, value2, "kcxf");
            return (Criteria) this;
        }

        public Criteria andQxkcbhIsNull() {
            addCriterion("QXKCBH is null");
            return (Criteria) this;
        }

        public Criteria andQxkcbhIsNotNull() {
            addCriterion("QXKCBH is not null");
            return (Criteria) this;
        }

        public Criteria andQxkcbhEqualTo(String value) {
            addCriterion("QXKCBH =", value, "qxkcbh");
            return (Criteria) this;
        }

        public Criteria andQxkcbhNotEqualTo(String value) {
            addCriterion("QXKCBH <>", value, "qxkcbh");
            return (Criteria) this;
        }

        public Criteria andQxkcbhGreaterThan(String value) {
            addCriterion("QXKCBH >", value, "qxkcbh");
            return (Criteria) this;
        }

        public Criteria andQxkcbhGreaterThanOrEqualTo(String value) {
            addCriterion("QXKCBH >=", value, "qxkcbh");
            return (Criteria) this;
        }

        public Criteria andQxkcbhLessThan(String value) {
            addCriterion("QXKCBH <", value, "qxkcbh");
            return (Criteria) this;
        }

        public Criteria andQxkcbhLessThanOrEqualTo(String value) {
            addCriterion("QXKCBH <=", value, "qxkcbh");
            return (Criteria) this;
        }

        public Criteria andQxkcbhLike(String value) {
            addCriterion("QXKCBH like", value, "qxkcbh");
            return (Criteria) this;
        }

        public Criteria andQxkcbhNotLike(String value) {
            addCriterion("QXKCBH not like", value, "qxkcbh");
            return (Criteria) this;
        }

        public Criteria andQxkcbhIn(List<String> values) {
            addCriterion("QXKCBH in", values, "qxkcbh");
            return (Criteria) this;
        }

        public Criteria andQxkcbhNotIn(List<String> values) {
            addCriterion("QXKCBH not in", values, "qxkcbh");
            return (Criteria) this;
        }

        public Criteria andQxkcbhBetween(String value1, String value2) {
            addCriterion("QXKCBH between", value1, value2, "qxkcbh");
            return (Criteria) this;
        }

        public Criteria andQxkcbhNotBetween(String value1, String value2) {
            addCriterion("QXKCBH not between", value1, value2, "qxkcbh");
            return (Criteria) this;
        }

        public Criteria andXgkcbhIsNull() {
            addCriterion("XGKCBH is null");
            return (Criteria) this;
        }

        public Criteria andXgkcbhIsNotNull() {
            addCriterion("XGKCBH is not null");
            return (Criteria) this;
        }

        public Criteria andXgkcbhEqualTo(String value) {
            addCriterion("XGKCBH =", value, "xgkcbh");
            return (Criteria) this;
        }

        public Criteria andXgkcbhNotEqualTo(String value) {
            addCriterion("XGKCBH <>", value, "xgkcbh");
            return (Criteria) this;
        }

        public Criteria andXgkcbhGreaterThan(String value) {
            addCriterion("XGKCBH >", value, "xgkcbh");
            return (Criteria) this;
        }

        public Criteria andXgkcbhGreaterThanOrEqualTo(String value) {
            addCriterion("XGKCBH >=", value, "xgkcbh");
            return (Criteria) this;
        }

        public Criteria andXgkcbhLessThan(String value) {
            addCriterion("XGKCBH <", value, "xgkcbh");
            return (Criteria) this;
        }

        public Criteria andXgkcbhLessThanOrEqualTo(String value) {
            addCriterion("XGKCBH <=", value, "xgkcbh");
            return (Criteria) this;
        }

        public Criteria andXgkcbhLike(String value) {
            addCriterion("XGKCBH like", value, "xgkcbh");
            return (Criteria) this;
        }

        public Criteria andXgkcbhNotLike(String value) {
            addCriterion("XGKCBH not like", value, "xgkcbh");
            return (Criteria) this;
        }

        public Criteria andXgkcbhIn(List<String> values) {
            addCriterion("XGKCBH in", values, "xgkcbh");
            return (Criteria) this;
        }

        public Criteria andXgkcbhNotIn(List<String> values) {
            addCriterion("XGKCBH not in", values, "xgkcbh");
            return (Criteria) this;
        }

        public Criteria andXgkcbhBetween(String value1, String value2) {
            addCriterion("XGKCBH between", value1, value2, "xgkcbh");
            return (Criteria) this;
        }

        public Criteria andXgkcbhNotBetween(String value1, String value2) {
            addCriterion("XGKCBH not between", value1, value2, "xgkcbh");
            return (Criteria) this;
        }

        public Criteria andKcljIsNull() {
            addCriterion("KCLJ is null");
            return (Criteria) this;
        }

        public Criteria andKcljIsNotNull() {
            addCriterion("KCLJ is not null");
            return (Criteria) this;
        }

        public Criteria andKcljEqualTo(String value) {
            addCriterion("KCLJ =", value, "kclj");
            return (Criteria) this;
        }

        public Criteria andKcljNotEqualTo(String value) {
            addCriterion("KCLJ <>", value, "kclj");
            return (Criteria) this;
        }

        public Criteria andKcljGreaterThan(String value) {
            addCriterion("KCLJ >", value, "kclj");
            return (Criteria) this;
        }

        public Criteria andKcljGreaterThanOrEqualTo(String value) {
            addCriterion("KCLJ >=", value, "kclj");
            return (Criteria) this;
        }

        public Criteria andKcljLessThan(String value) {
            addCriterion("KCLJ <", value, "kclj");
            return (Criteria) this;
        }

        public Criteria andKcljLessThanOrEqualTo(String value) {
            addCriterion("KCLJ <=", value, "kclj");
            return (Criteria) this;
        }

        public Criteria andKcljLike(String value) {
            addCriterion("KCLJ like", value, "kclj");
            return (Criteria) this;
        }

        public Criteria andKcljNotLike(String value) {
            addCriterion("KCLJ not like", value, "kclj");
            return (Criteria) this;
        }

        public Criteria andKcljIn(List<String> values) {
            addCriterion("KCLJ in", values, "kclj");
            return (Criteria) this;
        }

        public Criteria andKcljNotIn(List<String> values) {
            addCriterion("KCLJ not in", values, "kclj");
            return (Criteria) this;
        }

        public Criteria andKcljBetween(String value1, String value2) {
            addCriterion("KCLJ between", value1, value2, "kclj");
            return (Criteria) this;
        }

        public Criteria andKcljNotBetween(String value1, String value2) {
            addCriterion("KCLJ not between", value1, value2, "kclj");
            return (Criteria) this;
        }

        public Criteria andKksjIsNull() {
            addCriterion("KKSJ is null");
            return (Criteria) this;
        }

        public Criteria andKksjIsNotNull() {
            addCriterion("KKSJ is not null");
            return (Criteria) this;
        }

        public Criteria andKksjEqualTo(Date value) {
            addCriterion("KKSJ =", value, "kksj");
            return (Criteria) this;
        }

        public Criteria andKksjNotEqualTo(Date value) {
            addCriterion("KKSJ <>", value, "kksj");
            return (Criteria) this;
        }

        public Criteria andKksjGreaterThan(Date value) {
            addCriterion("KKSJ >", value, "kksj");
            return (Criteria) this;
        }

        public Criteria andKksjGreaterThanOrEqualTo(Date value) {
            addCriterion("KKSJ >=", value, "kksj");
            return (Criteria) this;
        }

        public Criteria andKksjLessThan(Date value) {
            addCriterion("KKSJ <", value, "kksj");
            return (Criteria) this;
        }

        public Criteria andKksjLessThanOrEqualTo(Date value) {
            addCriterion("KKSJ <=", value, "kksj");
            return (Criteria) this;
        }

        public Criteria andKksjIn(List<Date> values) {
            addCriterion("KKSJ in", values, "kksj");
            return (Criteria) this;
        }

        public Criteria andKksjNotIn(List<Date> values) {
            addCriterion("KKSJ not in", values, "kksj");
            return (Criteria) this;
        }

        public Criteria andKksjBetween(Date value1, Date value2) {
            addCriterion("KKSJ between", value1, value2, "kksj");
            return (Criteria) this;
        }

        public Criteria andKksjNotBetween(Date value1, Date value2) {
            addCriterion("KKSJ not between", value1, value2, "kksj");
            return (Criteria) this;
        }

        public Criteria andJksjIsNull() {
            addCriterion("JKSJ is null");
            return (Criteria) this;
        }

        public Criteria andJksjIsNotNull() {
            addCriterion("JKSJ is not null");
            return (Criteria) this;
        }

        public Criteria andJksjEqualTo(Date value) {
            addCriterion("JKSJ =", value, "jksj");
            return (Criteria) this;
        }

        public Criteria andJksjNotEqualTo(Date value) {
            addCriterion("JKSJ <>", value, "jksj");
            return (Criteria) this;
        }

        public Criteria andJksjGreaterThan(Date value) {
            addCriterion("JKSJ >", value, "jksj");
            return (Criteria) this;
        }

        public Criteria andJksjGreaterThanOrEqualTo(Date value) {
            addCriterion("JKSJ >=", value, "jksj");
            return (Criteria) this;
        }

        public Criteria andJksjLessThan(Date value) {
            addCriterion("JKSJ <", value, "jksj");
            return (Criteria) this;
        }

        public Criteria andJksjLessThanOrEqualTo(Date value) {
            addCriterion("JKSJ <=", value, "jksj");
            return (Criteria) this;
        }

        public Criteria andJksjIn(List<Date> values) {
            addCriterion("JKSJ in", values, "jksj");
            return (Criteria) this;
        }

        public Criteria andJksjNotIn(List<Date> values) {
            addCriterion("JKSJ not in", values, "jksj");
            return (Criteria) this;
        }

        public Criteria andJksjBetween(Date value1, Date value2) {
            addCriterion("JKSJ between", value1, value2, "jksj");
            return (Criteria) this;
        }

        public Criteria andJksjNotBetween(Date value1, Date value2) {
            addCriterion("JKSJ not between", value1, value2, "jksj");
            return (Criteria) this;
        }

        public Criteria andBxzd1IsNull() {
            addCriterion("BXZD_1 is null");
            return (Criteria) this;
        }

        public Criteria andBxzd1IsNotNull() {
            addCriterion("BXZD_1 is not null");
            return (Criteria) this;
        }

        public Criteria andBxzd1EqualTo(String value) {
            addCriterion("BXZD_1 =", value, "bxzd1");
            return (Criteria) this;
        }

        public Criteria andBxzd1NotEqualTo(String value) {
            addCriterion("BXZD_1 <>", value, "bxzd1");
            return (Criteria) this;
        }

        public Criteria andBxzd1GreaterThan(String value) {
            addCriterion("BXZD_1 >", value, "bxzd1");
            return (Criteria) this;
        }

        public Criteria andBxzd1GreaterThanOrEqualTo(String value) {
            addCriterion("BXZD_1 >=", value, "bxzd1");
            return (Criteria) this;
        }

        public Criteria andBxzd1LessThan(String value) {
            addCriterion("BXZD_1 <", value, "bxzd1");
            return (Criteria) this;
        }

        public Criteria andBxzd1LessThanOrEqualTo(String value) {
            addCriterion("BXZD_1 <=", value, "bxzd1");
            return (Criteria) this;
        }

        public Criteria andBxzd1Like(String value) {
            addCriterion("BXZD_1 like", value, "bxzd1");
            return (Criteria) this;
        }

        public Criteria andBxzd1NotLike(String value) {
            addCriterion("BXZD_1 not like", value, "bxzd1");
            return (Criteria) this;
        }

        public Criteria andBxzd1In(List<String> values) {
            addCriterion("BXZD_1 in", values, "bxzd1");
            return (Criteria) this;
        }

        public Criteria andBxzd1NotIn(List<String> values) {
            addCriterion("BXZD_1 not in", values, "bxzd1");
            return (Criteria) this;
        }

        public Criteria andBxzd1Between(String value1, String value2) {
            addCriterion("BXZD_1 between", value1, value2, "bxzd1");
            return (Criteria) this;
        }

        public Criteria andBxzd1NotBetween(String value1, String value2) {
            addCriterion("BXZD_1 not between", value1, value2, "bxzd1");
            return (Criteria) this;
        }

        public Criteria andBxzd2IsNull() {
            addCriterion("BXZD_2 is null");
            return (Criteria) this;
        }

        public Criteria andBxzd2IsNotNull() {
            addCriterion("BXZD_2 is not null");
            return (Criteria) this;
        }

        public Criteria andBxzd2EqualTo(String value) {
            addCriterion("BXZD_2 =", value, "bxzd2");
            return (Criteria) this;
        }

        public Criteria andBxzd2NotEqualTo(String value) {
            addCriterion("BXZD_2 <>", value, "bxzd2");
            return (Criteria) this;
        }

        public Criteria andBxzd2GreaterThan(String value) {
            addCriterion("BXZD_2 >", value, "bxzd2");
            return (Criteria) this;
        }

        public Criteria andBxzd2GreaterThanOrEqualTo(String value) {
            addCriterion("BXZD_2 >=", value, "bxzd2");
            return (Criteria) this;
        }

        public Criteria andBxzd2LessThan(String value) {
            addCriterion("BXZD_2 <", value, "bxzd2");
            return (Criteria) this;
        }

        public Criteria andBxzd2LessThanOrEqualTo(String value) {
            addCriterion("BXZD_2 <=", value, "bxzd2");
            return (Criteria) this;
        }

        public Criteria andBxzd2Like(String value) {
            addCriterion("BXZD_2 like", value, "bxzd2");
            return (Criteria) this;
        }

        public Criteria andBxzd2NotLike(String value) {
            addCriterion("BXZD_2 not like", value, "bxzd2");
            return (Criteria) this;
        }

        public Criteria andBxzd2In(List<String> values) {
            addCriterion("BXZD_2 in", values, "bxzd2");
            return (Criteria) this;
        }

        public Criteria andBxzd2NotIn(List<String> values) {
            addCriterion("BXZD_2 not in", values, "bxzd2");
            return (Criteria) this;
        }

        public Criteria andBxzd2Between(String value1, String value2) {
            addCriterion("BXZD_2 between", value1, value2, "bxzd2");
            return (Criteria) this;
        }

        public Criteria andBxzd2NotBetween(String value1, String value2) {
            addCriterion("BXZD_2 not between", value1, value2, "bxzd2");
            return (Criteria) this;
        }

        public Criteria andKctbIsNull() {
            addCriterion("KCTB is null");
            return (Criteria) this;
        }

        public Criteria andKctbIsNotNull() {
            addCriterion("KCTB is not null");
            return (Criteria) this;
        }

        public Criteria andKctbEqualTo(String value) {
            addCriterion("KCTB =", value, "kctb");
            return (Criteria) this;
        }

        public Criteria andKctbNotEqualTo(String value) {
            addCriterion("KCTB <>", value, "kctb");
            return (Criteria) this;
        }

        public Criteria andKctbGreaterThan(String value) {
            addCriterion("KCTB >", value, "kctb");
            return (Criteria) this;
        }

        public Criteria andKctbGreaterThanOrEqualTo(String value) {
            addCriterion("KCTB >=", value, "kctb");
            return (Criteria) this;
        }

        public Criteria andKctbLessThan(String value) {
            addCriterion("KCTB <", value, "kctb");
            return (Criteria) this;
        }

        public Criteria andKctbLessThanOrEqualTo(String value) {
            addCriterion("KCTB <=", value, "kctb");
            return (Criteria) this;
        }

        public Criteria andKctbLike(String value) {
            addCriterion("KCTB like", value, "kctb");
            return (Criteria) this;
        }

        public Criteria andKctbNotLike(String value) {
            addCriterion("KCTB not like", value, "kctb");
            return (Criteria) this;
        }

        public Criteria andKctbIn(List<String> values) {
            addCriterion("KCTB in", values, "kctb");
            return (Criteria) this;
        }

        public Criteria andKctbNotIn(List<String> values) {
            addCriterion("KCTB not in", values, "kctb");
            return (Criteria) this;
        }

        public Criteria andKctbBetween(String value1, String value2) {
            addCriterion("KCTB between", value1, value2, "kctb");
            return (Criteria) this;
        }

        public Criteria andKctbNotBetween(String value1, String value2) {
            addCriterion("KCTB not between", value1, value2, "kctb");
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