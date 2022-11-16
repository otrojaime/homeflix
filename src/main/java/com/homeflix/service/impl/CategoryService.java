package com.homeflix.service.impl;

import com.homeflix.model.Category;
import com.homeflix.repository.CategoryRepository;
import com.homeflix.service.ICategoryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jaimito
 */
@Service
public class CategoryService implements ICategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> listarCategorias() {
        return categoryRepository.findAll();
    }
}
