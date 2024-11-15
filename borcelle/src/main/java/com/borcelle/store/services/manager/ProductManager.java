package com.borcelle.store.services.manager;

import java.util.List;
import java.util.Optional;

import com.borcelle.store.dao.entities.Product;
import org.springframework.stereotype.Component;

@Component
public interface ProductManager {

    List<Product> getAllProducts();
    Optional<Product> getProductByPid(String id);
    List<Product> getProductsByCategory(String category);
    Optional<Product> getProductBy_id(String id);

}
