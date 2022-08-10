package cn.qingyandark.service.impl;

import cn.qingyandark.mapper.UserMapper;
import cn.qingyandark.pojo.User;
import cn.qingyandark.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectALL() {
        return userMapper.selectALL();
    }
}
