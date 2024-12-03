package com.kinjo.E_com_Backend2.service;
import com.kinjo.E_com_Backend2.model.Product;
import com.kinjo.E_com_Backend2.repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public List<Product> getProductsByCategory(Long categoryId){
        return productRepository.findAllByCategoryId(categoryId);
    }
}
