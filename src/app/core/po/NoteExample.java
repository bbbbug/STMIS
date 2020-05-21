package app.core.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NoteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NoteExample() {
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

        public Criteria andZjxhIsNull() {
            addCriterion("ZJXH is null");
            return (Criteria) this;
        }

        public Criteria andZjxhIsNotNull() {
            addCriterion("ZJXH is not null");
            return (Criteria) this;
        }

        public Criteria andZjxhEqualTo(Integer value) {
            addCriterion("ZJXH =", value, "zjxh");
            return (Criteria) this;
        }

        public Criteria andZjxhNotEqualTo(Integer value) {
            addCriterion("ZJXH <>", value, "zjxh");
            return (Criteria) this;
        }

        public Criteria andZjxhGreaterThan(Integer value) {
            addCriterion("ZJXH >", value, "zjxh");
            return (Criteria) this;
        }

        public Criteria andZjxhGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZJXH >=", value, "zjxh");
            return (Criteria) this;
        }

        public Criteria andZjxhLessThan(Integer value) {
            addCriterion("ZJXH <", value, "zjxh");
            return (Criteria) this;
        }

        public Criteria andZjxhLessThanOrEqualTo(Integer value) {
            addCriterion("ZJXH <=", value, "zjxh");
            return (Criteria) this;
        }

        public Criteria andZjxhIn(List<Integer> values) {
            addCriterion("ZJXH in", values, "zjxh");
            return (Criteria) this;
        }

        public Criteria andZjxhNotIn(List<Integer> values) {
            addCriterion("ZJXH not in", values, "zjxh");
            return (Criteria) this;
        }

        public Criteria andZjxhBetween(Integer value1, Integer value2) {
            addCriterion("ZJXH between", value1, value2, "zjxh");
            return (Criteria) this;
        }

        public Criteria andZjxhNotBetween(Integer value1, Integer value2) {
            addCriterion("ZJXH not between", value1, value2, "zjxh");
            return (Criteria) this;
        }

        public Criteria andBjnrIsNull() {
            addCriterion("BJNR is null");
            return (Criteria) this;
        }

        public Criteria andBjnrIsNotNull() {
            addCriterion("BJNR is not null");
            return (Criteria) this;
        }

        public Criteria andBjnrEqualTo(String value) {
            addCriterion("BJNR =", value, "bjnr");
            return (Criteria) this;
        }

        public Criteria andBjnrNotEqualTo(String value) {
            addCriterion("BJNR <>", value, "bjnr");
            return (Criteria) this;
        }

        public Criteria andBjnrGreaterThan(String value) {
            addCriterion("BJNR >", value, "bjnr");
            return (Criteria) this;
        }

        public Criteria andBjnrGreaterThanOrEqualTo(String value) {
            addCriterion("BJNR >=", value, "bjnr");
            return (Criteria) this;
        }

        public Criteria andBjnrLessThan(String value) {
            addCriterion("BJNR <", value, "bjnr");
            return (Criteria) this;
        }

        public Criteria andBjnrLessThanOrEqualTo(String value) {
            addCriterion("BJNR <=", value, "bjnr");
            return (Criteria) this;
        }

        public Criteria andBjnrLike(String value) {
            addCriterion("BJNR like", value, "bjnr");
            return (Criteria) this;
        }

        public Criteria andBjnrNotLike(String value) {
            addCriterion("BJNR not like", value, "bjnr");
            return (Criteria) this;
        }

        public Criteria andBjnrIn(List<String> values) {
            addCriterion("BJNR in", values, "bjnr");
            return (Criteria) this;
        }

        public Criteria andBjnrNotIn(List<String> values) {
            addCriterion("BJNR not in", values, "bjnr");
            return (Criteria) this;
        }

        public Criteria andBjnrBetween(String value1, String value2) {
            addCriterion("BJNR between", value1, value2, "bjnr");
            return (Criteria) this;
        }

        public Criteria andBjnrNotBetween(String value1, String value2) {
            addCriterion("BJNR not between", value1, value2, "bjnr");
            return (Criteria) this;
        }

        public Criteria andBjsjIsNull() {
            addCriterion("BJSJ is null");
            return (Criteria) this;
        }

        public Criteria andBjsjIsNotNull() {
            addCriterion("BJSJ is not null");
            return (Criteria) this;
        }

        public Criteria andBjsjEqualTo(Date value) {
            addCriterion("BJSJ =", value, "bjsj");
            return (Criteria) this;
        }

        public Criteria andBjsjNotEqualTo(Date value) {
            addCriterion("BJSJ <>", value, "bjsj");
            return (Criteria) this;
        }

        public Criteria andBjsjGreaterThan(Date value) {
            addCriterion("BJSJ >", value, "bjsj");
            return (Criteria) this;
        }

        public Criteria andBjsjGreaterThanOrEqualTo(Date value) {
            addCriterion("BJSJ >=", value, "bjsj");
            return (Criteria) this;
        }

        public Criteria andBjsjLessThan(Date value) {
            addCriterion("BJSJ <", value, "bjsj");
            return (Criteria) this;
        }

        public Criteria andBjsjLessThanOrEqualTo(Date value) {
            addCriterion("BJSJ <=", value, "bjsj");
            return (Criteria) this;
        }

        public Criteria andBjsjIn(List<Date> values) {
            addCriterion("BJSJ in", values, "bjsj");
            return (Criteria) this;
        }

        public Criteria andBjsjNotIn(List<Date> values) {
            addCriterion("BJSJ not in", values, "bjsj");
            return (Criteria) this;
        }

        public Criteria andBjsjBetween(Date value1, Date value2) {
            addCriterion("BJSJ between", value1, value2, "bjsj");
            return (Criteria) this;
        }

        public Criteria andBjsjNotBetween(Date value1, Date value2) {
            addCriterion("BJSJ not between", value1, value2, "bjsj");
            return (Criteria) this;
        }

        public Criteria andBjztIsNull() {
            addCriterion("BJZT is null");
            return (Criteria) this;
        }

        public Criteria andBjztIsNotNull() {
            addCriterion("BJZT is not null");
            return (Criteria) this;
        }

        public Criteria andBjztEqualTo(Integer value) {
            addCriterion("BJZT =", value, "bjzt");
            return (Criteria) this;
        }

        public Criteria andBjztNotEqualTo(Integer value) {
            addCriterion("BJZT <>", value, "bjzt");
            return (Criteria) this;
        }

        public Criteria andBjztGreaterThan(Integer value) {
            addCriterion("BJZT >", value, "bjzt");
            return (Criteria) this;
        }

        public Criteria andBjztGreaterThanOrEqualTo(Integer value) {
            addCriterion("BJZT >=", value, "bjzt");
            return (Criteria) this;
        }

        public Criteria andBjztLessThan(Integer value) {
            addCriterion("BJZT <", value, "bjzt");
            return (Criteria) this;
        }

        public Criteria andBjztLessThanOrEqualTo(Integer value) {
            addCriterion("BJZT <=", value, "bjzt");
            return (Criteria) this;
        }

        public Criteria andBjztIn(List<Integer> values) {
            addCriterion("BJZT in", values, "bjzt");
            return (Criteria) this;
        }

        public Criteria andBjztNotIn(List<Integer> values) {
            addCriterion("BJZT not in", values, "bjzt");
            return (Criteria) this;
        }

        public Criteria andBjztBetween(Integer value1, Integer value2) {
            addCriterion("BJZT between", value1, value2, "bjzt");
            return (Criteria) this;
        }

        public Criteria andBjztNotBetween(Integer value1, Integer value2) {
            addCriterion("BJZT not between", value1, value2, "bjzt");
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