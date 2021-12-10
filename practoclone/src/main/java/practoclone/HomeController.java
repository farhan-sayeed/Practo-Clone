package practoclone;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("This is home url");
		return "index";
	}
//Controller return index name or view name
	@RequestMapping("/unauthorized")
	public String unauthorized() {
		System.out.println("Error 403 url");
		return "Error 403";	
		}
}