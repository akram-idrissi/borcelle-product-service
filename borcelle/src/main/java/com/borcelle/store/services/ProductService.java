package com.borcelle.store.services;

import com.borcelle.store.dao.entities.Product;
import com.borcelle.store.dao.repositories.ProductRepository;
import com.borcelle.store.services.manager.ProductManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements ProductManager {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public Product getProductById(String id) {
        return null;
    }

    @Override
    public Product getProductByCategory(String category) {
        return null;
    }
}
