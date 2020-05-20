package com.codegym.service;

import com.codegym.model.Product;

import java.util.List;

public interface ProductService {
    void addProduct(Product product);

    void deleteProduct(int id);

    void updateProduct(int id, Product product);

    List<Product> findAll();

    Product findById(int id);
}
