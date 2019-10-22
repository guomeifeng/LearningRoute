/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test.Service;


import Test2.Dto.Customer;
import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


/**
 *
 * @author kelly
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@ComponentScan("Test2")
public class MockCustomerControllerTestCase {

    @Autowired
    MockMvc mvc;

    @Before
    public void before() {

    }

    @Test
    public void exampleTest() throws Exception {
        this.mvc.perform(get("/customer/"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello World"));

    }

    @Test
    public void createCustomerTest() throws Exception {
        Customer c = new Customer();
        c.setGivenName("1");
        c.setSurName("2");
        c.setId(0);
        Gson gson = new Gson();
        String str = gson.toJson(c);
        this.mvc.perform(post("/customer/create").content(str).contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
    }

    @Test
    public void getCustomersByPostCodeTest() throws Exception {
        this.mvc.perform(get("/customer/get/2").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
    
    
    
//    @RestController
//@RequestMapping("/customer")
//@Slf4j
//
//public static class CustomerAddressController {
//
//
//
//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public ResponseEntity<String> sayHello() {
//
//        return ResponseEntity.ok("Hello World");
//       
//    }
//    
//    
//    @GetMapping(value = RestURIConstants.GET_CUSTOMERS)
//    
//    public @ResponseBody 
//    List<Customer> getCustomersByPostCode(@PathVariable String postCode) {
//        List<Customer> cus = new ArrayList<>();
//        Customer c = new Customer();
//        c.setGivenName("1");
//        c.setSurName("2");
//        c.setId(0);
//        cus.add(c);
//        return cus;
//       
//    }
//
//    @PostMapping(value = RestURIConstants.CREATE_CUSTOMER)
//    public @ResponseBody
//    Integer createCustomer(@RequestBody Customer customer) {
//        return 2;
////        return customerService.createCustomer(customer,addressList);
//            
//                
//    }
//}
}
