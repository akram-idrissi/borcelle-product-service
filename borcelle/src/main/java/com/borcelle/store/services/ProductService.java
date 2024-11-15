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
    public Optional<Product> getProductByPid(String pid) {
        return productRepository.findProductByPid(pid);
    }

    @Override
    public Optional<Product> getProductBy_id(String pid) {
        return productRepository.findProductBy_id(pid);
    }

    @Override
    public List<Product> getProductsByCategory(String category) {
        return productRepository.findAllByCategory(category);
    }
}
