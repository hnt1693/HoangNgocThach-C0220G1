package com.codegym.service;

import com.codegym.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class ProductServiceImpl implements ProductService {
    public static int count = 6;

    private static Map<Integer, Product> products = new HashMap<>();

    static {
        products.put(1, new Product(1, "BlackBerry", 5000000, "TIVI LG", "https://fdn2.gsmarena.com/vv/pics/blackberry/blackberry-keyone-mercury-1.jpg"));
        products.put(2, new Product(2, "SmartPhone IP", 5000000, "SmartPhone", "https://www.xtmobile.vn/vnt_upload/product/11_2019/thumbs/600_600_iphone_11_tim_xtmobile_1.jpg"));
        products.put(3, new Product(3, "TIVI SONY", 5000000, "TIVI LG", "https://cdn.tgdd.vn/Products/Images/1942/162885/Slider/vi-vn-smart-tivi-samsung-49-inch-ua49n5500-(1).jpg"));
        products.put(4, new Product(4, "TIVI LG", 5000000, "TIVI LG", "https://cdn.nguyenkimmall.com/images/detailed/627/10044873_TIVI-SMART_CASPER_50UG6000_01.jpg"));
        products.put(5, new Product(5, "TIVI TOSHIBA", 5000000, "TIVI LG", "https://cdn.nguyenkimmall.com/images/detailed/627/10044873_TIVI-SMART_CASPER_50UG6000_01.jpg"));
        products.put(6, new Product(6, "smartphone LG G8", 5000000, "SmartPhone", "https://cdn.fado.vn/images/I/41CTszjCJ0L._SR600,600_.jpg"));

    }

    @Override
    public void addProduct(Product product) {
        products.put( ProductServiceImpl.count+ 1, product);
    }

    @Override
    public void deleteProduct(int id) {
        products.remove(id);
    }

    @Override
    public void updateProduct(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<Product>(products.values());
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }
}
