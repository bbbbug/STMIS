package app.core.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompetitionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompetitionExample() {
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

        public Criteria andJskcbhIsNull() {
            addCriterion("JSKCBH is null");
            return (Criteria) this;
        }

        public Criteria andJskcbhIsNotNull() {
            addCriterion("JSKCBH is not null");
            return (Criteria) this;
        }

        public Criteria andJskcbhEqualTo(String value) {
            addCriterion("JSKCBH =", value, "jskcbh");
            return (Criteria) this;
        }

        public Criteria andJskcbhNotEqualTo(String value) {
            addCriterion("JSKCBH <>", value, "jskcbh");
            return (Criteria) this;
        }

        public Criteria andJskcbhGreaterThan(String value) {
            addCriterion("JSKCBH >", value, "jskcbh");
            return (Criteria) this;
        }

        public Criteria andJskcbhGreaterThanOrEqualTo(String value) {
            addCriterion("JSKCBH >=", value, "jskcbh");
            return (Criteria) this;
        }

        public Criteria andJskcbhLessThan(String value) {
            addCriterion("JSKCBH <", value, "jskcbh");
            return (Criteria) this;
        }

        public Criteria andJskcbhLessThanOrEqualTo(String value) {
            addCriterion("JSKCBH <=", value, "jskcbh");
            return (Criteria) this;
        }

        public Criteria andJskcbhLike(String value) {
            addCriterion("JSKCBH like", value, "jskcbh");
            return (Criteria) this;
        }

        public Criteria andJskcbhNotLike(String value) {
            addCriterion("JSKCBH not like", value, "jskcbh");
            return (Criteria) this;
        }

        public Criteria andJskcbhIn(List<String> values) {
            addCriterion("JSKCBH in", values, "jskcbh");
            return (Criteria) this;
        }

        public Criteria andJskcbhNotIn(List<String> values) {
            addCriterion("JSKCBH not in", values, "jskcbh");
            return (Criteria) this;
        }

        public Criteria andJskcbhBetween(String value1, String value2) {
            addCriterion("JSKCBH between", value1, value2, "jskcbh");
            return (Criteria) this;
        }

        public Criteria andJskcbhNotBetween(String value1, String value2) {
            addCriterion("JSKCBH not between", value1, value2, "jskcbh");
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

        public Criteria andJsfsIsNull() {
            addCriterion("JSFS is null");
            return (Criteria) this;
        }

        public Criteria andJsfsIsNotNull() {
            addCriterion("JSFS is not null");
            return (Criteria) this;
        }

        public Criteria andJsfsEqualTo(String value) {
            addCriterion("JSFS =", value, "jsfs");
            return (Criteria) this;
        }

        public Criteria andJsfsNotEqualTo(String value) {
            addCriterion("JSFS <>", value, "jsfs");
            return (Criteria) this;
        }

        public Criteria andJsfsGreaterThan(String value) {
            addCriterion("JSFS >", value, "jsfs");
            return (Criteria) this;
        }

        public Criteria andJsfsGreaterThanOrEqualTo(String value) {
            addCriterion("JSFS >=", value, "jsfs");
            return (Criteria) this;
        }

        public Criteria andJsfsLessThan(String value) {
            addCriterion("JSFS <", value, "jsfs");
            return (Criteria) this;
        }

        public Criteria andJsfsLessThanOrEqualTo(String value) {
            addCriterion("JSFS <=", value, "jsfs");
            return (Criteria) this;
        }

        public Criteria andJsfsLike(String value) {
            addCriterion("JSFS like", value, "jsfs");
            return (Criteria) this;
        }

        public Criteria andJsfsNotLike(String value) {
            addCriterion("JSFS not like", value, "jsfs");
            return (Criteria) this;
        }

        public Criteria andJsfsIn(List<String> values) {
            addCriterion("JSFS in", values, "jsfs");
            return (Criteria) this;
        }

        public Criteria andJsfsNotIn(List<String> values) {
            addCriterion("JSFS not in", values, "jsfs");
            return (Criteria) this;
        }

        public Criteria andJsfsBetween(String value1, String value2) {
            addCriterion("JSFS between", value1, value2, "jsfs");
            return (Criteria) this;
        }

        public Criteria andJsfsNotBetween(String value1, String value2) {
            addCriterion("JSFS not between", value1, value2, "jsfs");
            return (Criteria) this;
        }

        public Criteria andJsmsIsNull() {
            addCriterion("JSMS is null");
            return (Criteria) this;
        }

        public Criteria andJsmsIsNotNull() {
            addCriterion("JSMS is not null");
            return (Criteria) this;
        }

        public Criteria andJsmsEqualTo(String value) {
            addCriterion("JSMS =", value, "jsms");
            return (Criteria) this;
        }

        public Criteria andJsmsNotEqualTo(String value) {
            addCriterion("JSMS <>", value, "jsms");
            return (Criteria) this;
        }

        public Criteria andJsmsGreaterThan(String value) {
            addCriterion("JSMS >", value, "jsms");
            return (Criteria) this;
        }

        public Criteria andJsmsGreaterThanOrEqualTo(String value) {
            addCriterion("JSMS >=", value, "jsms");
            return (Criteria) this;
        }

        public Criteria andJsmsLessThan(String value) {
            addCriterion("JSMS <", value, "jsms");
            return (Criteria) this;
        }

        public Criteria andJsmsLessThanOrEqualTo(String value) {
            addCriterion("JSMS <=", value, "jsms");
            return (Criteria) this;
        }

        public Criteria andJsmsLike(String value) {
            addCriterion("JSMS like", value, "jsms");
            return (Criteria) this;
        }

        public Criteria andJsmsNotLike(String value) {
            addCriterion("JSMS not like", value, "jsms");
            return (Criteria) this;
        }

        public Criteria andJsmsIn(List<String> values) {
            addCriterion("JSMS in", values, "jsms");
            return (Criteria) this;
        }

        public Criteria andJsmsNotIn(List<String> values) {
            addCriterion("JSMS not in", values, "jsms");
            return (Criteria) this;
        }

        public Criteria andJsmsBetween(String value1, String value2) {
            addCriterion("JSMS between", value1, value2, "jsms");
            return (Criteria) this;
        }

        public Criteria andJsmsNotBetween(String value1, String value2) {
            addCriterion("JSMS not between", value1, value2, "jsms");
            return (Criteria) this;
        }

        public Criteria andJsjlIsNull() {
            addCriterion("JSJL is null");
            return (Criteria) this;
        }

        public Criteria andJsjlIsNotNull() {
            addCriterion("JSJL is not null");
            return (Criteria) this;
        }

        public Criteria andJsjlEqualTo(String value) {
            addCriterion("JSJL =", value, "jsjl");
            return (Criteria) this;
        }

        public Criteria andJsjlNotEqualTo(String value) {
            addCriterion("JSJL <>", value, "jsjl");
            return (Criteria) this;
        }

        public Criteria andJsjlGreaterThan(String value) {
            addCriterion("JSJL >", value, "jsjl");
            return (Criteria) this;
        }

        public Criteria andJsjlGreaterThanOrEqualTo(String value) {
            addCriterion("JSJL >=", value, "jsjl");
            return (Criteria) this;
        }

        public Criteria andJsjlLessThan(String value) {
            addCriterion("JSJL <", value, "jsjl");
            return (Criteria) this;
        }

        public Criteria andJsjlLessThanOrEqualTo(String value) {
            addCriterion("JSJL <=", value, "jsjl");
            return (Criteria) this;
        }

        public Criteria andJsjlLike(String value) {
            addCriterion("JSJL like", value, "jsjl");
            return (Criteria) this;
        }

        public Criteria andJsjlNotLike(String value) {
            addCriterion("JSJL not like", value, "jsjl");
            return (Criteria) this;
        }

        public Criteria andJsjlIn(List<String> values) {
            addCriterion("JSJL in", values, "jsjl");
            return (Criteria) this;
        }

        public Criteria andJsjlNotIn(List<String> values) {
            addCriterion("JSJL not in", values, "jsjl");
            return (Criteria) this;
        }

        public Criteria andJsjlBetween(String value1, String value2) {
            addCriterion("JSJL between", value1, value2, "jsjl");
            return (Criteria) this;
        }

        public Criteria andJsjlNotBetween(String value1, String value2) {
            addCriterion("JSJL not between", value1, value2, "jsjl");
            return (Criteria) this;
        }

        public Criteria andJsgzIsNull() {
            addCriterion("JSGZ is null");
            return (Criteria) this;
        }

        public Criteria andJsgzIsNotNull() {
            addCriterion("JSGZ is not null");
            return (Criteria) this;
        }

        public Criteria andJsgzEqualTo(String value) {
            addCriterion("JSGZ =", value, "jsgz");
            return (Criteria) this;
        }

        public Criteria andJsgzNotEqualTo(String value) {
            addCriterion("JSGZ <>", value, "jsgz");
            return (Criteria) this;
        }

        public Criteria andJsgzGreaterThan(String value) {
            addCriterion("JSGZ >", value, "jsgz");
            return (Criteria) this;
        }

        public Criteria andJsgzGreaterThanOrEqualTo(String value) {
            addCriterion("JSGZ >=", value, "jsgz");
            return (Criteria) this;
        }

        public Criteria andJsgzLessThan(String value) {
            addCriterion("JSGZ <", value, "jsgz");
            return (Criteria) this;
        }

        public Criteria andJsgzLessThanOrEqualTo(String value) {
            addCriterion("JSGZ <=", value, "jsgz");
            return (Criteria) this;
        }

        public Criteria andJsgzLike(String value) {
            addCriterion("JSGZ like", value, "jsgz");
            return (Criteria) this;
        }

        public Criteria andJsgzNotLike(String value) {
            addCriterion("JSGZ not like", value, "jsgz");
            return (Criteria) this;
        }

        public Criteria andJsgzIn(List<String> values) {
            addCriterion("JSGZ in", values, "jsgz");
            return (Criteria) this;
        }

        public Criteria andJsgzNotIn(List<String> values) {
            addCriterion("JSGZ not in", values, "jsgz");
            return (Criteria) this;
        }

        public Criteria andJsgzBetween(String value1, String value2) {
            addCriterion("JSGZ between", value1, value2, "jsgz");
            return (Criteria) this;
        }

        public Criteria andJsgzNotBetween(String value1, String value2) {
            addCriterion("JSGZ not between", value1, value2, "jsgz");
            return (Criteria) this;
        }

        public Criteria andJsrsIsNull() {
            addCriterion("JSRS is null");
            return (Criteria) this;
        }

        public Criteria andJsrsIsNotNull() {
            addCriterion("JSRS is not null");
            return (Criteria) this;
        }

        public Criteria andJsrsEqualTo(Integer value) {
            addCriterion("JSRS =", value, "jsrs");
            return (Criteria) this;
        }

        public Criteria andJsrsNotEqualTo(Integer value) {
            addCriterion("JSRS <>", value, "jsrs");
            return (Criteria) this;
        }

        public Criteria andJsrsGreaterThan(Integer value) {
            addCriterion("JSRS >", value, "jsrs");
            return (Criteria) this;
        }

        public Criteria andJsrsGreaterThanOrEqualTo(Integer value) {
            addCriterion("JSRS >=", value, "jsrs");
            return (Criteria) this;
        }

        public Criteria andJsrsLessThan(Integer value) {
            addCriterion("JSRS <", value, "jsrs");
            return (Criteria) this;
        }

        public Criteria andJsrsLessThanOrEqualTo(Integer value) {
            addCriterion("JSRS <=", value, "jsrs");
            return (Criteria) this;
        }

        public Criteria andJsrsIn(List<Integer> values) {
            addCriterion("JSRS in", values, "jsrs");
            return (Criteria) this;
        }

        public Criteria andJsrsNotIn(List<Integer> values) {
            addCriterion("JSRS not in", values, "jsrs");
            return (Criteria) this;
        }

        public Criteria andJsrsBetween(Integer value1, Integer value2) {
            addCriterion("JSRS between", value1, value2, "jsrs");
            return (Criteria) this;
        }

        public Criteria andJsrsNotBetween(Integer value1, Integer value2) {
            addCriterion("JSRS not between", value1, value2, "jsrs");
            return (Criteria) this;
        }

        public Criteria andJskssjIsNull() {
            addCriterion("JSKSSJ is null");
            return (Criteria) this;
        }

        public Criteria andJskssjIsNotNull() {
            addCriterion("JSKSSJ is not null");
            return (Criteria) this;
        }

        public Criteria andJskssjEqualTo(Date value) {
            addCriterion("JSKSSJ =", value, "jskssj");
            return (Criteria) this;
        }

        public Criteria andJskssjNotEqualTo(Date value) {
            addCriterion("JSKSSJ <>", value, "jskssj");
            return (Criteria) this;
        }

        public Criteria andJskssjGreaterThan(Date value) {
            addCriterion("JSKSSJ >", value, "jskssj");
            return (Criteria) this;
        }

        public Criteria andJskssjGreaterThanOrEqualTo(Date value) {
            addCriterion("JSKSSJ >=", value, "jskssj");
            return (Criteria) this;
        }

        public Criteria andJskssjLessThan(Date value) {
            addCriterion("JSKSSJ <", value, "jskssj");
            return (Criteria) this;
        }

        public Criteria andJskssjLessThanOrEqualTo(Date value) {
            addCriterion("JSKSSJ <=", value, "jskssj");
            return (Criteria) this;
        }

        public Criteria andJskssjIn(List<Date> values) {
            addCriterion("JSKSSJ in", values, "jskssj");
            return (Criteria) this;
        }

        public Criteria andJskssjNotIn(List<Date> values) {
            addCriterion("JSKSSJ not in", values, "jskssj");
            return (Criteria) this;
        }

        public Criteria andJskssjBetween(Date value1, Date value2) {
            addCriterion("JSKSSJ between", value1, value2, "jskssj");
            return (Criteria) this;
        }

        public Criteria andJskssjNotBetween(Date value1, Date value2) {
            addCriterion("JSKSSJ not between", value1, value2, "jskssj");
            return (Criteria) this;
        }

        public Criteria andJsjssjIsNull() {
            addCriterion("JSJSSJ is null");
            return (Criteria) this;
        }

        public Criteria andJsjssjIsNotNull() {
            addCriterion("JSJSSJ is not null");
            return (Criteria) this;
        }

        public Criteria andJsjssjEqualTo(Date value) {
            addCriterion("JSJSSJ =", value, "jsjssj");
            return (Criteria) this;
        }

        public Criteria andJsjssjNotEqualTo(Date value) {
            addCriterion("JSJSSJ <>", value, "jsjssj");
            return (Criteria) this;
        }

        public Criteria andJsjssjGreaterThan(Date value) {
            addCriterion("JSJSSJ >", value, "jsjssj");
            return (Criteria) this;
        }

        public Criteria andJsjssjGreaterThanOrEqualTo(Date value) {
            addCriterion("JSJSSJ >=", value, "jsjssj");
            return (Criteria) this;
        }

        public Criteria andJsjssjLessThan(Date value) {
            addCriterion("JSJSSJ <", value, "jsjssj");
            return (Criteria) this;
        }

        public Criteria andJsjssjLessThanOrEqualTo(Date value) {
            addCriterion("JSJSSJ <=", value, "jsjssj");
            return (Criteria) this;
        }

        public Criteria andJsjssjIn(List<Date> values) {
            addCriterion("JSJSSJ in", values, "jsjssj");
            return (Criteria) this;
        }

        public Criteria andJsjssjNotIn(List<Date> values) {
            addCriterion("JSJSSJ not in", values, "jsjssj");
            return (Criteria) this;
        }

        public Criteria andJsjssjBetween(Date value1, Date value2) {
            addCriterion("JSJSSJ between", value1, value2, "jsjssj");
            return (Criteria) this;
        }

        public Criteria andJsjssjNotBetween(Date value1, Date value2) {
            addCriterion("JSJSSJ not between", value1, value2, "jsjssj");
            return (Criteria) this;
        }

        public Criteria andJsstbhIsNull() {
            addCriterion("JSSTBH is null");
            return (Criteria) this;
        }

        public Criteria andJsstbhIsNotNull() {
            addCriterion("JSSTBH is not null");
            return (Criteria) this;
        }

        public Criteria andJsstbhEqualTo(String value) {
            addCriterion("JSSTBH =", value, "jsstbh");
            return (Criteria) this;
        }

        public Criteria andJsstbhNotEqualTo(String value) {
            addCriterion("JSSTBH <>", value, "jsstbh");
            return (Criteria) this;
        }

        public Criteria andJsstbhGreaterThan(String value) {
            addCriterion("JSSTBH >", value, "jsstbh");
            return (Criteria) this;
        }

        public Criteria andJsstbhGreaterThanOrEqualTo(String value) {
            addCriterion("JSSTBH >=", value, "jsstbh");
            return (Criteria) this;
        }

        public Criteria andJsstbhLessThan(String value) {
            addCriterion("JSSTBH <", value, "jsstbh");
            return (Criteria) this;
        }

        public Criteria andJsstbhLessThanOrEqualTo(String value) {
            addCriterion("JSSTBH <=", value, "jsstbh");
            return (Criteria) this;
        }

        public Criteria andJsstbhLike(String value) {
            addCriterion("JSSTBH like", value, "jsstbh");
            return (Criteria) this;
        }

        public Criteria andJsstbhNotLike(String value) {
            addCriterion("JSSTBH not like", value, "jsstbh");
            return (Criteria) this;
        }

        public Criteria andJsstbhIn(List<String> values) {
            addCriterion("JSSTBH in", values, "jsstbh");
            return (Criteria) this;
        }

        public Criteria andJsstbhNotIn(List<String> values) {
            addCriterion("JSSTBH not in", values, "jsstbh");
            return (Criteria) this;
        }

        public Criteria andJsstbhBetween(String value1, String value2) {
            addCriterion("JSSTBH between", value1, value2, "jsstbh");
            return (Criteria) this;
        }

        public Criteria andJsstbhNotBetween(String value1, String value2) {
            addCriterion("JSSTBH not between", value1, value2, "jsstbh");
            return (Criteria) this;
        }

        public Criteria andJsstnrIsNull() {
            addCriterion("JSSTNR is null");
            return (Criteria) this;
        }

        public Criteria andJsstnrIsNotNull() {
            addCriterion("JSSTNR is not null");
            return (Criteria) this;
        }

        public Criteria andJsstnrEqualTo(String value) {
            addCriterion("JSSTNR =", value, "jsstnr");
            return (Criteria) this;
        }

        public Criteria andJsstnrNotEqualTo(String value) {
            addCriterion("JSSTNR <>", value, "jsstnr");
            return (Criteria) this;
        }

        public Criteria andJsstnrGreaterThan(String value) {
            addCriterion("JSSTNR >", value, "jsstnr");
            return (Criteria) this;
        }

        public Criteria andJsstnrGreaterThanOrEqualTo(String value) {
            addCriterion("JSSTNR >=", value, "jsstnr");
            return (Criteria) this;
        }

        public Criteria andJsstnrLessThan(String value) {
            addCriterion("JSSTNR <", value, "jsstnr");
            return (Criteria) this;
        }

        public Criteria andJsstnrLessThanOrEqualTo(String value) {
            addCriterion("JSSTNR <=", value, "jsstnr");
            return (Criteria) this;
        }

        public Criteria andJsstnrLike(String value) {
            addCriterion("JSSTNR like", value, "jsstnr");
            return (Criteria) this;
        }

        public Criteria andJsstnrNotLike(String value) {
            addCriterion("JSSTNR not like", value, "jsstnr");
            return (Criteria) this;
        }

        public Criteria andJsstnrIn(List<String> values) {
            addCriterion("JSSTNR in", values, "jsstnr");
            return (Criteria) this;
        }

        public Criteria andJsstnrNotIn(List<String> values) {
            addCriterion("JSSTNR not in", values, "jsstnr");
            return (Criteria) this;
        }

        public Criteria andJsstnrBetween(String value1, String value2) {
            addCriterion("JSSTNR between", value1, value2, "jsstnr");
            return (Criteria) this;
        }

        public Criteria andJsstnrNotBetween(String value1, String value2) {
            addCriterion("JSSTNR not between", value1, value2, "jsstnr");
            return (Criteria) this;
        }

        public Criteria andJsstdaIsNull() {
            addCriterion("JSSTDA is null");
            return (Criteria) this;
        }

        public Criteria andJsstdaIsNotNull() {
            addCriterion("JSSTDA is not null");
            return (Criteria) this;
        }

        public Criteria andJsstdaEqualTo(String value) {
            addCriterion("JSSTDA =", value, "jsstda");
            return (Criteria) this;
        }

        public Criteria andJsstdaNotEqualTo(String value) {
            addCriterion("JSSTDA <>", value, "jsstda");
            return (Criteria) this;
        }

        public Criteria andJsstdaGreaterThan(String value) {
            addCriterion("JSSTDA >", value, "jsstda");
            return (Criteria) this;
        }

        public Criteria andJsstdaGreaterThanOrEqualTo(String value) {
            addCriterion("JSSTDA >=", value, "jsstda");
            return (Criteria) this;
        }

        public Criteria andJsstdaLessThan(String value) {
            addCriterion("JSSTDA <", value, "jsstda");
            return (Criteria) this;
        }

        public Criteria andJsstdaLessThanOrEqualTo(String value) {
            addCriterion("JSSTDA <=", value, "jsstda");
            return (Criteria) this;
        }

        public Criteria andJsstdaLike(String value) {
            addCriterion("JSSTDA like", value, "jsstda");
            return (Criteria) this;
        }

        public Criteria andJsstdaNotLike(String value) {
            addCriterion("JSSTDA not like", value, "jsstda");
            return (Criteria) this;
        }

        public Criteria andJsstdaIn(List<String> values) {
            addCriterion("JSSTDA in", values, "jsstda");
            return (Criteria) this;
        }

        public Criteria andJsstdaNotIn(List<String> values) {
            addCriterion("JSSTDA not in", values, "jsstda");
            return (Criteria) this;
        }

        public Criteria andJsstdaBetween(String value1, String value2) {
            addCriterion("JSSTDA between", value1, value2, "jsstda");
            return (Criteria) this;
        }

        public Criteria andJsstdaNotBetween(String value1, String value2) {
            addCriterion("JSSTDA not between", value1, value2, "jsstda");
            return (Criteria) this;
        }

        public Criteria andFzrghIsNull() {
            addCriterion("FZRGH is null");
            return (Criteria) this;
        }

        public Criteria andFzrghIsNotNull() {
            addCriterion("FZRGH is not null");
            return (Criteria) this;
        }

        public Criteria andFzrghEqualTo(String value) {
            addCriterion("FZRGH =", value, "fzrgh");
            return (Criteria) this;
        }

        public Criteria andFzrghNotEqualTo(String value) {
            addCriterion("FZRGH <>", value, "fzrgh");
            return (Criteria) this;
        }

        public Criteria andFzrghGreaterThan(String value) {
            addCriterion("FZRGH >", value, "fzrgh");
            return (Criteria) this;
        }

        public Criteria andFzrghGreaterThanOrEqualTo(String value) {
            addCriterion("FZRGH >=", value, "fzrgh");
            return (Criteria) this;
        }

        public Criteria andFzrghLessThan(String value) {
            addCriterion("FZRGH <", value, "fzrgh");
            return (Criteria) this;
        }

        public Criteria andFzrghLessThanOrEqualTo(String value) {
            addCriterion("FZRGH <=", value, "fzrgh");
            return (Criteria) this;
        }

        public Criteria andFzrghLike(String value) {
            addCriterion("FZRGH like", value, "fzrgh");
            return (Criteria) this;
        }

        public Criteria andFzrghNotLike(String value) {
            addCriterion("FZRGH not like", value, "fzrgh");
            return (Criteria) this;
        }

        public Criteria andFzrghIn(List<String> values) {
            addCriterion("FZRGH in", values, "fzrgh");
            return (Criteria) this;
        }

        public Criteria andFzrghNotIn(List<String> values) {
            addCriterion("FZRGH not in", values, "fzrgh");
            return (Criteria) this;
        }

        public Criteria andFzrghBetween(String value1, String value2) {
            addCriterion("FZRGH between", value1, value2, "fzrgh");
            return (Criteria) this;
        }

        public Criteria andFzrghNotBetween(String value1, String value2) {
            addCriterion("FZRGH not between", value1, value2, "fzrgh");
            return (Criteria) this;
        }

        public Criteria andJsshIsNull() {
            addCriterion("JSSH is null");
            return (Criteria) this;
        }

        public Criteria andJsshIsNotNull() {
            addCriterion("JSSH is not null");
            return (Criteria) this;
        }

        public Criteria andJsshEqualTo(String value) {
            addCriterion("JSSH =", value, "jssh");
            return (Criteria) this;
        }

        public Criteria andJsshNotEqualTo(String value) {
            addCriterion("JSSH <>", value, "jssh");
            return (Criteria) this;
        }

        public Criteria andJsshGreaterThan(String value) {
            addCriterion("JSSH >", value, "jssh");
            return (Criteria) this;
        }

        public Criteria andJsshGreaterThanOrEqualTo(String value) {
            addCriterion("JSSH >=", value, "jssh");
            return (Criteria) this;
        }

        public Criteria andJsshLessThan(String value) {
            addCriterion("JSSH <", value, "jssh");
            return (Criteria) this;
        }

        public Criteria andJsshLessThanOrEqualTo(String value) {
            addCriterion("JSSH <=", value, "jssh");
            return (Criteria) this;
        }

        public Criteria andJsshLike(String value) {
            addCriterion("JSSH like", value, "jssh");
            return (Criteria) this;
        }

        public Criteria andJsshNotLike(String value) {
            addCriterion("JSSH not like", value, "jssh");
            return (Criteria) this;
        }

        public Criteria andJsshIn(List<String> values) {
            addCriterion("JSSH in", values, "jssh");
            return (Criteria) this;
        }

        public Criteria andJsshNotIn(List<String> values) {
            addCriterion("JSSH not in", values, "jssh");
            return (Criteria) this;
        }

        public Criteria andJsshBetween(String value1, String value2) {
            addCriterion("JSSH between", value1, value2, "jssh");
            return (Criteria) this;
        }

        public Criteria andJsshNotBetween(String value1, String value2) {
            addCriterion("JSSH not between", value1, value2, "jssh");
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