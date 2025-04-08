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
    public List<UserVO> getAllUsers() {
        return userMapper.selectAllUsers();
    }
}
