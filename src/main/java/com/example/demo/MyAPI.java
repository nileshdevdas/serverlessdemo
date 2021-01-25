package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyAPI {

	@RequestMapping(path = "/ms", method = RequestMethod.GET, produces = "application/json")
	public String getMessage() {
		return "{\"status\" : \"success\" }";
	}
}
