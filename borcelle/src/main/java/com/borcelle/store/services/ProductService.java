package com.borcelle.store.services;

import com.borcelle.store.dao.entities.Product;
import com.borcelle.store.dao.repositories.ProductRepository;
import com.borcelle.store.services.manager.ProductManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService implements ProductManager {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Page<Product> getAllProducts(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return productRepository.findAll(pageable);
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
    public Page<Product> getProductsByCategory(String category, Pageable pageable) {
        return productRepository.findAllByCategory(category, pageable);
    }
}
