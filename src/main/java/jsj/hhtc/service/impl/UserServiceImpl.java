package jsj.hhtc.service.impl;

import jsj.hhtc.mapper.UserMapper;
import jsj.hhtc.pojo.User;
import jsj.hhtc.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("UserService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User findUser(User user) {
        return userMapper.findUser(user);
    }

    @Override
    public List<User> findAllUser(Integer startIndex, Integer pageSize) {
        return userMapper.findAllUser(startIndex,pageSize);
    }

    @Override
    public Integer findNum() {
        return userMapper.findNum();
    }

    @Override
    public Integer userStateChange(Integer id, Boolean state) {
        return userMapper.userStateChange(id,state);
    }
}
