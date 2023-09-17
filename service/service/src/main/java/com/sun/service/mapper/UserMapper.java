package com.sun.service.mapper;

import com.sun.service.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository
@Mapper
public interface UserMapper {
    Integer getUserById(User user);
}
