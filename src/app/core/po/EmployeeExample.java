package app.core.po;

import java.util.ArrayList;
import java.util.List;

public class EmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeeExample() {
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

        public Criteria andYgmmIsNull() {
            addCriterion("YGMM is null");
            return (Criteria) this;
        }

        public Criteria andYgmmIsNotNull() {
            addCriterion("YGMM is not null");
            return (Criteria) this;
        }

        public Criteria andYgmmEqualTo(String value) {
            addCriterion("YGMM =", value, "ygmm");
            return (Criteria) this;
        }

        public Criteria andYgmmNotEqualTo(String value) {
            addCriterion("YGMM <>", value, "ygmm");
            return (Criteria) this;
        }

        public Criteria andYgmmGreaterThan(String value) {
            addCriterion("YGMM >", value, "ygmm");
            return (Criteria) this;
        }

        public Criteria andYgmmGreaterThanOrEqualTo(String value) {
            addCriterion("YGMM >=", value, "ygmm");
            return (Criteria) this;
        }

        public Criteria andYgmmLessThan(String value) {
            addCriterion("YGMM <", value, "ygmm");
            return (Criteria) this;
        }

        public Criteria andYgmmLessThanOrEqualTo(String value) {
            addCriterion("YGMM <=", value, "ygmm");
            return (Criteria) this;
        }

        public Criteria andYgmmLike(String value) {
            addCriterion("YGMM like", value, "ygmm");
            return (Criteria) this;
        }

        public Criteria andYgmmNotLike(String value) {
            addCriterion("YGMM not like", value, "ygmm");
            return (Criteria) this;
        }

        public Criteria andYgmmIn(List<String> values) {
            addCriterion("YGMM in", values, "ygmm");
            return (Criteria) this;
        }

        public Criteria andYgmmNotIn(List<String> values) {
            addCriterion("YGMM not in", values, "ygmm");
            return (Criteria) this;
        }

        public Criteria andYgmmBetween(String value1, String value2) {
            addCriterion("YGMM between", value1, value2, "ygmm");
            return (Criteria) this;
        }

        public Criteria andYgmmNotBetween(String value1, String value2) {
            addCriterion("YGMM not between", value1, value2, "ygmm");
            return (Criteria) this;
        }

        public Criteria andYgxmIsNull() {
            addCriterion("YGXM is null");
            return (Criteria) this;
        }

        public Criteria andYgxmIsNotNull() {
            addCriterion("YGXM is not null");
            return (Criteria) this;
        }

        public Criteria andYgxmEqualTo(String value) {
            addCriterion("YGXM =", value, "ygxm");
            return (Criteria) this;
        }

        public Criteria andYgxmNotEqualTo(String value) {
            addCriterion("YGXM <>", value, "ygxm");
            return (Criteria) this;
        }

        public Criteria andYgxmGreaterThan(String value) {
            addCriterion("YGXM >", value, "ygxm");
            return (Criteria) this;
        }

        public Criteria andYgxmGreaterThanOrEqualTo(String value) {
            addCriterion("YGXM >=", value, "ygxm");
            return (Criteria) this;
        }

        public Criteria andYgxmLessThan(String value) {
            addCriterion("YGXM <", value, "ygxm");
            return (Criteria) this;
        }

        public Criteria andYgxmLessThanOrEqualTo(String value) {
            addCriterion("YGXM <=", value, "ygxm");
            return (Criteria) this;
        }

        public Criteria andYgxmLike(String value) {
            addCriterion("YGXM like", value, "ygxm");
            return (Criteria) this;
        }

        public Criteria andYgxmNotLike(String value) {
            addCriterion("YGXM not like", value, "ygxm");
            return (Criteria) this;
        }

        public Criteria andYgxmIn(List<String> values) {
            addCriterion("YGXM in", values, "ygxm");
            return (Criteria) this;
        }

        public Criteria andYgxmNotIn(List<String> values) {
            addCriterion("YGXM not in", values, "ygxm");
            return (Criteria) this;
        }

        public Criteria andYgxmBetween(String value1, String value2) {
            addCriterion("YGXM between", value1, value2, "ygxm");
            return (Criteria) this;
        }

        public Criteria andYgxmNotBetween(String value1, String value2) {
            addCriterion("YGXM not between", value1, value2, "ygxm");
            return (Criteria) this;
        }

        public Criteria andYgxbIsNull() {
            addCriterion("YGXB is null");
            return (Criteria) this;
        }

        public Criteria andYgxbIsNotNull() {
            addCriterion("YGXB is not null");
            return (Criteria) this;
        }

        public Criteria andYgxbEqualTo(String value) {
            addCriterion("YGXB =", value, "ygxb");
            return (Criteria) this;
        }

        public Criteria andYgxbNotEqualTo(String value) {
            addCriterion("YGXB <>", value, "ygxb");
            return (Criteria) this;
        }

        public Criteria andYgxbGreaterThan(String value) {
            addCriterion("YGXB >", value, "ygxb");
            return (Criteria) this;
        }

        public Criteria andYgxbGreaterThanOrEqualTo(String value) {
            addCriterion("YGXB >=", value, "ygxb");
            return (Criteria) this;
        }

        public Criteria andYgxbLessThan(String value) {
            addCriterion("YGXB <", value, "ygxb");
            return (Criteria) this;
        }

        public Criteria andYgxbLessThanOrEqualTo(String value) {
            addCriterion("YGXB <=", value, "ygxb");
            return (Criteria) this;
        }

        public Criteria andYgxbLike(String value) {
            addCriterion("YGXB like", value, "ygxb");
            return (Criteria) this;
        }

        public Criteria andYgxbNotLike(String value) {
            addCriterion("YGXB not like", value, "ygxb");
            return (Criteria) this;
        }

        public Criteria andYgxbIn(List<String> values) {
            addCriterion("YGXB in", values, "ygxb");
            return (Criteria) this;
        }

        public Criteria andYgxbNotIn(List<String> values) {
            addCriterion("YGXB not in", values, "ygxb");
            return (Criteria) this;
        }

        public Criteria andYgxbBetween(String value1, String value2) {
            addCriterion("YGXB between", value1, value2, "ygxb");
            return (Criteria) this;
        }

        public Criteria andYgxbNotBetween(String value1, String value2) {
            addCriterion("YGXB not between", value1, value2, "ygxb");
            return (Criteria) this;
        }

        public Criteria andYgnlIsNull() {
            addCriterion("YGNL is null");
            return (Criteria) this;
        }

        public Criteria andYgnlIsNotNull() {
            addCriterion("YGNL is not null");
            return (Criteria) this;
        }

        public Criteria andYgnlEqualTo(Integer value) {
            addCriterion("YGNL =", value, "ygnl");
            return (Criteria) this;
        }

        public Criteria andYgnlNotEqualTo(Integer value) {
            addCriterion("YGNL <>", value, "ygnl");
            return (Criteria) this;
        }

        public Criteria andYgnlGreaterThan(Integer value) {
            addCriterion("YGNL >", value, "ygnl");
            return (Criteria) this;
        }

        public Criteria andYgnlGreaterThanOrEqualTo(Integer value) {
            addCriterion("YGNL >=", value, "ygnl");
            return (Criteria) this;
        }

        public Criteria andYgnlLessThan(Integer value) {
            addCriterion("YGNL <", value, "ygnl");
            return (Criteria) this;
        }

        public Criteria andYgnlLessThanOrEqualTo(Integer value) {
            addCriterion("YGNL <=", value, "ygnl");
            return (Criteria) this;
        }

        public Criteria andYgnlIn(List<Integer> values) {
            addCriterion("YGNL in", values, "ygnl");
            return (Criteria) this;
        }

        public Criteria andYgnlNotIn(List<Integer> values) {
            addCriterion("YGNL not in", values, "ygnl");
            return (Criteria) this;
        }

        public Criteria andYgnlBetween(Integer value1, Integer value2) {
            addCriterion("YGNL between", value1, value2, "ygnl");
            return (Criteria) this;
        }

        public Criteria andYgnlNotBetween(Integer value1, Integer value2) {
            addCriterion("YGNL not between", value1, value2, "ygnl");
            return (Criteria) this;
        }

        public Criteria andYgdzIsNull() {
            addCriterion("YGDZ is null");
            return (Criteria) this;
        }

        public Criteria andYgdzIsNotNull() {
            addCriterion("YGDZ is not null");
            return (Criteria) this;
        }

        public Criteria andYgdzEqualTo(String value) {
            addCriterion("YGDZ =", value, "ygdz");
            return (Criteria) this;
        }

        public Criteria andYgdzNotEqualTo(String value) {
            addCriterion("YGDZ <>", value, "ygdz");
            return (Criteria) this;
        }

        public Criteria andYgdzGreaterThan(String value) {
            addCriterion("YGDZ >", value, "ygdz");
            return (Criteria) this;
        }

        public Criteria andYgdzGreaterThanOrEqualTo(String value) {
            addCriterion("YGDZ >=", value, "ygdz");
            return (Criteria) this;
        }

        public Criteria andYgdzLessThan(String value) {
            addCriterion("YGDZ <", value, "ygdz");
            return (Criteria) this;
        }

        public Criteria andYgdzLessThanOrEqualTo(String value) {
            addCriterion("YGDZ <=", value, "ygdz");
            return (Criteria) this;
        }

        public Criteria andYgdzLike(String value) {
            addCriterion("YGDZ like", value, "ygdz");
            return (Criteria) this;
        }

        public Criteria andYgdzNotLike(String value) {
            addCriterion("YGDZ not like", value, "ygdz");
            return (Criteria) this;
        }

        public Criteria andYgdzIn(List<String> values) {
            addCriterion("YGDZ in", values, "ygdz");
            return (Criteria) this;
        }

        public Criteria andYgdzNotIn(List<String> values) {
            addCriterion("YGDZ not in", values, "ygdz");
            return (Criteria) this;
        }

        public Criteria andYgdzBetween(String value1, String value2) {
            addCriterion("YGDZ between", value1, value2, "ygdz");
            return (Criteria) this;
        }

        public Criteria andYgdzNotBetween(String value1, String value2) {
            addCriterion("YGDZ not between", value1, value2, "ygdz");
            return (Criteria) this;
        }

        public Criteria andYgdwbhIsNull() {
            addCriterion("YGDWBH is null");
            return (Criteria) this;
        }

        public Criteria andYgdwbhIsNotNull() {
            addCriterion("YGDWBH is not null");
            return (Criteria) this;
        }

        public Criteria andYgdwbhEqualTo(String value) {
            addCriterion("YGDWBH =", value, "ygdwbh");
            return (Criteria) this;
        }

        public Criteria andYgdwbhNotEqualTo(String value) {
            addCriterion("YGDWBH <>", value, "ygdwbh");
            return (Criteria) this;
        }

        public Criteria andYgdwbhGreaterThan(String value) {
            addCriterion("YGDWBH >", value, "ygdwbh");
            return (Criteria) this;
        }

        public Criteria andYgdwbhGreaterThanOrEqualTo(String value) {
            addCriterion("YGDWBH >=", value, "ygdwbh");
            return (Criteria) this;
        }

        public Criteria andYgdwbhLessThan(String value) {
            addCriterion("YGDWBH <", value, "ygdwbh");
            return (Criteria) this;
        }

        public Criteria andYgdwbhLessThanOrEqualTo(String value) {
            addCriterion("YGDWBH <=", value, "ygdwbh");
            return (Criteria) this;
        }

        public Criteria andYgdwbhLike(String value) {
            addCriterion("YGDWBH like", value, "ygdwbh");
            return (Criteria) this;
        }

        public Criteria andYgdwbhNotLike(String value) {
            addCriterion("YGDWBH not like", value, "ygdwbh");
            return (Criteria) this;
        }

        public Criteria andYgdwbhIn(List<String> values) {
            addCriterion("YGDWBH in", values, "ygdwbh");
            return (Criteria) this;
        }

        public Criteria andYgdwbhNotIn(List<String> values) {
            addCriterion("YGDWBH not in", values, "ygdwbh");
            return (Criteria) this;
        }

        public Criteria andYgdwbhBetween(String value1, String value2) {
            addCriterion("YGDWBH between", value1, value2, "ygdwbh");
            return (Criteria) this;
        }

        public Criteria andYgdwbhNotBetween(String value1, String value2) {
            addCriterion("YGDWBH not between", value1, value2, "ygdwbh");
            return (Criteria) this;
        }

        public Criteria andYgdhIsNull() {
            addCriterion("YGDH is null");
            return (Criteria) this;
        }

        public Criteria andYgdhIsNotNull() {
            addCriterion("YGDH is not null");
            return (Criteria) this;
        }

        public Criteria andYgdhEqualTo(String value) {
            addCriterion("YGDH =", value, "ygdh");
            return (Criteria) this;
        }

        public Criteria andYgdhNotEqualTo(String value) {
            addCriterion("YGDH <>", value, "ygdh");
            return (Criteria) this;
        }

        public Criteria andYgdhGreaterThan(String value) {
            addCriterion("YGDH >", value, "ygdh");
            return (Criteria) this;
        }

        public Criteria andYgdhGreaterThanOrEqualTo(String value) {
            addCriterion("YGDH >=", value, "ygdh");
            return (Criteria) this;
        }

        public Criteria andYgdhLessThan(String value) {
            addCriterion("YGDH <", value, "ygdh");
            return (Criteria) this;
        }

        public Criteria andYgdhLessThanOrEqualTo(String value) {
            addCriterion("YGDH <=", value, "ygdh");
            return (Criteria) this;
        }

        public Criteria andYgdhLike(String value) {
            addCriterion("YGDH like", value, "ygdh");
            return (Criteria) this;
        }

        public Criteria andYgdhNotLike(String value) {
            addCriterion("YGDH not like", value, "ygdh");
            return (Criteria) this;
        }

        public Criteria andYgdhIn(List<String> values) {
            addCriterion("YGDH in", values, "ygdh");
            return (Criteria) this;
        }

        public Criteria andYgdhNotIn(List<String> values) {
            addCriterion("YGDH not in", values, "ygdh");
            return (Criteria) this;
        }

        public Criteria andYgdhBetween(String value1, String value2) {
            addCriterion("YGDH between", value1, value2, "ygdh");
            return (Criteria) this;
        }

        public Criteria andYgdhNotBetween(String value1, String value2) {
            addCriterion("YGDH not between", value1, value2, "ygdh");
            return (Criteria) this;
        }

        public Criteria andYgqxIsNull() {
            addCriterion("YGQX is null");
            return (Criteria) this;
        }

        public Criteria andYgqxIsNotNull() {
            addCriterion("YGQX is not null");
            return (Criteria) this;
        }

        public Criteria andYgqxEqualTo(Integer value) {
            addCriterion("YGQX =", value, "ygqx");
            return (Criteria) this;
        }

        public Criteria andYgqxNotEqualTo(Integer value) {
            addCriterion("YGQX <>", value, "ygqx");
            return (Criteria) this;
        }

        public Criteria andYgqxGreaterThan(Integer value) {
            addCriterion("YGQX >", value, "ygqx");
            return (Criteria) this;
        }

        public Criteria andYgqxGreaterThanOrEqualTo(Integer value) {
            addCriterion("YGQX >=", value, "ygqx");
            return (Criteria) this;
        }

        public Criteria andYgqxLessThan(Integer value) {
            addCriterion("YGQX <", value, "ygqx");
            return (Criteria) this;
        }

        public Criteria andYgqxLessThanOrEqualTo(Integer value) {
            addCriterion("YGQX <=", value, "ygqx");
            return (Criteria) this;
        }

        public Criteria andYgqxIn(List<Integer> values) {
            addCriterion("YGQX in", values, "ygqx");
            return (Criteria) this;
        }

        public Criteria andYgqxNotIn(List<Integer> values) {
            addCriterion("YGQX not in", values, "ygqx");
            return (Criteria) this;
        }

        public Criteria andYgqxBetween(Integer value1, Integer value2) {
            addCriterion("YGQX between", value1, value2, "ygqx");
            return (Criteria) this;
        }

        public Criteria andYgqxNotBetween(Integer value1, Integer value2) {
            addCriterion("YGQX not between", value1, value2, "ygqx");
            return (Criteria) this;
        }

        public Criteria andYgyxIsNull() {
            addCriterion("YGYX is null");
            return (Criteria) this;
        }

        public Criteria andYgyxIsNotNull() {
            addCriterion("YGYX is not null");
            return (Criteria) this;
        }

        public Criteria andYgyxEqualTo(String value) {
            addCriterion("YGYX =", value, "ygyx");
            return (Criteria) this;
        }

        public Criteria andYgyxNotEqualTo(String value) {
            addCriterion("YGYX <>", value, "ygyx");
            return (Criteria) this;
        }

        public Criteria andYgyxGreaterThan(String value) {
            addCriterion("YGYX >", value, "ygyx");
            return (Criteria) this;
        }

        public Criteria andYgyxGreaterThanOrEqualTo(String value) {
            addCriterion("YGYX >=", value, "ygyx");
            return (Criteria) this;
        }

        public Criteria andYgyxLessThan(String value) {
            addCriterion("YGYX <", value, "ygyx");
            return (Criteria) this;
        }

        public Criteria andYgyxLessThanOrEqualTo(String value) {
            addCriterion("YGYX <=", value, "ygyx");
            return (Criteria) this;
        }

        public Criteria andYgyxLike(String value) {
            addCriterion("YGYX like", value, "ygyx");
            return (Criteria) this;
        }

        public Criteria andYgyxNotLike(String value) {
            addCriterion("YGYX not like", value, "ygyx");
            return (Criteria) this;
        }

        public Criteria andYgyxIn(List<String> values) {
            addCriterion("YGYX in", values, "ygyx");
            return (Criteria) this;
        }

        public Criteria andYgyxNotIn(List<String> values) {
            addCriterion("YGYX not in", values, "ygyx");
            return (Criteria) this;
        }

        public Criteria andYgyxBetween(String value1, String value2) {
            addCriterion("YGYX between", value1, value2, "ygyx");
            return (Criteria) this;
        }

        public Criteria andYgyxNotBetween(String value1, String value2) {
            addCriterion("YGYX not between", value1, value2, "ygyx");
            return (Criteria) this;
        }

        public Criteria andYgxfIsNull() {
            addCriterion("YGXF is null");
            return (Criteria) this;
        }

        public Criteria andYgxfIsNotNull() {
            addCriterion("YGXF is not null");
            return (Criteria) this;
        }

        public Criteria andYgxfEqualTo(String value) {
            addCriterion("YGXF =", value, "ygxf");
            return (Criteria) this;
        }

        public Criteria andYgxfNotEqualTo(String value) {
            addCriterion("YGXF <>", value, "ygxf");
            return (Criteria) this;
        }

        public Criteria andYgxfGreaterThan(String value) {
            addCriterion("YGXF >", value, "ygxf");
            return (Criteria) this;
        }

        public Criteria andYgxfGreaterThanOrEqualTo(String value) {
            addCriterion("YGXF >=", value, "ygxf");
            return (Criteria) this;
        }

        public Criteria andYgxfLessThan(String value) {
            addCriterion("YGXF <", value, "ygxf");
            return (Criteria) this;
        }

        public Criteria andYgxfLessThanOrEqualTo(String value) {
            addCriterion("YGXF <=", value, "ygxf");
            return (Criteria) this;
        }

        public Criteria andYgxfLike(String value) {
            addCriterion("YGXF like", value, "ygxf");
            return (Criteria) this;
        }

        public Criteria andYgxfNotLike(String value) {
            addCriterion("YGXF not like", value, "ygxf");
            return (Criteria) this;
        }

        public Criteria andYgxfIn(List<String> values) {
            addCriterion("YGXF in", values, "ygxf");
            return (Criteria) this;
        }

        public Criteria andYgxfNotIn(List<String> values) {
            addCriterion("YGXF not in", values, "ygxf");
            return (Criteria) this;
        }

        public Criteria andYgxfBetween(String value1, String value2) {
            addCriterion("YGXF between", value1, value2, "ygxf");
            return (Criteria) this;
        }

        public Criteria andYgxfNotBetween(String value1, String value2) {
            addCriterion("YGXF not between", value1, value2, "ygxf");
            return (Criteria) this;
        }

        public Criteria andYgcjIsNull() {
            addCriterion("YGCJ is null");
            return (Criteria) this;
        }

        public Criteria andYgcjIsNotNull() {
            addCriterion("YGCJ is not null");
            return (Criteria) this;
        }

        public Criteria andYgcjEqualTo(Double value) {
            addCriterion("YGCJ =", value, "ygcj");
            return (Criteria) this;
        }

        public Criteria andYgcjNotEqualTo(Double value) {
            addCriterion("YGCJ <>", value, "ygcj");
            return (Criteria) this;
        }

        public Criteria andYgcjGreaterThan(Double value) {
            addCriterion("YGCJ >", value, "ygcj");
            return (Criteria) this;
        }

        public Criteria andYgcjGreaterThanOrEqualTo(Double value) {
            addCriterion("YGCJ >=", value, "ygcj");
            return (Criteria) this;
        }

        public Criteria andYgcjLessThan(Double value) {
            addCriterion("YGCJ <", value, "ygcj");
            return (Criteria) this;
        }

        public Criteria andYgcjLessThanOrEqualTo(Double value) {
            addCriterion("YGCJ <=", value, "ygcj");
            return (Criteria) this;
        }

        public Criteria andYgcjIn(List<Double> values) {
            addCriterion("YGCJ in", values, "ygcj");
            return (Criteria) this;
        }

        public Criteria andYgcjNotIn(List<Double> values) {
            addCriterion("YGCJ not in", values, "ygcj");
            return (Criteria) this;
        }

        public Criteria andYgcjBetween(Double value1, Double value2) {
            addCriterion("YGCJ between", value1, value2, "ygcj");
            return (Criteria) this;
        }

        public Criteria andYgcjNotBetween(Double value1, Double value2) {
            addCriterion("YGCJ not between", value1, value2, "ygcj");
            return (Criteria) this;
        }

        public Criteria andYgpxyqIsNull() {
            addCriterion("YGPXYQ is null");
            return (Criteria) this;
        }

        public Criteria andYgpxyqIsNotNull() {
            addCriterion("YGPXYQ is not null");
            return (Criteria) this;
        }

        public Criteria andYgpxyqEqualTo(String value) {
            addCriterion("YGPXYQ =", value, "ygpxyq");
            return (Criteria) this;
        }

        public Criteria andYgpxyqNotEqualTo(String value) {
            addCriterion("YGPXYQ <>", value, "ygpxyq");
            return (Criteria) this;
        }

        public Criteria andYgpxyqGreaterThan(String value) {
            addCriterion("YGPXYQ >", value, "ygpxyq");
            return (Criteria) this;
        }

        public Criteria andYgpxyqGreaterThanOrEqualTo(String value) {
            addCriterion("YGPXYQ >=", value, "ygpxyq");
            return (Criteria) this;
        }

        public Criteria andYgpxyqLessThan(String value) {
            addCriterion("YGPXYQ <", value, "ygpxyq");
            return (Criteria) this;
        }

        public Criteria andYgpxyqLessThanOrEqualTo(String value) {
            addCriterion("YGPXYQ <=", value, "ygpxyq");
            return (Criteria) this;
        }

        public Criteria andYgpxyqLike(String value) {
            addCriterion("YGPXYQ like", value, "ygpxyq");
            return (Criteria) this;
        }

        public Criteria andYgpxyqNotLike(String value) {
            addCriterion("YGPXYQ not like", value, "ygpxyq");
            return (Criteria) this;
        }

        public Criteria andYgpxyqIn(List<String> values) {
            addCriterion("YGPXYQ in", values, "ygpxyq");
            return (Criteria) this;
        }

        public Criteria andYgpxyqNotIn(List<String> values) {
            addCriterion("YGPXYQ not in", values, "ygpxyq");
            return (Criteria) this;
        }

        public Criteria andYgpxyqBetween(String value1, String value2) {
            addCriterion("YGPXYQ between", value1, value2, "ygpxyq");
            return (Criteria) this;
        }

        public Criteria andYgpxyqNotBetween(String value1, String value2) {
            addCriterion("YGPXYQ not between", value1, value2, "ygpxyq");
            return (Criteria) this;
        }

        public Criteria andYgpxzpIsNull() {
            addCriterion("YGPXZP is null");
            return (Criteria) this;
        }

        public Criteria andYgpxzpIsNotNull() {
            addCriterion("YGPXZP is not null");
            return (Criteria) this;
        }

        public Criteria andYgpxzpEqualTo(String value) {
            addCriterion("YGPXZP =", value, "ygpxzp");
            return (Criteria) this;
        }

        public Criteria andYgpxzpNotEqualTo(String value) {
            addCriterion("YGPXZP <>", value, "ygpxzp");
            return (Criteria) this;
        }

        public Criteria andYgpxzpGreaterThan(String value) {
            addCriterion("YGPXZP >", value, "ygpxzp");
            return (Criteria) this;
        }

        public Criteria andYgpxzpGreaterThanOrEqualTo(String value) {
            addCriterion("YGPXZP >=", value, "ygpxzp");
            return (Criteria) this;
        }

        public Criteria andYgpxzpLessThan(String value) {
            addCriterion("YGPXZP <", value, "ygpxzp");
            return (Criteria) this;
        }

        public Criteria andYgpxzpLessThanOrEqualTo(String value) {
            addCriterion("YGPXZP <=", value, "ygpxzp");
            return (Criteria) this;
        }

        public Criteria andYgpxzpLike(String value) {
            addCriterion("YGPXZP like", value, "ygpxzp");
            return (Criteria) this;
        }

        public Criteria andYgpxzpNotLike(String value) {
            addCriterion("YGPXZP not like", value, "ygpxzp");
            return (Criteria) this;
        }

        public Criteria andYgpxzpIn(List<String> values) {
            addCriterion("YGPXZP in", values, "ygpxzp");
            return (Criteria) this;
        }

        public Criteria andYgpxzpNotIn(List<String> values) {
            addCriterion("YGPXZP not in", values, "ygpxzp");
            return (Criteria) this;
        }

        public Criteria andYgpxzpBetween(String value1, String value2) {
            addCriterion("YGPXZP between", value1, value2, "ygpxzp");
            return (Criteria) this;
        }

        public Criteria andYgpxzpNotBetween(String value1, String value2) {
            addCriterion("YGPXZP not between", value1, value2, "ygpxzp");
            return (Criteria) this;
        }

        public Criteria andYgztIsNull() {
            addCriterion("YGZT is null");
            return (Criteria) this;
        }

        public Criteria andYgztIsNotNull() {
            addCriterion("YGZT is not null");
            return (Criteria) this;
        }

        public Criteria andYgztEqualTo(Integer value) {
            addCriterion("YGZT =", value, "ygzt");
            return (Criteria) this;
        }

        public Criteria andYgztNotEqualTo(Integer value) {
            addCriterion("YGZT <>", value, "ygzt");
            return (Criteria) this;
        }

        public Criteria andYgztGreaterThan(Integer value) {
            addCriterion("YGZT >", value, "ygzt");
            return (Criteria) this;
        }

        public Criteria andYgztGreaterThanOrEqualTo(Integer value) {
            addCriterion("YGZT >=", value, "ygzt");
            return (Criteria) this;
        }

        public Criteria andYgztLessThan(Integer value) {
            addCriterion("YGZT <", value, "ygzt");
            return (Criteria) this;
        }

        public Criteria andYgztLessThanOrEqualTo(Integer value) {
            addCriterion("YGZT <=", value, "ygzt");
            return (Criteria) this;
        }

        public Criteria andYgztIn(List<Integer> values) {
            addCriterion("YGZT in", values, "ygzt");
            return (Criteria) this;
        }

        public Criteria andYgztNotIn(List<Integer> values) {
            addCriterion("YGZT not in", values, "ygzt");
            return (Criteria) this;
        }

        public Criteria andYgztBetween(Integer value1, Integer value2) {
            addCriterion("YGZT between", value1, value2, "ygzt");
            return (Criteria) this;
        }

        public Criteria andYgztNotBetween(Integer value1, Integer value2) {
            addCriterion("YGZT not between", value1, value2, "ygzt");
            return (Criteria) this;
        }

        public Criteria andYgdlztIsNull() {
            addCriterion("YGDLZT is null");
            return (Criteria) this;
        }

        public Criteria andYgdlztIsNotNull() {
            addCriterion("YGDLZT is not null");
            return (Criteria) this;
        }

        public Criteria andYgdlztEqualTo(Integer value) {
            addCriterion("YGDLZT =", value, "ygdlzt");
            return (Criteria) this;
        }

        public Criteria andYgdlztNotEqualTo(Integer value) {
            addCriterion("YGDLZT <>", value, "ygdlzt");
            return (Criteria) this;
        }

        public Criteria andYgdlztGreaterThan(Integer value) {
            addCriterion("YGDLZT >", value, "ygdlzt");
            return (Criteria) this;
        }

        public Criteria andYgdlztGreaterThanOrEqualTo(Integer value) {
            addCriterion("YGDLZT >=", value, "ygdlzt");
            return (Criteria) this;
        }

        public Criteria andYgdlztLessThan(Integer value) {
            addCriterion("YGDLZT <", value, "ygdlzt");
            return (Criteria) this;
        }

        public Criteria andYgdlztLessThanOrEqualTo(Integer value) {
            addCriterion("YGDLZT <=", value, "ygdlzt");
            return (Criteria) this;
        }

        public Criteria andYgdlztIn(List<Integer> values) {
            addCriterion("YGDLZT in", values, "ygdlzt");
            return (Criteria) this;
        }

        public Criteria andYgdlztNotIn(List<Integer> values) {
            addCriterion("YGDLZT not in", values, "ygdlzt");
            return (Criteria) this;
        }

        public Criteria andYgdlztBetween(Integer value1, Integer value2) {
            addCriterion("YGDLZT between", value1, value2, "ygdlzt");
            return (Criteria) this;
        }

        public Criteria andYgdlztNotBetween(Integer value1, Integer value2) {
            addCriterion("YGDLZT not between", value1, value2, "ygdlzt");
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