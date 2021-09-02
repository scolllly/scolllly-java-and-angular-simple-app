package com.example.api.service;

import java.util.List;

import com.example.api.dto.CustomerDto;
import com.example.api.entity.Customer;
import com.example.api.mapper.CustomerMapper;
import com.example.api.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public List<CustomerDto> readAll() {
        List<Customer> customerLista = customerRepository.findAll();
        List<CustomerDto> customerDtoLista = customerMapper.entityToDto(customerLista);
        return customerDtoLista;
    }

    @Override
    public CustomerDto read() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public CustomerDto create(CustomerDto customerDto) {
        Customer customer = customerMapper.dtoToEntity(customerDto);
        Customer customerDb = customerRepository.save(customer);
        return customerMapper.entityToDto(customerDb);
    }

    @Override
    public CustomerDto update(CustomerDto customerDto) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete() {
        // TODO Auto-generated method stub
        
    }

   
    
}
