package br.edu.ifspcjo.ads.web2.tasks.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.edu.ifspcjo.ads.web2.tasks.domain.model.Category;
import br.edu.ifspcjo.ads.web2.tasks.repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository cateRepository;
	
	public Category update(Long id, Category category) {
		Category categorySaved = cateRepository.findById(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
		BeanUtils.copyProperties(category, categorySaved, "id");
		return cateRepository.save(categorySaved);
	}
}
