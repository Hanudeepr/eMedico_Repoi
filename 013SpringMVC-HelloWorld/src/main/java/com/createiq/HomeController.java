package com.createiq;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/helloworld")
	public ModelAndView helloWorld() {
		return new ModelAndView("helloWorld","name","Balaji");
	}

	@RequestMapping("/welcome")
	public String welcome() {
		return "welcome";
	}

}
