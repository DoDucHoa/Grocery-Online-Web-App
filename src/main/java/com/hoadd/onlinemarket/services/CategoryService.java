package com.hoadd.onlinemarket.services;

import com.hoadd.onlinemarket.entities.Category;
import com.hoadd.onlinemarket.interfaces.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repo;

    public List<Category> listAll() {
        return repo.findAll();
    }

    public void save(Category category) {
        repo.save(category);
    }

    public Category get(Long id) {
        return repo.findById(id).get();
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
