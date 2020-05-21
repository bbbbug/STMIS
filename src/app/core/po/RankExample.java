package app.core.po;

import java.util.ArrayList;
import java.util.List;

public class RankExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RankExample() {
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

        public Criteria andJsbhIsNull() {
            addCriterion("JSBH is null");
            return (Criteria) this;
        }

        public Criteria andJsbhIsNotNull() {
            addCriterion("JSBH is not null");
            return (Criteria) this;
        }

        public Criteria andJsbhEqualTo(Integer value) {
            addCriterion("JSBH =", value, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsbhNotEqualTo(Integer value) {
            addCriterion("JSBH <>", value, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsbhGreaterThan(Integer value) {
            addCriterion("JSBH >", value, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsbhGreaterThanOrEqualTo(Integer value) {
            addCriterion("JSBH >=", value, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsbhLessThan(Integer value) {
            addCriterion("JSBH <", value, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsbhLessThanOrEqualTo(Integer value) {
            addCriterion("JSBH <=", value, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsbhIn(List<Integer> values) {
            addCriterion("JSBH in", values, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsbhNotIn(List<Integer> values) {
            addCriterion("JSBH not in", values, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsbhBetween(Integer value1, Integer value2) {
            addCriterion("JSBH between", value1, value2, "jsbh");
            return (Criteria) this;
        }

        public Criteria andJsbhNotBetween(Integer value1, Integer value2) {
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

        public Criteria andYgjsfsIsNull() {
            addCriterion("YGJSFS is null");
            return (Criteria) this;
        }

        public Criteria andYgjsfsIsNotNull() {
            addCriterion("YGJSFS is not null");
            return (Criteria) this;
        }

        public Criteria andYgjsfsEqualTo(String value) {
            addCriterion("YGJSFS =", value, "ygjsfs");
            return (Criteria) this;
        }

        public Criteria andYgjsfsNotEqualTo(String value) {
            addCriterion("YGJSFS <>", value, "ygjsfs");
            return (Criteria) this;
        }

        public Criteria andYgjsfsGreaterThan(String value) {
            addCriterion("YGJSFS >", value, "ygjsfs");
            return (Criteria) this;
        }

        public Criteria andYgjsfsGreaterThanOrEqualTo(String value) {
            addCriterion("YGJSFS >=", value, "ygjsfs");
            return (Criteria) this;
        }

        public Criteria andYgjsfsLessThan(String value) {
            addCriterion("YGJSFS <", value, "ygjsfs");
            return (Criteria) this;
        }

        public Criteria andYgjsfsLessThanOrEqualTo(String value) {
            addCriterion("YGJSFS <=", value, "ygjsfs");
            return (Criteria) this;
        }

        public Criteria andYgjsfsLike(String value) {
            addCriterion("YGJSFS like", value, "ygjsfs");
            return (Criteria) this;
        }

        public Criteria andYgjsfsNotLike(String value) {
            addCriterion("YGJSFS not like", value, "ygjsfs");
            return (Criteria) this;
        }

        public Criteria andYgjsfsIn(List<String> values) {
            addCriterion("YGJSFS in", values, "ygjsfs");
            return (Criteria) this;
        }

        public Criteria andYgjsfsNotIn(List<String> values) {
            addCriterion("YGJSFS not in", values, "ygjsfs");
            return (Criteria) this;
        }

        public Criteria andYgjsfsBetween(String value1, String value2) {
            addCriterion("YGJSFS between", value1, value2, "ygjsfs");
            return (Criteria) this;
        }

        public Criteria andYgjsfsNotBetween(String value1, String value2) {
            addCriterion("YGJSFS not between", value1, value2, "ygjsfs");
            return (Criteria) this;
        }

        public Criteria andYgjspmIsNull() {
            addCriterion("YGJSPM is null");
            return (Criteria) this;
        }

        public Criteria andYgjspmIsNotNull() {
            addCriterion("YGJSPM is not null");
            return (Criteria) this;
        }

        public Criteria andYgjspmEqualTo(String value) {
            addCriterion("YGJSPM =", value, "ygjspm");
            return (Criteria) this;
        }

        public Criteria andYgjspmNotEqualTo(String value) {
            addCriterion("YGJSPM <>", value, "ygjspm");
            return (Criteria) this;
        }

        public Criteria andYgjspmGreaterThan(String value) {
            addCriterion("YGJSPM >", value, "ygjspm");
            return (Criteria) this;
        }

        public Criteria andYgjspmGreaterThanOrEqualTo(String value) {
            addCriterion("YGJSPM >=", value, "ygjspm");
            return (Criteria) this;
        }

        public Criteria andYgjspmLessThan(String value) {
            addCriterion("YGJSPM <", value, "ygjspm");
            return (Criteria) this;
        }

        public Criteria andYgjspmLessThanOrEqualTo(String value) {
            addCriterion("YGJSPM <=", value, "ygjspm");
            return (Criteria) this;
        }

        public Criteria andYgjspmLike(String value) {
            addCriterion("YGJSPM like", value, "ygjspm");
            return (Criteria) this;
        }

        public Criteria andYgjspmNotLike(String value) {
            addCriterion("YGJSPM not like", value, "ygjspm");
            return (Criteria) this;
        }

        public Criteria andYgjspmIn(List<String> values) {
            addCriterion("YGJSPM in", values, "ygjspm");
            return (Criteria) this;
        }

        public Criteria andYgjspmNotIn(List<String> values) {
            addCriterion("YGJSPM not in", values, "ygjspm");
            return (Criteria) this;
        }

        public Criteria andYgjspmBetween(String value1, String value2) {
            addCriterion("YGJSPM between", value1, value2, "ygjspm");
            return (Criteria) this;
        }

        public Criteria andYgjspmNotBetween(String value1, String value2) {
            addCriterion("YGJSPM not between", value1, value2, "ygjspm");
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