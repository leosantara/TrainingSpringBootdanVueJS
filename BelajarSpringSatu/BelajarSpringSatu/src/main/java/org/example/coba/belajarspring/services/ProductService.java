package org.example.coba.belajarspring.services;

import org.example.coba.belajarspring.models.entities.Product;
import org.example.coba.belajarspring.models.repos.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public Product save(Product product) {
        return productRepo.save(product);
    }

    public Product findOne(String nip){
        return productRepo.findById(nip).get();
    }

    public Iterable<Product> findAll(){
        return productRepo.findAll();
    }

    public void removeOne(String nip){
        productRepo.deleteById(nip);
    }

    public List<Product> findByName(String name) {
        return productRepo.findByNameContains(name);
    }
}
