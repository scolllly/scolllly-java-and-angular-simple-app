package com.example.api.service;

import java.util.List;

import com.example.api.dto.CustomerDto;
import com.example.api.entity.Customer;

public interface CustomerService {

    public List<CustomerDto> readAll();
    public CustomerDto read();
    public CustomerDto create(CustomerDto customerDto);
    public CustomerDto update(CustomerDto customerDto);
    public void delete();

    
}
