package com.example.api.mapper;

import java.util.ArrayList;
import java.util.List;

import com.example.api.dto.CustomerDto;
import com.example.api.entity.Customer;

import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {

    public Customer dtoToEntity(CustomerDto customerDto){
        Customer customer = Customer.builder()
                                    .id(customerDto.getId())
                                    .name(customerDto.getName())
                                    .lastname(customerDto.getLastname())
                                    .dateOfBirth(customerDto.getDateOfBirth())
                                    .dni(customerDto.getDni())
                                    .build();

        return customer;
    }

    public List<Customer> dtoToEntity(List<CustomerDto> customerDtoLista){

        List<Customer> customerLista = new ArrayList<>();
        customerDtoLista.stream().forEach(customerDto -> {

            Customer customer = Customer.builder()
                                    .id(customerDto.getId())
                                    .name(customerDto.getName())
                                    .lastname(customerDto.getLastname())
                                    .dateOfBirth(customerDto.getDateOfBirth())
                                    .dni(customerDto.getDni())
                                    .build();
            customerLista.add(customer);
        });
        

        return customerLista;
    }

    public CustomerDto entityToDto(Customer customer){
        CustomerDto customerDto = CustomerDto.builder()
                                    .id(customer.getId())
                                    .name(customer.getName())
                                    .lastname(customer.getLastname())
                                    .dateOfBirth(customer.getDateOfBirth())
                                    .dni(customer.getDni())    
                                    .build();

        customerDto.calculateAge();
        return customerDto;
    }

    public List<CustomerDto> entityToDto(List<Customer> customerLista){

        List<CustomerDto> customerDtoLista = new ArrayList<>();
        customerLista.stream().forEach(customer -> {

            CustomerDto customerDto = CustomerDto.builder()
                                    .id(customer.getId())
                                    .name(customer.getName())
                                    .lastname(customer.getLastname())
                                    .dateOfBirth(customer.getDateOfBirth())
                                    .dni(customer.getDni())
                                    .build();
            customerDto.calculateAge();
            customerDtoLista.add(customerDto);
        });
        

        return customerDtoLista;
    }
    
}
