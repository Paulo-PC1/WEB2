package br.edu.ifspcjo.ads.web2.tasks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.scheduling.config.Task;

public interface TasksRepository extends JpaRepository<Task, Long>{

}
