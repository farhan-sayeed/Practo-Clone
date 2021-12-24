package practo.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import practo.model.Login;
import practo.model.User;
import practo.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	UserService userService;
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("This is home url");
		model.addAttribute("name","Practo Clone");
		return "index";
	}
//Controller return index name or view name
	@RequestMapping("/login")
	public String showLogin() {
		System.out.println("This is login url");
		return "login";	
		}
	
	@RequestMapping(value ="/loginprocess", method = RequestMethod.POST)
	public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,@ModelAttribute Login login) {
		ModelAndView modelAndView=null;
		User user=userService.validateUser(login);
		if(null!=user) {
			modelAndView=new ModelAndView("welcome");
			modelAndView.addObject("username",user.getUsername());
		}else {
			modelAndView =new ModelAndView("login");
			modelAndView.addObject("message","Email or Password is wrong!!");
		}
		return modelAndView;
	}
	
}