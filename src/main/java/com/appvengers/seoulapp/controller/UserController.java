package com.appvengers.seoulapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appvengers.seoulapp.domain.user.LoginInfo;
import com.appvengers.seoulapp.domain.user.User;
import com.appvengers.seoulapp.domain.user.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/login")
	public List<LoginInfo> loginOrJoin( @RequestBody User user ) {
		return userService.loginOrJoin( user );
	}
	
	@PostMapping("updateUser")
	public boolean updateUser( @RequestBody User user ) {
		
		return userService.updateUser( user );
	}
	
	@PostMapping("deleteUser")
	public boolean deleteUser( int userId ) {
		
		return userService.deleteUser( userId );
	}

}
