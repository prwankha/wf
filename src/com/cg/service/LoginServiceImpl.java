package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.ILoginDao;
import com.cg.dto.Login;
@Service("loginSer")
public class LoginServiceImpl implements ILoginService {
	@Autowired
	ILoginDao logDao=null;
	public ILoginDao getLogDao() {
		return logDao;
	}

	public void setLogDao(ILoginDao logDao) {
		this.logDao = logDao;
	}

	@Override
	public boolean isUserExist(String usn) {
		return false;
	}

	@Override
	public Login validateUser(Login login) {
		if (login.getUserName().equalsIgnoreCase("CG")&& login.getPassword().equalsIgnoreCase("CG")){
			return login;
		}else {
			return null;
		}
	}

}
