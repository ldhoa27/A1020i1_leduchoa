package service;

import java.util.List;

public interface UserService {
    List<Product> findAll();
    Product findById(int id);
    void deleteById(int id);
    void save(Product product);
    void update(int id, Product product);
    List<Product> findbyKeyWork(String keywork);
}
