package practoclone;

import org.springframework.stereotype.Controller;
<<<<<<< HEAD
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("This is home url");
		model.addAttribute("name","Practo Clone");
=======
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("This is home url");
>>>>>>> branch 'master' of https://github.com/mrlazyProgrammer/Practo-Clone.git
		return "index";
	}
//Controller return index name or view name
}
