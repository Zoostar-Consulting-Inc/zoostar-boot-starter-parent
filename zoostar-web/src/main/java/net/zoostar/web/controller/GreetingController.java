package net.zoostar.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class GreetingController {

	@GetMapping("/")
	public String greeting() {
		log.info("Greet: {}", "Hello World!");
		return "greeting";
	}

}
