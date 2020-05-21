package app.core.po;

import java.util.ArrayList;
import java.util.List;

public class ExamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExamExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCaptionIsNull() {
            addCriterion("caption is null");
            return (Criteria) this;
        }

        public Criteria andCaptionIsNotNull() {
            addCriterion("caption is not null");
            return (Criteria) this;
        }

        public Criteria andCaptionEqualTo(String value) {
            addCriterion("caption =", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionNotEqualTo(String value) {
            addCriterion("caption <>", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionGreaterThan(String value) {
            addCriterion("caption >", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionGreaterThanOrEqualTo(String value) {
            addCriterion("caption >=", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionLessThan(String value) {
            addCriterion("caption <", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionLessThanOrEqualTo(String value) {
            addCriterion("caption <=", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionLike(String value) {
            addCriterion("caption like", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionNotLike(String value) {
            addCriterion("caption not like", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionIn(List<String> values) {
            addCriterion("caption in", values, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionNotIn(List<String> values) {
            addCriterion("caption not in", values, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionBetween(String value1, String value2) {
            addCriterion("caption between", value1, value2, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionNotBetween(String value1, String value2) {
            addCriterion("caption not between", value1, value2, "caption");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNull() {
            addCriterion("answer is null");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNotNull() {
            addCriterion("answer is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerEqualTo(String value) {
            addCriterion("answer =", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotEqualTo(String value) {
            addCriterion("answer <>", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThan(String value) {
            addCriterion("answer >", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("answer >=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThan(String value) {
            addCriterion("answer <", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThanOrEqualTo(String value) {
            addCriterion("answer <=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLike(String value) {
            addCriterion("answer like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotLike(String value) {
            addCriterion("answer not like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerIn(List<String> values) {
            addCriterion("answer in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotIn(List<String> values) {
            addCriterion("answer not in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerBetween(String value1, String value2) {
            addCriterion("answer between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotBetween(String value1, String value2) {
            addCriterion("answer not between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andRrangeIsNull() {
            addCriterion("rrange is null");
            return (Criteria) this;
        }

        public Criteria andRrangeIsNotNull() {
            addCriterion("rrange is not null");
            return (Criteria) this;
        }

        public Criteria andRrangeEqualTo(String value) {
            addCriterion("rrange =", value, "rrange");
            return (Criteria) this;
        }

        public Criteria andRrangeNotEqualTo(String value) {
            addCriterion("rrange <>", value, "rrange");
            return (Criteria) this;
        }

        public Criteria andRrangeGreaterThan(String value) {
            addCriterion("rrange >", value, "rrange");
            return (Criteria) this;
        }

        public Criteria andRrangeGreaterThanOrEqualTo(String value) {
            addCriterion("rrange >=", value, "rrange");
            return (Criteria) this;
        }

        public Criteria andRrangeLessThan(String value) {
            addCriterion("rrange <", value, "rrange");
            return (Criteria) this;
        }

        public Criteria andRrangeLessThanOrEqualTo(String value) {
            addCriterion("rrange <=", value, "rrange");
            return (Criteria) this;
        }

        public Criteria andRrangeLike(String value) {
            addCriterion("rrange like", value, "rrange");
            return (Criteria) this;
        }

        public Criteria andRrangeNotLike(String value) {
            addCriterion("rrange not like", value, "rrange");
            return (Criteria) this;
        }

        public Criteria andRrangeIn(List<String> values) {
            addCriterion("rrange in", values, "rrange");
            return (Criteria) this;
        }

        public Criteria andRrangeNotIn(List<String> values) {
            addCriterion("rrange not in", values, "rrange");
            return (Criteria) this;
        }

        public Criteria andRrangeBetween(String value1, String value2) {
            addCriterion("rrange between", value1, value2, "rrange");
            return (Criteria) this;
        }

        public Criteria andRrangeNotBetween(String value1, String value2) {
            addCriterion("rrange not between", value1, value2, "rrange");
            return (Criteria) this;
        }

        public Criteria andKcjsIsNull() {
            addCriterion("kcjs is null");
            return (Criteria) this;
        }

        public Criteria andKcjsIsNotNull() {
            addCriterion("kcjs is not null");
            return (Criteria) this;
        }

        public Criteria andKcjsEqualTo(String value) {
            addCriterion("kcjs =", value, "kcjs");
            return (Criteria) this;
        }

        public Criteria andKcjsNotEqualTo(String value) {
            addCriterion("kcjs <>", value, "kcjs");
            return (Criteria) this;
        }

        public Criteria andKcjsGreaterThan(String value) {
            addCriterion("kcjs >", value, "kcjs");
            return (Criteria) this;
        }

        public Criteria andKcjsGreaterThanOrEqualTo(String value) {
            addCriterion("kcjs >=", value, "kcjs");
            return (Criteria) this;
        }

        public Criteria andKcjsLessThan(String value) {
            addCriterion("kcjs <", value, "kcjs");
            return (Criteria) this;
        }

        public Criteria andKcjsLessThanOrEqualTo(String value) {
            addCriterion("kcjs <=", value, "kcjs");
            return (Criteria) this;
        }

        public Criteria andKcjsLike(String value) {
            addCriterion("kcjs like", value, "kcjs");
            return (Criteria) this;
        }

        public Criteria andKcjsNotLike(String value) {
            addCriterion("kcjs not like", value, "kcjs");
            return (Criteria) this;
        }

        public Criteria andKcjsIn(List<String> values) {
            addCriterion("kcjs in", values, "kcjs");
            return (Criteria) this;
        }

        public Criteria andKcjsNotIn(List<String> values) {
            addCriterion("kcjs not in", values, "kcjs");
            return (Criteria) this;
        }

        public Criteria andKcjsBetween(String value1, String value2) {
            addCriterion("kcjs between", value1, value2, "kcjs");
            return (Criteria) this;
        }

        public Criteria andKcjsNotBetween(String value1, String value2) {
            addCriterion("kcjs not between", value1, value2, "kcjs");
            return (Criteria) this;
        }

        public Criteria andSjlbIsNull() {
            addCriterion("sjlb is null");
            return (Criteria) this;
        }

        public Criteria andSjlbIsNotNull() {
            addCriterion("sjlb is not null");
            return (Criteria) this;
        }

        public Criteria andSjlbEqualTo(String value) {
            addCriterion("sjlb =", value, "sjlb");
            return (Criteria) this;
        }

        public Criteria andSjlbNotEqualTo(String value) {
            addCriterion("sjlb <>", value, "sjlb");
            return (Criteria) this;
        }

        public Criteria andSjlbGreaterThan(String value) {
            addCriterion("sjlb >", value, "sjlb");
            return (Criteria) this;
        }

        public Criteria andSjlbGreaterThanOrEqualTo(String value) {
            addCriterion("sjlb >=", value, "sjlb");
            return (Criteria) this;
        }

        public Criteria andSjlbLessThan(String value) {
            addCriterion("sjlb <", value, "sjlb");
            return (Criteria) this;
        }

        public Criteria andSjlbLessThanOrEqualTo(String value) {
            addCriterion("sjlb <=", value, "sjlb");
            return (Criteria) this;
        }

        public Criteria andSjlbLike(String value) {
            addCriterion("sjlb like", value, "sjlb");
            return (Criteria) this;
        }

        public Criteria andSjlbNotLike(String value) {
            addCriterion("sjlb not like", value, "sjlb");
            return (Criteria) this;
        }

        public Criteria andSjlbIn(List<String> values) {
            addCriterion("sjlb in", values, "sjlb");
            return (Criteria) this;
        }

        public Criteria andSjlbNotIn(List<String> values) {
            addCriterion("sjlb not in", values, "sjlb");
            return (Criteria) this;
        }

        public Criteria andSjlbBetween(String value1, String value2) {
            addCriterion("sjlb between", value1, value2, "sjlb");
            return (Criteria) this;
        }

        public Criteria andSjlbNotBetween(String value1, String value2) {
            addCriterion("sjlb not between", value1, value2, "sjlb");
            return (Criteria) this;
        }

        public Criteria andKcbhIsNull() {
            addCriterion("kcbh is null");
            return (Criteria) this;
        }

        public Criteria andKcbhIsNotNull() {
            addCriterion("kcbh is not null");
            return (Criteria) this;
        }

        public Criteria andKcbhEqualTo(String value) {
            addCriterion("kcbh =", value, "kcbh");
            return (Criteria) this;
        }

        public Criteria andKcbhNotEqualTo(String value) {
            addCriterion("kcbh <>", value, "kcbh");
            return (Criteria) this;
        }

        public Criteria andKcbhGreaterThan(String value) {
            addCriterion("kcbh >", value, "kcbh");
            return (Criteria) this;
        }

        public Criteria andKcbhGreaterThanOrEqualTo(String value) {
            addCriterion("kcbh >=", value, "kcbh");
            return (Criteria) this;
        }

        public Criteria andKcbhLessThan(String value) {
            addCriterion("kcbh <", value, "kcbh");
            return (Criteria) this;
        }

        public Criteria andKcbhLessThanOrEqualTo(String value) {
            addCriterion("kcbh <=", value, "kcbh");
            return (Criteria) this;
        }

        public Criteria andKcbhLike(String value) {
            addCriterion("kcbh like", value, "kcbh");
            return (Criteria) this;
        }

        public Criteria andKcbhNotLike(String value) {
            addCriterion("kcbh not like", value, "kcbh");
            return (Criteria) this;
        }

        public Criteria andKcbhIn(List<String> values) {
            addCriterion("kcbh in", values, "kcbh");
            return (Criteria) this;
        }

        public Criteria andKcbhNotIn(List<String> values) {
            addCriterion("kcbh not in", values, "kcbh");
            return (Criteria) this;
        }

        public Criteria andKcbhBetween(String value1, String value2) {
            addCriterion("kcbh between", value1, value2, "kcbh");
            return (Criteria) this;
        }

        public Criteria andKcbhNotBetween(String value1, String value2) {
            addCriterion("kcbh not between", value1, value2, "kcbh");
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