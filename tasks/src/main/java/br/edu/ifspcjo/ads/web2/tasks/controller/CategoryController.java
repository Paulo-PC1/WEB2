package br.edu.ifspcjo.ads.web2.tasks.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifspcjo.ads.web2.tasks.domain.model.Category;
import br.edu.ifspcjo.ads.web2.tasks.repository.CategoryRepository;
import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/tasks")
public class CategoryController {

	@Autowired
	private CategoryRepository categoryRepository;
	
	@GetMapping
	public List<Category> listar(){
		return categoryRepository.findAll();
	}
	
	@PostMapping
	public Category create(@RequestBody Category category, HttpServletResponse response) {
		return categoryRepository.save(category);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		Optional<Category> category = categoryRepository.findById(id);
		if(category.isPresent()) {
			return ResponseEntity.ok(category.get());
		}
		return ResponseEntity.notFound().build();
	}
}
