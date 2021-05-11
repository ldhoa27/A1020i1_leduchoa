package model.service;

import model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    Product findById(int id);
    void deleteById(int id);
    void save(Product product);
    void update(int id, Product product);
    List<Product> findbyKeyWork(String keywork);
}
