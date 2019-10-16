/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testproject.mybatismapper;


import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 *
 * @author kelly
 */
@Mapper
public interface Transaction_I {
@Select
        ("SELECT * FROM tbl_MS_TRANSACTION WHERE ServiceID = #{serviceId} AND trans_group = #{trans_group}" )
  List<Transaction> findByServiceIdAndTransGroup(@Param("serviceId") String serviceId, @Param("trans_group") String transGroup);
}
