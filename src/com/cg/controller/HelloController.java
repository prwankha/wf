package com.cg.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("myctrl")
public class HelloController {
	@RequestMapping(value="/hello")
	public ModelAndView showMsg() {
		LocalDate today=LocalDate.now();
		ModelAndView mdv=new ModelAndView("Hello","tdObj",today);
		return mdv;
	}
}
