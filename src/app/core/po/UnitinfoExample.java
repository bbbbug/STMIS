package app.core.po;

import java.util.ArrayList;
import java.util.List;

public class UnitinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UnitinfoExample() {
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

        public Criteria andDwbhIsNull() {
            addCriterion("DWBH is null");
            return (Criteria) this;
        }

        public Criteria andDwbhIsNotNull() {
            addCriterion("DWBH is not null");
            return (Criteria) this;
        }

        public Criteria andDwbhEqualTo(String value) {
            addCriterion("DWBH =", value, "dwbh");
            return (Criteria) this;
        }

        public Criteria andDwbhNotEqualTo(String value) {
            addCriterion("DWBH <>", value, "dwbh");
            return (Criteria) this;
        }

        public Criteria andDwbhGreaterThan(String value) {
            addCriterion("DWBH >", value, "dwbh");
            return (Criteria) this;
        }

        public Criteria andDwbhGreaterThanOrEqualTo(String value) {
            addCriterion("DWBH >=", value, "dwbh");
            return (Criteria) this;
        }

        public Criteria andDwbhLessThan(String value) {
            addCriterion("DWBH <", value, "dwbh");
            return (Criteria) this;
        }

        public Criteria andDwbhLessThanOrEqualTo(String value) {
            addCriterion("DWBH <=", value, "dwbh");
            return (Criteria) this;
        }

        public Criteria andDwbhLike(String value) {
            addCriterion("DWBH like", value, "dwbh");
            return (Criteria) this;
        }

        public Criteria andDwbhNotLike(String value) {
            addCriterion("DWBH not like", value, "dwbh");
            return (Criteria) this;
        }

        public Criteria andDwbhIn(List<String> values) {
            addCriterion("DWBH in", values, "dwbh");
            return (Criteria) this;
        }

        public Criteria andDwbhNotIn(List<String> values) {
            addCriterion("DWBH not in", values, "dwbh");
            return (Criteria) this;
        }

        public Criteria andDwbhBetween(String value1, String value2) {
            addCriterion("DWBH between", value1, value2, "dwbh");
            return (Criteria) this;
        }

        public Criteria andDwbhNotBetween(String value1, String value2) {
            addCriterion("DWBH not between", value1, value2, "dwbh");
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

        public Criteria andDwmcIsNull() {
            addCriterion("DWMC is null");
            return (Criteria) this;
        }

        public Criteria andDwmcIsNotNull() {
            addCriterion("DWMC is not null");
            return (Criteria) this;
        }

        public Criteria andDwmcEqualTo(String value) {
            addCriterion("DWMC =", value, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcNotEqualTo(String value) {
            addCriterion("DWMC <>", value, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcGreaterThan(String value) {
            addCriterion("DWMC >", value, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcGreaterThanOrEqualTo(String value) {
            addCriterion("DWMC >=", value, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcLessThan(String value) {
            addCriterion("DWMC <", value, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcLessThanOrEqualTo(String value) {
            addCriterion("DWMC <=", value, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcLike(String value) {
            addCriterion("DWMC like", value, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcNotLike(String value) {
            addCriterion("DWMC not like", value, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcIn(List<String> values) {
            addCriterion("DWMC in", values, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcNotIn(List<String> values) {
            addCriterion("DWMC not in", values, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcBetween(String value1, String value2) {
            addCriterion("DWMC between", value1, value2, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcNotBetween(String value1, String value2) {
            addCriterion("DWMC not between", value1, value2, "dwmc");
            return (Criteria) this;
        }

        public Criteria andHyIsNull() {
            addCriterion("HY is null");
            return (Criteria) this;
        }

        public Criteria andHyIsNotNull() {
            addCriterion("HY is not null");
            return (Criteria) this;
        }

        public Criteria andHyEqualTo(String value) {
            addCriterion("HY =", value, "hy");
            return (Criteria) this;
        }

        public Criteria andHyNotEqualTo(String value) {
            addCriterion("HY <>", value, "hy");
            return (Criteria) this;
        }

        public Criteria andHyGreaterThan(String value) {
            addCriterion("HY >", value, "hy");
            return (Criteria) this;
        }

        public Criteria andHyGreaterThanOrEqualTo(String value) {
            addCriterion("HY >=", value, "hy");
            return (Criteria) this;
        }

        public Criteria andHyLessThan(String value) {
            addCriterion("HY <", value, "hy");
            return (Criteria) this;
        }

        public Criteria andHyLessThanOrEqualTo(String value) {
            addCriterion("HY <=", value, "hy");
            return (Criteria) this;
        }

        public Criteria andHyLike(String value) {
            addCriterion("HY like", value, "hy");
            return (Criteria) this;
        }

        public Criteria andHyNotLike(String value) {
            addCriterion("HY not like", value, "hy");
            return (Criteria) this;
        }

        public Criteria andHyIn(List<String> values) {
            addCriterion("HY in", values, "hy");
            return (Criteria) this;
        }

        public Criteria andHyNotIn(List<String> values) {
            addCriterion("HY not in", values, "hy");
            return (Criteria) this;
        }

        public Criteria andHyBetween(String value1, String value2) {
            addCriterion("HY between", value1, value2, "hy");
            return (Criteria) this;
        }

        public Criteria andHyNotBetween(String value1, String value2) {
            addCriterion("HY not between", value1, value2, "hy");
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