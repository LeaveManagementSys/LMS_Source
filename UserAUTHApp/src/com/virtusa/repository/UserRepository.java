package com.virtusa.repository;

import java.util.List;
import java.util.ArrayList;

import com.virtusa.entities.Admin;
import com.virtusa.entities.Student;
import com.virtusa.entities.User;
import com.virtusa.utilities.UserTypes;

public class UserRepository {
	
	private static List<User> userRepository = new ArrayList<User>();

	static {
		
		Student student=new Student();
		student.setUsername("vamshikrishna vemula");
		student.setEmail("vamshi@mail.com");
		student.setFirstname("vamshikrishna");
		student.setLastname("vemula");
		student.setPassword("123456");
		student.setPhoneNumber("99578745");
		student.setDob("01-01-1997");
		student.setStudentId("S001");
		student.setUserType(UserTypes.STUDENT);
		
		userRepository.add(student);
		
		Admin admin=new Admin();
		admin.setUsername("nani");
		admin.setEmail("nani@mail.com");
		admin.setFirstname("naniv");
		admin.setLastname("vem");
		admin.setPassword("12345678");
		admin.setPhoneNumber("995785745");
		admin.setDob("01-03-1997");
		admin.setAdminId("A001");
		admin.setUserType(UserTypes.ADMIN);
		
		userRepository.add(admin);
	}
	public static List<User> getUserRepository(){
		return userRepository;
	}
}
