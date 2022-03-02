package isp.lab3.exercise3;

import static java.lang.System.out;
import java.lang.String;

public class Vehicles {
    private String model;
    private String type;
    private int speed;
    private char fuelType;
    static int count = 0;

    public Vehicles(String model, String type, int speed, char fuelType) {
        this.model = model;
        this.type = type;
        this.speed = speed;
        this.fuelType = fuelType;
        count++;

    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public int getSpeed() {
        return speed;
    }

    public char getFuelType() {
        return fuelType;
    }

    public void setModel(String newModel) {
        this.model = newModel;
    }

    public void setType(String newType) {
        this.type = newType;
    }

    public void setSpeed(int newSpeed) {
        this.speed = newSpeed;
    }

    public void setFuelType(char newFuelType) {
        this.fuelType = newFuelType;
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", speed=" + speed +
                ", fuelType=" + fuelType +
                '}';
    }

    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (!(obj instanceof Vehicles))
            return false;
        if (obj == this)
            return true;
        Vehicles input = (Vehicles) obj;
        return ((input.model == this.model) && (input.speed == this.speed) && (input.type == this.type) && (input.fuelType == this.fuelType));
    }


    static void numberOfObjects(){
        System.out.println("Number of objects created is: " +count);
    }

}


