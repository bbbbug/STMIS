package app.core.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReviewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReviewExample() {
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

        public Criteria andYgzhIsNull() {
            addCriterion("YGZH is null");
            return (Criteria) this;
        }

        public Criteria andYgzhIsNotNull() {
            addCriterion("YGZH is not null");
            return (Criteria) this;
        }

        public Criteria andYgzhEqualTo(String value) {
            addCriterion("YGZH =", value, "ygzh");
            return (Criteria) this;
        }

        public Criteria andYgzhNotEqualTo(String value) {
            addCriterion("YGZH <>", value, "ygzh");
            return (Criteria) this;
        }

        public Criteria andYgzhGreaterThan(String value) {
            addCriterion("YGZH >", value, "ygzh");
            return (Criteria) this;
        }

        public Criteria andYgzhGreaterThanOrEqualTo(String value) {
            addCriterion("YGZH >=", value, "ygzh");
            return (Criteria) this;
        }

        public Criteria andYgzhLessThan(String value) {
            addCriterion("YGZH <", value, "ygzh");
            return (Criteria) this;
        }

        public Criteria andYgzhLessThanOrEqualTo(String value) {
            addCriterion("YGZH <=", value, "ygzh");
            return (Criteria) this;
        }

        public Criteria andYgzhLike(String value) {
            addCriterion("YGZH like", value, "ygzh");
            return (Criteria) this;
        }

        public Criteria andYgzhNotLike(String value) {
            addCriterion("YGZH not like", value, "ygzh");
            return (Criteria) this;
        }

        public Criteria andYgzhIn(List<String> values) {
            addCriterion("YGZH in", values, "ygzh");
            return (Criteria) this;
        }

        public Criteria andYgzhNotIn(List<String> values) {
            addCriterion("YGZH not in", values, "ygzh");
            return (Criteria) this;
        }

        public Criteria andYgzhBetween(String value1, String value2) {
            addCriterion("YGZH between", value1, value2, "ygzh");
            return (Criteria) this;
        }

        public Criteria andYgzhNotBetween(String value1, String value2) {
            addCriterion("YGZH not between", value1, value2, "ygzh");
            return (Criteria) this;
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

        public Criteria andPlnrIsNull() {
            addCriterion("PLNR is null");
            return (Criteria) this;
        }

        public Criteria andPlnrIsNotNull() {
            addCriterion("PLNR is not null");
            return (Criteria) this;
        }

        public Criteria andPlnrEqualTo(String value) {
            addCriterion("PLNR =", value, "plnr");
            return (Criteria) this;
        }

        public Criteria andPlnrNotEqualTo(String value) {
            addCriterion("PLNR <>", value, "plnr");
            return (Criteria) this;
        }

        public Criteria andPlnrGreaterThan(String value) {
            addCriterion("PLNR >", value, "plnr");
            return (Criteria) this;
        }

        public Criteria andPlnrGreaterThanOrEqualTo(String value) {
            addCriterion("PLNR >=", value, "plnr");
            return (Criteria) this;
        }

        public Criteria andPlnrLessThan(String value) {
            addCriterion("PLNR <", value, "plnr");
            return (Criteria) this;
        }

        public Criteria andPlnrLessThanOrEqualTo(String value) {
            addCriterion("PLNR <=", value, "plnr");
            return (Criteria) this;
        }

        public Criteria andPlnrLike(String value) {
            addCriterion("PLNR like", value, "plnr");
            return (Criteria) this;
        }

        public Criteria andPlnrNotLike(String value) {
            addCriterion("PLNR not like", value, "plnr");
            return (Criteria) this;
        }

        public Criteria andPlnrIn(List<String> values) {
            addCriterion("PLNR in", values, "plnr");
            return (Criteria) this;
        }

        public Criteria andPlnrNotIn(List<String> values) {
            addCriterion("PLNR not in", values, "plnr");
            return (Criteria) this;
        }

        public Criteria andPlnrBetween(String value1, String value2) {
            addCriterion("PLNR between", value1, value2, "plnr");
            return (Criteria) this;
        }

        public Criteria andPlnrNotBetween(String value1, String value2) {
            addCriterion("PLNR not between", value1, value2, "plnr");
            return (Criteria) this;
        }

        public Criteria andPlsjIsNull() {
            addCriterion("PLSJ is null");
            return (Criteria) this;
        }

        public Criteria andPlsjIsNotNull() {
            addCriterion("PLSJ is not null");
            return (Criteria) this;
        }

        public Criteria andPlsjEqualTo(Date value) {
            addCriterion("PLSJ =", value, "plsj");
            return (Criteria) this;
        }

        public Criteria andPlsjNotEqualTo(Date value) {
            addCriterion("PLSJ <>", value, "plsj");
            return (Criteria) this;
        }

        public Criteria andPlsjGreaterThan(Date value) {
            addCriterion("PLSJ >", value, "plsj");
            return (Criteria) this;
        }

        public Criteria andPlsjGreaterThanOrEqualTo(Date value) {
            addCriterion("PLSJ >=", value, "plsj");
            return (Criteria) this;
        }

        public Criteria andPlsjLessThan(Date value) {
            addCriterion("PLSJ <", value, "plsj");
            return (Criteria) this;
        }

        public Criteria andPlsjLessThanOrEqualTo(Date value) {
            addCriterion("PLSJ <=", value, "plsj");
            return (Criteria) this;
        }

        public Criteria andPlsjIn(List<Date> values) {
            addCriterion("PLSJ in", values, "plsj");
            return (Criteria) this;
        }

        public Criteria andPlsjNotIn(List<Date> values) {
            addCriterion("PLSJ not in", values, "plsj");
            return (Criteria) this;
        }

        public Criteria andPlsjBetween(Date value1, Date value2) {
            addCriterion("PLSJ between", value1, value2, "plsj");
            return (Criteria) this;
        }

        public Criteria andPlsjNotBetween(Date value1, Date value2) {
            addCriterion("PLSJ not between", value1, value2, "plsj");
            return (Criteria) this;
        }

        public Criteria andPllllIsNull() {
            addCriterion("PLLLL is null");
            return (Criteria) this;
        }

        public Criteria andPllllIsNotNull() {
            addCriterion("PLLLL is not null");
            return (Criteria) this;
        }

        public Criteria andPllllEqualTo(Integer value) {
            addCriterion("PLLLL =", value, "pllll");
            return (Criteria) this;
        }

        public Criteria andPllllNotEqualTo(Integer value) {
            addCriterion("PLLLL <>", value, "pllll");
            return (Criteria) this;
        }

        public Criteria andPllllGreaterThan(Integer value) {
            addCriterion("PLLLL >", value, "pllll");
            return (Criteria) this;
        }

        public Criteria andPllllGreaterThanOrEqualTo(Integer value) {
            addCriterion("PLLLL >=", value, "pllll");
            return (Criteria) this;
        }

        public Criteria andPllllLessThan(Integer value) {
            addCriterion("PLLLL <", value, "pllll");
            return (Criteria) this;
        }

        public Criteria andPllllLessThanOrEqualTo(Integer value) {
            addCriterion("PLLLL <=", value, "pllll");
            return (Criteria) this;
        }

        public Criteria andPllllIn(List<Integer> values) {
            addCriterion("PLLLL in", values, "pllll");
            return (Criteria) this;
        }

        public Criteria andPllllNotIn(List<Integer> values) {
            addCriterion("PLLLL not in", values, "pllll");
            return (Criteria) this;
        }

        public Criteria andPllllBetween(Integer value1, Integer value2) {
            addCriterion("PLLLL between", value1, value2, "pllll");
            return (Criteria) this;
        }

        public Criteria andPllllNotBetween(Integer value1, Integer value2) {
            addCriterion("PLLLL not between", value1, value2, "pllll");
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