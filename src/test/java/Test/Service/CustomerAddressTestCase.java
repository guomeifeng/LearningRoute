/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test.Service;

import Test2.DAO.AddressRepository;
import Test2.DAO.CustomerAddressRepository;
import Test2.DAO.CustomerRepository;
import Test2.Dto.Address;
import Test2.Dto.Customer;
import Test2.Dto.CustomerAddress;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author kelly
 */
@RunWith(SpringJUnit4ClassRunner.class)
@Slf4j
@DataJpaTest
@EnableJpaRepositories
@ComponentScan("Test2")
public class CustomerAddressTestCase {

    @Autowired
    private CustomerRepository customerRepository ;
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private CustomerAddressRepository customerAddressRepository ;
    
    
    @Before
    public void init(){
        Customer kelly = new Customer(null, "Kelly", "Guo");
        customerRepository.save(kelly);
        Customer charlie = new Customer(null, "Charlie", "Li");
        customerRepository.save(charlie);
        Address balwyn1 = new Address(null, "233 Doncaster Rd, Balwyn North", "3104");
        addressRepository.save(balwyn1);
        Address balwyn2 = new Address(null, "239 Doncaster Rd, Balwyn North", "3104");
        addressRepository.save(balwyn2);
        
        Address docaster1 = new Address(null, "233 Doncaster Rd, Doncaster", "3108");
        addressRepository.save(docaster1);
        Address docaster2 = new Address(null, "239 Doncaster Rd, Doncaster", "3108");
        addressRepository.save(docaster2);
        customerAddressRepository.save(new CustomerAddress(kelly.getId(),balwyn1.getId()));
        customerAddressRepository.save(new CustomerAddress(kelly.getId(),balwyn2.getId()));
        customerAddressRepository.save(new CustomerAddress(charlie.getId(),balwyn1.getId()));
        customerAddressRepository.save(new CustomerAddress(charlie.getId(),balwyn2.getId()));
        customerAddressRepository.save(new CustomerAddress(charlie.getId(),docaster1.getId()));
        customerAddressRepository.save(new CustomerAddress(charlie.getId(),docaster2.getId()));
        
    }
    @After
    public void deleteAll(){
        
    }
    @Test
    public void findAll11(){
        log.info("start");
        String postCode = "3104";
        List<Address> addresses = addressRepository.findByPostCode(postCode);
        List<Object[]> customers = customerAddressRepository.findCustomersByAddress_PostCode(postCode);
        log.info("end");
        
    }

   
}
