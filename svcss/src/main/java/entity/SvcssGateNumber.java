package entity;

public class SvcssGateNumber {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column svcss_gate_number.stu_professional
     *
     * @mbg.generated
     */
    private String stuProfessional;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column svcss_gate_number.course_gate_number
     *
     * @mbg.generated
     */
    private Integer courseGateNumber;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column svcss_gate_number.stu_professional
     *
     * @return the value of svcss_gate_number.stu_professional
     *
     * @mbg.generated
     */
    public String getStuProfessional() {
        return stuProfessional;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column svcss_gate_number.stu_professional
     *
     * @param stuProfessional the value for svcss_gate_number.stu_professional
     *
     * @mbg.generated
     */
    public void setStuProfessional(String stuProfessional) {
        this.stuProfessional = stuProfessional == null ? null : stuProfessional.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column svcss_gate_number.course_gate_number
     *
     * @return the value of svcss_gate_number.course_gate_number
     *
     * @mbg.generated
     */
    public Integer getCourseGateNumber() {
        return courseGateNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column svcss_gate_number.course_gate_number
     *
     * @param courseGateNumber the value for svcss_gate_number.course_gate_number
     *
     * @mbg.generated
     */
    public void setCourseGateNumber(Integer courseGateNumber) {
        this.courseGateNumber = courseGateNumber;
    }
}