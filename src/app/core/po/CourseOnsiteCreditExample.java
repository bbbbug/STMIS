package app.core.po;

import java.util.ArrayList;
import java.util.List;

public class CourseOnsiteCreditExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseOnsiteCreditExample() {
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

        public Criteria andXyzhIsNull() {
            addCriterion("XYZH is null");
            return (Criteria) this;
        }

        public Criteria andXyzhIsNotNull() {
            addCriterion("XYZH is not null");
            return (Criteria) this;
        }

        public Criteria andXyzhEqualTo(String value) {
            addCriterion("XYZH =", value, "xyzh");
            return (Criteria) this;
        }

        public Criteria andXyzhNotEqualTo(String value) {
            addCriterion("XYZH <>", value, "xyzh");
            return (Criteria) this;
        }

        public Criteria andXyzhGreaterThan(String value) {
            addCriterion("XYZH >", value, "xyzh");
            return (Criteria) this;
        }

        public Criteria andXyzhGreaterThanOrEqualTo(String value) {
            addCriterion("XYZH >=", value, "xyzh");
            return (Criteria) this;
        }

        public Criteria andXyzhLessThan(String value) {
            addCriterion("XYZH <", value, "xyzh");
            return (Criteria) this;
        }

        public Criteria andXyzhLessThanOrEqualTo(String value) {
            addCriterion("XYZH <=", value, "xyzh");
            return (Criteria) this;
        }

        public Criteria andXyzhLike(String value) {
            addCriterion("XYZH like", value, "xyzh");
            return (Criteria) this;
        }

        public Criteria andXyzhNotLike(String value) {
            addCriterion("XYZH not like", value, "xyzh");
            return (Criteria) this;
        }

        public Criteria andXyzhIn(List<String> values) {
            addCriterion("XYZH in", values, "xyzh");
            return (Criteria) this;
        }

        public Criteria andXyzhNotIn(List<String> values) {
            addCriterion("XYZH not in", values, "xyzh");
            return (Criteria) this;
        }

        public Criteria andXyzhBetween(String value1, String value2) {
            addCriterion("XYZH between", value1, value2, "xyzh");
            return (Criteria) this;
        }

        public Criteria andXyzhNotBetween(String value1, String value2) {
            addCriterion("XYZH not between", value1, value2, "xyzh");
            return (Criteria) this;
        }

        public Criteria andXymcIsNull() {
            addCriterion("XYMC is null");
            return (Criteria) this;
        }

        public Criteria andXymcIsNotNull() {
            addCriterion("XYMC is not null");
            return (Criteria) this;
        }

        public Criteria andXymcEqualTo(String value) {
            addCriterion("XYMC =", value, "xymc");
            return (Criteria) this;
        }

        public Criteria andXymcNotEqualTo(String value) {
            addCriterion("XYMC <>", value, "xymc");
            return (Criteria) this;
        }

        public Criteria andXymcGreaterThan(String value) {
            addCriterion("XYMC >", value, "xymc");
            return (Criteria) this;
        }

        public Criteria andXymcGreaterThanOrEqualTo(String value) {
            addCriterion("XYMC >=", value, "xymc");
            return (Criteria) this;
        }

        public Criteria andXymcLessThan(String value) {
            addCriterion("XYMC <", value, "xymc");
            return (Criteria) this;
        }

        public Criteria andXymcLessThanOrEqualTo(String value) {
            addCriterion("XYMC <=", value, "xymc");
            return (Criteria) this;
        }

        public Criteria andXymcLike(String value) {
            addCriterion("XYMC like", value, "xymc");
            return (Criteria) this;
        }

        public Criteria andXymcNotLike(String value) {
            addCriterion("XYMC not like", value, "xymc");
            return (Criteria) this;
        }

        public Criteria andXymcIn(List<String> values) {
            addCriterion("XYMC in", values, "xymc");
            return (Criteria) this;
        }

        public Criteria andXymcNotIn(List<String> values) {
            addCriterion("XYMC not in", values, "xymc");
            return (Criteria) this;
        }

        public Criteria andXymcBetween(String value1, String value2) {
            addCriterion("XYMC between", value1, value2, "xymc");
            return (Criteria) this;
        }

        public Criteria andXymcNotBetween(String value1, String value2) {
            addCriterion("XYMC not between", value1, value2, "xymc");
            return (Criteria) this;
        }

        public Criteria andXxkcmcIsNull() {
            addCriterion("XXKCMC is null");
            return (Criteria) this;
        }

        public Criteria andXxkcmcIsNotNull() {
            addCriterion("XXKCMC is not null");
            return (Criteria) this;
        }

        public Criteria andXxkcmcEqualTo(String value) {
            addCriterion("XXKCMC =", value, "xxkcmc");
            return (Criteria) this;
        }

        public Criteria andXxkcmcNotEqualTo(String value) {
            addCriterion("XXKCMC <>", value, "xxkcmc");
            return (Criteria) this;
        }

        public Criteria andXxkcmcGreaterThan(String value) {
            addCriterion("XXKCMC >", value, "xxkcmc");
            return (Criteria) this;
        }

        public Criteria andXxkcmcGreaterThanOrEqualTo(String value) {
            addCriterion("XXKCMC >=", value, "xxkcmc");
            return (Criteria) this;
        }

        public Criteria andXxkcmcLessThan(String value) {
            addCriterion("XXKCMC <", value, "xxkcmc");
            return (Criteria) this;
        }

        public Criteria andXxkcmcLessThanOrEqualTo(String value) {
            addCriterion("XXKCMC <=", value, "xxkcmc");
            return (Criteria) this;
        }

        public Criteria andXxkcmcLike(String value) {
            addCriterion("XXKCMC like", value, "xxkcmc");
            return (Criteria) this;
        }

        public Criteria andXxkcmcNotLike(String value) {
            addCriterion("XXKCMC not like", value, "xxkcmc");
            return (Criteria) this;
        }

        public Criteria andXxkcmcIn(List<String> values) {
            addCriterion("XXKCMC in", values, "xxkcmc");
            return (Criteria) this;
        }

        public Criteria andXxkcmcNotIn(List<String> values) {
            addCriterion("XXKCMC not in", values, "xxkcmc");
            return (Criteria) this;
        }

        public Criteria andXxkcmcBetween(String value1, String value2) {
            addCriterion("XXKCMC between", value1, value2, "xxkcmc");
            return (Criteria) this;
        }

        public Criteria andXxkcmcNotBetween(String value1, String value2) {
            addCriterion("XXKCMC not between", value1, value2, "xxkcmc");
            return (Criteria) this;
        }

        public Criteria andXxkcxfIsNull() {
            addCriterion("XXKCXF is null");
            return (Criteria) this;
        }

        public Criteria andXxkcxfIsNotNull() {
            addCriterion("XXKCXF is not null");
            return (Criteria) this;
        }

        public Criteria andXxkcxfEqualTo(Double value) {
            addCriterion("XXKCXF =", value, "xxkcxf");
            return (Criteria) this;
        }

        public Criteria andXxkcxfNotEqualTo(Double value) {
            addCriterion("XXKCXF <>", value, "xxkcxf");
            return (Criteria) this;
        }

        public Criteria andXxkcxfGreaterThan(Double value) {
            addCriterion("XXKCXF >", value, "xxkcxf");
            return (Criteria) this;
        }

        public Criteria andXxkcxfGreaterThanOrEqualTo(Double value) {
            addCriterion("XXKCXF >=", value, "xxkcxf");
            return (Criteria) this;
        }

        public Criteria andXxkcxfLessThan(Double value) {
            addCriterion("XXKCXF <", value, "xxkcxf");
            return (Criteria) this;
        }

        public Criteria andXxkcxfLessThanOrEqualTo(Double value) {
            addCriterion("XXKCXF <=", value, "xxkcxf");
            return (Criteria) this;
        }

        public Criteria andXxkcxfIn(List<Double> values) {
            addCriterion("XXKCXF in", values, "xxkcxf");
            return (Criteria) this;
        }

        public Criteria andXxkcxfNotIn(List<Double> values) {
            addCriterion("XXKCXF not in", values, "xxkcxf");
            return (Criteria) this;
        }

        public Criteria andXxkcxfBetween(Double value1, Double value2) {
            addCriterion("XXKCXF between", value1, value2, "xxkcxf");
            return (Criteria) this;
        }

        public Criteria andXxkcxfNotBetween(Double value1, Double value2) {
            addCriterion("XXKCXF not between", value1, value2, "xxkcxf");
            return (Criteria) this;
        }

        public Criteria andXxpxidIsNull() {
            addCriterion("XXPXID is null");
            return (Criteria) this;
        }

        public Criteria andXxpxidIsNotNull() {
            addCriterion("XXPXID is not null");
            return (Criteria) this;
        }

        public Criteria andXxpxidEqualTo(Integer value) {
            addCriterion("XXPXID =", value, "xxpxid");
            return (Criteria) this;
        }

        public Criteria andXxpxidNotEqualTo(Integer value) {
            addCriterion("XXPXID <>", value, "xxpxid");
            return (Criteria) this;
        }

        public Criteria andXxpxidGreaterThan(Integer value) {
            addCriterion("XXPXID >", value, "xxpxid");
            return (Criteria) this;
        }

        public Criteria andXxpxidGreaterThanOrEqualTo(Integer value) {
            addCriterion("XXPXID >=", value, "xxpxid");
            return (Criteria) this;
        }

        public Criteria andXxpxidLessThan(Integer value) {
            addCriterion("XXPXID <", value, "xxpxid");
            return (Criteria) this;
        }

        public Criteria andXxpxidLessThanOrEqualTo(Integer value) {
            addCriterion("XXPXID <=", value, "xxpxid");
            return (Criteria) this;
        }

        public Criteria andXxpxidIn(List<Integer> values) {
            addCriterion("XXPXID in", values, "xxpxid");
            return (Criteria) this;
        }

        public Criteria andXxpxidNotIn(List<Integer> values) {
            addCriterion("XXPXID not in", values, "xxpxid");
            return (Criteria) this;
        }

        public Criteria andXxpxidBetween(Integer value1, Integer value2) {
            addCriterion("XXPXID between", value1, value2, "xxpxid");
            return (Criteria) this;
        }

        public Criteria andXxpxidNotBetween(Integer value1, Integer value2) {
            addCriterion("XXPXID not between", value1, value2, "xxpxid");
            return (Criteria) this;
        }

        public Criteria andXxsklsIsNull() {
            addCriterion("XXSKLS is null");
            return (Criteria) this;
        }

        public Criteria andXxsklsIsNotNull() {
            addCriterion("XXSKLS is not null");
            return (Criteria) this;
        }

        public Criteria andXxsklsEqualTo(String value) {
            addCriterion("XXSKLS =", value, "xxskls");
            return (Criteria) this;
        }

        public Criteria andXxsklsNotEqualTo(String value) {
            addCriterion("XXSKLS <>", value, "xxskls");
            return (Criteria) this;
        }

        public Criteria andXxsklsGreaterThan(String value) {
            addCriterion("XXSKLS >", value, "xxskls");
            return (Criteria) this;
        }

        public Criteria andXxsklsGreaterThanOrEqualTo(String value) {
            addCriterion("XXSKLS >=", value, "xxskls");
            return (Criteria) this;
        }

        public Criteria andXxsklsLessThan(String value) {
            addCriterion("XXSKLS <", value, "xxskls");
            return (Criteria) this;
        }

        public Criteria andXxsklsLessThanOrEqualTo(String value) {
            addCriterion("XXSKLS <=", value, "xxskls");
            return (Criteria) this;
        }

        public Criteria andXxsklsLike(String value) {
            addCriterion("XXSKLS like", value, "xxskls");
            return (Criteria) this;
        }

        public Criteria andXxsklsNotLike(String value) {
            addCriterion("XXSKLS not like", value, "xxskls");
            return (Criteria) this;
        }

        public Criteria andXxsklsIn(List<String> values) {
            addCriterion("XXSKLS in", values, "xxskls");
            return (Criteria) this;
        }

        public Criteria andXxsklsNotIn(List<String> values) {
            addCriterion("XXSKLS not in", values, "xxskls");
            return (Criteria) this;
        }

        public Criteria andXxsklsBetween(String value1, String value2) {
            addCriterion("XXSKLS between", value1, value2, "xxskls");
            return (Criteria) this;
        }

        public Criteria andXxsklsNotBetween(String value1, String value2) {
            addCriterion("XXSKLS not between", value1, value2, "xxskls");
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