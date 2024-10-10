package net.zoostar.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class GreetingController {

	@GetMapping("/")
	public String greeting(@RequestParam(required=false, defaultValue="World") String name, Model model) {
		log.info("Greet: {}", name);
		model.addAttribute("name", name);
		return "greeting";
	}

}
