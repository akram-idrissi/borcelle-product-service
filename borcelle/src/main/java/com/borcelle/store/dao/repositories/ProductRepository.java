package com.borcelle.store.dao.repositories;

import com.borcelle.store.dao.entities.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends MongoRepository<Product, String> {
    List<Product> findAllByCategory(String category);
    Optional<Product> findProductByPid(String pid);
    Optional<Product> findProductBy_id(String pid);

}
