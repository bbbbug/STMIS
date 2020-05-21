package app.core.po;

import java.util.ArrayList;
import java.util.List;

public class CompetitionQuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompetitionQuestionExample() {
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

        public Criteria andStbhIsNull() {
            addCriterion("STBH is null");
            return (Criteria) this;
        }

        public Criteria andStbhIsNotNull() {
            addCriterion("STBH is not null");
            return (Criteria) this;
        }

        public Criteria andStbhEqualTo(String value) {
            addCriterion("STBH =", value, "stbh");
            return (Criteria) this;
        }

        public Criteria andStbhNotEqualTo(String value) {
            addCriterion("STBH <>", value, "stbh");
            return (Criteria) this;
        }

        public Criteria andStbhGreaterThan(String value) {
            addCriterion("STBH >", value, "stbh");
            return (Criteria) this;
        }

        public Criteria andStbhGreaterThanOrEqualTo(String value) {
            addCriterion("STBH >=", value, "stbh");
            return (Criteria) this;
        }

        public Criteria andStbhLessThan(String value) {
            addCriterion("STBH <", value, "stbh");
            return (Criteria) this;
        }

        public Criteria andStbhLessThanOrEqualTo(String value) {
            addCriterion("STBH <=", value, "stbh");
            return (Criteria) this;
        }

        public Criteria andStbhLike(String value) {
            addCriterion("STBH like", value, "stbh");
            return (Criteria) this;
        }

        public Criteria andStbhNotLike(String value) {
            addCriterion("STBH not like", value, "stbh");
            return (Criteria) this;
        }

        public Criteria andStbhIn(List<String> values) {
            addCriterion("STBH in", values, "stbh");
            return (Criteria) this;
        }

        public Criteria andStbhNotIn(List<String> values) {
            addCriterion("STBH not in", values, "stbh");
            return (Criteria) this;
        }

        public Criteria andStbhBetween(String value1, String value2) {
            addCriterion("STBH between", value1, value2, "stbh");
            return (Criteria) this;
        }

        public Criteria andStbhNotBetween(String value1, String value2) {
            addCriterion("STBH not between", value1, value2, "stbh");
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

        public Criteria andJsbhEqualTo(String value) {
            addCriterion("JSBH =", value, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsbhNotEqualTo(String value) {
            addCriterion("JSBH <>", value, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsbhGreaterThan(String value) {
            addCriterion("JSBH >", value, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsbhGreaterThanOrEqualTo(String value) {
            addCriterion("JSBH >=", value, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsbhLessThan(String value) {
            addCriterion("JSBH <", value, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsbhLessThanOrEqualTo(String value) {
            addCriterion("JSBH <=", value, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsbhLike(String value) {
            addCriterion("JSBH like", value, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsbhNotLike(String value) {
            addCriterion("JSBH not like", value, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsbhIn(List<String> values) {
            addCriterion("JSBH in", values, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsbhNotIn(List<String> values) {
            addCriterion("JSBH not in", values, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsbhBetween(String value1, String value2) {
            addCriterion("JSBH between", value1, value2, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsbhNotBetween(String value1, String value2) {
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

        public Criteria andJstxIsNull() {
            addCriterion("JSTX is null");
            return (Criteria) this;
        }

        public Criteria andJstxIsNotNull() {
            addCriterion("JSTX is not null");
            return (Criteria) this;
        }

        public Criteria andJstxEqualTo(String value) {
            addCriterion("JSTX =", value, "jstx");
            return (Criteria) this;
        }

        public Criteria andJstxNotEqualTo(String value) {
            addCriterion("JSTX <>", value, "jstx");
            return (Criteria) this;
        }

        public Criteria andJstxGreaterThan(String value) {
            addCriterion("JSTX >", value, "jstx");
            return (Criteria) this;
        }

        public Criteria andJstxGreaterThanOrEqualTo(String value) {
            addCriterion("JSTX >=", value, "jstx");
            return (Criteria) this;
        }

        public Criteria andJstxLessThan(String value) {
            addCriterion("JSTX <", value, "jstx");
            return (Criteria) this;
        }

        public Criteria andJstxLessThanOrEqualTo(String value) {
            addCriterion("JSTX <=", value, "jstx");
            return (Criteria) this;
        }

        public Criteria andJstxLike(String value) {
            addCriterion("JSTX like", value, "jstx");
            return (Criteria) this;
        }

        public Criteria andJstxNotLike(String value) {
            addCriterion("JSTX not like", value, "jstx");
            return (Criteria) this;
        }

        public Criteria andJstxIn(List<String> values) {
            addCriterion("JSTX in", values, "jstx");
            return (Criteria) this;
        }

        public Criteria andJstxNotIn(List<String> values) {
            addCriterion("JSTX not in", values, "jstx");
            return (Criteria) this;
        }

        public Criteria andJstxBetween(String value1, String value2) {
            addCriterion("JSTX between", value1, value2, "jstx");
            return (Criteria) this;
        }

        public Criteria andJstxNotBetween(String value1, String value2) {
            addCriterion("JSTX not between", value1, value2, "jstx");
            return (Criteria) this;
        }

        public Criteria andTmnrIsNull() {
            addCriterion("TMNR is null");
            return (Criteria) this;
        }

        public Criteria andTmnrIsNotNull() {
            addCriterion("TMNR is not null");
            return (Criteria) this;
        }

        public Criteria andTmnrEqualTo(String value) {
            addCriterion("TMNR =", value, "tmnr");
            return (Criteria) this;
        }

        public Criteria andTmnrNotEqualTo(String value) {
            addCriterion("TMNR <>", value, "tmnr");
            return (Criteria) this;
        }

        public Criteria andTmnrGreaterThan(String value) {
            addCriterion("TMNR >", value, "tmnr");
            return (Criteria) this;
        }

        public Criteria andTmnrGreaterThanOrEqualTo(String value) {
            addCriterion("TMNR >=", value, "tmnr");
            return (Criteria) this;
        }

        public Criteria andTmnrLessThan(String value) {
            addCriterion("TMNR <", value, "tmnr");
            return (Criteria) this;
        }

        public Criteria andTmnrLessThanOrEqualTo(String value) {
            addCriterion("TMNR <=", value, "tmnr");
            return (Criteria) this;
        }

        public Criteria andTmnrLike(String value) {
            addCriterion("TMNR like", value, "tmnr");
            return (Criteria) this;
        }

        public Criteria andTmnrNotLike(String value) {
            addCriterion("TMNR not like", value, "tmnr");
            return (Criteria) this;
        }

        public Criteria andTmnrIn(List<String> values) {
            addCriterion("TMNR in", values, "tmnr");
            return (Criteria) this;
        }

        public Criteria andTmnrNotIn(List<String> values) {
            addCriterion("TMNR not in", values, "tmnr");
            return (Criteria) this;
        }

        public Criteria andTmnrBetween(String value1, String value2) {
            addCriterion("TMNR between", value1, value2, "tmnr");
            return (Criteria) this;
        }

        public Criteria andTmnrNotBetween(String value1, String value2) {
            addCriterion("TMNR not between", value1, value2, "tmnr");
            return (Criteria) this;
        }

        public Criteria andTmdaIsNull() {
            addCriterion("TMDA is null");
            return (Criteria) this;
        }

        public Criteria andTmdaIsNotNull() {
            addCriterion("TMDA is not null");
            return (Criteria) this;
        }

        public Criteria andTmdaEqualTo(String value) {
            addCriterion("TMDA =", value, "tmda");
            return (Criteria) this;
        }

        public Criteria andTmdaNotEqualTo(String value) {
            addCriterion("TMDA <>", value, "tmda");
            return (Criteria) this;
        }

        public Criteria andTmdaGreaterThan(String value) {
            addCriterion("TMDA >", value, "tmda");
            return (Criteria) this;
        }

        public Criteria andTmdaGreaterThanOrEqualTo(String value) {
            addCriterion("TMDA >=", value, "tmda");
            return (Criteria) this;
        }

        public Criteria andTmdaLessThan(String value) {
            addCriterion("TMDA <", value, "tmda");
            return (Criteria) this;
        }

        public Criteria andTmdaLessThanOrEqualTo(String value) {
            addCriterion("TMDA <=", value, "tmda");
            return (Criteria) this;
        }

        public Criteria andTmdaLike(String value) {
            addCriterion("TMDA like", value, "tmda");
            return (Criteria) this;
        }

        public Criteria andTmdaNotLike(String value) {
            addCriterion("TMDA not like", value, "tmda");
            return (Criteria) this;
        }

        public Criteria andTmdaIn(List<String> values) {
            addCriterion("TMDA in", values, "tmda");
            return (Criteria) this;
        }

        public Criteria andTmdaNotIn(List<String> values) {
            addCriterion("TMDA not in", values, "tmda");
            return (Criteria) this;
        }

        public Criteria andTmdaBetween(String value1, String value2) {
            addCriterion("TMDA between", value1, value2, "tmda");
            return (Criteria) this;
        }

        public Criteria andTmdaNotBetween(String value1, String value2) {
            addCriterion("TMDA not between", value1, value2, "tmda");
            return (Criteria) this;
        }

        public Criteria andTmjxIsNull() {
            addCriterion("TMJX is null");
            return (Criteria) this;
        }

        public Criteria andTmjxIsNotNull() {
            addCriterion("TMJX is not null");
            return (Criteria) this;
        }

        public Criteria andTmjxEqualTo(String value) {
            addCriterion("TMJX =", value, "tmjx");
            return (Criteria) this;
        }

        public Criteria andTmjxNotEqualTo(String value) {
            addCriterion("TMJX <>", value, "tmjx");
            return (Criteria) this;
        }

        public Criteria andTmjxGreaterThan(String value) {
            addCriterion("TMJX >", value, "tmjx");
            return (Criteria) this;
        }

        public Criteria andTmjxGreaterThanOrEqualTo(String value) {
            addCriterion("TMJX >=", value, "tmjx");
            return (Criteria) this;
        }

        public Criteria andTmjxLessThan(String value) {
            addCriterion("TMJX <", value, "tmjx");
            return (Criteria) this;
        }

        public Criteria andTmjxLessThanOrEqualTo(String value) {
            addCriterion("TMJX <=", value, "tmjx");
            return (Criteria) this;
        }

        public Criteria andTmjxLike(String value) {
            addCriterion("TMJX like", value, "tmjx");
            return (Criteria) this;
        }

        public Criteria andTmjxNotLike(String value) {
            addCriterion("TMJX not like", value, "tmjx");
            return (Criteria) this;
        }

        public Criteria andTmjxIn(List<String> values) {
            addCriterion("TMJX in", values, "tmjx");
            return (Criteria) this;
        }

        public Criteria andTmjxNotIn(List<String> values) {
            addCriterion("TMJX not in", values, "tmjx");
            return (Criteria) this;
        }

        public Criteria andTmjxBetween(String value1, String value2) {
            addCriterion("TMJX between", value1, value2, "tmjx");
            return (Criteria) this;
        }

        public Criteria andTmjxNotBetween(String value1, String value2) {
            addCriterion("TMJX not between", value1, value2, "tmjx");
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