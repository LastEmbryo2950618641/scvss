package mapper;

import java.util.List;


import entity.UserKey;



public interface UserKeyMapper {
  
    int insert(UserKey record);

 
    int insertSelective(UserKey record);
    
    UserKey check(String username);
    
    List<UserKey> selectAll();
}