package com.example.ecommerce.ecommerce_api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerce.ecommerce_api.Repository.CustomerRepository;
import com.example.ecommerce.ecommerce_api.model.Customer;

@Service
public class CustomerService {
    
    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> getAllCustomers(){
        return (List<Customer>) customerRepository.findAll(); 
    }

    public Optional<Customer> getAllCustomersById(Long id){
        Optional<Customer> customer=customerRepository.findById(id);
        return customer;
    }
    
    public Customer saveCustomer(Customer customer){
        Customer c =customerRepository.save(customer);
       return c;
    }

     public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }

}
