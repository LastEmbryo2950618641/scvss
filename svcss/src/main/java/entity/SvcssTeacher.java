package entity;

public class SvcssTeacher {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column svcss_teacher.teacher_id
     *
     * @mbg.generated
     */
    private String teacherId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column svcss_teacher.teacher_name
     *
     * @mbg.generated
     */
    private String teacherName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column svcss_teacher.teacher_intro
     *
     * @mbg.generated
     */
    private String teacherIntro;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column svcss_teacher.teacher_id
     *
     * @return the value of svcss_teacher.teacher_id
     *
     * @mbg.generated
     */
    public String getTeacherId() {
        return teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column svcss_teacher.teacher_id
     *
     * @param teacherId the value for svcss_teacher.teacher_id
     *
     * @mbg.generated
     */
    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId == null ? null : teacherId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column svcss_teacher.teacher_name
     *
     * @return the value of svcss_teacher.teacher_name
     *
     * @mbg.generated
     */
    public String getTeacherName() {
        return teacherName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column svcss_teacher.teacher_name
     *
     * @param teacherName the value for svcss_teacher.teacher_name
     *
     * @mbg.generated
     */
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column svcss_teacher.teacher_intro
     *
     * @return the value of svcss_teacher.teacher_intro
     *
     * @mbg.generated
     */
    public String getTeacherIntro() {
        return teacherIntro;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column svcss_teacher.teacher_intro
     *
     * @param teacherIntro the value for svcss_teacher.teacher_intro
     *
     * @mbg.generated
     */
    public void setTeacherIntro(String teacherIntro) {
        this.teacherIntro = teacherIntro == null ? null : teacherIntro.trim();
    }
}