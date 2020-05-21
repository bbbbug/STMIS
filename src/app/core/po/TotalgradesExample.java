package app.core.po;

import java.util.ArrayList;
import java.util.List;

public class TotalgradesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TotalgradesExample() {
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

        public Criteria andBndsxkczsIsNull() {
            addCriterion("BNDSXKCZS is null");
            return (Criteria) this;
        }

        public Criteria andBndsxkczsIsNotNull() {
            addCriterion("BNDSXKCZS is not null");
            return (Criteria) this;
        }

        public Criteria andBndsxkczsEqualTo(Integer value) {
            addCriterion("BNDSXKCZS =", value, "bndsxkczs");
            return (Criteria) this;
        }

        public Criteria andBndsxkczsNotEqualTo(Integer value) {
            addCriterion("BNDSXKCZS <>", value, "bndsxkczs");
            return (Criteria) this;
        }

        public Criteria andBndsxkczsGreaterThan(Integer value) {
            addCriterion("BNDSXKCZS >", value, "bndsxkczs");
            return (Criteria) this;
        }

        public Criteria andBndsxkczsGreaterThanOrEqualTo(Integer value) {
            addCriterion("BNDSXKCZS >=", value, "bndsxkczs");
            return (Criteria) this;
        }

        public Criteria andBndsxkczsLessThan(Integer value) {
            addCriterion("BNDSXKCZS <", value, "bndsxkczs");
            return (Criteria) this;
        }

        public Criteria andBndsxkczsLessThanOrEqualTo(Integer value) {
            addCriterion("BNDSXKCZS <=", value, "bndsxkczs");
            return (Criteria) this;
        }

        public Criteria andBndsxkczsIn(List<Integer> values) {
            addCriterion("BNDSXKCZS in", values, "bndsxkczs");
            return (Criteria) this;
        }

        public Criteria andBndsxkczsNotIn(List<Integer> values) {
            addCriterion("BNDSXKCZS not in", values, "bndsxkczs");
            return (Criteria) this;
        }

        public Criteria andBndsxkczsBetween(Integer value1, Integer value2) {
            addCriterion("BNDSXKCZS between", value1, value2, "bndsxkczs");
            return (Criteria) this;
        }

        public Criteria andBndsxkczsNotBetween(Integer value1, Integer value2) {
            addCriterion("BNDSXKCZS not between", value1, value2, "bndsxkczs");
            return (Criteria) this;
        }

        public Criteria andLjsxkczsIsNull() {
            addCriterion("LJSXKCZS is null");
            return (Criteria) this;
        }

        public Criteria andLjsxkczsIsNotNull() {
            addCriterion("LJSXKCZS is not null");
            return (Criteria) this;
        }

        public Criteria andLjsxkczsEqualTo(Integer value) {
            addCriterion("LJSXKCZS =", value, "ljsxkczs");
            return (Criteria) this;
        }

        public Criteria andLjsxkczsNotEqualTo(Integer value) {
            addCriterion("LJSXKCZS <>", value, "ljsxkczs");
            return (Criteria) this;
        }

        public Criteria andLjsxkczsGreaterThan(Integer value) {
            addCriterion("LJSXKCZS >", value, "ljsxkczs");
            return (Criteria) this;
        }

        public Criteria andLjsxkczsGreaterThanOrEqualTo(Integer value) {
            addCriterion("LJSXKCZS >=", value, "ljsxkczs");
            return (Criteria) this;
        }

        public Criteria andLjsxkczsLessThan(Integer value) {
            addCriterion("LJSXKCZS <", value, "ljsxkczs");
            return (Criteria) this;
        }

        public Criteria andLjsxkczsLessThanOrEqualTo(Integer value) {
            addCriterion("LJSXKCZS <=", value, "ljsxkczs");
            return (Criteria) this;
        }

        public Criteria andLjsxkczsIn(List<Integer> values) {
            addCriterion("LJSXKCZS in", values, "ljsxkczs");
            return (Criteria) this;
        }

        public Criteria andLjsxkczsNotIn(List<Integer> values) {
            addCriterion("LJSXKCZS not in", values, "ljsxkczs");
            return (Criteria) this;
        }

        public Criteria andLjsxkczsBetween(Integer value1, Integer value2) {
            addCriterion("LJSXKCZS between", value1, value2, "ljsxkczs");
            return (Criteria) this;
        }

        public Criteria andLjsxkczsNotBetween(Integer value1, Integer value2) {
            addCriterion("LJSXKCZS not between", value1, value2, "ljsxkczs");
            return (Criteria) this;
        }

        public Criteria andBndzfIsNull() {
            addCriterion("BNDZF is null");
            return (Criteria) this;
        }

        public Criteria andBndzfIsNotNull() {
            addCriterion("BNDZF is not null");
            return (Criteria) this;
        }

        public Criteria andBndzfEqualTo(Double value) {
            addCriterion("BNDZF =", value, "bndzf");
            return (Criteria) this;
        }

        public Criteria andBndzfNotEqualTo(Double value) {
            addCriterion("BNDZF <>", value, "bndzf");
            return (Criteria) this;
        }

        public Criteria andBndzfGreaterThan(Double value) {
            addCriterion("BNDZF >", value, "bndzf");
            return (Criteria) this;
        }

        public Criteria andBndzfGreaterThanOrEqualTo(Double value) {
            addCriterion("BNDZF >=", value, "bndzf");
            return (Criteria) this;
        }

        public Criteria andBndzfLessThan(Double value) {
            addCriterion("BNDZF <", value, "bndzf");
            return (Criteria) this;
        }

        public Criteria andBndzfLessThanOrEqualTo(Double value) {
            addCriterion("BNDZF <=", value, "bndzf");
            return (Criteria) this;
        }

        public Criteria andBndzfIn(List<Double> values) {
            addCriterion("BNDZF in", values, "bndzf");
            return (Criteria) this;
        }

        public Criteria andBndzfNotIn(List<Double> values) {
            addCriterion("BNDZF not in", values, "bndzf");
            return (Criteria) this;
        }

        public Criteria andBndzfBetween(Double value1, Double value2) {
            addCriterion("BNDZF between", value1, value2, "bndzf");
            return (Criteria) this;
        }

        public Criteria andBndzfNotBetween(Double value1, Double value2) {
            addCriterion("BNDZF not between", value1, value2, "bndzf");
            return (Criteria) this;
        }

        public Criteria andLjzfIsNull() {
            addCriterion("LJZF is null");
            return (Criteria) this;
        }

        public Criteria andLjzfIsNotNull() {
            addCriterion("LJZF is not null");
            return (Criteria) this;
        }

        public Criteria andLjzfEqualTo(Double value) {
            addCriterion("LJZF =", value, "ljzf");
            return (Criteria) this;
        }

        public Criteria andLjzfNotEqualTo(Double value) {
            addCriterion("LJZF <>", value, "ljzf");
            return (Criteria) this;
        }

        public Criteria andLjzfGreaterThan(Double value) {
            addCriterion("LJZF >", value, "ljzf");
            return (Criteria) this;
        }

        public Criteria andLjzfGreaterThanOrEqualTo(Double value) {
            addCriterion("LJZF >=", value, "ljzf");
            return (Criteria) this;
        }

        public Criteria andLjzfLessThan(Double value) {
            addCriterion("LJZF <", value, "ljzf");
            return (Criteria) this;
        }

        public Criteria andLjzfLessThanOrEqualTo(Double value) {
            addCriterion("LJZF <=", value, "ljzf");
            return (Criteria) this;
        }

        public Criteria andLjzfIn(List<Double> values) {
            addCriterion("LJZF in", values, "ljzf");
            return (Criteria) this;
        }

        public Criteria andLjzfNotIn(List<Double> values) {
            addCriterion("LJZF not in", values, "ljzf");
            return (Criteria) this;
        }

        public Criteria andLjzfBetween(Double value1, Double value2) {
            addCriterion("LJZF between", value1, value2, "ljzf");
            return (Criteria) this;
        }

        public Criteria andLjzfNotBetween(Double value1, Double value2) {
            addCriterion("LJZF not between", value1, value2, "ljzf");
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