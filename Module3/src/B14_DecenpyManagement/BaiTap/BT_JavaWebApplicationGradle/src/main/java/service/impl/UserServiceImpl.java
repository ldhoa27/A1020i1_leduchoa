package service.impl;

import service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserServiceImpl productRepository = new UserServiceImpl();

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public void deleteById(int id) {
        productRepository.deleteById(id);
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public void update(int id, Product product) {
        productRepository.update(id, product);
    }

    @Override
    public List<Product> findbyKeyWork(String keywork) {
        return productRepository.findbyKeyWork(keywork);
    }
}
