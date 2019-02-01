package com.cg.dao;

import org.springframework.stereotype.Repository;

import com.cg.dto.Login;
@Repository("loginDao")
public class LoginDaoImpl implements ILoginDao{

	@Override
	public boolean isUserExist(String usn) {
		return false;
	}

	@Override
	public Login validateUser(Login login) {
		return null;
	}

}
