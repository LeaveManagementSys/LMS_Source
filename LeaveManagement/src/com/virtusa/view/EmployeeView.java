package com.virtusa.view;

import java.util.Scanner;

public class EmployeeView {

	public void employeeHomePage() {
		Scanner sc=new Scanner(System.in);
		System.out.println("********Employee View********");
		System.out.println("1.Check leave balences");
		System.out.println("2.Apply leave");
		System.out.println("3.Approved leaves");
		System.out.println("4.cancelled leaves");
		System.out.println("5.Pending leaves");
		System.out.println("6.Logout");
		System.out.println("Enter option");
		int opt1=sc.nextInt();
		switch(opt1)
		{
		case 1:
			System.out.println("waiting for implemtation of leave class");
			break;
			
		case 2:
			System.out.println("1.sick leave");
			System.out.println("2.casual leave");
			System.out.println("3.privilage leave");
			System.out.println("choose option");
			int opt2=sc.nextInt();
			System.out.println("Leave request is forwarded to your manager");
			break;
		
		case 3:
			System.out.println("waiting for implemtation of leave class");
			break;
		
		case 4:
			System.out.println("waiting for implemtation of leave class");
			break;
			
		case 5:
			System.out.println("waiting for implemtation of leave class");
			break;
		
		case 6:
			System.out.println("sucessfully loged out");
		}
		
	}
}
