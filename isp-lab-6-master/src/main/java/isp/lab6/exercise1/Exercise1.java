package isp.lab6.exercise1;

import sun.management.Sensor;

import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {

        System.out.println("Test implementation here.");
        SensorReading s1 = new SensorReading(140, "kitchen", Type.TEMPERATURE);
        SensorReading s2 = new SensorReading(80, "bathroom", Type.HUMIDITY);
        Implementation i1= new Implementation();
        i1.addReading(s1);
        i1.addReading(s2);

    }
}
