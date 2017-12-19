package com.rtdback.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rtdback.code.Constants;
import com.rtdback.pojo.Account;
import com.rtdback.service.AccountService;

@RestController
public class AccountController {

	@Autowired
	private AccountService accountService;
	
	/**
	 * test:localhost:8080/RTDBackstage/account/login/wushuoyouting&12345
	 * 用户登陆  
	 */
	@RequestMapping(value="/account/login/{username}&{password}",method =RequestMethod.GET)
	public ResponseEntity<ArrayList<?>> login(@PathVariable("username")String username,
			@PathVariable("password")String password,HttpServletRequest request){
		HttpSession session = request.getSession();
		Account account = accountService.login(username,password);
		ArrayList<String> logintext = new ArrayList<String>();
		if(account != null){
			logintext.add("登陆成功");
			session.setAttribute("account", account);
		}else {
			logintext.add("登陆失败，请重新登陆");
		}
		return  ResponseEntity.ok(logintext);
	}
	
	@RequestMapping("/accountController_quit")
	  public ResponseEntity<?> quit(HttpServletRequest request) {
	    HttpSession session = request.getSession();
	    session.removeAttribute("account");
	    session.invalidate();
	    return ResponseEntity.ok("login.jsp");
	  }
}
