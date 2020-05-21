package app.core.po;

import java.util.ArrayList;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        public Criteria andJszhIsNull() {
            addCriterion("JSZH is null");
            return (Criteria) this;
        }

        public Criteria andJszhIsNotNull() {
            addCriterion("JSZH is not null");
            return (Criteria) this;
        }

        public Criteria andJszhEqualTo(String value) {
            addCriterion("JSZH =", value, "jszh");
            return (Criteria) this;
        }

        public Criteria andJszhNotEqualTo(String value) {
            addCriterion("JSZH <>", value, "jszh");
            return (Criteria) this;
        }

        public Criteria andJszhGreaterThan(String value) {
            addCriterion("JSZH >", value, "jszh");
            return (Criteria) this;
        }

        public Criteria andJszhGreaterThanOrEqualTo(String value) {
            addCriterion("JSZH >=", value, "jszh");
            return (Criteria) this;
        }

        public Criteria andJszhLessThan(String value) {
            addCriterion("JSZH <", value, "jszh");
            return (Criteria) this;
        }

        public Criteria andJszhLessThanOrEqualTo(String value) {
            addCriterion("JSZH <=", value, "jszh");
            return (Criteria) this;
        }

        public Criteria andJszhLike(String value) {
            addCriterion("JSZH like", value, "jszh");
            return (Criteria) this;
        }

        public Criteria andJszhNotLike(String value) {
            addCriterion("JSZH not like", value, "jszh");
            return (Criteria) this;
        }

        public Criteria andJszhIn(List<String> values) {
            addCriterion("JSZH in", values, "jszh");
            return (Criteria) this;
        }

        public Criteria andJszhNotIn(List<String> values) {
            addCriterion("JSZH not in", values, "jszh");
            return (Criteria) this;
        }

        public Criteria andJszhBetween(String value1, String value2) {
            addCriterion("JSZH between", value1, value2, "jszh");
            return (Criteria) this;
        }

        public Criteria andJszhNotBetween(String value1, String value2) {
            addCriterion("JSZH not between", value1, value2, "jszh");
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

        public Criteria andJsmmIsNull() {
            addCriterion("JSMM is null");
            return (Criteria) this;
        }

        public Criteria andJsmmIsNotNull() {
            addCriterion("JSMM is not null");
            return (Criteria) this;
        }

        public Criteria andJsmmEqualTo(String value) {
            addCriterion("JSMM =", value, "jsmm");
            return (Criteria) this;
        }

        public Criteria andJsmmNotEqualTo(String value) {
            addCriterion("JSMM <>", value, "jsmm");
            return (Criteria) this;
        }

        public Criteria andJsmmGreaterThan(String value) {
            addCriterion("JSMM >", value, "jsmm");
            return (Criteria) this;
        }

        public Criteria andJsmmGreaterThanOrEqualTo(String value) {
            addCriterion("JSMM >=", value, "jsmm");
            return (Criteria) this;
        }

        public Criteria andJsmmLessThan(String value) {
            addCriterion("JSMM <", value, "jsmm");
            return (Criteria) this;
        }

        public Criteria andJsmmLessThanOrEqualTo(String value) {
            addCriterion("JSMM <=", value, "jsmm");
            return (Criteria) this;
        }

        public Criteria andJsmmLike(String value) {
            addCriterion("JSMM like", value, "jsmm");
            return (Criteria) this;
        }

        public Criteria andJsmmNotLike(String value) {
            addCriterion("JSMM not like", value, "jsmm");
            return (Criteria) this;
        }

        public Criteria andJsmmIn(List<String> values) {
            addCriterion("JSMM in", values, "jsmm");
            return (Criteria) this;
        }

        public Criteria andJsmmNotIn(List<String> values) {
            addCriterion("JSMM not in", values, "jsmm");
            return (Criteria) this;
        }

        public Criteria andJsmmBetween(String value1, String value2) {
            addCriterion("JSMM between", value1, value2, "jsmm");
            return (Criteria) this;
        }

        public Criteria andJsmmNotBetween(String value1, String value2) {
            addCriterion("JSMM not between", value1, value2, "jsmm");
            return (Criteria) this;
        }

        public Criteria andJsxmIsNull() {
            addCriterion("JSXM is null");
            return (Criteria) this;
        }

        public Criteria andJsxmIsNotNull() {
            addCriterion("JSXM is not null");
            return (Criteria) this;
        }

        public Criteria andJsxmEqualTo(String value) {
            addCriterion("JSXM =", value, "jsxm");
            return (Criteria) this;
        }

        public Criteria andJsxmNotEqualTo(String value) {
            addCriterion("JSXM <>", value, "jsxm");
            return (Criteria) this;
        }

        public Criteria andJsxmGreaterThan(String value) {
            addCriterion("JSXM >", value, "jsxm");
            return (Criteria) this;
        }

        public Criteria andJsxmGreaterThanOrEqualTo(String value) {
            addCriterion("JSXM >=", value, "jsxm");
            return (Criteria) this;
        }

        public Criteria andJsxmLessThan(String value) {
            addCriterion("JSXM <", value, "jsxm");
            return (Criteria) this;
        }

        public Criteria andJsxmLessThanOrEqualTo(String value) {
            addCriterion("JSXM <=", value, "jsxm");
            return (Criteria) this;
        }

        public Criteria andJsxmLike(String value) {
            addCriterion("JSXM like", value, "jsxm");
            return (Criteria) this;
        }

        public Criteria andJsxmNotLike(String value) {
            addCriterion("JSXM not like", value, "jsxm");
            return (Criteria) this;
        }

        public Criteria andJsxmIn(List<String> values) {
            addCriterion("JSXM in", values, "jsxm");
            return (Criteria) this;
        }

        public Criteria andJsxmNotIn(List<String> values) {
            addCriterion("JSXM not in", values, "jsxm");
            return (Criteria) this;
        }

        public Criteria andJsxmBetween(String value1, String value2) {
            addCriterion("JSXM between", value1, value2, "jsxm");
            return (Criteria) this;
        }

        public Criteria andJsxmNotBetween(String value1, String value2) {
            addCriterion("JSXM not between", value1, value2, "jsxm");
            return (Criteria) this;
        }

        public Criteria andJszyIsNull() {
            addCriterion("JSZY is null");
            return (Criteria) this;
        }

        public Criteria andJszyIsNotNull() {
            addCriterion("JSZY is not null");
            return (Criteria) this;
        }

        public Criteria andJszyEqualTo(String value) {
            addCriterion("JSZY =", value, "jszy");
            return (Criteria) this;
        }

        public Criteria andJszyNotEqualTo(String value) {
            addCriterion("JSZY <>", value, "jszy");
            return (Criteria) this;
        }

        public Criteria andJszyGreaterThan(String value) {
            addCriterion("JSZY >", value, "jszy");
            return (Criteria) this;
        }

        public Criteria andJszyGreaterThanOrEqualTo(String value) {
            addCriterion("JSZY >=", value, "jszy");
            return (Criteria) this;
        }

        public Criteria andJszyLessThan(String value) {
            addCriterion("JSZY <", value, "jszy");
            return (Criteria) this;
        }

        public Criteria andJszyLessThanOrEqualTo(String value) {
            addCriterion("JSZY <=", value, "jszy");
            return (Criteria) this;
        }

        public Criteria andJszyLike(String value) {
            addCriterion("JSZY like", value, "jszy");
            return (Criteria) this;
        }

        public Criteria andJszyNotLike(String value) {
            addCriterion("JSZY not like", value, "jszy");
            return (Criteria) this;
        }

        public Criteria andJszyIn(List<String> values) {
            addCriterion("JSZY in", values, "jszy");
            return (Criteria) this;
        }

        public Criteria andJszyNotIn(List<String> values) {
            addCriterion("JSZY not in", values, "jszy");
            return (Criteria) this;
        }

        public Criteria andJszyBetween(String value1, String value2) {
            addCriterion("JSZY between", value1, value2, "jszy");
            return (Criteria) this;
        }

        public Criteria andJszyNotBetween(String value1, String value2) {
            addCriterion("JSZY not between", value1, value2, "jszy");
            return (Criteria) this;
        }

        public Criteria andJsdwbhIsNull() {
            addCriterion("JSDWBH is null");
            return (Criteria) this;
        }

        public Criteria andJsdwbhIsNotNull() {
            addCriterion("JSDWBH is not null");
            return (Criteria) this;
        }

        public Criteria andJsdwbhEqualTo(String value) {
            addCriterion("JSDWBH =", value, "jsdwbh");
            return (Criteria) this;
        }

        public Criteria andJsdwbhNotEqualTo(String value) {
            addCriterion("JSDWBH <>", value, "jsdwbh");
            return (Criteria) this;
        }

        public Criteria andJsdwbhGreaterThan(String value) {
            addCriterion("JSDWBH >", value, "jsdwbh");
            return (Criteria) this;
        }

        public Criteria andJsdwbhGreaterThanOrEqualTo(String value) {
            addCriterion("JSDWBH >=", value, "jsdwbh");
            return (Criteria) this;
        }

        public Criteria andJsdwbhLessThan(String value) {
            addCriterion("JSDWBH <", value, "jsdwbh");
            return (Criteria) this;
        }

        public Criteria andJsdwbhLessThanOrEqualTo(String value) {
            addCriterion("JSDWBH <=", value, "jsdwbh");
            return (Criteria) this;
        }

        public Criteria andJsdwbhLike(String value) {
            addCriterion("JSDWBH like", value, "jsdwbh");
            return (Criteria) this;
        }

        public Criteria andJsdwbhNotLike(String value) {
            addCriterion("JSDWBH not like", value, "jsdwbh");
            return (Criteria) this;
        }

        public Criteria andJsdwbhIn(List<String> values) {
            addCriterion("JSDWBH in", values, "jsdwbh");
            return (Criteria) this;
        }

        public Criteria andJsdwbhNotIn(List<String> values) {
            addCriterion("JSDWBH not in", values, "jsdwbh");
            return (Criteria) this;
        }

        public Criteria andJsdwbhBetween(String value1, String value2) {
            addCriterion("JSDWBH between", value1, value2, "jsdwbh");
            return (Criteria) this;
        }

        public Criteria andJsdwbhNotBetween(String value1, String value2) {
            addCriterion("JSDWBH not between", value1, value2, "jsdwbh");
            return (Criteria) this;
        }

        public Criteria andJsdjIsNull() {
            addCriterion("JSDJ is null");
            return (Criteria) this;
        }

        public Criteria andJsdjIsNotNull() {
            addCriterion("JSDJ is not null");
            return (Criteria) this;
        }

        public Criteria andJsdjEqualTo(Integer value) {
            addCriterion("JSDJ =", value, "jsdj");
            return (Criteria) this;
        }

        public Criteria andJsdjNotEqualTo(Integer value) {
            addCriterion("JSDJ <>", value, "jsdj");
            return (Criteria) this;
        }

        public Criteria andJsdjGreaterThan(Integer value) {
            addCriterion("JSDJ >", value, "jsdj");
            return (Criteria) this;
        }

        public Criteria andJsdjGreaterThanOrEqualTo(Integer value) {
            addCriterion("JSDJ >=", value, "jsdj");
            return (Criteria) this;
        }

        public Criteria andJsdjLessThan(Integer value) {
            addCriterion("JSDJ <", value, "jsdj");
            return (Criteria) this;
        }

        public Criteria andJsdjLessThanOrEqualTo(Integer value) {
            addCriterion("JSDJ <=", value, "jsdj");
            return (Criteria) this;
        }

        public Criteria andJsdjIn(List<Integer> values) {
            addCriterion("JSDJ in", values, "jsdj");
            return (Criteria) this;
        }

        public Criteria andJsdjNotIn(List<Integer> values) {
            addCriterion("JSDJ not in", values, "jsdj");
            return (Criteria) this;
        }

        public Criteria andJsdjBetween(Integer value1, Integer value2) {
            addCriterion("JSDJ between", value1, value2, "jsdj");
            return (Criteria) this;
        }

        public Criteria andJsdjNotBetween(Integer value1, Integer value2) {
            addCriterion("JSDJ not between", value1, value2, "jsdj");
            return (Criteria) this;
        }

        public Criteria andJsdlztIsNull() {
            addCriterion("JSDLZT is null");
            return (Criteria) this;
        }

        public Criteria andJsdlztIsNotNull() {
            addCriterion("JSDLZT is not null");
            return (Criteria) this;
        }

        public Criteria andJsdlztEqualTo(Integer value) {
            addCriterion("JSDLZT =", value, "jsdlzt");
            return (Criteria) this;
        }

        public Criteria andJsdlztNotEqualTo(Integer value) {
            addCriterion("JSDLZT <>", value, "jsdlzt");
            return (Criteria) this;
        }

        public Criteria andJsdlztGreaterThan(Integer value) {
            addCriterion("JSDLZT >", value, "jsdlzt");
            return (Criteria) this;
        }

        public Criteria andJsdlztGreaterThanOrEqualTo(Integer value) {
            addCriterion("JSDLZT >=", value, "jsdlzt");
            return (Criteria) this;
        }

        public Criteria andJsdlztLessThan(Integer value) {
            addCriterion("JSDLZT <", value, "jsdlzt");
            return (Criteria) this;
        }

        public Criteria andJsdlztLessThanOrEqualTo(Integer value) {
            addCriterion("JSDLZT <=", value, "jsdlzt");
            return (Criteria) this;
        }

        public Criteria andJsdlztIn(List<Integer> values) {
            addCriterion("JSDLZT in", values, "jsdlzt");
            return (Criteria) this;
        }

        public Criteria andJsdlztNotIn(List<Integer> values) {
            addCriterion("JSDLZT not in", values, "jsdlzt");
            return (Criteria) this;
        }

        public Criteria andJsdlztBetween(Integer value1, Integer value2) {
            addCriterion("JSDLZT between", value1, value2, "jsdlzt");
            return (Criteria) this;
        }

        public Criteria andJsdlztNotBetween(Integer value1, Integer value2) {
            addCriterion("JSDLZT not between", value1, value2, "jsdlzt");
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

        public Criteria andJsbsIsNull() {
            addCriterion("JSBS is null");
            return (Criteria) this;
        }

        public Criteria andJsbsIsNotNull() {
            addCriterion("JSBS is not null");
            return (Criteria) this;
        }

        public Criteria andJsbsEqualTo(String value) {
            addCriterion("JSBS =", value, "jsbs");
            return (Criteria) this;
        }

        public Criteria andJsbsNotEqualTo(String value) {
            addCriterion("JSBS <>", value, "jsbs");
            return (Criteria) this;
        }

        public Criteria andJsbsGreaterThan(String value) {
            addCriterion("JSBS >", value, "jsbs");
            return (Criteria) this;
        }

        public Criteria andJsbsGreaterThanOrEqualTo(String value) {
            addCriterion("JSBS >=", value, "jsbs");
            return (Criteria) this;
        }

        public Criteria andJsbsLessThan(String value) {
            addCriterion("JSBS <", value, "jsbs");
            return (Criteria) this;
        }

        public Criteria andJsbsLessThanOrEqualTo(String value) {
            addCriterion("JSBS <=", value, "jsbs");
            return (Criteria) this;
        }

        public Criteria andJsbsLike(String value) {
            addCriterion("JSBS like", value, "jsbs");
            return (Criteria) this;
        }

        public Criteria andJsbsNotLike(String value) {
            addCriterion("JSBS not like", value, "jsbs");
            return (Criteria) this;
        }

        public Criteria andJsbsIn(List<String> values) {
            addCriterion("JSBS in", values, "jsbs");
            return (Criteria) this;
        }

        public Criteria andJsbsNotIn(List<String> values) {
            addCriterion("JSBS not in", values, "jsbs");
            return (Criteria) this;
        }

        public Criteria andJsbsBetween(String value1, String value2) {
            addCriterion("JSBS between", value1, value2, "jsbs");
            return (Criteria) this;
        }

        public Criteria andJsbsNotBetween(String value1, String value2) {
            addCriterion("JSBS not between", value1, value2, "jsbs");
            return (Criteria) this;
        }

        public Criteria andJsxbIsNull() {
            addCriterion("JSXB is null");
            return (Criteria) this;
        }

        public Criteria andJsxbIsNotNull() {
            addCriterion("JSXB is not null");
            return (Criteria) this;
        }

        public Criteria andJsxbEqualTo(String value) {
            addCriterion("JSXB =", value, "jsxb");
            return (Criteria) this;
        }

        public Criteria andJsxbNotEqualTo(String value) {
            addCriterion("JSXB <>", value, "jsxb");
            return (Criteria) this;
        }

        public Criteria andJsxbGreaterThan(String value) {
            addCriterion("JSXB >", value, "jsxb");
            return (Criteria) this;
        }

        public Criteria andJsxbGreaterThanOrEqualTo(String value) {
            addCriterion("JSXB >=", value, "jsxb");
            return (Criteria) this;
        }

        public Criteria andJsxbLessThan(String value) {
            addCriterion("JSXB <", value, "jsxb");
            return (Criteria) this;
        }

        public Criteria andJsxbLessThanOrEqualTo(String value) {
            addCriterion("JSXB <=", value, "jsxb");
            return (Criteria) this;
        }

        public Criteria andJsxbLike(String value) {
            addCriterion("JSXB like", value, "jsxb");
            return (Criteria) this;
        }

        public Criteria andJsxbNotLike(String value) {
            addCriterion("JSXB not like", value, "jsxb");
            return (Criteria) this;
        }

        public Criteria andJsxbIn(List<String> values) {
            addCriterion("JSXB in", values, "jsxb");
            return (Criteria) this;
        }

        public Criteria andJsxbNotIn(List<String> values) {
            addCriterion("JSXB not in", values, "jsxb");
            return (Criteria) this;
        }

        public Criteria andJsxbBetween(String value1, String value2) {
            addCriterion("JSXB between", value1, value2, "jsxb");
            return (Criteria) this;
        }

        public Criteria andJsxbNotBetween(String value1, String value2) {
            addCriterion("JSXB not between", value1, value2, "jsxb");
            return (Criteria) this;
        }

        public Criteria andJsnlIsNull() {
            addCriterion("JSNL is null");
            return (Criteria) this;
        }

        public Criteria andJsnlIsNotNull() {
            addCriterion("JSNL is not null");
            return (Criteria) this;
        }

        public Criteria andJsnlEqualTo(Integer value) {
            addCriterion("JSNL =", value, "jsnl");
            return (Criteria) this;
        }

        public Criteria andJsnlNotEqualTo(Integer value) {
            addCriterion("JSNL <>", value, "jsnl");
            return (Criteria) this;
        }

        public Criteria andJsnlGreaterThan(Integer value) {
            addCriterion("JSNL >", value, "jsnl");
            return (Criteria) this;
        }

        public Criteria andJsnlGreaterThanOrEqualTo(Integer value) {
            addCriterion("JSNL >=", value, "jsnl");
            return (Criteria) this;
        }

        public Criteria andJsnlLessThan(Integer value) {
            addCriterion("JSNL <", value, "jsnl");
            return (Criteria) this;
        }

        public Criteria andJsnlLessThanOrEqualTo(Integer value) {
            addCriterion("JSNL <=", value, "jsnl");
            return (Criteria) this;
        }

        public Criteria andJsnlIn(List<Integer> values) {
            addCriterion("JSNL in", values, "jsnl");
            return (Criteria) this;
        }

        public Criteria andJsnlNotIn(List<Integer> values) {
            addCriterion("JSNL not in", values, "jsnl");
            return (Criteria) this;
        }

        public Criteria andJsnlBetween(Integer value1, Integer value2) {
            addCriterion("JSNL between", value1, value2, "jsnl");
            return (Criteria) this;
        }

        public Criteria andJsnlNotBetween(Integer value1, Integer value2) {
            addCriterion("JSNL not between", value1, value2, "jsnl");
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

        public Criteria andJsjjIsNull() {
            addCriterion("JSJJ is null");
            return (Criteria) this;
        }

        public Criteria andJsjjIsNotNull() {
            addCriterion("JSJJ is not null");
            return (Criteria) this;
        }

        public Criteria andJsjjEqualTo(String value) {
            addCriterion("JSJJ =", value, "jsjj");
            return (Criteria) this;
        }

        public Criteria andJsjjNotEqualTo(String value) {
            addCriterion("JSJJ <>", value, "jsjj");
            return (Criteria) this;
        }

        public Criteria andJsjjGreaterThan(String value) {
            addCriterion("JSJJ >", value, "jsjj");
            return (Criteria) this;
        }

        public Criteria andJsjjGreaterThanOrEqualTo(String value) {
            addCriterion("JSJJ >=", value, "jsjj");
            return (Criteria) this;
        }

        public Criteria andJsjjLessThan(String value) {
            addCriterion("JSJJ <", value, "jsjj");
            return (Criteria) this;
        }

        public Criteria andJsjjLessThanOrEqualTo(String value) {
            addCriterion("JSJJ <=", value, "jsjj");
            return (Criteria) this;
        }

        public Criteria andJsjjLike(String value) {
            addCriterion("JSJJ like", value, "jsjj");
            return (Criteria) this;
        }

        public Criteria andJsjjNotLike(String value) {
            addCriterion("JSJJ not like", value, "jsjj");
            return (Criteria) this;
        }

        public Criteria andJsjjIn(List<String> values) {
            addCriterion("JSJJ in", values, "jsjj");
            return (Criteria) this;
        }

        public Criteria andJsjjNotIn(List<String> values) {
            addCriterion("JSJJ not in", values, "jsjj");
            return (Criteria) this;
        }

        public Criteria andJsjjBetween(String value1, String value2) {
            addCriterion("JSJJ between", value1, value2, "jsjj");
            return (Criteria) this;
        }

        public Criteria andJsjjNotBetween(String value1, String value2) {
            addCriterion("JSJJ not between", value1, value2, "jsjj");
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