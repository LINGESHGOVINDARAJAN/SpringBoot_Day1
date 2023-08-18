package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Colour {
private String colour="Green";
@GetMapping("/colour")
public String colour()
{
	return "My Favorite colour is "+colour;
}

}
