package com.clickbit.News.controller;

import com.clickbit.News.model.Category;
import com.clickbit.News.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    // 1. Get all categories
    @GetMapping
    public ResponseEntity<List<Category>> getAllCategories() {
        List<Category> categories = categoryRepository.findAll();
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    // 2. Get a category by ID
    @GetMapping("/{id}")
    public ResponseEntity<Category> getCategoryById(@PathVariable Long id) {
        Optional<Category> category = categoryRepository.findById(id);
        if (category.isPresent()) {
            return new ResponseEntity<>(category.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // 3. Add a new category
    @PostMapping
    public ResponseEntity<Category> createCategory(@RequestBody Category category) {
//        if (category.getName() == null || category.getName().isEmpty()) {
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
        Category savedCategory = categoryRepository.save(category);
        return new ResponseEntity<>(savedCategory, HttpStatus.CREATED);
    }

    // TODO 4. Update an existing category
    // Use PUT /categories/{id} to update the name of an existing category.

    // TODO 5. Delete a category by ID
    // Use DELETE /categories/{id} to delete a category by its ID.

    // TODO 6. Get categories by name (search/filter)
    // Use GET /categories/search?name=keyword to find categories by partial match.

}