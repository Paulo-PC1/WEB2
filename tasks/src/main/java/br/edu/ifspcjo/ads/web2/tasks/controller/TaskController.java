package br.edu.ifspcjo.ads.web2.tasks.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifspcjo.ads.web2.tasks.repository.TasksRepository;
import br.edu.ifspcjo.ads.web2.tasks.service.TasksService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/task")
public class TaskController {
	
	@Autowired
	private TasksRepository tasksRepository;

	@Autowired
	private TasksService tasksService;
	
	@GetMapping
	public List<Task> list() {
		return tasksRepository.findAll();
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Task> findById(@PathVariable Long id){
		Optional<Task> task = tasksRepository.findById(id);
		if (task.isPresent()) {
			return ResponseEntity.ok(task.get());
		}
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Task create(@Valid @RequestBody Task task) {
		return tasksService.save(task);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remove(@PathVariable Long id) {
		tasksRepository.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Task> update(@PathVariable Long id, @Valid @RequestBody Task task){
		Task taskSaved = tasksService.update(id, task);
		return ResponseEntity.ok(taskSaved);
	}
}
