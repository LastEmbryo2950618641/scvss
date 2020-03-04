package mapper;

import entity.SvcssTimeChoose;
import entity.SvcssTimeChooseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SvcssTimeChooseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table svcss_time_choose
     *
     * @mbg.generated
     */
    long countByExample(SvcssTimeChooseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table svcss_time_choose
     *
     * @mbg.generated
     */
    int deleteByExample(SvcssTimeChooseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table svcss_time_choose
     *
     * @mbg.generated
     */
    int insert(SvcssTimeChoose record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table svcss_time_choose
     *
     * @mbg.generated
     */
    int insertSelective(SvcssTimeChoose record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table svcss_time_choose
     *
     * @mbg.generated
     */
    List<SvcssTimeChoose> selectByExample(SvcssTimeChooseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table svcss_time_choose
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") SvcssTimeChoose record, @Param("example") SvcssTimeChooseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table svcss_time_choose
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") SvcssTimeChoose record, @Param("example") SvcssTimeChooseExample example);
}