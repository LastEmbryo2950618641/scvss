package entity;

public class SvcssUserKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column svcss_user_key.user_id
     *
     * @mbg.generated
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column svcss_user_key.user_username
     *
     * @mbg.generated
     */
    private String userUsername;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column svcss_user_key.user_password
     *
     * @mbg.generated
     */
    private String userPassword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column svcss_user_key.user_tag
     *
     * @mbg.generated
     */
    private String userTag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column svcss_user_key.user_id
     *
     * @return the value of svcss_user_key.user_id
     *
     * @mbg.generated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column svcss_user_key.user_id
     *
     * @param userId the value for svcss_user_key.user_id
     *
     * @mbg.generated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column svcss_user_key.user_username
     *
     * @return the value of svcss_user_key.user_username
     *
     * @mbg.generated
     */
    public String getUserUsername() {
        return userUsername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column svcss_user_key.user_username
     *
     * @param userUsername the value for svcss_user_key.user_username
     *
     * @mbg.generated
     */
    public void setUserUsername(String userUsername) {
        this.userUsername = userUsername == null ? null : userUsername.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column svcss_user_key.user_password
     *
     * @return the value of svcss_user_key.user_password
     *
     * @mbg.generated
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column svcss_user_key.user_password
     *
     * @param userPassword the value for svcss_user_key.user_password
     *
     * @mbg.generated
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column svcss_user_key.user_tag
     *
     * @return the value of svcss_user_key.user_tag
     *
     * @mbg.generated
     */
    public String getUserTag() {
        return userTag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column svcss_user_key.user_tag
     *
     * @param userTag the value for svcss_user_key.user_tag
     *
     * @mbg.generated
     */
    public void setUserTag(String userTag) {
        this.userTag = userTag == null ? null : userTag.trim();
    }
}