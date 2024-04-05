package ptit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin")
public class profileController {
	@RequestMapping(value="/profile",method=RequestMethod.GET)
	public String adminProfileShow() {
		return "admin/profile";
	}
}
