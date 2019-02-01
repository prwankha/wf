package com.cg.dao;

import com.cg.dto.Login;

public interface ILoginDao {
	public boolean isUserExist(String usn);
	public Login validateUser(Login login);
}
