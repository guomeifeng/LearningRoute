/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test2.Dto;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author kelly
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@IdClass(CustomerAddressPK.class)
@Table(name="customer_address")
public class CustomerAddress implements Serializable {
    @Id
    private Integer customerId;
    
    @Id
    private Integer addressId;
}
