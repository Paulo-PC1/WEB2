package br.edu.ifspcjo.ads.web2.tasks.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifspcjo.ads.web2.tasks.domain.model.Tasks;
import br.edu.ifspcjo.ads.web2.tasks.repository.TasksRepository;
import br.edu.ifspcjo.ads.web2.tasks.service.TasksService;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/tarefas")
public class TaskController {
	
	@Autowired
	private TasksRepository tasksRepository;

	@Autowired
	private TasksService tasksService;
	
	@GetMapping
	public List<Tasks> listar() {
		return tasksRepository.findAll();
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Tasks> findById(@PathVariable Long id){
		Optional<Tasks> tasks = tasksRepository.findById(id);
		if (tasks.isPresent()) {
			return ResponseEntity.ok(tasks.get());
		}
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Tasks create(@Valid @RequestBody Tasks tasks, HttpServletResponse response) {
		return tasksRepository.save(tasks);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remove(@PathVariable Long id) {
		tasksRepository.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Tasks> update(@PathVariable Long id, @Valid @RequestBody Tasks tasks){
		Tasks tasksSaved = tasksService.update(id, tasks);
		return ResponseEntity.ok(tasksSaved);
	}
}
