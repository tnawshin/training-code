package com.revature.main;

import com.revature.data.UserDAO;
import com.revature.service.UserService;

public class App {
	
	public static void main(String[] args) {
//		UserDAO dao = new UserDAO();
//		System.out.println(dao.getUsers());
		
		UserService service = new UserService();
		System.out.println(service.logIn("genesisb", "123"));
	}
}
