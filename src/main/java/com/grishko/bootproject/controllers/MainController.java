package com.grishko.bootproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	
	@RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String index(Model model) {
        return "index";
    }
	
	@RequestMapping("/")
	public String root() {
		return "redirect:/index";
	}

	@RequestMapping("/user/index")
	public String userIndex() {
		return "user/index";
	}
	
	@RequestMapping("/add_advert")
	public String addAdvert() {
		return "add_advert";
	}

	@RequestMapping("/login")
	public String login() {
		return "login";
	}

	@RequestMapping("/login-error")
	public String loginError(Model model) {
		model.addAttribute("loginError", true);
		return "login";
	}
}
