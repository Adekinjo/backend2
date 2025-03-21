package com.kinjo.E_com_Backend2.controller;
import com.kinjo.E_com_Backend2.model.Product;
import com.kinjo.E_com_Backend2.service.ProductService;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/products")
@CrossOrigin(origins = "http://localhost:5173")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/category/{categoryId}")
    public List<Product> getAllProductsByCategory(@PathVariable Long categoryId){
        return productService.getProductsByCategory(categoryId);
    }

}
