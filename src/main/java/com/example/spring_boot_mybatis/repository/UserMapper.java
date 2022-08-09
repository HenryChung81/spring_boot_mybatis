package com.example.spring_boot_mybatis.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.spring_boot_mybatis.dto.UserSearchRequest;
import com.example.spring_boot_mybatis.entity.User;

@Mapper
public interface UserMapper {

  User search(UserSearchRequest user);
  
}
