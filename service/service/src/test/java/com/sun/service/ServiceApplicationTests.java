package com.sun.service;

import com.sun.service.mapper.UserMapper;
import com.sun.service.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ServiceApplicationTests {


	@Autowired
	UserMapper userMapper;

	@Test
	void contextLoads() {
		User user = new User();
		user.setUsername("admin");
		user.setPassword("123123");
		Integer userById = userMapper.getUserById(user);
		System.out.println(userById);
	}

}
