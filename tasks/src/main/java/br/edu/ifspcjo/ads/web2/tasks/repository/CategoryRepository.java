package br.edu.ifspcjo.ads.web2.tasks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifspcjo.ads.web2.tasks.domain.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
