package com.borcelle.store.services;

import com.borcelle.store.dao.entities.Product;
import com.borcelle.store.dao.repositories.ProductRepository;
import com.borcelle.store.services.manager.ProductManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements ProductManager {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> getProductById(String id) {
        return productRepository.findById(id);
    }

    @Override
    public Optional<Product> getProductByCategory(String category) {
        return productRepository.findProductByCategory(category);
    }
}
