package com.z.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.z.service.RyService;

@Controller
public class TestAction {
	
	@Autowired
	private RyService ryService;
	
	@RequestMapping("/login")
	public String login(String username,String password){
		String auth = ryService.auth(username, password);
		System.out.println(username);
		System.out.println(auth);
		if(auth!=null){
			if(auth=="1"){
				return "main";
			}else{
				return "login";
			}
		}else{
			return "login";
		}
	}
}
