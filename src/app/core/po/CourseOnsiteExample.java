package app.core.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CourseOnsiteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseOnsiteExample() {
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

        public Criteria andPxkcIsNull() {
            addCriterion("PXKC is null");
            return (Criteria) this;
        }

        public Criteria andPxkcIsNotNull() {
            addCriterion("PXKC is not null");
            return (Criteria) this;
        }

        public Criteria andPxkcEqualTo(String value) {
            addCriterion("PXKC =", value, "pxkc");
            return (Criteria) this;
        }

        public Criteria andPxkcNotEqualTo(String value) {
            addCriterion("PXKC <>", value, "pxkc");
            return (Criteria) this;
        }

        public Criteria andPxkcGreaterThan(String value) {
            addCriterion("PXKC >", value, "pxkc");
            return (Criteria) this;
        }

        public Criteria andPxkcGreaterThanOrEqualTo(String value) {
            addCriterion("PXKC >=", value, "pxkc");
            return (Criteria) this;
        }

        public Criteria andPxkcLessThan(String value) {
            addCriterion("PXKC <", value, "pxkc");
            return (Criteria) this;
        }

        public Criteria andPxkcLessThanOrEqualTo(String value) {
            addCriterion("PXKC <=", value, "pxkc");
            return (Criteria) this;
        }

        public Criteria andPxkcLike(String value) {
            addCriterion("PXKC like", value, "pxkc");
            return (Criteria) this;
        }

        public Criteria andPxkcNotLike(String value) {
            addCriterion("PXKC not like", value, "pxkc");
            return (Criteria) this;
        }

        public Criteria andPxkcIn(List<String> values) {
            addCriterion("PXKC in", values, "pxkc");
            return (Criteria) this;
        }

        public Criteria andPxkcNotIn(List<String> values) {
            addCriterion("PXKC not in", values, "pxkc");
            return (Criteria) this;
        }

        public Criteria andPxkcBetween(String value1, String value2) {
            addCriterion("PXKC between", value1, value2, "pxkc");
            return (Criteria) this;
        }

        public Criteria andPxkcNotBetween(String value1, String value2) {
            addCriterion("PXKC not between", value1, value2, "pxkc");
            return (Criteria) this;
        }

        public Criteria andPxddIsNull() {
            addCriterion("PXDD is null");
            return (Criteria) this;
        }

        public Criteria andPxddIsNotNull() {
            addCriterion("PXDD is not null");
            return (Criteria) this;
        }

        public Criteria andPxddEqualTo(String value) {
            addCriterion("PXDD =", value, "pxdd");
            return (Criteria) this;
        }

        public Criteria andPxddNotEqualTo(String value) {
            addCriterion("PXDD <>", value, "pxdd");
            return (Criteria) this;
        }

        public Criteria andPxddGreaterThan(String value) {
            addCriterion("PXDD >", value, "pxdd");
            return (Criteria) this;
        }

        public Criteria andPxddGreaterThanOrEqualTo(String value) {
            addCriterion("PXDD >=", value, "pxdd");
            return (Criteria) this;
        }

        public Criteria andPxddLessThan(String value) {
            addCriterion("PXDD <", value, "pxdd");
            return (Criteria) this;
        }

        public Criteria andPxddLessThanOrEqualTo(String value) {
            addCriterion("PXDD <=", value, "pxdd");
            return (Criteria) this;
        }

        public Criteria andPxddLike(String value) {
            addCriterion("PXDD like", value, "pxdd");
            return (Criteria) this;
        }

        public Criteria andPxddNotLike(String value) {
            addCriterion("PXDD not like", value, "pxdd");
            return (Criteria) this;
        }

        public Criteria andPxddIn(List<String> values) {
            addCriterion("PXDD in", values, "pxdd");
            return (Criteria) this;
        }

        public Criteria andPxddNotIn(List<String> values) {
            addCriterion("PXDD not in", values, "pxdd");
            return (Criteria) this;
        }

        public Criteria andPxddBetween(String value1, String value2) {
            addCriterion("PXDD between", value1, value2, "pxdd");
            return (Criteria) this;
        }

        public Criteria andPxddNotBetween(String value1, String value2) {
            addCriterion("PXDD not between", value1, value2, "pxdd");
            return (Criteria) this;
        }

        public Criteria andPxfsIsNull() {
            addCriterion("PXFS is null");
            return (Criteria) this;
        }

        public Criteria andPxfsIsNotNull() {
            addCriterion("PXFS is not null");
            return (Criteria) this;
        }

        public Criteria andPxfsEqualTo(String value) {
            addCriterion("PXFS =", value, "pxfs");
            return (Criteria) this;
        }

        public Criteria andPxfsNotEqualTo(String value) {
            addCriterion("PXFS <>", value, "pxfs");
            return (Criteria) this;
        }

        public Criteria andPxfsGreaterThan(String value) {
            addCriterion("PXFS >", value, "pxfs");
            return (Criteria) this;
        }

        public Criteria andPxfsGreaterThanOrEqualTo(String value) {
            addCriterion("PXFS >=", value, "pxfs");
            return (Criteria) this;
        }

        public Criteria andPxfsLessThan(String value) {
            addCriterion("PXFS <", value, "pxfs");
            return (Criteria) this;
        }

        public Criteria andPxfsLessThanOrEqualTo(String value) {
            addCriterion("PXFS <=", value, "pxfs");
            return (Criteria) this;
        }

        public Criteria andPxfsLike(String value) {
            addCriterion("PXFS like", value, "pxfs");
            return (Criteria) this;
        }

        public Criteria andPxfsNotLike(String value) {
            addCriterion("PXFS not like", value, "pxfs");
            return (Criteria) this;
        }

        public Criteria andPxfsIn(List<String> values) {
            addCriterion("PXFS in", values, "pxfs");
            return (Criteria) this;
        }

        public Criteria andPxfsNotIn(List<String> values) {
            addCriterion("PXFS not in", values, "pxfs");
            return (Criteria) this;
        }

        public Criteria andPxfsBetween(String value1, String value2) {
            addCriterion("PXFS between", value1, value2, "pxfs");
            return (Criteria) this;
        }

        public Criteria andPxfsNotBetween(String value1, String value2) {
            addCriterion("PXFS not between", value1, value2, "pxfs");
            return (Criteria) this;
        }

        public Criteria andSklsIsNull() {
            addCriterion("SKLS is null");
            return (Criteria) this;
        }

        public Criteria andSklsIsNotNull() {
            addCriterion("SKLS is not null");
            return (Criteria) this;
        }

        public Criteria andSklsEqualTo(String value) {
            addCriterion("SKLS =", value, "skls");
            return (Criteria) this;
        }

        public Criteria andSklsNotEqualTo(String value) {
            addCriterion("SKLS <>", value, "skls");
            return (Criteria) this;
        }

        public Criteria andSklsGreaterThan(String value) {
            addCriterion("SKLS >", value, "skls");
            return (Criteria) this;
        }

        public Criteria andSklsGreaterThanOrEqualTo(String value) {
            addCriterion("SKLS >=", value, "skls");
            return (Criteria) this;
        }

        public Criteria andSklsLessThan(String value) {
            addCriterion("SKLS <", value, "skls");
            return (Criteria) this;
        }

        public Criteria andSklsLessThanOrEqualTo(String value) {
            addCriterion("SKLS <=", value, "skls");
            return (Criteria) this;
        }

        public Criteria andSklsLike(String value) {
            addCriterion("SKLS like", value, "skls");
            return (Criteria) this;
        }

        public Criteria andSklsNotLike(String value) {
            addCriterion("SKLS not like", value, "skls");
            return (Criteria) this;
        }

        public Criteria andSklsIn(List<String> values) {
            addCriterion("SKLS in", values, "skls");
            return (Criteria) this;
        }

        public Criteria andSklsNotIn(List<String> values) {
            addCriterion("SKLS not in", values, "skls");
            return (Criteria) this;
        }

        public Criteria andSklsBetween(String value1, String value2) {
            addCriterion("SKLS between", value1, value2, "skls");
            return (Criteria) this;
        }

        public Criteria andSklsNotBetween(String value1, String value2) {
            addCriterion("SKLS not between", value1, value2, "skls");
            return (Criteria) this;
        }

        public Criteria andSkxfIsNull() {
            addCriterion("SKXF is null");
            return (Criteria) this;
        }

        public Criteria andSkxfIsNotNull() {
            addCriterion("SKXF is not null");
            return (Criteria) this;
        }

        public Criteria andSkxfEqualTo(Double value) {
            addCriterion("SKXF =", value, "skxf");
            return (Criteria) this;
        }

        public Criteria andSkxfNotEqualTo(Double value) {
            addCriterion("SKXF <>", value, "skxf");
            return (Criteria) this;
        }

        public Criteria andSkxfGreaterThan(Double value) {
            addCriterion("SKXF >", value, "skxf");
            return (Criteria) this;
        }

        public Criteria andSkxfGreaterThanOrEqualTo(Double value) {
            addCriterion("SKXF >=", value, "skxf");
            return (Criteria) this;
        }

        public Criteria andSkxfLessThan(Double value) {
            addCriterion("SKXF <", value, "skxf");
            return (Criteria) this;
        }

        public Criteria andSkxfLessThanOrEqualTo(Double value) {
            addCriterion("SKXF <=", value, "skxf");
            return (Criteria) this;
        }

        public Criteria andSkxfIn(List<Double> values) {
            addCriterion("SKXF in", values, "skxf");
            return (Criteria) this;
        }

        public Criteria andSkxfNotIn(List<Double> values) {
            addCriterion("SKXF not in", values, "skxf");
            return (Criteria) this;
        }

        public Criteria andSkxfBetween(Double value1, Double value2) {
            addCriterion("SKXF between", value1, value2, "skxf");
            return (Criteria) this;
        }

        public Criteria andSkxfNotBetween(Double value1, Double value2) {
            addCriterion("SKXF not between", value1, value2, "skxf");
            return (Criteria) this;
        }

        public Criteria andCjrsIsNull() {
            addCriterion("CJRS is null");
            return (Criteria) this;
        }

        public Criteria andCjrsIsNotNull() {
            addCriterion("CJRS is not null");
            return (Criteria) this;
        }

        public Criteria andCjrsEqualTo(Double value) {
            addCriterion("CJRS =", value, "cjrs");
            return (Criteria) this;
        }

        public Criteria andCjrsNotEqualTo(Double value) {
            addCriterion("CJRS <>", value, "cjrs");
            return (Criteria) this;
        }

        public Criteria andCjrsGreaterThan(Double value) {
            addCriterion("CJRS >", value, "cjrs");
            return (Criteria) this;
        }

        public Criteria andCjrsGreaterThanOrEqualTo(Double value) {
            addCriterion("CJRS >=", value, "cjrs");
            return (Criteria) this;
        }

        public Criteria andCjrsLessThan(Double value) {
            addCriterion("CJRS <", value, "cjrs");
            return (Criteria) this;
        }

        public Criteria andCjrsLessThanOrEqualTo(Double value) {
            addCriterion("CJRS <=", value, "cjrs");
            return (Criteria) this;
        }

        public Criteria andCjrsIn(List<Double> values) {
            addCriterion("CJRS in", values, "cjrs");
            return (Criteria) this;
        }

        public Criteria andCjrsNotIn(List<Double> values) {
            addCriterion("CJRS not in", values, "cjrs");
            return (Criteria) this;
        }

        public Criteria andCjrsBetween(Double value1, Double value2) {
            addCriterion("CJRS between", value1, value2, "cjrs");
            return (Criteria) this;
        }

        public Criteria andCjrsNotBetween(Double value1, Double value2) {
            addCriterion("CJRS not between", value1, value2, "cjrs");
            return (Criteria) this;
        }

        public Criteria andPxzlIsNull() {
            addCriterion("PXZL is null");
            return (Criteria) this;
        }

        public Criteria andPxzlIsNotNull() {
            addCriterion("PXZL is not null");
            return (Criteria) this;
        }

        public Criteria andPxzlEqualTo(String value) {
            addCriterion("PXZL =", value, "pxzl");
            return (Criteria) this;
        }

        public Criteria andPxzlNotEqualTo(String value) {
            addCriterion("PXZL <>", value, "pxzl");
            return (Criteria) this;
        }

        public Criteria andPxzlGreaterThan(String value) {
            addCriterion("PXZL >", value, "pxzl");
            return (Criteria) this;
        }

        public Criteria andPxzlGreaterThanOrEqualTo(String value) {
            addCriterion("PXZL >=", value, "pxzl");
            return (Criteria) this;
        }

        public Criteria andPxzlLessThan(String value) {
            addCriterion("PXZL <", value, "pxzl");
            return (Criteria) this;
        }

        public Criteria andPxzlLessThanOrEqualTo(String value) {
            addCriterion("PXZL <=", value, "pxzl");
            return (Criteria) this;
        }

        public Criteria andPxzlLike(String value) {
            addCriterion("PXZL like", value, "pxzl");
            return (Criteria) this;
        }

        public Criteria andPxzlNotLike(String value) {
            addCriterion("PXZL not like", value, "pxzl");
            return (Criteria) this;
        }

        public Criteria andPxzlIn(List<String> values) {
            addCriterion("PXZL in", values, "pxzl");
            return (Criteria) this;
        }

        public Criteria andPxzlNotIn(List<String> values) {
            addCriterion("PXZL not in", values, "pxzl");
            return (Criteria) this;
        }

        public Criteria andPxzlBetween(String value1, String value2) {
            addCriterion("PXZL between", value1, value2, "pxzl");
            return (Criteria) this;
        }

        public Criteria andPxzlNotBetween(String value1, String value2) {
            addCriterion("PXZL not between", value1, value2, "pxzl");
            return (Criteria) this;
        }

        public Criteria andPxnrIsNull() {
            addCriterion("PXNR is null");
            return (Criteria) this;
        }

        public Criteria andPxnrIsNotNull() {
            addCriterion("PXNR is not null");
            return (Criteria) this;
        }

        public Criteria andPxnrEqualTo(String value) {
            addCriterion("PXNR =", value, "pxnr");
            return (Criteria) this;
        }

        public Criteria andPxnrNotEqualTo(String value) {
            addCriterion("PXNR <>", value, "pxnr");
            return (Criteria) this;
        }

        public Criteria andPxnrGreaterThan(String value) {
            addCriterion("PXNR >", value, "pxnr");
            return (Criteria) this;
        }

        public Criteria andPxnrGreaterThanOrEqualTo(String value) {
            addCriterion("PXNR >=", value, "pxnr");
            return (Criteria) this;
        }

        public Criteria andPxnrLessThan(String value) {
            addCriterion("PXNR <", value, "pxnr");
            return (Criteria) this;
        }

        public Criteria andPxnrLessThanOrEqualTo(String value) {
            addCriterion("PXNR <=", value, "pxnr");
            return (Criteria) this;
        }

        public Criteria andPxnrLike(String value) {
            addCriterion("PXNR like", value, "pxnr");
            return (Criteria) this;
        }

        public Criteria andPxnrNotLike(String value) {
            addCriterion("PXNR not like", value, "pxnr");
            return (Criteria) this;
        }

        public Criteria andPxnrIn(List<String> values) {
            addCriterion("PXNR in", values, "pxnr");
            return (Criteria) this;
        }

        public Criteria andPxnrNotIn(List<String> values) {
            addCriterion("PXNR not in", values, "pxnr");
            return (Criteria) this;
        }

        public Criteria andPxnrBetween(String value1, String value2) {
            addCriterion("PXNR between", value1, value2, "pxnr");
            return (Criteria) this;
        }

        public Criteria andPxnrNotBetween(String value1, String value2) {
            addCriterion("PXNR not between", value1, value2, "pxnr");
            return (Criteria) this;
        }

        public Criteria andPxjlrIsNull() {
            addCriterion("PXJLR is null");
            return (Criteria) this;
        }

        public Criteria andPxjlrIsNotNull() {
            addCriterion("PXJLR is not null");
            return (Criteria) this;
        }

        public Criteria andPxjlrEqualTo(String value) {
            addCriterion("PXJLR =", value, "pxjlr");
            return (Criteria) this;
        }

        public Criteria andPxjlrNotEqualTo(String value) {
            addCriterion("PXJLR <>", value, "pxjlr");
            return (Criteria) this;
        }

        public Criteria andPxjlrGreaterThan(String value) {
            addCriterion("PXJLR >", value, "pxjlr");
            return (Criteria) this;
        }

        public Criteria andPxjlrGreaterThanOrEqualTo(String value) {
            addCriterion("PXJLR >=", value, "pxjlr");
            return (Criteria) this;
        }

        public Criteria andPxjlrLessThan(String value) {
            addCriterion("PXJLR <", value, "pxjlr");
            return (Criteria) this;
        }

        public Criteria andPxjlrLessThanOrEqualTo(String value) {
            addCriterion("PXJLR <=", value, "pxjlr");
            return (Criteria) this;
        }

        public Criteria andPxjlrLike(String value) {
            addCriterion("PXJLR like", value, "pxjlr");
            return (Criteria) this;
        }

        public Criteria andPxjlrNotLike(String value) {
            addCriterion("PXJLR not like", value, "pxjlr");
            return (Criteria) this;
        }

        public Criteria andPxjlrIn(List<String> values) {
            addCriterion("PXJLR in", values, "pxjlr");
            return (Criteria) this;
        }

        public Criteria andPxjlrNotIn(List<String> values) {
            addCriterion("PXJLR not in", values, "pxjlr");
            return (Criteria) this;
        }

        public Criteria andPxjlrBetween(String value1, String value2) {
            addCriterion("PXJLR between", value1, value2, "pxjlr");
            return (Criteria) this;
        }

        public Criteria andPxjlrNotBetween(String value1, String value2) {
            addCriterion("PXJLR not between", value1, value2, "pxjlr");
            return (Criteria) this;
        }

        public Criteria andPxsjIsNull() {
            addCriterion("PXSJ is null");
            return (Criteria) this;
        }

        public Criteria andPxsjIsNotNull() {
            addCriterion("PXSJ is not null");
            return (Criteria) this;
        }

        public Criteria andPxsjEqualTo(Date value) {
            addCriterion("PXSJ =", value, "pxsj");
            return (Criteria) this;
        }

        public Criteria andPxsjNotEqualTo(Date value) {
            addCriterion("PXSJ <>", value, "pxsj");
            return (Criteria) this;
        }

        public Criteria andPxsjGreaterThan(Date value) {
            addCriterion("PXSJ >", value, "pxsj");
            return (Criteria) this;
        }

        public Criteria andPxsjGreaterThanOrEqualTo(Date value) {
            addCriterion("PXSJ >=", value, "pxsj");
            return (Criteria) this;
        }

        public Criteria andPxsjLessThan(Date value) {
            addCriterion("PXSJ <", value, "pxsj");
            return (Criteria) this;
        }

        public Criteria andPxsjLessThanOrEqualTo(Date value) {
            addCriterion("PXSJ <=", value, "pxsj");
            return (Criteria) this;
        }

        public Criteria andPxsjIn(List<Date> values) {
            addCriterion("PXSJ in", values, "pxsj");
            return (Criteria) this;
        }

        public Criteria andPxsjNotIn(List<Date> values) {
            addCriterion("PXSJ not in", values, "pxsj");
            return (Criteria) this;
        }

        public Criteria andPxsjBetween(Date value1, Date value2) {
            addCriterion("PXSJ between", value1, value2, "pxsj");
            return (Criteria) this;
        }

        public Criteria andPxsjNotBetween(Date value1, Date value2) {
            addCriterion("PXSJ not between", value1, value2, "pxsj");
            return (Criteria) this;
        }

        public Criteria andPxjlsjIsNull() {
            addCriterion("PXJLSJ is null");
            return (Criteria) this;
        }

        public Criteria andPxjlsjIsNotNull() {
            addCriterion("PXJLSJ is not null");
            return (Criteria) this;
        }

        public Criteria andPxjlsjEqualTo(Date value) {
            addCriterion("PXJLSJ =", value, "pxjlsj");
            return (Criteria) this;
        }

        public Criteria andPxjlsjNotEqualTo(Date value) {
            addCriterion("PXJLSJ <>", value, "pxjlsj");
            return (Criteria) this;
        }

        public Criteria andPxjlsjGreaterThan(Date value) {
            addCriterion("PXJLSJ >", value, "pxjlsj");
            return (Criteria) this;
        }

        public Criteria andPxjlsjGreaterThanOrEqualTo(Date value) {
            addCriterion("PXJLSJ >=", value, "pxjlsj");
            return (Criteria) this;
        }

        public Criteria andPxjlsjLessThan(Date value) {
            addCriterion("PXJLSJ <", value, "pxjlsj");
            return (Criteria) this;
        }

        public Criteria andPxjlsjLessThanOrEqualTo(Date value) {
            addCriterion("PXJLSJ <=", value, "pxjlsj");
            return (Criteria) this;
        }

        public Criteria andPxjlsjIn(List<Date> values) {
            addCriterion("PXJLSJ in", values, "pxjlsj");
            return (Criteria) this;
        }

        public Criteria andPxjlsjNotIn(List<Date> values) {
            addCriterion("PXJLSJ not in", values, "pxjlsj");
            return (Criteria) this;
        }

        public Criteria andPxjlsjBetween(Date value1, Date value2) {
            addCriterion("PXJLSJ between", value1, value2, "pxjlsj");
            return (Criteria) this;
        }

        public Criteria andPxjlsjNotBetween(Date value1, Date value2) {
            addCriterion("PXJLSJ not between", value1, value2, "pxjlsj");
            return (Criteria) this;
        }

        public Criteria andPxzzbmIsNull() {
            addCriterion("PXZZBM is null");
            return (Criteria) this;
        }

        public Criteria andPxzzbmIsNotNull() {
            addCriterion("PXZZBM is not null");
            return (Criteria) this;
        }

        public Criteria andPxzzbmEqualTo(String value) {
            addCriterion("PXZZBM =", value, "pxzzbm");
            return (Criteria) this;
        }

        public Criteria andPxzzbmNotEqualTo(String value) {
            addCriterion("PXZZBM <>", value, "pxzzbm");
            return (Criteria) this;
        }

        public Criteria andPxzzbmGreaterThan(String value) {
            addCriterion("PXZZBM >", value, "pxzzbm");
            return (Criteria) this;
        }

        public Criteria andPxzzbmGreaterThanOrEqualTo(String value) {
            addCriterion("PXZZBM >=", value, "pxzzbm");
            return (Criteria) this;
        }

        public Criteria andPxzzbmLessThan(String value) {
            addCriterion("PXZZBM <", value, "pxzzbm");
            return (Criteria) this;
        }

        public Criteria andPxzzbmLessThanOrEqualTo(String value) {
            addCriterion("PXZZBM <=", value, "pxzzbm");
            return (Criteria) this;
        }

        public Criteria andPxzzbmLike(String value) {
            addCriterion("PXZZBM like", value, "pxzzbm");
            return (Criteria) this;
        }

        public Criteria andPxzzbmNotLike(String value) {
            addCriterion("PXZZBM not like", value, "pxzzbm");
            return (Criteria) this;
        }

        public Criteria andPxzzbmIn(List<String> values) {
            addCriterion("PXZZBM in", values, "pxzzbm");
            return (Criteria) this;
        }

        public Criteria andPxzzbmNotIn(List<String> values) {
            addCriterion("PXZZBM not in", values, "pxzzbm");
            return (Criteria) this;
        }

        public Criteria andPxzzbmBetween(String value1, String value2) {
            addCriterion("PXZZBM between", value1, value2, "pxzzbm");
            return (Criteria) this;
        }

        public Criteria andPxzzbmNotBetween(String value1, String value2) {
            addCriterion("PXZZBM not between", value1, value2, "pxzzbm");
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