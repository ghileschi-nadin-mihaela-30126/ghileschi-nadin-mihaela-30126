package isp.lab4.exercise1;

//import isp.lab4.exercise0.CarAlarm; //NU ASA

public class Exercise1 {

    public static void main(String[] args) {

        TemperatureSensor t1 = new TemperatureSensor();
        TemperatureSensor t2 = new TemperatureSensor(150, "engine");

        System.out.println("The temperature is: "+t1.getValue());
        System.out.println("and the location is: " +t1.getLocation());
        System.out.println("The temperature is: " +t2.getValue());
        System.out.println("and the location is: "+t2.getLocation());

        t1.toString();
        System.out.println(t1.toString());
        t2.toString();
        System.out.println(t2.toString());



        //instantiati obiect
    }
}
