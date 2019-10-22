package Test.Service;

import Test2.Dto.Customer;
import Test2.controller.RestURIConstants;
import Test2.service.CustomerService;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
;
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class MockMvcExampleTests {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testHomeUrl() throws Exception {
        this.mvc.perform(get("/customer1/")).andExpect(status().isOk())
                .andExpect(content().string("Hello World"));
    }

    @Test
    public void testAdminHomeUrl() throws Exception {
        this.mvc.perform(get("/admin/home")).andExpect(status().isUnauthorized());
    }

//    @Configuration
//    public static class MyTestConfiguration extends WebSecurityConfigurerAdapter {
//        @Override
//        protected void configure(HttpSecurity http) throws Exception {
//            http
//                    .authorizeRequests().antMatchers("/admin/**").hasRole("USER").and()
//                    .httpBasic();
//        }
//    }
//@TestConfiguration
    @Controller
    public static class TestController {

        @RequestMapping(path = "/home")
        public ResponseEntity<String> home() {
            return ResponseEntity.ok("Hello World");
        }

        @RequestMapping(path = "/admin/home")
        public ResponseEntity<String> adminHome() {
            return ResponseEntity.ok("Hello World Secured");
        }

    }
@Controller

public static class CustomerAddressController2 {


    @RequestMapping(value = "/customer1/")
    public ResponseEntity<String> sayHello() {

        return ResponseEntity.ok("Hello World");
       
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
    Integer createCustomer(@RequestBody Customer customer) {
        return 2;
//        return customerService.createCustomer(customer,addressList);
            
                
    }

}

}