package com.cg.service;

import com.cg.dto.Login;

public interface ILoginService {
	public boolean isUserExist(String usn);
	public Login validateUser(Login login);
}
