package entity;

import java.util.ArrayList;
import java.util.List;

public class SvcssGradeStatisticsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table svcss_grade_statistics
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table svcss_grade_statistics
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table svcss_grade_statistics
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table svcss_grade_statistics
     *
     * @mbg.generated
     */
    public SvcssGradeStatisticsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table svcss_grade_statistics
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table svcss_grade_statistics
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table svcss_grade_statistics
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table svcss_grade_statistics
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table svcss_grade_statistics
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table svcss_grade_statistics
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table svcss_grade_statistics
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table svcss_grade_statistics
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table svcss_grade_statistics
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table svcss_grade_statistics
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table svcss_grade_statistics
     *
     * @mbg.generated
     */
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

        public Criteria andStatisticsIdIsNull() {
            addCriterion("statistics_id is null");
            return (Criteria) this;
        }

        public Criteria andStatisticsIdIsNotNull() {
            addCriterion("statistics_id is not null");
            return (Criteria) this;
        }

        public Criteria andStatisticsIdEqualTo(String value) {
            addCriterion("statistics_id =", value, "statisticsId");
            return (Criteria) this;
        }

        public Criteria andStatisticsIdNotEqualTo(String value) {
            addCriterion("statistics_id <>", value, "statisticsId");
            return (Criteria) this;
        }

        public Criteria andStatisticsIdGreaterThan(String value) {
            addCriterion("statistics_id >", value, "statisticsId");
            return (Criteria) this;
        }

        public Criteria andStatisticsIdGreaterThanOrEqualTo(String value) {
            addCriterion("statistics_id >=", value, "statisticsId");
            return (Criteria) this;
        }

        public Criteria andStatisticsIdLessThan(String value) {
            addCriterion("statistics_id <", value, "statisticsId");
            return (Criteria) this;
        }

        public Criteria andStatisticsIdLessThanOrEqualTo(String value) {
            addCriterion("statistics_id <=", value, "statisticsId");
            return (Criteria) this;
        }

        public Criteria andStatisticsIdLike(String value) {
            addCriterion("statistics_id like", value, "statisticsId");
            return (Criteria) this;
        }

        public Criteria andStatisticsIdNotLike(String value) {
            addCriterion("statistics_id not like", value, "statisticsId");
            return (Criteria) this;
        }

        public Criteria andStatisticsIdIn(List<String> values) {
            addCriterion("statistics_id in", values, "statisticsId");
            return (Criteria) this;
        }

        public Criteria andStatisticsIdNotIn(List<String> values) {
            addCriterion("statistics_id not in", values, "statisticsId");
            return (Criteria) this;
        }

        public Criteria andStatisticsIdBetween(String value1, String value2) {
            addCriterion("statistics_id between", value1, value2, "statisticsId");
            return (Criteria) this;
        }

        public Criteria andStatisticsIdNotBetween(String value1, String value2) {
            addCriterion("statistics_id not between", value1, value2, "statisticsId");
            return (Criteria) this;
        }

        public Criteria andStatisticsCourseIdIsNull() {
            addCriterion("statistics_course_id is null");
            return (Criteria) this;
        }

        public Criteria andStatisticsCourseIdIsNotNull() {
            addCriterion("statistics_course_id is not null");
            return (Criteria) this;
        }

        public Criteria andStatisticsCourseIdEqualTo(String value) {
            addCriterion("statistics_course_id =", value, "statisticsCourseId");
            return (Criteria) this;
        }

        public Criteria andStatisticsCourseIdNotEqualTo(String value) {
            addCriterion("statistics_course_id <>", value, "statisticsCourseId");
            return (Criteria) this;
        }

        public Criteria andStatisticsCourseIdGreaterThan(String value) {
            addCriterion("statistics_course_id >", value, "statisticsCourseId");
            return (Criteria) this;
        }

        public Criteria andStatisticsCourseIdGreaterThanOrEqualTo(String value) {
            addCriterion("statistics_course_id >=", value, "statisticsCourseId");
            return (Criteria) this;
        }

        public Criteria andStatisticsCourseIdLessThan(String value) {
            addCriterion("statistics_course_id <", value, "statisticsCourseId");
            return (Criteria) this;
        }

        public Criteria andStatisticsCourseIdLessThanOrEqualTo(String value) {
            addCriterion("statistics_course_id <=", value, "statisticsCourseId");
            return (Criteria) this;
        }

        public Criteria andStatisticsCourseIdLike(String value) {
            addCriterion("statistics_course_id like", value, "statisticsCourseId");
            return (Criteria) this;
        }

        public Criteria andStatisticsCourseIdNotLike(String value) {
            addCriterion("statistics_course_id not like", value, "statisticsCourseId");
            return (Criteria) this;
        }

        public Criteria andStatisticsCourseIdIn(List<String> values) {
            addCriterion("statistics_course_id in", values, "statisticsCourseId");
            return (Criteria) this;
        }

        public Criteria andStatisticsCourseIdNotIn(List<String> values) {
            addCriterion("statistics_course_id not in", values, "statisticsCourseId");
            return (Criteria) this;
        }

        public Criteria andStatisticsCourseIdBetween(String value1, String value2) {
            addCriterion("statistics_course_id between", value1, value2, "statisticsCourseId");
            return (Criteria) this;
        }

        public Criteria andStatisticsCourseIdNotBetween(String value1, String value2) {
            addCriterion("statistics_course_id not between", value1, value2, "statisticsCourseId");
            return (Criteria) this;
        }

        public Criteria andStatisticsStunumIsNull() {
            addCriterion("statistics_stunum is null");
            return (Criteria) this;
        }

        public Criteria andStatisticsStunumIsNotNull() {
            addCriterion("statistics_stunum is not null");
            return (Criteria) this;
        }

        public Criteria andStatisticsStunumEqualTo(String value) {
            addCriterion("statistics_stunum =", value, "statisticsStunum");
            return (Criteria) this;
        }

        public Criteria andStatisticsStunumNotEqualTo(String value) {
            addCriterion("statistics_stunum <>", value, "statisticsStunum");
            return (Criteria) this;
        }

        public Criteria andStatisticsStunumGreaterThan(String value) {
            addCriterion("statistics_stunum >", value, "statisticsStunum");
            return (Criteria) this;
        }

        public Criteria andStatisticsStunumGreaterThanOrEqualTo(String value) {
            addCriterion("statistics_stunum >=", value, "statisticsStunum");
            return (Criteria) this;
        }

        public Criteria andStatisticsStunumLessThan(String value) {
            addCriterion("statistics_stunum <", value, "statisticsStunum");
            return (Criteria) this;
        }

        public Criteria andStatisticsStunumLessThanOrEqualTo(String value) {
            addCriterion("statistics_stunum <=", value, "statisticsStunum");
            return (Criteria) this;
        }

        public Criteria andStatisticsStunumLike(String value) {
            addCriterion("statistics_stunum like", value, "statisticsStunum");
            return (Criteria) this;
        }

        public Criteria andStatisticsStunumNotLike(String value) {
            addCriterion("statistics_stunum not like", value, "statisticsStunum");
            return (Criteria) this;
        }

        public Criteria andStatisticsStunumIn(List<String> values) {
            addCriterion("statistics_stunum in", values, "statisticsStunum");
            return (Criteria) this;
        }

        public Criteria andStatisticsStunumNotIn(List<String> values) {
            addCriterion("statistics_stunum not in", values, "statisticsStunum");
            return (Criteria) this;
        }

        public Criteria andStatisticsStunumBetween(String value1, String value2) {
            addCriterion("statistics_stunum between", value1, value2, "statisticsStunum");
            return (Criteria) this;
        }

        public Criteria andStatisticsStunumNotBetween(String value1, String value2) {
            addCriterion("statistics_stunum not between", value1, value2, "statisticsStunum");
            return (Criteria) this;
        }

        public Criteria andStatisticsHaveScoreIsNull() {
            addCriterion("statistics_have_score is null");
            return (Criteria) this;
        }

        public Criteria andStatisticsHaveScoreIsNotNull() {
            addCriterion("statistics_have_score is not null");
            return (Criteria) this;
        }

        public Criteria andStatisticsHaveScoreEqualTo(String value) {
            addCriterion("statistics_have_score =", value, "statisticsHaveScore");
            return (Criteria) this;
        }

        public Criteria andStatisticsHaveScoreNotEqualTo(String value) {
            addCriterion("statistics_have_score <>", value, "statisticsHaveScore");
            return (Criteria) this;
        }

        public Criteria andStatisticsHaveScoreGreaterThan(String value) {
            addCriterion("statistics_have_score >", value, "statisticsHaveScore");
            return (Criteria) this;
        }

        public Criteria andStatisticsHaveScoreGreaterThanOrEqualTo(String value) {
            addCriterion("statistics_have_score >=", value, "statisticsHaveScore");
            return (Criteria) this;
        }

        public Criteria andStatisticsHaveScoreLessThan(String value) {
            addCriterion("statistics_have_score <", value, "statisticsHaveScore");
            return (Criteria) this;
        }

        public Criteria andStatisticsHaveScoreLessThanOrEqualTo(String value) {
            addCriterion("statistics_have_score <=", value, "statisticsHaveScore");
            return (Criteria) this;
        }

        public Criteria andStatisticsHaveScoreLike(String value) {
            addCriterion("statistics_have_score like", value, "statisticsHaveScore");
            return (Criteria) this;
        }

        public Criteria andStatisticsHaveScoreNotLike(String value) {
            addCriterion("statistics_have_score not like", value, "statisticsHaveScore");
            return (Criteria) this;
        }

        public Criteria andStatisticsHaveScoreIn(List<String> values) {
            addCriterion("statistics_have_score in", values, "statisticsHaveScore");
            return (Criteria) this;
        }

        public Criteria andStatisticsHaveScoreNotIn(List<String> values) {
            addCriterion("statistics_have_score not in", values, "statisticsHaveScore");
            return (Criteria) this;
        }

        public Criteria andStatisticsHaveScoreBetween(String value1, String value2) {
            addCriterion("statistics_have_score between", value1, value2, "statisticsHaveScore");
            return (Criteria) this;
        }

        public Criteria andStatisticsHaveScoreNotBetween(String value1, String value2) {
            addCriterion("statistics_have_score not between", value1, value2, "statisticsHaveScore");
            return (Criteria) this;
        }

        public Criteria andStatisticsNotScoreIsNull() {
            addCriterion("statistics_not_score is null");
            return (Criteria) this;
        }

        public Criteria andStatisticsNotScoreIsNotNull() {
            addCriterion("statistics_not_score is not null");
            return (Criteria) this;
        }

        public Criteria andStatisticsNotScoreEqualTo(String value) {
            addCriterion("statistics_not_score =", value, "statisticsNotScore");
            return (Criteria) this;
        }

        public Criteria andStatisticsNotScoreNotEqualTo(String value) {
            addCriterion("statistics_not_score <>", value, "statisticsNotScore");
            return (Criteria) this;
        }

        public Criteria andStatisticsNotScoreGreaterThan(String value) {
            addCriterion("statistics_not_score >", value, "statisticsNotScore");
            return (Criteria) this;
        }

        public Criteria andStatisticsNotScoreGreaterThanOrEqualTo(String value) {
            addCriterion("statistics_not_score >=", value, "statisticsNotScore");
            return (Criteria) this;
        }

        public Criteria andStatisticsNotScoreLessThan(String value) {
            addCriterion("statistics_not_score <", value, "statisticsNotScore");
            return (Criteria) this;
        }

        public Criteria andStatisticsNotScoreLessThanOrEqualTo(String value) {
            addCriterion("statistics_not_score <=", value, "statisticsNotScore");
            return (Criteria) this;
        }

        public Criteria andStatisticsNotScoreLike(String value) {
            addCriterion("statistics_not_score like", value, "statisticsNotScore");
            return (Criteria) this;
        }

        public Criteria andStatisticsNotScoreNotLike(String value) {
            addCriterion("statistics_not_score not like", value, "statisticsNotScore");
            return (Criteria) this;
        }

        public Criteria andStatisticsNotScoreIn(List<String> values) {
            addCriterion("statistics_not_score in", values, "statisticsNotScore");
            return (Criteria) this;
        }

        public Criteria andStatisticsNotScoreNotIn(List<String> values) {
            addCriterion("statistics_not_score not in", values, "statisticsNotScore");
            return (Criteria) this;
        }

        public Criteria andStatisticsNotScoreBetween(String value1, String value2) {
            addCriterion("statistics_not_score between", value1, value2, "statisticsNotScore");
            return (Criteria) this;
        }

        public Criteria andStatisticsNotScoreNotBetween(String value1, String value2) {
            addCriterion("statistics_not_score not between", value1, value2, "statisticsNotScore");
            return (Criteria) this;
        }

        public Criteria andStatisticsPassRateIsNull() {
            addCriterion("statistics_pass_rate is null");
            return (Criteria) this;
        }

        public Criteria andStatisticsPassRateIsNotNull() {
            addCriterion("statistics_pass_rate is not null");
            return (Criteria) this;
        }

        public Criteria andStatisticsPassRateEqualTo(String value) {
            addCriterion("statistics_pass_rate =", value, "statisticsPassRate");
            return (Criteria) this;
        }

        public Criteria andStatisticsPassRateNotEqualTo(String value) {
            addCriterion("statistics_pass_rate <>", value, "statisticsPassRate");
            return (Criteria) this;
        }

        public Criteria andStatisticsPassRateGreaterThan(String value) {
            addCriterion("statistics_pass_rate >", value, "statisticsPassRate");
            return (Criteria) this;
        }

        public Criteria andStatisticsPassRateGreaterThanOrEqualTo(String value) {
            addCriterion("statistics_pass_rate >=", value, "statisticsPassRate");
            return (Criteria) this;
        }

        public Criteria andStatisticsPassRateLessThan(String value) {
            addCriterion("statistics_pass_rate <", value, "statisticsPassRate");
            return (Criteria) this;
        }

        public Criteria andStatisticsPassRateLessThanOrEqualTo(String value) {
            addCriterion("statistics_pass_rate <=", value, "statisticsPassRate");
            return (Criteria) this;
        }

        public Criteria andStatisticsPassRateLike(String value) {
            addCriterion("statistics_pass_rate like", value, "statisticsPassRate");
            return (Criteria) this;
        }

        public Criteria andStatisticsPassRateNotLike(String value) {
            addCriterion("statistics_pass_rate not like", value, "statisticsPassRate");
            return (Criteria) this;
        }

        public Criteria andStatisticsPassRateIn(List<String> values) {
            addCriterion("statistics_pass_rate in", values, "statisticsPassRate");
            return (Criteria) this;
        }

        public Criteria andStatisticsPassRateNotIn(List<String> values) {
            addCriterion("statistics_pass_rate not in", values, "statisticsPassRate");
            return (Criteria) this;
        }

        public Criteria andStatisticsPassRateBetween(String value1, String value2) {
            addCriterion("statistics_pass_rate between", value1, value2, "statisticsPassRate");
            return (Criteria) this;
        }

        public Criteria andStatisticsPassRateNotBetween(String value1, String value2) {
            addCriterion("statistics_pass_rate not between", value1, value2, "statisticsPassRate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table svcss_grade_statistics
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table svcss_grade_statistics
     *
     * @mbg.generated
     */
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