package com.piseth.bank.account.controller;

import com.piseth.bank.account.dto.CustomerDTO;
import com.piseth.bank.account.entity.Customer;
import com.piseth.bank.account.mapper.CustomerMapper;
import com.piseth.bank.account.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/customers")
@AllArgsConstructor
public class CustomerController {

    private final CustomerService customerService;
    private final CustomerMapper customerMapper;

    @PostMapping
    public ResponseEntity<?> saveCustomer(@RequestBody CustomerDTO dto){
        Customer customer = customerMapper.toCustomer(dto);
         customer = customerService.save(customer);
         return ResponseEntity.ok(customer);
    }

    @GetMapping
    public ResponseEntity<?> getCustomers(){
        return ResponseEntity.ok(customerService.getCustomer()
        );
    }
}
