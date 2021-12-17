package practo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import practo.model.User;
import practo.service.UserService;

@Controller
public class LogController {
		@Autowired
		private UserService userService;
	
	/* This method/request handler is only used to show the registration form */
		@RequestMapping("/registeruser")
		public String showForm() {
			return "registeruser";
		}
		
		@RequestMapping(path = "/processform", method = RequestMethod.POST)
		public String handleForm(@ModelAttribute User user,Model model) 
		{
			System.out.println(user);
			if (user.getUsername().isBlank()) {
				return "redirect:/registeruser";
			}
			//process
			int createUser = this.userService.createUser(user);
			model.addAttribute("msg","User created with id "+createUser);
			return "success";
		}
		/*
		@RequestMapping(path = "/processform", method = RequestMethod.POST)
		public String handleForm(HttpServletRequest request) {
			String userName = request.getParameter("username");
			System.out.println("Username is "+ userName);
			return "login";
		}
		*/
		
		/*
		@RequestMapping(path = "/processform", method = RequestMethod.POST)
		public String handleForm(
				@RequestParam(name = "username",required = false) String userName,
				@RequestParam("email") String userEmail,
				@RequestParam("password") String userPassword,
				Model model) 
		{
			User user=new User();
			user.setUsername(userName);
			user.setEmail(userEmail);
			user.setPassword(userPassword);
			System.out.println(user);
			
			System.out.println("User name is "+userName);
			System.out.println("User email is "+userEmail);
			System.out.println("User password is "+userPassword);
			
			//we can process the data here
			
			//model.addAttribute("name",userName);
			//model.addAttribute("email",userEmail);
			//model.addAttribute("password",userPassword);
			model.addAttribute("user",user);
			return "success";
		}
		*/
}
