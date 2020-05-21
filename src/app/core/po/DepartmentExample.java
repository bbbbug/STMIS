package app.core.po;

import java.util.ArrayList;
import java.util.List;

public class DepartmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DepartmentExample() {
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

        public Criteria andBmbhIsNull() {
            addCriterion("BMBH is null");
            return (Criteria) this;
        }

        public Criteria andBmbhIsNotNull() {
            addCriterion("BMBH is not null");
            return (Criteria) this;
        }

        public Criteria andBmbhEqualTo(String value) {
            addCriterion("BMBH =", value, "bmbh");
            return (Criteria) this;
        }

        public Criteria andBmbhNotEqualTo(String value) {
            addCriterion("BMBH <>", value, "bmbh");
            return (Criteria) this;
        }

        public Criteria andBmbhGreaterThan(String value) {
            addCriterion("BMBH >", value, "bmbh");
            return (Criteria) this;
        }

        public Criteria andBmbhGreaterThanOrEqualTo(String value) {
            addCriterion("BMBH >=", value, "bmbh");
            return (Criteria) this;
        }

        public Criteria andBmbhLessThan(String value) {
            addCriterion("BMBH <", value, "bmbh");
            return (Criteria) this;
        }

        public Criteria andBmbhLessThanOrEqualTo(String value) {
            addCriterion("BMBH <=", value, "bmbh");
            return (Criteria) this;
        }

        public Criteria andBmbhLike(String value) {
            addCriterion("BMBH like", value, "bmbh");
            return (Criteria) this;
        }

        public Criteria andBmbhNotLike(String value) {
            addCriterion("BMBH not like", value, "bmbh");
            return (Criteria) this;
        }

        public Criteria andBmbhIn(List<String> values) {
            addCriterion("BMBH in", values, "bmbh");
            return (Criteria) this;
        }

        public Criteria andBmbhNotIn(List<String> values) {
            addCriterion("BMBH not in", values, "bmbh");
            return (Criteria) this;
        }

        public Criteria andBmbhBetween(String value1, String value2) {
            addCriterion("BMBH between", value1, value2, "bmbh");
            return (Criteria) this;
        }

        public Criteria andBmbhNotBetween(String value1, String value2) {
            addCriterion("BMBH not between", value1, value2, "bmbh");
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

        public Criteria andBmmcIsNull() {
            addCriterion("BMMC is null");
            return (Criteria) this;
        }

        public Criteria andBmmcIsNotNull() {
            addCriterion("BMMC is not null");
            return (Criteria) this;
        }

        public Criteria andBmmcEqualTo(String value) {
            addCriterion("BMMC =", value, "bmmc");
            return (Criteria) this;
        }

        public Criteria andBmmcNotEqualTo(String value) {
            addCriterion("BMMC <>", value, "bmmc");
            return (Criteria) this;
        }

        public Criteria andBmmcGreaterThan(String value) {
            addCriterion("BMMC >", value, "bmmc");
            return (Criteria) this;
        }

        public Criteria andBmmcGreaterThanOrEqualTo(String value) {
            addCriterion("BMMC >=", value, "bmmc");
            return (Criteria) this;
        }

        public Criteria andBmmcLessThan(String value) {
            addCriterion("BMMC <", value, "bmmc");
            return (Criteria) this;
        }

        public Criteria andBmmcLessThanOrEqualTo(String value) {
            addCriterion("BMMC <=", value, "bmmc");
            return (Criteria) this;
        }

        public Criteria andBmmcLike(String value) {
            addCriterion("BMMC like", value, "bmmc");
            return (Criteria) this;
        }

        public Criteria andBmmcNotLike(String value) {
            addCriterion("BMMC not like", value, "bmmc");
            return (Criteria) this;
        }

        public Criteria andBmmcIn(List<String> values) {
            addCriterion("BMMC in", values, "bmmc");
            return (Criteria) this;
        }

        public Criteria andBmmcNotIn(List<String> values) {
            addCriterion("BMMC not in", values, "bmmc");
            return (Criteria) this;
        }

        public Criteria andBmmcBetween(String value1, String value2) {
            addCriterion("BMMC between", value1, value2, "bmmc");
            return (Criteria) this;
        }

        public Criteria andBmmcNotBetween(String value1, String value2) {
            addCriterion("BMMC not between", value1, value2, "bmmc");
            return (Criteria) this;
        }

        public Criteria andZfyqIsNull() {
            addCriterion("ZFYQ is null");
            return (Criteria) this;
        }

        public Criteria andZfyqIsNotNull() {
            addCriterion("ZFYQ is not null");
            return (Criteria) this;
        }

        public Criteria andZfyqEqualTo(Double value) {
            addCriterion("ZFYQ =", value, "zfyq");
            return (Criteria) this;
        }

        public Criteria andZfyqNotEqualTo(Double value) {
            addCriterion("ZFYQ <>", value, "zfyq");
            return (Criteria) this;
        }

        public Criteria andZfyqGreaterThan(Double value) {
            addCriterion("ZFYQ >", value, "zfyq");
            return (Criteria) this;
        }

        public Criteria andZfyqGreaterThanOrEqualTo(Double value) {
            addCriterion("ZFYQ >=", value, "zfyq");
            return (Criteria) this;
        }

        public Criteria andZfyqLessThan(Double value) {
            addCriterion("ZFYQ <", value, "zfyq");
            return (Criteria) this;
        }

        public Criteria andZfyqLessThanOrEqualTo(Double value) {
            addCriterion("ZFYQ <=", value, "zfyq");
            return (Criteria) this;
        }

        public Criteria andZfyqIn(List<Double> values) {
            addCriterion("ZFYQ in", values, "zfyq");
            return (Criteria) this;
        }

        public Criteria andZfyqNotIn(List<Double> values) {
            addCriterion("ZFYQ not in", values, "zfyq");
            return (Criteria) this;
        }

        public Criteria andZfyqBetween(Double value1, Double value2) {
            addCriterion("ZFYQ between", value1, value2, "zfyq");
            return (Criteria) this;
        }

        public Criteria andZfyqNotBetween(Double value1, Double value2) {
            addCriterion("ZFYQ not between", value1, value2, "zfyq");
            return (Criteria) this;
        }

        public Criteria andBxxfyqIsNull() {
            addCriterion("BXXFYQ is null");
            return (Criteria) this;
        }

        public Criteria andBxxfyqIsNotNull() {
            addCriterion("BXXFYQ is not null");
            return (Criteria) this;
        }

        public Criteria andBxxfyqEqualTo(Double value) {
            addCriterion("BXXFYQ =", value, "bxxfyq");
            return (Criteria) this;
        }

        public Criteria andBxxfyqNotEqualTo(Double value) {
            addCriterion("BXXFYQ <>", value, "bxxfyq");
            return (Criteria) this;
        }

        public Criteria andBxxfyqGreaterThan(Double value) {
            addCriterion("BXXFYQ >", value, "bxxfyq");
            return (Criteria) this;
        }

        public Criteria andBxxfyqGreaterThanOrEqualTo(Double value) {
            addCriterion("BXXFYQ >=", value, "bxxfyq");
            return (Criteria) this;
        }

        public Criteria andBxxfyqLessThan(Double value) {
            addCriterion("BXXFYQ <", value, "bxxfyq");
            return (Criteria) this;
        }

        public Criteria andBxxfyqLessThanOrEqualTo(Double value) {
            addCriterion("BXXFYQ <=", value, "bxxfyq");
            return (Criteria) this;
        }

        public Criteria andBxxfyqIn(List<Double> values) {
            addCriterion("BXXFYQ in", values, "bxxfyq");
            return (Criteria) this;
        }

        public Criteria andBxxfyqNotIn(List<Double> values) {
            addCriterion("BXXFYQ not in", values, "bxxfyq");
            return (Criteria) this;
        }

        public Criteria andBxxfyqBetween(Double value1, Double value2) {
            addCriterion("BXXFYQ between", value1, value2, "bxxfyq");
            return (Criteria) this;
        }

        public Criteria andBxxfyqNotBetween(Double value1, Double value2) {
            addCriterion("BXXFYQ not between", value1, value2, "bxxfyq");
            return (Criteria) this;
        }

        public Criteria andXxxfyqIsNull() {
            addCriterion("XXXFYQ is null");
            return (Criteria) this;
        }

        public Criteria andXxxfyqIsNotNull() {
            addCriterion("XXXFYQ is not null");
            return (Criteria) this;
        }

        public Criteria andXxxfyqEqualTo(Double value) {
            addCriterion("XXXFYQ =", value, "xxxfyq");
            return (Criteria) this;
        }

        public Criteria andXxxfyqNotEqualTo(Double value) {
            addCriterion("XXXFYQ <>", value, "xxxfyq");
            return (Criteria) this;
        }

        public Criteria andXxxfyqGreaterThan(Double value) {
            addCriterion("XXXFYQ >", value, "xxxfyq");
            return (Criteria) this;
        }

        public Criteria andXxxfyqGreaterThanOrEqualTo(Double value) {
            addCriterion("XXXFYQ >=", value, "xxxfyq");
            return (Criteria) this;
        }

        public Criteria andXxxfyqLessThan(Double value) {
            addCriterion("XXXFYQ <", value, "xxxfyq");
            return (Criteria) this;
        }

        public Criteria andXxxfyqLessThanOrEqualTo(Double value) {
            addCriterion("XXXFYQ <=", value, "xxxfyq");
            return (Criteria) this;
        }

        public Criteria andXxxfyqIn(List<Double> values) {
            addCriterion("XXXFYQ in", values, "xxxfyq");
            return (Criteria) this;
        }

        public Criteria andXxxfyqNotIn(List<Double> values) {
            addCriterion("XXXFYQ not in", values, "xxxfyq");
            return (Criteria) this;
        }

        public Criteria andXxxfyqBetween(Double value1, Double value2) {
            addCriterion("XXXFYQ between", value1, value2, "xxxfyq");
            return (Criteria) this;
        }

        public Criteria andXxxfyqNotBetween(Double value1, Double value2) {
            addCriterion("XXXFYQ not between", value1, value2, "xxxfyq");
            return (Criteria) this;
        }

        public Criteria andBxzd1IsNull() {
            addCriterion("BXZD1 is null");
            return (Criteria) this;
        }

        public Criteria andBxzd1IsNotNull() {
            addCriterion("BXZD1 is not null");
            return (Criteria) this;
        }

        public Criteria andBxzd1EqualTo(String value) {
            addCriterion("BXZD1 =", value, "bxzd1");
            return (Criteria) this;
        }

        public Criteria andBxzd1NotEqualTo(String value) {
            addCriterion("BXZD1 <>", value, "bxzd1");
            return (Criteria) this;
        }

        public Criteria andBxzd1GreaterThan(String value) {
            addCriterion("BXZD1 >", value, "bxzd1");
            return (Criteria) this;
        }

        public Criteria andBxzd1GreaterThanOrEqualTo(String value) {
            addCriterion("BXZD1 >=", value, "bxzd1");
            return (Criteria) this;
        }

        public Criteria andBxzd1LessThan(String value) {
            addCriterion("BXZD1 <", value, "bxzd1");
            return (Criteria) this;
        }

        public Criteria andBxzd1LessThanOrEqualTo(String value) {
            addCriterion("BXZD1 <=", value, "bxzd1");
            return (Criteria) this;
        }

        public Criteria andBxzd1Like(String value) {
            addCriterion("BXZD1 like", value, "bxzd1");
            return (Criteria) this;
        }

        public Criteria andBxzd1NotLike(String value) {
            addCriterion("BXZD1 not like", value, "bxzd1");
            return (Criteria) this;
        }

        public Criteria andBxzd1In(List<String> values) {
            addCriterion("BXZD1 in", values, "bxzd1");
            return (Criteria) this;
        }

        public Criteria andBxzd1NotIn(List<String> values) {
            addCriterion("BXZD1 not in", values, "bxzd1");
            return (Criteria) this;
        }

        public Criteria andBxzd1Between(String value1, String value2) {
            addCriterion("BXZD1 between", value1, value2, "bxzd1");
            return (Criteria) this;
        }

        public Criteria andBxzd1NotBetween(String value1, String value2) {
            addCriterion("BXZD1 not between", value1, value2, "bxzd1");
            return (Criteria) this;
        }

        public Criteria andBxzd2IsNull() {
            addCriterion("BXZD2 is null");
            return (Criteria) this;
        }

        public Criteria andBxzd2IsNotNull() {
            addCriterion("BXZD2 is not null");
            return (Criteria) this;
        }

        public Criteria andBxzd2EqualTo(String value) {
            addCriterion("BXZD2 =", value, "bxzd2");
            return (Criteria) this;
        }

        public Criteria andBxzd2NotEqualTo(String value) {
            addCriterion("BXZD2 <>", value, "bxzd2");
            return (Criteria) this;
        }

        public Criteria andBxzd2GreaterThan(String value) {
            addCriterion("BXZD2 >", value, "bxzd2");
            return (Criteria) this;
        }

        public Criteria andBxzd2GreaterThanOrEqualTo(String value) {
            addCriterion("BXZD2 >=", value, "bxzd2");
            return (Criteria) this;
        }

        public Criteria andBxzd2LessThan(String value) {
            addCriterion("BXZD2 <", value, "bxzd2");
            return (Criteria) this;
        }

        public Criteria andBxzd2LessThanOrEqualTo(String value) {
            addCriterion("BXZD2 <=", value, "bxzd2");
            return (Criteria) this;
        }

        public Criteria andBxzd2Like(String value) {
            addCriterion("BXZD2 like", value, "bxzd2");
            return (Criteria) this;
        }

        public Criteria andBxzd2NotLike(String value) {
            addCriterion("BXZD2 not like", value, "bxzd2");
            return (Criteria) this;
        }

        public Criteria andBxzd2In(List<String> values) {
            addCriterion("BXZD2 in", values, "bxzd2");
            return (Criteria) this;
        }

        public Criteria andBxzd2NotIn(List<String> values) {
            addCriterion("BXZD2 not in", values, "bxzd2");
            return (Criteria) this;
        }

        public Criteria andBxzd2Between(String value1, String value2) {
            addCriterion("BXZD2 between", value1, value2, "bxzd2");
            return (Criteria) this;
        }

        public Criteria andBxzd2NotBetween(String value1, String value2) {
            addCriterion("BXZD2 not between", value1, value2, "bxzd2");
            return (Criteria) this;
        }

        public Criteria andBxzd3IsNull() {
            addCriterion("BXZD3 is null");
            return (Criteria) this;
        }

        public Criteria andBxzd3IsNotNull() {
            addCriterion("BXZD3 is not null");
            return (Criteria) this;
        }

        public Criteria andBxzd3EqualTo(String value) {
            addCriterion("BXZD3 =", value, "bxzd3");
            return (Criteria) this;
        }

        public Criteria andBxzd3NotEqualTo(String value) {
            addCriterion("BXZD3 <>", value, "bxzd3");
            return (Criteria) this;
        }

        public Criteria andBxzd3GreaterThan(String value) {
            addCriterion("BXZD3 >", value, "bxzd3");
            return (Criteria) this;
        }

        public Criteria andBxzd3GreaterThanOrEqualTo(String value) {
            addCriterion("BXZD3 >=", value, "bxzd3");
            return (Criteria) this;
        }

        public Criteria andBxzd3LessThan(String value) {
            addCriterion("BXZD3 <", value, "bxzd3");
            return (Criteria) this;
        }

        public Criteria andBxzd3LessThanOrEqualTo(String value) {
            addCriterion("BXZD3 <=", value, "bxzd3");
            return (Criteria) this;
        }

        public Criteria andBxzd3Like(String value) {
            addCriterion("BXZD3 like", value, "bxzd3");
            return (Criteria) this;
        }

        public Criteria andBxzd3NotLike(String value) {
            addCriterion("BXZD3 not like", value, "bxzd3");
            return (Criteria) this;
        }

        public Criteria andBxzd3In(List<String> values) {
            addCriterion("BXZD3 in", values, "bxzd3");
            return (Criteria) this;
        }

        public Criteria andBxzd3NotIn(List<String> values) {
            addCriterion("BXZD3 not in", values, "bxzd3");
            return (Criteria) this;
        }

        public Criteria andBxzd3Between(String value1, String value2) {
            addCriterion("BXZD3 between", value1, value2, "bxzd3");
            return (Criteria) this;
        }

        public Criteria andBxzd3NotBetween(String value1, String value2) {
            addCriterion("BXZD3 not between", value1, value2, "bxzd3");
            return (Criteria) this;
        }

        public Criteria andBxzd4IsNull() {
            addCriterion("BXZD4 is null");
            return (Criteria) this;
        }

        public Criteria andBxzd4IsNotNull() {
            addCriterion("BXZD4 is not null");
            return (Criteria) this;
        }

        public Criteria andBxzd4EqualTo(String value) {
            addCriterion("BXZD4 =", value, "bxzd4");
            return (Criteria) this;
        }

        public Criteria andBxzd4NotEqualTo(String value) {
            addCriterion("BXZD4 <>", value, "bxzd4");
            return (Criteria) this;
        }

        public Criteria andBxzd4GreaterThan(String value) {
            addCriterion("BXZD4 >", value, "bxzd4");
            return (Criteria) this;
        }

        public Criteria andBxzd4GreaterThanOrEqualTo(String value) {
            addCriterion("BXZD4 >=", value, "bxzd4");
            return (Criteria) this;
        }

        public Criteria andBxzd4LessThan(String value) {
            addCriterion("BXZD4 <", value, "bxzd4");
            return (Criteria) this;
        }

        public Criteria andBxzd4LessThanOrEqualTo(String value) {
            addCriterion("BXZD4 <=", value, "bxzd4");
            return (Criteria) this;
        }

        public Criteria andBxzd4Like(String value) {
            addCriterion("BXZD4 like", value, "bxzd4");
            return (Criteria) this;
        }

        public Criteria andBxzd4NotLike(String value) {
            addCriterion("BXZD4 not like", value, "bxzd4");
            return (Criteria) this;
        }

        public Criteria andBxzd4In(List<String> values) {
            addCriterion("BXZD4 in", values, "bxzd4");
            return (Criteria) this;
        }

        public Criteria andBxzd4NotIn(List<String> values) {
            addCriterion("BXZD4 not in", values, "bxzd4");
            return (Criteria) this;
        }

        public Criteria andBxzd4Between(String value1, String value2) {
            addCriterion("BXZD4 between", value1, value2, "bxzd4");
            return (Criteria) this;
        }

        public Criteria andBxzd4NotBetween(String value1, String value2) {
            addCriterion("BXZD4 not between", value1, value2, "bxzd4");
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