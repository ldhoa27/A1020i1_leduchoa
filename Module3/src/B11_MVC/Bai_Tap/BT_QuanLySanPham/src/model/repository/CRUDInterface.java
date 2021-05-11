package model.repository;

import model.Product;

import java.util.List;

public interface CRUDInterface<T> {
    List<T> findAll();
    T findById(int id);
    void deleteById(int id);
    void save(T product);
    void update(int id, Product product);
    List<T> findbyKeyWork(String keywork);
}
