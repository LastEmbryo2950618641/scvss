package entity;

public class SvcssCourseTag {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column svcss_course_tag.tag_id
     *
     * @mbg.generated
     */
    private String tagId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column svcss_course_tag.tag_name
     *
     * @mbg.generated
     */
    private String tagName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column svcss_course_tag.tag_id
     *
     * @return the value of svcss_course_tag.tag_id
     *
     * @mbg.generated
     */
    public String getTagId() {
        return tagId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column svcss_course_tag.tag_id
     *
     * @param tagId the value for svcss_course_tag.tag_id
     *
     * @mbg.generated
     */
    public void setTagId(String tagId) {
        this.tagId = tagId == null ? null : tagId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column svcss_course_tag.tag_name
     *
     * @return the value of svcss_course_tag.tag_name
     *
     * @mbg.generated
     */
    public String getTagName() {
        return tagName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column svcss_course_tag.tag_name
     *
     * @param tagName the value for svcss_course_tag.tag_name
     *
     * @mbg.generated
     */
    public void setTagName(String tagName) {
        this.tagName = tagName == null ? null : tagName.trim();
    }
}