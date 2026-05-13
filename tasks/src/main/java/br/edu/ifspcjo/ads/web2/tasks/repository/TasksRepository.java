package br.edu.ifspcjo.ads.web2.tasks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifspcjo.ads.web2.tasks.domain.model.Tasks;

public interface TasksRepository extends JpaRepository<Tasks, Long>{

}
