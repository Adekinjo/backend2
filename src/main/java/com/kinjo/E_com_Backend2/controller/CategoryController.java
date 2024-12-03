package com.kinjo.E_com_Backend2.controller;
import com.kinjo.E_com_Backend2.model.Category;
import com.kinjo.E_com_Backend2.model.Product;
import com.kinjo.E_com_Backend2.service.CategoryService;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/categories")
@CrossOrigin(origins = "http://localhost:5173")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }
    @GetMapping("/products/{productId}")
    public List<Product> getAllProductsByCategory(@PathVariable Long productId){
        return categoryService.getAllProducts(productId);
    }
}
