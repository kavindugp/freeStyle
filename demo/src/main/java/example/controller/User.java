package example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example.controller.Service.UserService;
import example.controller.Service.UserServiceImpl;


@RestController
@RequestMapping("/user")
public class User {

	@Autowired
	private UserService userService;
	
	@GetMapping("/all")
	public String allUsers() {
		
		return userService.getAllUser(); 
	}
}
