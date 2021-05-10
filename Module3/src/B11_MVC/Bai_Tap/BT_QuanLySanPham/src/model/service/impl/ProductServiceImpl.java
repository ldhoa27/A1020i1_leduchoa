package model.service.impl;

import model.bean.Product;
import model.responsitory.ProductRepository;
import model.responsitory.impl.ProductRepositoryImpl;
import model.service.ProductService;


import java.util.List;

public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository = new ProductRepositoryImpl();

    @Override
    public List<Product> findAll() {
        return this.productRepository.findAll();
    }

    @Override
    public boolean save(Product product) {
       this.productRepository.save(product);
       return true;
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public void update(int id, Product product) {
        this.productRepository.update(id, product);
    }

    @Override
    public void remove(int id) {
        this.productRepository.remove(id);

    }
}
