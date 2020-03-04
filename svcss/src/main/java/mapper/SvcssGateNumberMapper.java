package mapper;

import entity.SvcssGateNumber;
import entity.SvcssGateNumberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SvcssGateNumberMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table svcss_gate_number
     *
     * @mbg.generated
     */
    long countByExample(SvcssGateNumberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table svcss_gate_number
     *
     * @mbg.generated
     */
    int deleteByExample(SvcssGateNumberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table svcss_gate_number
     *
     * @mbg.generated
     */
    int insert(SvcssGateNumber record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table svcss_gate_number
     *
     * @mbg.generated
     */
    int insertSelective(SvcssGateNumber record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table svcss_gate_number
     *
     * @mbg.generated
     */
    List<SvcssGateNumber> selectByExample(SvcssGateNumberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table svcss_gate_number
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") SvcssGateNumber record, @Param("example") SvcssGateNumberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table svcss_gate_number
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") SvcssGateNumber record, @Param("example") SvcssGateNumberExample example);
}