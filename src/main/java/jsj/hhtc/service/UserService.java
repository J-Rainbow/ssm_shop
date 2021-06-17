package jsj.hhtc.service;

import jsj.hhtc.pojo.User;

import java.util.List;

public interface UserService {
    User findUser(User user);

    List<User> findAllUser(Integer startIndex, Integer pageSize);

    Integer findNum();

    Integer userStateChange(Integer id, Boolean state);

    Integer addUser(User user);

    Integer deleteUser(Integer id);

    User findUserById(Integer id);

    Integer editUser(User user);
}
