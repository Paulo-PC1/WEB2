package br.edu.ifspcjo.ads.web2.ifitness.resource;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifspcjo.ads.web2.ifitness.domain.model.User;

//Resource(ou Controller)

@RestController // Annotation para quando chegar requisição spring progura classe para processar ela
public class UserResource {
	
	@GetMapping("/users") // @GetMapping = Mapear requisição GET (endpoint"/xpto")
	public List<User> list(){
		User user1 = new User();
		user1.setId(1L);
		user1.setName("Paulo Cezar");
		user1.setEmail("paulocezzar@hotmail.com");
		user1.setPassword("54321");
		user1.setBirthDate(LocalDate.of(2004, 12, 18));
		user1.setActive(true);
		
		User user2 = new User();
		user2.setId(2L);
		user2.setName("Paola Silva");
		user2.setEmail("paolasisilva@hotmail.com");
		user2.setPassword("12345");
		user2.setBirthDate(LocalDate.of(2007, 05, 13));
		user2.setActive(true);
		
		return Arrays.asList(user1, user2);
	}
}
