package com.borcelle.store.dao.repositories;

import com.borcelle.store.dao.entities.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
