package controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class AppController {
	@RequestMapping("/")
	public static ModelAndView homePageLoader() {
		
		ModelAndView mv = new ModelAndView("employee/index");
		return mv;
	}
	
	
	 
}
    
