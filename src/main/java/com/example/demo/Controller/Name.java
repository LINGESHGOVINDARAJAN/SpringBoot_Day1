package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Name {
	private String names="i am neo";
	@GetMapping("view")
	

public String getName()
{
	return "Welcome "+names+" !";
}
}
