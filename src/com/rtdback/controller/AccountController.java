package com.rtdback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rtdback.service.AccountService;

@RestController
public class AccountController {

	@Autowired
	private AccountService AccountService;
	
	/**
	 * test:localhost:8080/RTDBackstage/account/login/wushuoyouting/12345
	 * 用户登陆  
	 */
	@RequestMapping(value="/account/login/{username}&{password}",method =RequestMethod.GET)
	public ResponseEntity<?> login(@PathVariable("username")String username,@PathVariable("password")String password){
		String logintext = AccountService.login(username,password);
		return new ResponseEntity<String>(logintext,HttpStatus.OK);
	}
}
