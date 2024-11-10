package com.borcelle.store.services.manager;

import java.util.List;
import com.borcelle.store.dao.entities.Product;
import org.springframework.stereotype.Component;

@Component
public interface ProductManager {

    List<Product> getAllProducts();
    Product getProductById(String id);
    Product getProductByCategory(String category);

}
