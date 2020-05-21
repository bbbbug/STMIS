package app.core.po;

import java.util.ArrayList;
import java.util.List;

public class CompetitionentryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompetitionentryExample() {
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

        public Criteria andJsbhIsNull() {
            addCriterion("JSBH is null");
            return (Criteria) this;
        }

        public Criteria andJsbhIsNotNull() {
            addCriterion("JSBH is not null");
            return (Criteria) this;
        }

        public Criteria andJsbhEqualTo(Integer value) {
            addCriterion("JSBH =", value, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsbhNotEqualTo(Integer value) {
            addCriterion("JSBH <>", value, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsbhGreaterThan(Integer value) {
            addCriterion("JSBH >", value, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsbhGreaterThanOrEqualTo(Integer value) {
            addCriterion("JSBH >=", value, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsbhLessThan(Integer value) {
            addCriterion("JSBH <", value, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsbhLessThanOrEqualTo(Integer value) {
            addCriterion("JSBH <=", value, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsbhIn(List<Integer> values) {
            addCriterion("JSBH in", values, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsbhNotIn(List<Integer> values) {
            addCriterion("JSBH not in", values, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsbhBetween(Integer value1, Integer value2) {
            addCriterion("JSBH between", value1, value2, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsbhNotBetween(Integer value1, Integer value2) {
            addCriterion("JSBH not between", value1, value2, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsztIsNull() {
            addCriterion("JSZT is null");
            return (Criteria) this;
        }

        public Criteria andJsztIsNotNull() {
            addCriterion("JSZT is not null");
            return (Criteria) this;
        }

        public Criteria andJsztEqualTo(String value) {
            addCriterion("JSZT =", value, "jszt");
            return (Criteria) this;
        }

        public Criteria andJsztNotEqualTo(String value) {
            addCriterion("JSZT <>", value, "jszt");
            return (Criteria) this;
        }

        public Criteria andJsztGreaterThan(String value) {
            addCriterion("JSZT >", value, "jszt");
            return (Criteria) this;
        }

        public Criteria andJsztGreaterThanOrEqualTo(String value) {
            addCriterion("JSZT >=", value, "jszt");
            return (Criteria) this;
        }

        public Criteria andJsztLessThan(String value) {
            addCriterion("JSZT <", value, "jszt");
            return (Criteria) this;
        }

        public Criteria andJsztLessThanOrEqualTo(String value) {
            addCriterion("JSZT <=", value, "jszt");
            return (Criteria) this;
        }

        public Criteria andJsztLike(String value) {
            addCriterion("JSZT like", value, "jszt");
            return (Criteria) this;
        }

        public Criteria andJsztNotLike(String value) {
            addCriterion("JSZT not like", value, "jszt");
            return (Criteria) this;
        }

        public Criteria andJsztIn(List<String> values) {
            addCriterion("JSZT in", values, "jszt");
            return (Criteria) this;
        }

        public Criteria andJsztNotIn(List<String> values) {
            addCriterion("JSZT not in", values, "jszt");
            return (Criteria) this;
        }

        public Criteria andJsztBetween(String value1, String value2) {
            addCriterion("JSZT between", value1, value2, "jszt");
            return (Criteria) this;
        }

        public Criteria andJsztNotBetween(String value1, String value2) {
            addCriterion("JSZT not between", value1, value2, "jszt");
            return (Criteria) this;
        }

        public Criteria andBmygzhIsNull() {
            addCriterion("BMYGZH is null");
            return (Criteria) this;
        }

        public Criteria andBmygzhIsNotNull() {
            addCriterion("BMYGZH is not null");
            return (Criteria) this;
        }

        public Criteria andBmygzhEqualTo(String value) {
            addCriterion("BMYGZH =", value, "bmygzh");
            return (Criteria) this;
        }

        public Criteria andBmygzhNotEqualTo(String value) {
            addCriterion("BMYGZH <>", value, "bmygzh");
            return (Criteria) this;
        }

        public Criteria andBmygzhGreaterThan(String value) {
            addCriterion("BMYGZH >", value, "bmygzh");
            return (Criteria) this;
        }

        public Criteria andBmygzhGreaterThanOrEqualTo(String value) {
            addCriterion("BMYGZH >=", value, "bmygzh");
            return (Criteria) this;
        }

        public Criteria andBmygzhLessThan(String value) {
            addCriterion("BMYGZH <", value, "bmygzh");
            return (Criteria) this;
        }

        public Criteria andBmygzhLessThanOrEqualTo(String value) {
            addCriterion("BMYGZH <=", value, "bmygzh");
            return (Criteria) this;
        }

        public Criteria andBmygzhLike(String value) {
            addCriterion("BMYGZH like", value, "bmygzh");
            return (Criteria) this;
        }

        public Criteria andBmygzhNotLike(String value) {
            addCriterion("BMYGZH not like", value, "bmygzh");
            return (Criteria) this;
        }

        public Criteria andBmygzhIn(List<String> values) {
            addCriterion("BMYGZH in", values, "bmygzh");
            return (Criteria) this;
        }

        public Criteria andBmygzhNotIn(List<String> values) {
            addCriterion("BMYGZH not in", values, "bmygzh");
            return (Criteria) this;
        }

        public Criteria andBmygzhBetween(String value1, String value2) {
            addCriterion("BMYGZH between", value1, value2, "bmygzh");
            return (Criteria) this;
        }

        public Criteria andBmygzhNotBetween(String value1, String value2) {
            addCriterion("BMYGZH not between", value1, value2, "bmygzh");
            return (Criteria) this;
        }

        public Criteria andZdlsIsNull() {
            addCriterion("ZDLS is null");
            return (Criteria) this;
        }

        public Criteria andZdlsIsNotNull() {
            addCriterion("ZDLS is not null");
            return (Criteria) this;
        }

        public Criteria andZdlsEqualTo(String value) {
            addCriterion("ZDLS =", value, "zdls");
            return (Criteria) this;
        }

        public Criteria andZdlsNotEqualTo(String value) {
            addCriterion("ZDLS <>", value, "zdls");
            return (Criteria) this;
        }

        public Criteria andZdlsGreaterThan(String value) {
            addCriterion("ZDLS >", value, "zdls");
            return (Criteria) this;
        }

        public Criteria andZdlsGreaterThanOrEqualTo(String value) {
            addCriterion("ZDLS >=", value, "zdls");
            return (Criteria) this;
        }

        public Criteria andZdlsLessThan(String value) {
            addCriterion("ZDLS <", value, "zdls");
            return (Criteria) this;
        }

        public Criteria andZdlsLessThanOrEqualTo(String value) {
            addCriterion("ZDLS <=", value, "zdls");
            return (Criteria) this;
        }

        public Criteria andZdlsLike(String value) {
            addCriterion("ZDLS like", value, "zdls");
            return (Criteria) this;
        }

        public Criteria andZdlsNotLike(String value) {
            addCriterion("ZDLS not like", value, "zdls");
            return (Criteria) this;
        }

        public Criteria andZdlsIn(List<String> values) {
            addCriterion("ZDLS in", values, "zdls");
            return (Criteria) this;
        }

        public Criteria andZdlsNotIn(List<String> values) {
            addCriterion("ZDLS not in", values, "zdls");
            return (Criteria) this;
        }

        public Criteria andZdlsBetween(String value1, String value2) {
            addCriterion("ZDLS between", value1, value2, "zdls");
            return (Criteria) this;
        }

        public Criteria andZdlsNotBetween(String value1, String value2) {
            addCriterion("ZDLS not between", value1, value2, "zdls");
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