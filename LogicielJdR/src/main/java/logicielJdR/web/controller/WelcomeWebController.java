package logicielJdR.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class WelcomeWebController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView display() {
		return new ModelAndView("index");
	}
	
	
}
