package app.core.po;

import java.util.ArrayList;
import java.util.List;

public class CourseFeedbackQuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseFeedbackQuestionExample() {
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

        public Criteria andFktmmcIsNull() {
            addCriterion("FKTMMC is null");
            return (Criteria) this;
        }

        public Criteria andFktmmcIsNotNull() {
            addCriterion("FKTMMC is not null");
            return (Criteria) this;
        }

        public Criteria andFktmmcEqualTo(String value) {
            addCriterion("FKTMMC =", value, "fktmmc");
            return (Criteria) this;
        }

        public Criteria andFktmmcNotEqualTo(String value) {
            addCriterion("FKTMMC <>", value, "fktmmc");
            return (Criteria) this;
        }

        public Criteria andFktmmcGreaterThan(String value) {
            addCriterion("FKTMMC >", value, "fktmmc");
            return (Criteria) this;
        }

        public Criteria andFktmmcGreaterThanOrEqualTo(String value) {
            addCriterion("FKTMMC >=", value, "fktmmc");
            return (Criteria) this;
        }

        public Criteria andFktmmcLessThan(String value) {
            addCriterion("FKTMMC <", value, "fktmmc");
            return (Criteria) this;
        }

        public Criteria andFktmmcLessThanOrEqualTo(String value) {
            addCriterion("FKTMMC <=", value, "fktmmc");
            return (Criteria) this;
        }

        public Criteria andFktmmcLike(String value) {
            addCriterion("FKTMMC like", value, "fktmmc");
            return (Criteria) this;
        }

        public Criteria andFktmmcNotLike(String value) {
            addCriterion("FKTMMC not like", value, "fktmmc");
            return (Criteria) this;
        }

        public Criteria andFktmmcIn(List<String> values) {
            addCriterion("FKTMMC in", values, "fktmmc");
            return (Criteria) this;
        }

        public Criteria andFktmmcNotIn(List<String> values) {
            addCriterion("FKTMMC not in", values, "fktmmc");
            return (Criteria) this;
        }

        public Criteria andFktmmcBetween(String value1, String value2) {
            addCriterion("FKTMMC between", value1, value2, "fktmmc");
            return (Criteria) this;
        }

        public Criteria andFktmmcNotBetween(String value1, String value2) {
            addCriterion("FKTMMC not between", value1, value2, "fktmmc");
            return (Criteria) this;
        }

        public Criteria andFktmxx1IsNull() {
            addCriterion("FKTMXX1 is null");
            return (Criteria) this;
        }

        public Criteria andFktmxx1IsNotNull() {
            addCriterion("FKTMXX1 is not null");
            return (Criteria) this;
        }

        public Criteria andFktmxx1EqualTo(String value) {
            addCriterion("FKTMXX1 =", value, "fktmxx1");
            return (Criteria) this;
        }

        public Criteria andFktmxx1NotEqualTo(String value) {
            addCriterion("FKTMXX1 <>", value, "fktmxx1");
            return (Criteria) this;
        }

        public Criteria andFktmxx1GreaterThan(String value) {
            addCriterion("FKTMXX1 >", value, "fktmxx1");
            return (Criteria) this;
        }

        public Criteria andFktmxx1GreaterThanOrEqualTo(String value) {
            addCriterion("FKTMXX1 >=", value, "fktmxx1");
            return (Criteria) this;
        }

        public Criteria andFktmxx1LessThan(String value) {
            addCriterion("FKTMXX1 <", value, "fktmxx1");
            return (Criteria) this;
        }

        public Criteria andFktmxx1LessThanOrEqualTo(String value) {
            addCriterion("FKTMXX1 <=", value, "fktmxx1");
            return (Criteria) this;
        }

        public Criteria andFktmxx1Like(String value) {
            addCriterion("FKTMXX1 like", value, "fktmxx1");
            return (Criteria) this;
        }

        public Criteria andFktmxx1NotLike(String value) {
            addCriterion("FKTMXX1 not like", value, "fktmxx1");
            return (Criteria) this;
        }

        public Criteria andFktmxx1In(List<String> values) {
            addCriterion("FKTMXX1 in", values, "fktmxx1");
            return (Criteria) this;
        }

        public Criteria andFktmxx1NotIn(List<String> values) {
            addCriterion("FKTMXX1 not in", values, "fktmxx1");
            return (Criteria) this;
        }

        public Criteria andFktmxx1Between(String value1, String value2) {
            addCriterion("FKTMXX1 between", value1, value2, "fktmxx1");
            return (Criteria) this;
        }

        public Criteria andFktmxx1NotBetween(String value1, String value2) {
            addCriterion("FKTMXX1 not between", value1, value2, "fktmxx1");
            return (Criteria) this;
        }

        public Criteria andFktmxx2IsNull() {
            addCriterion("FKTMXX2 is null");
            return (Criteria) this;
        }

        public Criteria andFktmxx2IsNotNull() {
            addCriterion("FKTMXX2 is not null");
            return (Criteria) this;
        }

        public Criteria andFktmxx2EqualTo(String value) {
            addCriterion("FKTMXX2 =", value, "fktmxx2");
            return (Criteria) this;
        }

        public Criteria andFktmxx2NotEqualTo(String value) {
            addCriterion("FKTMXX2 <>", value, "fktmxx2");
            return (Criteria) this;
        }

        public Criteria andFktmxx2GreaterThan(String value) {
            addCriterion("FKTMXX2 >", value, "fktmxx2");
            return (Criteria) this;
        }

        public Criteria andFktmxx2GreaterThanOrEqualTo(String value) {
            addCriterion("FKTMXX2 >=", value, "fktmxx2");
            return (Criteria) this;
        }

        public Criteria andFktmxx2LessThan(String value) {
            addCriterion("FKTMXX2 <", value, "fktmxx2");
            return (Criteria) this;
        }

        public Criteria andFktmxx2LessThanOrEqualTo(String value) {
            addCriterion("FKTMXX2 <=", value, "fktmxx2");
            return (Criteria) this;
        }

        public Criteria andFktmxx2Like(String value) {
            addCriterion("FKTMXX2 like", value, "fktmxx2");
            return (Criteria) this;
        }

        public Criteria andFktmxx2NotLike(String value) {
            addCriterion("FKTMXX2 not like", value, "fktmxx2");
            return (Criteria) this;
        }

        public Criteria andFktmxx2In(List<String> values) {
            addCriterion("FKTMXX2 in", values, "fktmxx2");
            return (Criteria) this;
        }

        public Criteria andFktmxx2NotIn(List<String> values) {
            addCriterion("FKTMXX2 not in", values, "fktmxx2");
            return (Criteria) this;
        }

        public Criteria andFktmxx2Between(String value1, String value2) {
            addCriterion("FKTMXX2 between", value1, value2, "fktmxx2");
            return (Criteria) this;
        }

        public Criteria andFktmxx2NotBetween(String value1, String value2) {
            addCriterion("FKTMXX2 not between", value1, value2, "fktmxx2");
            return (Criteria) this;
        }

        public Criteria andFktmxx3IsNull() {
            addCriterion("FKTMXX3 is null");
            return (Criteria) this;
        }

        public Criteria andFktmxx3IsNotNull() {
            addCriterion("FKTMXX3 is not null");
            return (Criteria) this;
        }

        public Criteria andFktmxx3EqualTo(String value) {
            addCriterion("FKTMXX3 =", value, "fktmxx3");
            return (Criteria) this;
        }

        public Criteria andFktmxx3NotEqualTo(String value) {
            addCriterion("FKTMXX3 <>", value, "fktmxx3");
            return (Criteria) this;
        }

        public Criteria andFktmxx3GreaterThan(String value) {
            addCriterion("FKTMXX3 >", value, "fktmxx3");
            return (Criteria) this;
        }

        public Criteria andFktmxx3GreaterThanOrEqualTo(String value) {
            addCriterion("FKTMXX3 >=", value, "fktmxx3");
            return (Criteria) this;
        }

        public Criteria andFktmxx3LessThan(String value) {
            addCriterion("FKTMXX3 <", value, "fktmxx3");
            return (Criteria) this;
        }

        public Criteria andFktmxx3LessThanOrEqualTo(String value) {
            addCriterion("FKTMXX3 <=", value, "fktmxx3");
            return (Criteria) this;
        }

        public Criteria andFktmxx3Like(String value) {
            addCriterion("FKTMXX3 like", value, "fktmxx3");
            return (Criteria) this;
        }

        public Criteria andFktmxx3NotLike(String value) {
            addCriterion("FKTMXX3 not like", value, "fktmxx3");
            return (Criteria) this;
        }

        public Criteria andFktmxx3In(List<String> values) {
            addCriterion("FKTMXX3 in", values, "fktmxx3");
            return (Criteria) this;
        }

        public Criteria andFktmxx3NotIn(List<String> values) {
            addCriterion("FKTMXX3 not in", values, "fktmxx3");
            return (Criteria) this;
        }

        public Criteria andFktmxx3Between(String value1, String value2) {
            addCriterion("FKTMXX3 between", value1, value2, "fktmxx3");
            return (Criteria) this;
        }

        public Criteria andFktmxx3NotBetween(String value1, String value2) {
            addCriterion("FKTMXX3 not between", value1, value2, "fktmxx3");
            return (Criteria) this;
        }

        public Criteria andFktmxx4IsNull() {
            addCriterion("FKTMXX4 is null");
            return (Criteria) this;
        }

        public Criteria andFktmxx4IsNotNull() {
            addCriterion("FKTMXX4 is not null");
            return (Criteria) this;
        }

        public Criteria andFktmxx4EqualTo(String value) {
            addCriterion("FKTMXX4 =", value, "fktmxx4");
            return (Criteria) this;
        }

        public Criteria andFktmxx4NotEqualTo(String value) {
            addCriterion("FKTMXX4 <>", value, "fktmxx4");
            return (Criteria) this;
        }

        public Criteria andFktmxx4GreaterThan(String value) {
            addCriterion("FKTMXX4 >", value, "fktmxx4");
            return (Criteria) this;
        }

        public Criteria andFktmxx4GreaterThanOrEqualTo(String value) {
            addCriterion("FKTMXX4 >=", value, "fktmxx4");
            return (Criteria) this;
        }

        public Criteria andFktmxx4LessThan(String value) {
            addCriterion("FKTMXX4 <", value, "fktmxx4");
            return (Criteria) this;
        }

        public Criteria andFktmxx4LessThanOrEqualTo(String value) {
            addCriterion("FKTMXX4 <=", value, "fktmxx4");
            return (Criteria) this;
        }

        public Criteria andFktmxx4Like(String value) {
            addCriterion("FKTMXX4 like", value, "fktmxx4");
            return (Criteria) this;
        }

        public Criteria andFktmxx4NotLike(String value) {
            addCriterion("FKTMXX4 not like", value, "fktmxx4");
            return (Criteria) this;
        }

        public Criteria andFktmxx4In(List<String> values) {
            addCriterion("FKTMXX4 in", values, "fktmxx4");
            return (Criteria) this;
        }

        public Criteria andFktmxx4NotIn(List<String> values) {
            addCriterion("FKTMXX4 not in", values, "fktmxx4");
            return (Criteria) this;
        }

        public Criteria andFktmxx4Between(String value1, String value2) {
            addCriterion("FKTMXX4 between", value1, value2, "fktmxx4");
            return (Criteria) this;
        }

        public Criteria andFktmxx4NotBetween(String value1, String value2) {
            addCriterion("FKTMXX4 not between", value1, value2, "fktmxx4");
            return (Criteria) this;
        }

        public Criteria andFktmxx5IsNull() {
            addCriterion("FKTMXX5 is null");
            return (Criteria) this;
        }

        public Criteria andFktmxx5IsNotNull() {
            addCriterion("FKTMXX5 is not null");
            return (Criteria) this;
        }

        public Criteria andFktmxx5EqualTo(String value) {
            addCriterion("FKTMXX5 =", value, "fktmxx5");
            return (Criteria) this;
        }

        public Criteria andFktmxx5NotEqualTo(String value) {
            addCriterion("FKTMXX5 <>", value, "fktmxx5");
            return (Criteria) this;
        }

        public Criteria andFktmxx5GreaterThan(String value) {
            addCriterion("FKTMXX5 >", value, "fktmxx5");
            return (Criteria) this;
        }

        public Criteria andFktmxx5GreaterThanOrEqualTo(String value) {
            addCriterion("FKTMXX5 >=", value, "fktmxx5");
            return (Criteria) this;
        }

        public Criteria andFktmxx5LessThan(String value) {
            addCriterion("FKTMXX5 <", value, "fktmxx5");
            return (Criteria) this;
        }

        public Criteria andFktmxx5LessThanOrEqualTo(String value) {
            addCriterion("FKTMXX5 <=", value, "fktmxx5");
            return (Criteria) this;
        }

        public Criteria andFktmxx5Like(String value) {
            addCriterion("FKTMXX5 like", value, "fktmxx5");
            return (Criteria) this;
        }

        public Criteria andFktmxx5NotLike(String value) {
            addCriterion("FKTMXX5 not like", value, "fktmxx5");
            return (Criteria) this;
        }

        public Criteria andFktmxx5In(List<String> values) {
            addCriterion("FKTMXX5 in", values, "fktmxx5");
            return (Criteria) this;
        }

        public Criteria andFktmxx5NotIn(List<String> values) {
            addCriterion("FKTMXX5 not in", values, "fktmxx5");
            return (Criteria) this;
        }

        public Criteria andFktmxx5Between(String value1, String value2) {
            addCriterion("FKTMXX5 between", value1, value2, "fktmxx5");
            return (Criteria) this;
        }

        public Criteria andFktmxx5NotBetween(String value1, String value2) {
            addCriterion("FKTMXX5 not between", value1, value2, "fktmxx5");
            return (Criteria) this;
        }

        public Criteria andFktmlxIsNull() {
            addCriterion("FKTMLX is null");
            return (Criteria) this;
        }

        public Criteria andFktmlxIsNotNull() {
            addCriterion("FKTMLX is not null");
            return (Criteria) this;
        }

        public Criteria andFktmlxEqualTo(String value) {
            addCriterion("FKTMLX =", value, "fktmlx");
            return (Criteria) this;
        }

        public Criteria andFktmlxNotEqualTo(String value) {
            addCriterion("FKTMLX <>", value, "fktmlx");
            return (Criteria) this;
        }

        public Criteria andFktmlxGreaterThan(String value) {
            addCriterion("FKTMLX >", value, "fktmlx");
            return (Criteria) this;
        }

        public Criteria andFktmlxGreaterThanOrEqualTo(String value) {
            addCriterion("FKTMLX >=", value, "fktmlx");
            return (Criteria) this;
        }

        public Criteria andFktmlxLessThan(String value) {
            addCriterion("FKTMLX <", value, "fktmlx");
            return (Criteria) this;
        }

        public Criteria andFktmlxLessThanOrEqualTo(String value) {
            addCriterion("FKTMLX <=", value, "fktmlx");
            return (Criteria) this;
        }

        public Criteria andFktmlxLike(String value) {
            addCriterion("FKTMLX like", value, "fktmlx");
            return (Criteria) this;
        }

        public Criteria andFktmlxNotLike(String value) {
            addCriterion("FKTMLX not like", value, "fktmlx");
            return (Criteria) this;
        }

        public Criteria andFktmlxIn(List<String> values) {
            addCriterion("FKTMLX in", values, "fktmlx");
            return (Criteria) this;
        }

        public Criteria andFktmlxNotIn(List<String> values) {
            addCriterion("FKTMLX not in", values, "fktmlx");
            return (Criteria) this;
        }

        public Criteria andFktmlxBetween(String value1, String value2) {
            addCriterion("FKTMLX between", value1, value2, "fktmlx");
            return (Criteria) this;
        }

        public Criteria andFktmlxNotBetween(String value1, String value2) {
            addCriterion("FKTMLX not between", value1, value2, "fktmlx");
            return (Criteria) this;
        }

        public Criteria andCfidIsNull() {
            addCriterion("CFID is null");
            return (Criteria) this;
        }

        public Criteria andCfidIsNotNull() {
            addCriterion("CFID is not null");
            return (Criteria) this;
        }

        public Criteria andCfidEqualTo(Integer value) {
            addCriterion("CFID =", value, "cfid");
            return (Criteria) this;
        }

        public Criteria andCfidNotEqualTo(Integer value) {
            addCriterion("CFID <>", value, "cfid");
            return (Criteria) this;
        }

        public Criteria andCfidGreaterThan(Integer value) {
            addCriterion("CFID >", value, "cfid");
            return (Criteria) this;
        }

        public Criteria andCfidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CFID >=", value, "cfid");
            return (Criteria) this;
        }

        public Criteria andCfidLessThan(Integer value) {
            addCriterion("CFID <", value, "cfid");
            return (Criteria) this;
        }

        public Criteria andCfidLessThanOrEqualTo(Integer value) {
            addCriterion("CFID <=", value, "cfid");
            return (Criteria) this;
        }

        public Criteria andCfidIn(List<Integer> values) {
            addCriterion("CFID in", values, "cfid");
            return (Criteria) this;
        }

        public Criteria andCfidNotIn(List<Integer> values) {
            addCriterion("CFID not in", values, "cfid");
            return (Criteria) this;
        }

        public Criteria andCfidBetween(Integer value1, Integer value2) {
            addCriterion("CFID between", value1, value2, "cfid");
            return (Criteria) this;
        }

        public Criteria andCfidNotBetween(Integer value1, Integer value2) {
            addCriterion("CFID not between", value1, value2, "cfid");
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