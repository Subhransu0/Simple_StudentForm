package in.sonu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import in.sonu.model.User;
import in.sonu.service.UserServiceInterface;

@Controller
public class MyController {
	@Autowired
	private UserServiceInterface userServiceInterface;

	@RequestMapping("/register")
	public String registration() {

		return "register";
	}

	@RequestMapping(path = "/createuser", method = RequestMethod.POST)
	public String registerStudent(@ModelAttribute User user, RedirectAttributes r) {
		System.out.println(user);
		userServiceInterface.registerUser(user);
		r.addFlashAttribute("msg", "Upload Successfully");
		return "redirect:/register";

	}

}
