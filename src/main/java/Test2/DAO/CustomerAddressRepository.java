/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test2.DAO;

import Test2.Dto.Customer;
import Test2.Dto.CustomerAddress;
import java.util.ArrayList;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author kelly
 */
@Repository("customerAddressRepository")
public interface CustomerAddressRepository extends JpaRepository<CustomerAddress, Integer>{
    @Query(nativeQuery=true, value="select a.id, GROUP_CONCAT(b.street) as address,a.given_name, a.sur_name from customer a, address b, customer_address ab"
            + " where b.id=ab.address_id and a.id=ab.customer_id and b.post_code = ?1 group by a.id ")
    List<Object[]> findCustomersByAddress_PostCode(String postCode);
//select a.id, b.street,GROUP_CONCAT(a.given_name) as name from customer a, address b, customer_address ab where b.id=ab.address_id and a.id=ab.customer_id and b.post_code ='3104' group by a.id 
    
    
    default List<Customer> convertToCustomer(List<Object[]> findResult){
        List<Customer> customers = new ArrayList<>();
        findResult.stream().forEach(s->{
            Customer customer = new Customer();
            for (int i=0; i<s.length; i++){
                if (i==0){
                    customer.setId((Integer)s[i]);
                }else if(i==1){
                    
                }else if(i==2){
                    customer.setGivenName((String)s[i]);
                }else if(i==3){
                    customer.setSurName((String)s[i]);
                }
            }
            customers.add(customer);
        });
        return customers;
    }
}
