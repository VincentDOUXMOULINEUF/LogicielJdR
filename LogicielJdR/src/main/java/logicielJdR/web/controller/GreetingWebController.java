package logicielJdR.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import logicielJdR.api.service.IGreetingService;

@Controller
public class GreetingWebController {

	@Autowired
	private IGreetingService greetingService;
	
	@RequestMapping(value = "/greetings", method = RequestMethod.GET)
	public ModelAndView display() {
		return new ModelAndView("greetings", "liste", greetingService.findAll());
	}
	
	
}
