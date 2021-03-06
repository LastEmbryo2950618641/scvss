package mapper;

import entity.SvcssInvitationCode;
import entity.SvcssInvitationCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SvcssInvitationCodeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table svcss_invitation_code
     *
     * @mbg.generated
     */
    long countByExample(SvcssInvitationCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table svcss_invitation_code
     *
     * @mbg.generated
     */
    int deleteByExample(SvcssInvitationCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table svcss_invitation_code
     *
     * @mbg.generated
     */
    int insert(SvcssInvitationCode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table svcss_invitation_code
     *
     * @mbg.generated
     */
    int insertSelective(SvcssInvitationCode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table svcss_invitation_code
     *
     * @mbg.generated
     */
    List<SvcssInvitationCode> selectByExample(SvcssInvitationCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table svcss_invitation_code
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") SvcssInvitationCode record, @Param("example") SvcssInvitationCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table svcss_invitation_code
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") SvcssInvitationCode record, @Param("example") SvcssInvitationCodeExample example);
}