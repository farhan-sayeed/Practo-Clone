package practo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogController {
	
		@RequestMapping("/register")
		public String Register() {
			return "registeruser";
		}
}
