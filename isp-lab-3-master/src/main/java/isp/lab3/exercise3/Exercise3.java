package isp.lab3.exercise3;

import java.lang.String;
//Create two Vehicle object and test getter and setter methods (in main).
public class Exercise3 {
    public static void main(String[] args) {
    Vehicles car1= new Vehicles("model1", "tip1", 1, 'D');
    Vehicles car2= new Vehicles("model2", "tip2", 2, 'D');

    car1.setModel("Mercedes");
    car1.setType("Benz");
    car1.setSpeed(280);
    car1.setFuelType('D');
    car2.setModel("Audi");
    car2.setType("A8");
    car2.setSpeed(260);
    car2.setFuelType('D');
    car1.getModel();
    car1.getType();
    car1.getSpeed();
    car1.getFuelType();
    car2.getModel();
    car2.getType();
    car2.getSpeed();
    car2.getFuelType();
    car1.toString();
    System.out.println(car1.toString());
    car2.toString();
    System.out.println(car2.toString());

        System.out.println(car1.equals(car2));

        car2.setModel("Mercedes");
        car2.setType("Benz");
        car2.setSpeed(280);
        car2.setFuelType('D');
        car2.getModel();
        car2.getType();
        car2.getSpeed();
        car2.getFuelType();
        car1.toString();
        System.out.println(car1.toString());
        car2.toString();
        System.out.println(car2.toString());

        System.out.println(car1.equals(car2));

        Vehicles.numberOfObjects();
    }
}
