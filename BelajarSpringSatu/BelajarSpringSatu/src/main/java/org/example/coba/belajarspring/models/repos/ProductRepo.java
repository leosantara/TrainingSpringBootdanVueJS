package org.example.coba.belajarspring.models.repos;

import org.example.coba.belajarspring.models.entities.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepo extends CrudRepository<Product, String> {
    List<Product> findByNameContains(String name);
}
