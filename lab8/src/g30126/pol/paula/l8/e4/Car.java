package g30126.pol.paula.l8.e4;

import java.io.*;

public class Car implements Serializable{

    private String model;
    private double price;



    public Car(String model, double price){
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
