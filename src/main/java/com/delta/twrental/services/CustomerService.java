package com.delta.twrental.services;

import com.delta.twrental.entities.Customer;
import com.delta.twrental.repositories.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements CustomerServiceInterface {

    @Autowired
    private CustomerRepo customerRepo;
    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepo.save(customer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepo.findAll();
    }

    @Override
    public Customer updateCustomer(Customer customer, int id) {
        Customer c = customerRepo.findById(id).orElseThrow(() -> new RuntimeException());
        c.setUserName(customer.getUserName());
        c.setName(customer.getName());
        c.setAddress(customer.getAddress());
        c.setEmail(customer.getEmail());
        c.setPhoneNumber(customer.getPhoneNumber());
        return c;
    }

    @Override
    public void deleteCustomer(int id) {
        customerRepo.findById(id).orElseThrow(() -> new RuntimeException());
        customerRepo.deleteById(id);

    }
}
