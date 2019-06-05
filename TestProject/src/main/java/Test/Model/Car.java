/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test.Model;

/**
 *
 * @author kelly
 */
public class Car {
    private double row;
    private String make;
    private String model;
    private String show;

    public double getRow() {
        return row;
    }

    public void setRow(double row) {
        this.row = row;
    }

    public String getShow() {
        return show;
    }

    public void setShow(String show) {
        this.show = show;
    }

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "{" + "make=" + make + ", model=" + model + '}';
    }


    
}
