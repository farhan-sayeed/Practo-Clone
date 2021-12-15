package practo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import practo.model.User;

@Controller
public class LogController {
	
	/* This method/request handler is only used to show the registration form */
		@RequestMapping("/registeruser")
		public String showForm() {
			return "registeruser";
		}
		
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
			/*
			System.out.println("User name is "+userName);
			System.out.println("User email is "+userEmail);
			System.out.println("User password is "+userPassword);
			*/
			//we can process the data here
			
			//model.addAttribute("name",userName);
			//model.addAttribute("email",userEmail);
			//model.addAttribute("password",userPassword);
			model.addAttribute("user",user);
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
