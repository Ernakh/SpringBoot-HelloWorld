package com.fabriciolondero.SpringBootTeste.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class helloController {
	@RequestMapping("/hello.html")
	public ModelAndView hello() {
		return new ModelAndView("hello");
	}
}
