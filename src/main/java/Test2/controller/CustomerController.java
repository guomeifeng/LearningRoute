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
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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
public class CustomerController {

    @Autowired
    private CustomerService customerService;


    @RequestMapping(value = RestURIConstants.GET_CUSTOMERS, method = RequestMethod.GET)
    public @ResponseBody
    List<Customer> getCustomersByPostCode(@RequestBody String postCode) {

        return customerService.getCustomersByPostCode(postCode);
       
    }

    @RequestMapping(value = RestURIConstants.CREATE_CUSTOMER, method = RequestMethod.POST)
    public @ResponseBody
    Integer createCustomer(@RequestBody Customer customer, @RequestBody List<Address> addressList) {
        return customerService.createCustomer(customer,addressList);
            
                
    }

}
