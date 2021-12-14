package practo.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("This is home url");
		model.addAttribute("name","Practo Clone");
		return "index";
	}
//Controller return index name or view name
	@RequestMapping("/login")
	public String login() {
		System.out.println("This is login url");
		return "login";	
		}
	
	@RequestMapping("/register")
	public String register() {
		System.out.println("This is register url");
		return "register";
		
	}
}