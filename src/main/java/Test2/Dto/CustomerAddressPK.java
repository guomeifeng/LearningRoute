/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test2.Dto;

import java.io.Serializable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author kelly
 */
@Getter
@Setter
@EqualsAndHashCode
public class CustomerAddressPK implements Serializable{
    private Integer customerId;
   
    private Integer addressId;
}
