package com.borcelle.store.services.manager;

import java.util.List;
import java.util.Optional;

import com.borcelle.store.dao.entities.Product;
import org.springframework.stereotype.Component;

@Component
public interface ProductManager {

    List<Product> getAllProducts();
    Optional<Product> getProductById(String id);
    Optional<Product> getProductByCategory(String category);

}
