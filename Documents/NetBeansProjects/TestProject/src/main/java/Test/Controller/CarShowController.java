/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test.Controller;



import Test.Model.Car;
import Test.Service.CarShowsProcessor;
import java.util.Collection;
import java.util.List;
import java.util.Map;


import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




/**
 *
 * @author kelly
 */
@RestController
@RequestMapping("/api")
public class CarShowController {
    
    private CarShowsProcessor processor = new CarShowsProcessor();
    
    @GetMapping("/carshow")
    public Collection getCarAndShows(Model model) {
        Collection carJson = processor.processToCollection();
//        for (Map.Entry entry:carMap.entrySet()){
//
//            Car car = (Car)entry.getKey();   
//            System.out.println(car.getMake());
//            System.out.println("&nbsp"+car.getModel());
//            List<String> showNames = (List)entry.getValue();
//            
//            showNames.stream().forEach(s -> System.out.println("&nbsp&nbsp"+s));
//
//            
//        }
//        model.addAttribute("carMap", carMap);
        return carJson;
    }


}