package com.fabriciolondero.SpringBootTeste.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class testeController {
	@RequestMapping("/index.html")
	public ModelAndView firstPage() {
		return new ModelAndView("hello");
	}
}
