package com.passion.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.passion.core.AbstractService;
import com.passion.dao.UserMapper;
import com.passion.model.User;
import com.passion.service.UserService;

/**
 * Created by ne.passion on 2018/02/07.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {
	@Autowired
	private UserMapper userMapper;

}
