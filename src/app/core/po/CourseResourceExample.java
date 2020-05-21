package app.core.po;

import java.util.ArrayList;
import java.util.List;

public class CourseResourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseResourceExample() {
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

        public Criteria andZjmcIsNull() {
            addCriterion("ZJMC is null");
            return (Criteria) this;
        }

        public Criteria andZjmcIsNotNull() {
            addCriterion("ZJMC is not null");
            return (Criteria) this;
        }

        public Criteria andZjmcEqualTo(String value) {
            addCriterion("ZJMC =", value, "zjmc");
            return (Criteria) this;
        }

        public Criteria andZjmcNotEqualTo(String value) {
            addCriterion("ZJMC <>", value, "zjmc");
            return (Criteria) this;
        }

        public Criteria andZjmcGreaterThan(String value) {
            addCriterion("ZJMC >", value, "zjmc");
            return (Criteria) this;
        }

        public Criteria andZjmcGreaterThanOrEqualTo(String value) {
            addCriterion("ZJMC >=", value, "zjmc");
            return (Criteria) this;
        }

        public Criteria andZjmcLessThan(String value) {
            addCriterion("ZJMC <", value, "zjmc");
            return (Criteria) this;
        }

        public Criteria andZjmcLessThanOrEqualTo(String value) {
            addCriterion("ZJMC <=", value, "zjmc");
            return (Criteria) this;
        }

        public Criteria andZjmcLike(String value) {
            addCriterion("ZJMC like", value, "zjmc");
            return (Criteria) this;
        }

        public Criteria andZjmcNotLike(String value) {
            addCriterion("ZJMC not like", value, "zjmc");
            return (Criteria) this;
        }

        public Criteria andZjmcIn(List<String> values) {
            addCriterion("ZJMC in", values, "zjmc");
            return (Criteria) this;
        }

        public Criteria andZjmcNotIn(List<String> values) {
            addCriterion("ZJMC not in", values, "zjmc");
            return (Criteria) this;
        }

        public Criteria andZjmcBetween(String value1, String value2) {
            addCriterion("ZJMC between", value1, value2, "zjmc");
            return (Criteria) this;
        }

        public Criteria andZjmcNotBetween(String value1, String value2) {
            addCriterion("ZJMC not between", value1, value2, "zjmc");
            return (Criteria) this;
        }

        public Criteria andZylxIsNull() {
            addCriterion("ZYLX is null");
            return (Criteria) this;
        }

        public Criteria andZylxIsNotNull() {
            addCriterion("ZYLX is not null");
            return (Criteria) this;
        }

        public Criteria andZylxEqualTo(String value) {
            addCriterion("ZYLX =", value, "zylx");
            return (Criteria) this;
        }

        public Criteria andZylxNotEqualTo(String value) {
            addCriterion("ZYLX <>", value, "zylx");
            return (Criteria) this;
        }

        public Criteria andZylxGreaterThan(String value) {
            addCriterion("ZYLX >", value, "zylx");
            return (Criteria) this;
        }

        public Criteria andZylxGreaterThanOrEqualTo(String value) {
            addCriterion("ZYLX >=", value, "zylx");
            return (Criteria) this;
        }

        public Criteria andZylxLessThan(String value) {
            addCriterion("ZYLX <", value, "zylx");
            return (Criteria) this;
        }

        public Criteria andZylxLessThanOrEqualTo(String value) {
            addCriterion("ZYLX <=", value, "zylx");
            return (Criteria) this;
        }

        public Criteria andZylxLike(String value) {
            addCriterion("ZYLX like", value, "zylx");
            return (Criteria) this;
        }

        public Criteria andZylxNotLike(String value) {
            addCriterion("ZYLX not like", value, "zylx");
            return (Criteria) this;
        }

        public Criteria andZylxIn(List<String> values) {
            addCriterion("ZYLX in", values, "zylx");
            return (Criteria) this;
        }

        public Criteria andZylxNotIn(List<String> values) {
            addCriterion("ZYLX not in", values, "zylx");
            return (Criteria) this;
        }

        public Criteria andZylxBetween(String value1, String value2) {
            addCriterion("ZYLX between", value1, value2, "zylx");
            return (Criteria) this;
        }

        public Criteria andZylxNotBetween(String value1, String value2) {
            addCriterion("ZYLX not between", value1, value2, "zylx");
            return (Criteria) this;
        }

        public Criteria andZyljIsNull() {
            addCriterion("ZYLJ is null");
            return (Criteria) this;
        }

        public Criteria andZyljIsNotNull() {
            addCriterion("ZYLJ is not null");
            return (Criteria) this;
        }

        public Criteria andZyljEqualTo(String value) {
            addCriterion("ZYLJ =", value, "zylj");
            return (Criteria) this;
        }

        public Criteria andZyljNotEqualTo(String value) {
            addCriterion("ZYLJ <>", value, "zylj");
            return (Criteria) this;
        }

        public Criteria andZyljGreaterThan(String value) {
            addCriterion("ZYLJ >", value, "zylj");
            return (Criteria) this;
        }

        public Criteria andZyljGreaterThanOrEqualTo(String value) {
            addCriterion("ZYLJ >=", value, "zylj");
            return (Criteria) this;
        }

        public Criteria andZyljLessThan(String value) {
            addCriterion("ZYLJ <", value, "zylj");
            return (Criteria) this;
        }

        public Criteria andZyljLessThanOrEqualTo(String value) {
            addCriterion("ZYLJ <=", value, "zylj");
            return (Criteria) this;
        }

        public Criteria andZyljLike(String value) {
            addCriterion("ZYLJ like", value, "zylj");
            return (Criteria) this;
        }

        public Criteria andZyljNotLike(String value) {
            addCriterion("ZYLJ not like", value, "zylj");
            return (Criteria) this;
        }

        public Criteria andZyljIn(List<String> values) {
            addCriterion("ZYLJ in", values, "zylj");
            return (Criteria) this;
        }

        public Criteria andZyljNotIn(List<String> values) {
            addCriterion("ZYLJ not in", values, "zylj");
            return (Criteria) this;
        }

        public Criteria andZyljBetween(String value1, String value2) {
            addCriterion("ZYLJ between", value1, value2, "zylj");
            return (Criteria) this;
        }

        public Criteria andZyljNotBetween(String value1, String value2) {
            addCriterion("ZYLJ not between", value1, value2, "zylj");
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