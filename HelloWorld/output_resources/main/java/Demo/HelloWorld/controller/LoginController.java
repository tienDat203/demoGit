package Demo.HelloWorld.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping(value="/loginform", method=RequestMethod.GET)
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("login");
	}

}
