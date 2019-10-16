/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test2.service;

import Test2.DAO.AddressRepository;
import Test2.DAO.CustomerAddressRepository;
import Test2.DAO.CustomerRepository;
import Test2.Dto.Address;
import Test2.Dto.Customer;
import Test2.Dto.CustomerAddress;
import Test2.controller.RestURIConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author kelly
 */
@Slf4j
@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private CustomerAddressRepository customerAddressRepository;


    public List<Customer> getCustomersByPostCode(String postCode) {

        List<Customer> customers = new ArrayList<>();        
        List<Object[]> result = customerAddressRepository.findCustomersByAddress_PostCode(postCode);
        customers = customerAddressRepository.convertToCustomer(result);
        
        return customers;
    }


    public Integer createCustomer(Customer customer, List<Address> addressList) {
        try {
            customerRepository.save(customer);
            addressList.stream().forEach(s -> {
                addressRepository.save(s);
                customerAddressRepository.save(new CustomerAddress(customer.getId(), s.getId()));
            });
            return customer.getId();
        }catch(Exception e){
            log.error("Error happens in CustomerAddressController.createCustomer" + Arrays.toString(e.getStackTrace()));
            return null;
        }        
    }
}
