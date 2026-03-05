package com.nomevini.dscatalog.services;

import com.nomevini.dscatalog.entities.Category;
import com.nomevini.dscatalog.exception.ResourceNotFoundException;
import com.nomevini.dscatalog.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    @Transactional(readOnly = true)
    public List<Category> findAll() {
        return repository.findAll();
    }

    @Transactional(readOnly = true)
    public Category findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Category not found"));
    }
}
