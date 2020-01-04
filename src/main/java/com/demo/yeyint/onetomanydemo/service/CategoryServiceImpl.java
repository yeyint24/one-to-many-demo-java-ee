package com.demo.yeyint.onetomanydemo.service;

import com.demo.yeyint.onetomanydemo.domain.Category;
import com.demo.yeyint.onetomanydemo.repository.CategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Category save(Category category){
        return  null;
    }

}
