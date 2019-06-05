/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test.Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kelly
 */
public class CarShow {
    private String name;
    private List<Car> cars;

    public CarShow(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Car> getCars() {
        if (this.cars==null) this.cars = new ArrayList<Car>();
        return this.cars;
    }
    
    public boolean carExistsInShow(Car car){
        long carNum = cars.stream().filter(s->s.getMake().equals(car.getMake())&&s.getModel().equals(car.getModel())).count();
        if (carNum > 0) return true;
        return false;
    }
    

    
}
