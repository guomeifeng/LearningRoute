/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test2.controller;

import Test2.DAO.AddressRepository;
import Test2.DAO.CustomerAddressRepository;
import Test2.DAO.CustomerRepository;
import Test2.Dto.Address;
import Test2.Dto.Customer;
import Test2.Dto.CustomerAddress;
import Test2.service.CustomerService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.websocket.server.PathParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author kelly
 */
@RestController
@RequestMapping("/customer")
@Slf4j

public class CustomerAddressController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public @ResponseBody  String sayHello() {

        return "Hello World";
       
    }
    
    
    @GetMapping(value = RestURIConstants.GET_CUSTOMERS)
    
    public @ResponseBody 
    List<Customer> getCustomersByPostCode(@PathVariable String postCode) {
        List<Customer> cus = new ArrayList<>();
        Customer c = new Customer();
        c.setGivenName("1");
        c.setSurName("2");
        c.setId(0);
        cus.add(c);
        return cus;
       
    }

    @PostMapping(value = RestURIConstants.CREATE_CUSTOMER)
    public @ResponseBody
    Customer createCustomer(@RequestBody Customer customer) {
        customer.setId(100);
        return customer;
//        return customerService.createCustomer(customer,addressList);
            
                
    }

}
