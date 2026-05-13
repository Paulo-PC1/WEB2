package br.edu.ifspcjo.ads.web2.tasks.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.edu.ifspcjo.ads.web2.tasks.domain.model.Tasks;
import br.edu.ifspcjo.ads.web2.tasks.repository.TasksRepository;

@Service
public class TasksService {
	
	@Autowired
	private TasksRepository tasksRepository;
	
	public Tasks update(Long id, Tasks task) {
		Tasks tasksSaved = tasksRepository.findById(id).orElseThrow(()-> new EmptyResultDataAccessException(1));
		BeanUtils.copyProperties(task, tasksSaved, "id");
		return tasksRepository.save(tasksSaved);
	}
	
	
}
