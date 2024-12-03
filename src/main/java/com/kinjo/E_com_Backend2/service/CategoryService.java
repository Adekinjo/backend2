package com.kinjo.E_com_Backend2.service;
import com.kinjo.E_com_Backend2.model.Category;
import com.kinjo.E_com_Backend2.model.Product;
import com.kinjo.E_com_Backend2.repository.CategoryRepository;
import com.kinjo.E_com_Backend2.repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;
    public CategoryService(CategoryRepository categoryRepository, ProductRepository productRepository) {
        this.categoryRepository = categoryRepository;
        this.productRepository = productRepository;
    }


    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public List<Product> getAllProducts(Long productId) {
        return productRepository.findAll();
    }
}
