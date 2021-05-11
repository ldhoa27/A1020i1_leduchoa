package model.repository;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepositoryImpl implements ProductRepository {
    private static Map<Integer, Product> listProduct;

    static {
        listProduct = new HashMap<>();
        listProduct.put(1, new Product(1,"Iphone 11", 400, "Apple"));
        listProduct.put(2, new Product(2,"Iphone 12", 500, "SamSung"));
        listProduct.put(3, new Product(3,"Iphone 13", 600, "Apple"));
        listProduct.put(4, new Product(4,"Iphone 14", 700, "Apple"));
        listProduct.put(5, new Product(5,"Iphone 15", 800, "SamSung"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(listProduct.values());
    }

    @Override
    public Product findById(int id) {
        return listProduct.get(id);
    }

    @Override
    public void deleteById(int id) {
        listProduct.remove(id);
    }

    @Override
    public void save(Product product) {
        listProduct.put(product.getId(), product);
    }

    @Override
    public void update(int id, Product product) {
        listProduct.put(product.getId(), product);
    }

    @Override
    public List<Product> findbyKeyWork(String keywork) {
        List<Product> listOfProductsByKeyword = new ArrayList<Product>();

        for (Map.Entry<Integer, Product> entry : listProduct.entrySet()) {
            if (entry.getValue().getName().contains(keywork)) {
                listOfProductsByKeyword.add(entry.getValue());
            }
        }
        return listOfProductsByKeyword;
    }
}
