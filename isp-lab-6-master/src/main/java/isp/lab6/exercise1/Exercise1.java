package isp.lab6.exercise1;

import sun.management.Sensor;
import isp.lab6.exercise1.SensorReading;
import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {

        System.out.println("Test implementation here.");
        SensorReading s1 = new SensorReading(140, "kitchen", Type.TEMPERATURE);
        SensorReading s2 = new SensorReading(80, "living", Type.HUMIDITY);
        SensorReading s3 = new SensorReading(85, "kitchen", Type.TEMPERATURE);
        Implementation i1= new Implementation();
        i1.addReading(s1);
        i1.addReading(s2);
        i1.addReading(s3);
        i1.displayList();
        i1.listSortedByLocation();
        i1.listSortedByValue();
        i1.getAvarageValueByType(Type.TEMPERATURE, "kitchen");
        List<SensorReading> listType= i1.getReadingsByType(Type.TEMPERATURE);
        System.out.println(listType);
        List<SensorReading> listTypeAndLocation= i1.findAllByLocationAndType("kitchen", Type.TEMPERATURE);
        System.out.println(listTypeAndLocation);

    }
}
