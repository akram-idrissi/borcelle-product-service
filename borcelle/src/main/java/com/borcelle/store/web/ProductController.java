package com.borcelle.store.web;

import com.borcelle.store.dao.entities.Product;
import com.borcelle.store.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public List<Product> fetchProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Optional<Product> fetchOneProduct(@PathVariable String id) {
        return productService.getProductBy_id(id);
    }

    @GetMapping("/category/{category}")
    public List<Product> fetchProductsByCategory(@PathVariable String category) {
        return productService.getProductsByCategory(category);
    }

}
