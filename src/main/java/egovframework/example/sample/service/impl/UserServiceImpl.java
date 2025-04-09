package egovframework.example.sample.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.example.sample.service.UserMapper;
import egovframework.example.sample.service.UserService;
import egovframework.example.sample.service.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource(name = "userMapper")
    private UserMapper userMapper;

    @Override
    public List<UserVO> getAllUsers() throws Exception {
        return userMapper.getAllUsers();
    }

    @Override
    public void insertUser(UserVO user) throws Exception {
        userMapper.insertUser(user);
    }
}