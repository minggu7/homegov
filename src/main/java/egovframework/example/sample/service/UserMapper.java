package egovframework.example.sample.service;

import java.util.List;
import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

@Mapper("userMapper")
public interface UserMapper {
    List<UserVO> getAllUsers() throws Exception;
    void insertUser(UserVO user) throws Exception;
}