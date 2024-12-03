package com.kinjo.E_com_Backend2.config;
import com.kinjo.E_com_Backend2.model.Category;
import com.kinjo.E_com_Backend2.model.Product;
import com.kinjo.E_com_Backend2.repository.CategoryRepository;
import com.kinjo.E_com_Backend2.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
public class DataSeeder implements CommandLineRunner {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public DataSeeder(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        // Clear all existing data
        productRepository.deleteAll();
        categoryRepository.deleteAll();


        //  Create Categories
        Category electronics = new Category();
        electronics.setName("Electronics");

        Category clothing = new Category();
        clothing.setName("Clothing");

        Category home = new Category();
        home.setName("Home and Kitchen");

        categoryRepository.saveAll(Arrays.asList(electronics, clothing, home));


        //  Creating the Products
        Product phone = new Product();
        phone.setName("Smartphone");
        phone.setDescription("Latest model smartphone with amazing features");
        phone.setImgUrl("https://placehold.co/600x400");
        phone.setPrice(599.99);
        phone.setCategory(electronics);


        Product laptop = new Product();
        laptop.setName("Laptop");
        laptop.setDescription("High-performance laptop for work and study");
        laptop.setImgUrl("https://placehold.co/600x400");
        laptop.setPrice(899.99);
        laptop.setCategory(electronics);

        Product jacket = new Product();
        jacket.setName("Winter Jacket");
        jacket.setDescription("Warm and cozy jacket for winter");
        jacket.setImgUrl("https://placehold.co/600x400");
        jacket.setPrice(129.99);
        jacket.setCategory(clothing);


        Product blender = new Product();
        blender.setName("Blender");
        blender.setDescription("High -speed blender for smoothies and more");
        blender.setImgUrl("https://placehold.co/600x400");
        blender.setPrice(89.99);
        blender.setCategory(home);

        productRepository.saveAll(Arrays.asList(phone, laptop, jacket, blender));
    }
}
