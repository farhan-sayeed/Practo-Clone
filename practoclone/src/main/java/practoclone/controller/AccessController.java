package practoclone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccessController {
	@RequestMapping("/unauthorized")
	public String unauthorized() {
		return "Error 403";
		
	}

}
