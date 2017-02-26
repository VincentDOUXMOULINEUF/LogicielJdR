package logicielJdR.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import logicielJdR.web.viewmodel.SignInViewModel;

@Controller
@RequestMapping(value = "/inscription")
public class InscriptionController {
	
	private final String INSCRIPTION_VIEW = "inscription";
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView inscription() {
		SignInViewModel signInMV = new SignInViewModel();
		ModelAndView mav = new ModelAndView(INSCRIPTION_VIEW);
		mav.addObject("signInMV", signInMV);
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView register(@RequestBody final SignInViewModel signInVM) {
		return new ModelAndView(INSCRIPTION_VIEW);
	}

}
