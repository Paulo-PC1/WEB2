package br.edu.ifspcjo.ads.web2.tasks.controller;

import java.util.List;
import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifspcjo.ads.web2.tasks.domain.model.User;

@RestController
public class UserController {
	
	@GetMapping("/users")
	public List<User> listar(){
		var user1 = new User();
		user1.setId(1L);
		user1.setName("Paulo Cezar");
		user1.setPassword("cjoweb2");
		user1.setPhoneNumber("(12) 9999-999");
		user1.setActive(true);
		
		var user2 = new User();
		user2.setId(2L);
		user2.setName("Paola Henrique");
		user2.setPassword("cjoweb333");
		user2.setPhoneNumber("(12) 9999-888");
		user2.setActive(true);
		
		return Arrays.asList(user1, user2);
	}
}
