package com.fil.services;

import com.fil.models.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class CustomerServiceImpl implements CustomerService {
    public static Map<Integer, Customer> customersList = new HashMap<>();

    static {
        customersList.put(1, new Customer(1,"Thach", "12-12-93", "Quang Tri", "hnt@gmail.com"));
        customersList.put(2, new Customer(2,"Thach", "12-12-93", "Quang Tri", "hnt@gmail.com"));
        customersList.put(3, new Customer(3,"Thach", "12-12-93", "Quang Tri", "hnt@gmail.com"));
        customersList.put(4, new Customer(4,"Thach", "12-12-93", "Quang Tri", "hnt@gmail.com"));

    }

    @Override
    public void add(Customer customer) {
        customersList.put(customer.getId(), customer);
    }

    @Override
    public void remove(int id) {
        customersList.remove(id);
    }

    @Override
    public Customer findById(int id) {
        return customersList.get(id);
    }

    @Override
    public ArrayList<Customer> findAll() {
        return (ArrayList<Customer>) customersList.values();
    }

    @Override
    public int size() {
        return customersList.size();
    }

    @Override
    public Collection<Customer> getList() {
        return  customersList.values();
    }
}
