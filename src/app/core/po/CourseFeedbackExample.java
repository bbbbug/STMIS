package app.core.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CourseFeedbackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseFeedbackExample() {
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

        public Criteria andKcjsIsNull() {
            addCriterion("KCJS is null");
            return (Criteria) this;
        }

        public Criteria andKcjsIsNotNull() {
            addCriterion("KCJS is not null");
            return (Criteria) this;
        }

        public Criteria andKcjsEqualTo(String value) {
            addCriterion("KCJS =", value, "kcjs");
            return (Criteria) this;
        }

        public Criteria andKcjsNotEqualTo(String value) {
            addCriterion("KCJS <>", value, "kcjs");
            return (Criteria) this;
        }

        public Criteria andKcjsGreaterThan(String value) {
            addCriterion("KCJS >", value, "kcjs");
            return (Criteria) this;
        }

        public Criteria andKcjsGreaterThanOrEqualTo(String value) {
            addCriterion("KCJS >=", value, "kcjs");
            return (Criteria) this;
        }

        public Criteria andKcjsLessThan(String value) {
            addCriterion("KCJS <", value, "kcjs");
            return (Criteria) this;
        }

        public Criteria andKcjsLessThanOrEqualTo(String value) {
            addCriterion("KCJS <=", value, "kcjs");
            return (Criteria) this;
        }

        public Criteria andKcjsLike(String value) {
            addCriterion("KCJS like", value, "kcjs");
            return (Criteria) this;
        }

        public Criteria andKcjsNotLike(String value) {
            addCriterion("KCJS not like", value, "kcjs");
            return (Criteria) this;
        }

        public Criteria andKcjsIn(List<String> values) {
            addCriterion("KCJS in", values, "kcjs");
            return (Criteria) this;
        }

        public Criteria andKcjsNotIn(List<String> values) {
            addCriterion("KCJS not in", values, "kcjs");
            return (Criteria) this;
        }

        public Criteria andKcjsBetween(String value1, String value2) {
            addCriterion("KCJS between", value1, value2, "kcjs");
            return (Criteria) this;
        }

        public Criteria andKcjsNotBetween(String value1, String value2) {
            addCriterion("KCJS not between", value1, value2, "kcjs");
            return (Criteria) this;
        }

        public Criteria andJksjIsNull() {
            addCriterion("JKSJ is null");
            return (Criteria) this;
        }

        public Criteria andJksjIsNotNull() {
            addCriterion("JKSJ is not null");
            return (Criteria) this;
        }

        public Criteria andJksjEqualTo(Date value) {
            addCriterion("JKSJ =", value, "jksj");
            return (Criteria) this;
        }

        public Criteria andJksjNotEqualTo(Date value) {
            addCriterion("JKSJ <>", value, "jksj");
            return (Criteria) this;
        }

        public Criteria andJksjGreaterThan(Date value) {
            addCriterion("JKSJ >", value, "jksj");
            return (Criteria) this;
        }

        public Criteria andJksjGreaterThanOrEqualTo(Date value) {
            addCriterion("JKSJ >=", value, "jksj");
            return (Criteria) this;
        }

        public Criteria andJksjLessThan(Date value) {
            addCriterion("JKSJ <", value, "jksj");
            return (Criteria) this;
        }

        public Criteria andJksjLessThanOrEqualTo(Date value) {
            addCriterion("JKSJ <=", value, "jksj");
            return (Criteria) this;
        }

        public Criteria andJksjIn(List<Date> values) {
            addCriterion("JKSJ in", values, "jksj");
            return (Criteria) this;
        }

        public Criteria andJksjNotIn(List<Date> values) {
            addCriterion("JKSJ not in", values, "jksj");
            return (Criteria) this;
        }

        public Criteria andJksjBetween(Date value1, Date value2) {
            addCriterion("JKSJ between", value1, value2, "jksj");
            return (Criteria) this;
        }

        public Criteria andJksjNotBetween(Date value1, Date value2) {
            addCriterion("JKSJ not between", value1, value2, "jksj");
            return (Criteria) this;
        }

        public Criteria andYgmcIsNull() {
            addCriterion("YGMC is null");
            return (Criteria) this;
        }

        public Criteria andYgmcIsNotNull() {
            addCriterion("YGMC is not null");
            return (Criteria) this;
        }

        public Criteria andYgmcEqualTo(String value) {
            addCriterion("YGMC =", value, "ygmc");
            return (Criteria) this;
        }

        public Criteria andYgmcNotEqualTo(String value) {
            addCriterion("YGMC <>", value, "ygmc");
            return (Criteria) this;
        }

        public Criteria andYgmcGreaterThan(String value) {
            addCriterion("YGMC >", value, "ygmc");
            return (Criteria) this;
        }

        public Criteria andYgmcGreaterThanOrEqualTo(String value) {
            addCriterion("YGMC >=", value, "ygmc");
            return (Criteria) this;
        }

        public Criteria andYgmcLessThan(String value) {
            addCriterion("YGMC <", value, "ygmc");
            return (Criteria) this;
        }

        public Criteria andYgmcLessThanOrEqualTo(String value) {
            addCriterion("YGMC <=", value, "ygmc");
            return (Criteria) this;
        }

        public Criteria andYgmcLike(String value) {
            addCriterion("YGMC like", value, "ygmc");
            return (Criteria) this;
        }

        public Criteria andYgmcNotLike(String value) {
            addCriterion("YGMC not like", value, "ygmc");
            return (Criteria) this;
        }

        public Criteria andYgmcIn(List<String> values) {
            addCriterion("YGMC in", values, "ygmc");
            return (Criteria) this;
        }

        public Criteria andYgmcNotIn(List<String> values) {
            addCriterion("YGMC not in", values, "ygmc");
            return (Criteria) this;
        }

        public Criteria andYgmcBetween(String value1, String value2) {
            addCriterion("YGMC between", value1, value2, "ygmc");
            return (Criteria) this;
        }

        public Criteria andYgmcNotBetween(String value1, String value2) {
            addCriterion("YGMC not between", value1, value2, "ygmc");
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

        public Criteria andFkjgIsNull() {
            addCriterion("FKJG is null");
            return (Criteria) this;
        }

        public Criteria andFkjgIsNotNull() {
            addCriterion("FKJG is not null");
            return (Criteria) this;
        }

        public Criteria andFkjgEqualTo(String value) {
            addCriterion("FKJG =", value, "fkjg");
            return (Criteria) this;
        }

        public Criteria andFkjgNotEqualTo(String value) {
            addCriterion("FKJG <>", value, "fkjg");
            return (Criteria) this;
        }

        public Criteria andFkjgGreaterThan(String value) {
            addCriterion("FKJG >", value, "fkjg");
            return (Criteria) this;
        }

        public Criteria andFkjgGreaterThanOrEqualTo(String value) {
            addCriterion("FKJG >=", value, "fkjg");
            return (Criteria) this;
        }

        public Criteria andFkjgLessThan(String value) {
            addCriterion("FKJG <", value, "fkjg");
            return (Criteria) this;
        }

        public Criteria andFkjgLessThanOrEqualTo(String value) {
            addCriterion("FKJG <=", value, "fkjg");
            return (Criteria) this;
        }

        public Criteria andFkjgLike(String value) {
            addCriterion("FKJG like", value, "fkjg");
            return (Criteria) this;
        }

        public Criteria andFkjgNotLike(String value) {
            addCriterion("FKJG not like", value, "fkjg");
            return (Criteria) this;
        }

        public Criteria andFkjgIn(List<String> values) {
            addCriterion("FKJG in", values, "fkjg");
            return (Criteria) this;
        }

        public Criteria andFkjgNotIn(List<String> values) {
            addCriterion("FKJG not in", values, "fkjg");
            return (Criteria) this;
        }

        public Criteria andFkjgBetween(String value1, String value2) {
            addCriterion("FKJG between", value1, value2, "fkjg");
            return (Criteria) this;
        }

        public Criteria andFkjgNotBetween(String value1, String value2) {
            addCriterion("FKJG not between", value1, value2, "fkjg");
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

        public Criteria andTmbhIsNull() {
            addCriterion("TMBH is null");
            return (Criteria) this;
        }

        public Criteria andTmbhIsNotNull() {
            addCriterion("TMBH is not null");
            return (Criteria) this;
        }

        public Criteria andTmbhEqualTo(Integer value) {
            addCriterion("TMBH =", value, "tmbh");
            return (Criteria) this;
        }

        public Criteria andTmbhNotEqualTo(Integer value) {
            addCriterion("TMBH <>", value, "tmbh");
            return (Criteria) this;
        }

        public Criteria andTmbhGreaterThan(Integer value) {
            addCriterion("TMBH >", value, "tmbh");
            return (Criteria) this;
        }

        public Criteria andTmbhGreaterThanOrEqualTo(Integer value) {
            addCriterion("TMBH >=", value, "tmbh");
            return (Criteria) this;
        }

        public Criteria andTmbhLessThan(Integer value) {
            addCriterion("TMBH <", value, "tmbh");
            return (Criteria) this;
        }

        public Criteria andTmbhLessThanOrEqualTo(Integer value) {
            addCriterion("TMBH <=", value, "tmbh");
            return (Criteria) this;
        }

        public Criteria andTmbhIn(List<Integer> values) {
            addCriterion("TMBH in", values, "tmbh");
            return (Criteria) this;
        }

        public Criteria andTmbhNotIn(List<Integer> values) {
            addCriterion("TMBH not in", values, "tmbh");
            return (Criteria) this;
        }

        public Criteria andTmbhBetween(Integer value1, Integer value2) {
            addCriterion("TMBH between", value1, value2, "tmbh");
            return (Criteria) this;
        }

        public Criteria andTmbhNotBetween(Integer value1, Integer value2) {
            addCriterion("TMBH not between", value1, value2, "tmbh");
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