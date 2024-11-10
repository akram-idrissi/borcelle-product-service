package com.borcelle.store.dao.repositories;

import com.borcelle.store.dao.entities.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ProductRepository extends MongoRepository<Product, String> {
    Optional<Product> findProductByCategory(String category);
}
