package com.delta.twrental.services;

import com.delta.twrental.entities.Customer;
import com.delta.twrental.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServices implements CustomerServiceInterface {

    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer updateCustomer(Customer customer, int id) {
        Customer c = customerRepository.findById(id).orElseThrow(() -> new RuntimeException());
        c.setUserName(customer.getUserName());
        c.setName(customer.getName());
        c.setAddress(customer.getAddress());
        c.setEmail(customer.getEmail());
        c.setPhoneNumber(customer.getPhoneNumber());
        return c;
    }

    @Override
    public void deleteCustomer(int id) {
        customerRepository.findById(id).orElseThrow(() -> new RuntimeException());
        customerRepository.deleteById(id);

    }
}
