package com.borcelle.store.services.manager;

import java.util.Optional;

import com.borcelle.store.dao.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

@Component
public interface ProductManager {

    Page<Product> getAllProducts(int page, int size);
    Optional<Product> getProductByPid(String id);
    Page<Product> getProductsByCategory(String category, Pageable pageable);
    Optional<Product> getProductBy_id(String id);

}
