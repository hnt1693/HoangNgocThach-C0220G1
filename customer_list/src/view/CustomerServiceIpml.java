package view;

import models.Customer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CustomerServiceIpml implements CustomerService {
    public static Map<Integer, Customer> customers;
    static {
        customers.put(1,new Customer("Hoang Ngoc Thach","15-5-1993","Quang Tri","None"));
        customers.put(2,new Customer("Tran Van Thanh","15-5-1993","Quang Tri","None"));
    }
    @Override
    public void save(Customer customer) {
        customers.put(customers.size()+1,customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {

    }

    @Override
    public void remove(int id) {

    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }
}
