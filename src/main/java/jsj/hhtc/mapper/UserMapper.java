package jsj.hhtc.mapper;

import jsj.hhtc.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    User findUser(User user);

    List<User> findAllUser( @Param("startIndex") Integer startIndex, @Param("pageSize") Integer pageSize);

    Integer findNum();

    Integer userStateChange(@Param("id") Integer id, @Param("state") Boolean state);


    Integer addUser(User user);

    Integer deleteUser(Integer id);
}
