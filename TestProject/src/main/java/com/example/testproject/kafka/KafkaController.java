/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testproject.kafka;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {
//private final Producer producer;
//@Autowired
//public KafkaController(Producer producer) {
//this.producer = producer;
//}
//@PostMapping(value = "/publish")
//public void sendMessageToKafkaTopic(@RequestParam("message") String message){
//this.producer.sendMessage(message);
//}
}