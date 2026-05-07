package br.edu.ifspcjo.ads.web2.tasks.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;

import br.edu.ifspcjo.ads.web2.tasks.domain.model.Category;
import br.edu.ifspcjo.ads.web2.tasks.repository.CategoryRepository;
import jakarta.validation.constraints.Size;

@Size
public class CategoryService {
	
	@Autowired
	private CategoryRepository cateRepository;
	
	public Category update(Long id, Category category) {
		Category categorySaved = cateRepository.findById(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
		BeanUtils.copyProperties(category, categorySaved, "id");
		return cateRepository.save(categorySaved);
	}
}
