package com.exam;

import com.exam.models.Role;
import com.exam.models.User;
import com.exam.models.UserRole;
import com.exam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;


@SpringBootApplication
public class ExamserverApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;


	public static void main(String[] args) {
		SpringApplication.run(ExamserverApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println("starting code ...");

		/*User user = new User();
		user.setFirstName("Naman");
		user.setLastName("sharma");
		user.setUserName("naman143");
		user.setPassword("naman143pass");
		user.setEmail("naman@gmail.com");
		user.setProfile("default.png");


		Role role1 = new Role();
		role1.setRoleID(44L);
		role1.setRoleName("admin");



		Set<UserRole> userRoleSet = new HashSet<>();


		UserRole userRole = new UserRole();
		userRole.setUser(user);
		userRole.setRole(role1);
		userRoleSet.add(userRole);


		User user1 = this.userService.createUser(user, userRoleSet);

		System.out.println(user1.getUserName());*/


	}
}
