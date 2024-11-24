package com.borcelle.store.dao.repositories;

import com.borcelle.store.dao.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends MongoRepository<Product, String> {
    Optional<Product> findProductByPid(String pid);
    Optional<Product> findProductBy_id(String pid);
    Page<Product> findAllByCategory(String category, Pageable pageable);
}
