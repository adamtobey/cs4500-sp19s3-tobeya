package com.example.cs4500sp19s3tobeya.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import java.util.ArrayList;
import com.example.cs4500sp19s3tobeya.models.User;

@RestController
public class UserService {
	private static List<User> users = new ArrayList();
	static {
		users.add(new User(123, "alice", "alice", "Alice", "Wonderland"));
		users.add(new User(234, "bob", "bob", "Bob", "Marley"));
	}
	@GetMapping("/api/user")
	public List<User> findAllUsers() {
		return users;
	}
  @GetMapping("/api/user/{userId}")
	public User findUserById(
		@PathVariable("userId") Integer id) {
		for(User user: users) {
			if(user.getId().equals(id)) {
				return user;
      }
		}
		return null;
	}
}
