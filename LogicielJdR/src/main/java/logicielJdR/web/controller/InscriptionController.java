package logicielJdR.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InscriptionController {
	
	private final String INSCRIPTION_VIEW = "inscription";
	
	@RequestMapping(value = "/inscription", method = RequestMethod.GET)
	public ModelAndView inscription() {
		return new ModelAndView(INSCRIPTION_VIEW);
	}

}
