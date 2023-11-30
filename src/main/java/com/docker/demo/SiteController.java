package com.docker.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SiteController {
	@RequestMapping("/site")
	public String site() {
		return "Hi from  Developers ";
	}

}
