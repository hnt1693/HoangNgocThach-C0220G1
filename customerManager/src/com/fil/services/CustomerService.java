package com.fil.services;

import com.fil.models.Customer;

import java.util.ArrayList;
import java.util.Collection;

public interface CustomerService {
    void add(Customer customer);
    void remove(int id);
    Customer findById(int id);
    ArrayList<Customer> findAll();
    int size();
    Collection<Customer> getList();
}

