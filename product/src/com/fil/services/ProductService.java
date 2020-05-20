package com.fil.services;

import com.fil.model.Product;

import java.util.List;

public interface ProductService {
    void addnew(Product product);
    Product findByID(int id);
    void delete(int id);
    void update(int id, Product product);
    List<Product> showProduct(int id);
    List<Product> searchByName(String name);
}
