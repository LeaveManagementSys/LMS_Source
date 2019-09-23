package com.virtusa.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.virtusa.controller.UserLoginController;

public class DisplayPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(
			InputStreamReader reader=
			new InputStreamReader(System.in);
				BufferedReader buffer=new BufferedReader(reader);	
	     ){
			
			System.out.print("Enter User Name:");
			String userName=buffer.readLine();
			
			System.out.print("Enter Password:");
			String password=buffer.readLine();
			
			UserLoginController controller=new UserLoginController();
			controller.userVerification(userName, password);
				
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
