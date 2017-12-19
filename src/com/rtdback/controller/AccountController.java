package com.rtdback.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
	 * localhost:8080/RTDBackstage/account/add
	 * @param account
	 * @return
	 */
	@RequestMapping(value = "/account/add",method = RequestMethod.POST)
	public ResponseEntity<?> add(@RequestBody Account account){
		int count = accountService.add(account);
		return new ResponseEntity<Integer>(count,HttpStatus.OK);
	}
	
	/**
	 * localhost:8080/RTDBackstage/account/find
	 * @return
	 */
	@RequestMapping(value="/account/find",method=RequestMethod.GET)
	public ResponseEntity<?> find(){
		List<Account> accounts = accountService.find();
		return new ResponseEntity<List<Account>>(accounts,HttpStatus.OK);
	}
	
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
	
	//退出当前用户 去除session
	@RequestMapping("/accountController_quit")
	  public ResponseEntity<?> quit(HttpServletRequest request) {
	    HttpSession session = request.getSession();
	    session.removeAttribute("account");
	    session.invalidate();
	    return ResponseEntity.ok("login.jsp");
	  }
}
