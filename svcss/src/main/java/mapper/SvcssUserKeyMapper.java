package mapper;

import entity.SvcssUserKey;
import entity.SvcssUserKeyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SvcssUserKeyMapper {

    long countByExample(SvcssUserKeyExample example);


    int deleteByExample(SvcssUserKeyExample example);


    int insert(SvcssUserKey record);


    int insertSelective(SvcssUserKey record);


    List<SvcssUserKey> selectByExample(SvcssUserKeyExample example);
    

    int updateByExampleSelective(@Param("record") SvcssUserKey record, @Param("example") SvcssUserKeyExample example);


    int updateByExample(@Param("record") SvcssUserKey record, @Param("example") SvcssUserKeyExample example);
}