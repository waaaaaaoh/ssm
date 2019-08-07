package cn.edu.cuit.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.cuit.ssm.entity.User;
import cn.edu.cuit.ssm.mapper.UserMapper;
import cn.edu.cuit.ssm.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public boolean login(String name, String pass) {
		int ret=userMapper.findUserByNameAndPwd(name, pass);
		if (ret>0) {
			return true;
		}
		return false ;
	}

	@Override
	public boolean register(User user) {
		
		int ret = userMapper.insert(user);
		if(ret > 0) {
			return true;
		}
		return false;		
	}

}
