package com.codehelp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.codehelp.domain.User;
import com.codehelp.service.UserService;

@RestController
@RequestMapping(value= "/codehelp")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value= "/users", method= RequestMethod.GET)
	public ResponseEntity <List<User>> getAllUsers(){
		
		List<User> users= userService.findAll();
		return new ResponseEntity <> (users,HttpStatus.OK);
		
	}
	
	@RequestMapping(value= "/user", method= RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void addUser(@RequestBody User user) {
		userService.addUser(user);
		
	}

}
