package com.techienick.productservice01.repository;

import com.techienick.productservice01.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface ProductRepository extends MongoRepository<Product, String> {
}