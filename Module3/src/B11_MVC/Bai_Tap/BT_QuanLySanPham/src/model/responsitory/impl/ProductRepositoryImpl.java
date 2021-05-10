package model.responsitory.impl;

import model.bean.Product;
import model.responsitory.ProductRepository;

import java.util.*;

public class ProductRepositoryImpl implements ProductRepository {
    private static Map<Integer, Product> productMap = new TreeMap<>();

    static {
        productMap.put(1, new Product(1, "Iphone", "30000", "IOS", "Apple"));
        productMap.put(2, new Product(2, "SamSung S20", "25000", "Android", "Sam Sung"));
        productMap.put(3, new Product(3, "Vivo V10", "20000", "Android", "Vivo"));
        productMap.put(4, new Product(4, "Vismart", "15000", "Android", "Vinmart"));

    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public boolean save(Product product) {
        int id = (int) (Math.random() * 1000);
        product.setId(id);
        productMap.put(product.getId(), product);
        return true;

    }

    @Override
    public Product findById(int id) {
        return productMap.get(id);
    }

    @Override
    public void update(int id, Product product) {
        productMap.put(id, product);
    }

    @Override
    public void remove(int id) {
        productMap.remove(id);
    }
}
