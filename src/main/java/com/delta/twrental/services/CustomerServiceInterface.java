package com.delta.twrental.services;

import com.delta.twrental.entities.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerServiceInterface {

    Customer saveCustomer(Customer customer);

    List<Customer> getAllCustomers();

    Customer updateCustomer(Customer customer, int id);

    void deleteCustomer(int id);
}
