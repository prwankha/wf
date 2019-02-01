package com.cg.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cg.dto.Login;
import com.cg.service.ILoginService;

@Controller
public class LoginController {
	@Autowired
	ILoginService logSer=null;
	
	public ILoginService getLogSer() {
		return logSer;
	}

	public void setLogSer(ILoginService logSer) {
		this.logSer = logSer;
	}

	@RequestMapping(value="/ShowLoginPage", method=RequestMethod.GET)
	public String displayLoginPage(Model model) {
		Login lg=new Login();
		lg.setUserName("Enter ur userName here");
		model.addAttribute("log", lg);
		model.addAttribute("compNameObj", "Capgemini");
		return "Login";
	}
	
	/************************Validate User*******************/
	@RequestMapping(value="/ValidateUser", method=RequestMethod.POST)
	public String validateUserDetails(@ModelAttribute(value="log") 
			@Valid Login lg, BindingResult result,Model model) {
		if(result.hasErrors()) {
			return "Login";
		}else {
			Login user=logSer.validateUser(lg);
			if(user!=null){
					model.addAttribute("unmObj",lg.getUserName());
					return "Success";
				}else {
					return "Failure";
				}
		}
	}
	
	/************************Register User*******************/
	@RequestMapping(value="/ShowRegisterPage", method=RequestMethod.GET)
	public String displayRegPage() {
		return "Register";
	}
}