package model.responsitory;

import model.bean.Product;

import java.util.List;

public interface ProductRepository {
        List<Product> findAll();

        boolean save(Product product);

        Product findById(int id);
        void update(int id, Product product);
        void remove(int id);

}
