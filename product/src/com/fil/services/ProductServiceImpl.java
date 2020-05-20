package com.fil.services;

import com.fil.model.Product;

import java.util.*;

public class ProductServiceImpl implements ProductService {
    public static Map<Integer, Product> products = new HashMap<>();

    static {
        products.put(1, new Product(1, "TIVI SONY", 2000000, "Qua tuyet voi", "SONY ELECTRICS"));
        products.put(2, new Product(2, "TIVI TOSHSIBA", 3000000, "Qua tuyet voi", "TOSHIBA ELECTRICS"));
        products.put(3, new Product(3, "TIVI LG", 3000000, "Qua tuyet voi", "TOSHIBA ELECTRICS"));
    }

    @Override
    public void addnew(Product product) {
        products.put(products.size() + 1, product);
    }

    @Override
    public Product findByID(int id) {
        return products.get(id);
    }

    @Override
    public void delete(int id) {
        products.remove(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public List<Product> showProduct(int id) {
        return new ArrayList<>(products.values());
    }

    @Override
    public List<Product> searchByName(String name) {
        Collection<Product> products = ProductServiceImpl.products.values();
        ArrayList<Product> temp = new ArrayList<>();
        for (Product product : products
        ) {
            if (product.getName().indexOf(name)!= -1) {
                temp.add(product);
            }
        }
        return temp;
    }
}
