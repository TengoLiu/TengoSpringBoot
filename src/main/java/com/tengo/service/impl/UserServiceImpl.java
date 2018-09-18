package com.tengo.service.impl;

import com.tengo.bean.User;

/**
 * @author tengo_liu
 * Service的接口层用于解耦业务代码
 */
public interface UserServiceImpl {
	//通过姓名查找一个用户
	User findUserByName(String name);
	
	//通过id查找一个用户
	User findUserById(long id);
}
