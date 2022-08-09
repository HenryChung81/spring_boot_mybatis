package com.example.spring_boot_mybatis.service;

import org.springframework.stereotype.Service;

import com.example.spring_boot_mybatis.dto.UserSearchRequest;
import com.example.spring_boot_mybatis.entity.User;
import com.example.spring_boot_mybatis.repository.UserMapper;

@Service
public class UserService {

  private final UserMapper userMapper;

  public UserService(UserMapper userMapper) {
    this.userMapper = userMapper;
  }

  public User search(UserSearchRequest userSearchRequest) {
    return userMapper.search(userSearchRequest);
  }
  
}
