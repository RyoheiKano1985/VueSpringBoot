package com.demo.web.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/demo")
	public String api() {
		System.out.println("api");
		return "api call";
	}

}
