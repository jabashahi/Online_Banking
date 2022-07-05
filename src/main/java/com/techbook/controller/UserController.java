package com.techbook.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.techbook.domain.User;
import com.techbook.service.UserService;

public class UserController {

	private UserService userService;

	public void saveUserInfo(Scanner input) {

		System.out.println("Enter username: ");
		String username = input.next();
		System.out.println("Enter password: ");
		String password = input.next();
		System.out.println("Enter address: ");
		String address = input.next();
		System.out.println("Enter account no: ");
		long accountNo = input.nextLong();
		System.out.println("Enter check balance: ");
		String checkBalance = input.next();
		System.out.println("Enter withdraw amount: ");
		String withDrawAmount = input.next();
		System.out.println("Enter deposit amount: ");
		String depositAmount = input.next();
		System.out.println("Enter dob: ");
		String dob = input.next();
		Date dateOfBirth = parseDate(dob);

		

		User user = new User();
		user.setUserName(username);
		user.setPassword(password);
		user.setAddress(address);
		user.setAccountNo(accountNo);
	//	user.setCheckBalance(checkBalance);
	//	user.setWithDrawAmount(withDrawAmount);
	//	user.setdepositAmount(depositAmount);
		user.setDob(dateOfBirth);

	}

	public Date parseDate(String dob) {
		Date dateOfBirth = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			dateOfBirth = sdf.parse(dob);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return dateOfBirth;
	}

}


