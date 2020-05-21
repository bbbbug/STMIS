package app.core.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GradeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GradeExample() {
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

        public Criteria andYgzxfIsNull() {
            addCriterion("YGZXF is null");
            return (Criteria) this;
        }

        public Criteria andYgzxfIsNotNull() {
            addCriterion("YGZXF is not null");
            return (Criteria) this;
        }

        public Criteria andYgzxfEqualTo(Double value) {
            addCriterion("YGZXF =", value, "ygzxf");
            return (Criteria) this;
        }

        public Criteria andYgzxfNotEqualTo(Double value) {
            addCriterion("YGZXF <>", value, "ygzxf");
            return (Criteria) this;
        }

        public Criteria andYgzxfGreaterThan(Double value) {
            addCriterion("YGZXF >", value, "ygzxf");
            return (Criteria) this;
        }

        public Criteria andYgzxfGreaterThanOrEqualTo(Double value) {
            addCriterion("YGZXF >=", value, "ygzxf");
            return (Criteria) this;
        }

        public Criteria andYgzxfLessThan(Double value) {
            addCriterion("YGZXF <", value, "ygzxf");
            return (Criteria) this;
        }

        public Criteria andYgzxfLessThanOrEqualTo(Double value) {
            addCriterion("YGZXF <=", value, "ygzxf");
            return (Criteria) this;
        }

        public Criteria andYgzxfIn(List<Double> values) {
            addCriterion("YGZXF in", values, "ygzxf");
            return (Criteria) this;
        }

        public Criteria andYgzxfNotIn(List<Double> values) {
            addCriterion("YGZXF not in", values, "ygzxf");
            return (Criteria) this;
        }

        public Criteria andYgzxfBetween(Double value1, Double value2) {
            addCriterion("YGZXF between", value1, value2, "ygzxf");
            return (Criteria) this;
        }

        public Criteria andYgzxfNotBetween(Double value1, Double value2) {
            addCriterion("YGZXF not between", value1, value2, "ygzxf");
            return (Criteria) this;
        }

        public Criteria andYgbxxfIsNull() {
            addCriterion("YGBXXF is null");
            return (Criteria) this;
        }

        public Criteria andYgbxxfIsNotNull() {
            addCriterion("YGBXXF is not null");
            return (Criteria) this;
        }

        public Criteria andYgbxxfEqualTo(Double value) {
            addCriterion("YGBXXF =", value, "ygbxxf");
            return (Criteria) this;
        }

        public Criteria andYgbxxfNotEqualTo(Double value) {
            addCriterion("YGBXXF <>", value, "ygbxxf");
            return (Criteria) this;
        }

        public Criteria andYgbxxfGreaterThan(Double value) {
            addCriterion("YGBXXF >", value, "ygbxxf");
            return (Criteria) this;
        }

        public Criteria andYgbxxfGreaterThanOrEqualTo(Double value) {
            addCriterion("YGBXXF >=", value, "ygbxxf");
            return (Criteria) this;
        }

        public Criteria andYgbxxfLessThan(Double value) {
            addCriterion("YGBXXF <", value, "ygbxxf");
            return (Criteria) this;
        }

        public Criteria andYgbxxfLessThanOrEqualTo(Double value) {
            addCriterion("YGBXXF <=", value, "ygbxxf");
            return (Criteria) this;
        }

        public Criteria andYgbxxfIn(List<Double> values) {
            addCriterion("YGBXXF in", values, "ygbxxf");
            return (Criteria) this;
        }

        public Criteria andYgbxxfNotIn(List<Double> values) {
            addCriterion("YGBXXF not in", values, "ygbxxf");
            return (Criteria) this;
        }

        public Criteria andYgbxxfBetween(Double value1, Double value2) {
            addCriterion("YGBXXF between", value1, value2, "ygbxxf");
            return (Criteria) this;
        }

        public Criteria andYgbxxfNotBetween(Double value1, Double value2) {
            addCriterion("YGBXXF not between", value1, value2, "ygbxxf");
            return (Criteria) this;
        }

        public Criteria andYgxxxfIsNull() {
            addCriterion("YGXXXF is null");
            return (Criteria) this;
        }

        public Criteria andYgxxxfIsNotNull() {
            addCriterion("YGXXXF is not null");
            return (Criteria) this;
        }

        public Criteria andYgxxxfEqualTo(Double value) {
            addCriterion("YGXXXF =", value, "ygxxxf");
            return (Criteria) this;
        }

        public Criteria andYgxxxfNotEqualTo(Double value) {
            addCriterion("YGXXXF <>", value, "ygxxxf");
            return (Criteria) this;
        }

        public Criteria andYgxxxfGreaterThan(Double value) {
            addCriterion("YGXXXF >", value, "ygxxxf");
            return (Criteria) this;
        }

        public Criteria andYgxxxfGreaterThanOrEqualTo(Double value) {
            addCriterion("YGXXXF >=", value, "ygxxxf");
            return (Criteria) this;
        }

        public Criteria andYgxxxfLessThan(Double value) {
            addCriterion("YGXXXF <", value, "ygxxxf");
            return (Criteria) this;
        }

        public Criteria andYgxxxfLessThanOrEqualTo(Double value) {
            addCriterion("YGXXXF <=", value, "ygxxxf");
            return (Criteria) this;
        }

        public Criteria andYgxxxfIn(List<Double> values) {
            addCriterion("YGXXXF in", values, "ygxxxf");
            return (Criteria) this;
        }

        public Criteria andYgxxxfNotIn(List<Double> values) {
            addCriterion("YGXXXF not in", values, "ygxxxf");
            return (Criteria) this;
        }

        public Criteria andYgxxxfBetween(Double value1, Double value2) {
            addCriterion("YGXXXF between", value1, value2, "ygxxxf");
            return (Criteria) this;
        }

        public Criteria andYgxxxfNotBetween(Double value1, Double value2) {
            addCriterion("YGXXXF not between", value1, value2, "ygxxxf");
            return (Criteria) this;
        }

        public Criteria andKsdfsjIsNull() {
            addCriterion("KSDFSJ is null");
            return (Criteria) this;
        }

        public Criteria andKsdfsjIsNotNull() {
            addCriterion("KSDFSJ is not null");
            return (Criteria) this;
        }

        public Criteria andKsdfsjEqualTo(Date value) {
            addCriterion("KSDFSJ =", value, "ksdfsj");
            return (Criteria) this;
        }

        public Criteria andKsdfsjNotEqualTo(Date value) {
            addCriterion("KSDFSJ <>", value, "ksdfsj");
            return (Criteria) this;
        }

        public Criteria andKsdfsjGreaterThan(Date value) {
            addCriterion("KSDFSJ >", value, "ksdfsj");
            return (Criteria) this;
        }

        public Criteria andKsdfsjGreaterThanOrEqualTo(Date value) {
            addCriterion("KSDFSJ >=", value, "ksdfsj");
            return (Criteria) this;
        }

        public Criteria andKsdfsjLessThan(Date value) {
            addCriterion("KSDFSJ <", value, "ksdfsj");
            return (Criteria) this;
        }

        public Criteria andKsdfsjLessThanOrEqualTo(Date value) {
            addCriterion("KSDFSJ <=", value, "ksdfsj");
            return (Criteria) this;
        }

        public Criteria andKsdfsjIn(List<Date> values) {
            addCriterion("KSDFSJ in", values, "ksdfsj");
            return (Criteria) this;
        }

        public Criteria andKsdfsjNotIn(List<Date> values) {
            addCriterion("KSDFSJ not in", values, "ksdfsj");
            return (Criteria) this;
        }

        public Criteria andKsdfsjBetween(Date value1, Date value2) {
            addCriterion("KSDFSJ between", value1, value2, "ksdfsj");
            return (Criteria) this;
        }

        public Criteria andKsdfsjNotBetween(Date value1, Date value2) {
            addCriterion("KSDFSJ not between", value1, value2, "ksdfsj");
            return (Criteria) this;
        }

        public Criteria andMnkssjIsNull() {
            addCriterion("MNKSSJ is null");
            return (Criteria) this;
        }

        public Criteria andMnkssjIsNotNull() {
            addCriterion("MNKSSJ is not null");
            return (Criteria) this;
        }

        public Criteria andMnkssjEqualTo(Date value) {
            addCriterion("MNKSSJ =", value, "mnkssj");
            return (Criteria) this;
        }

        public Criteria andMnkssjNotEqualTo(Date value) {
            addCriterion("MNKSSJ <>", value, "mnkssj");
            return (Criteria) this;
        }

        public Criteria andMnkssjGreaterThan(Date value) {
            addCriterion("MNKSSJ >", value, "mnkssj");
            return (Criteria) this;
        }

        public Criteria andMnkssjGreaterThanOrEqualTo(Date value) {
            addCriterion("MNKSSJ >=", value, "mnkssj");
            return (Criteria) this;
        }

        public Criteria andMnkssjLessThan(Date value) {
            addCriterion("MNKSSJ <", value, "mnkssj");
            return (Criteria) this;
        }

        public Criteria andMnkssjLessThanOrEqualTo(Date value) {
            addCriterion("MNKSSJ <=", value, "mnkssj");
            return (Criteria) this;
        }

        public Criteria andMnkssjIn(List<Date> values) {
            addCriterion("MNKSSJ in", values, "mnkssj");
            return (Criteria) this;
        }

        public Criteria andMnkssjNotIn(List<Date> values) {
            addCriterion("MNKSSJ not in", values, "mnkssj");
            return (Criteria) this;
        }

        public Criteria andMnkssjBetween(Date value1, Date value2) {
            addCriterion("MNKSSJ between", value1, value2, "mnkssj");
            return (Criteria) this;
        }

        public Criteria andMnkssjNotBetween(Date value1, Date value2) {
            addCriterion("MNKSSJ not between", value1, value2, "mnkssj");
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