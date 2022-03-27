package isp.lab6.exercise3;


import java.util.List;

public class Exercise3 {

    public static void main(String[] args) {
        SensorCluster c = new SensorCluster();
        c.addSensor("1",SensorType.TEMPERATURE);

        c.writeSensorReading("1",8,9);
        c.writeSensorReading("1",1,91);
        c.writeSensorReading("1",7,92);
        c.writeSensorReading("1",5,93);
        c.writeSensorReading("1",2,19);

        Sensor s1 = c.getSensorById("1");
        List<SensorReading> rez = s1.getSensorReadingSortedByValue();


        ////////////
        rez.stream().forEach(s -> System.out.println(s.value));

        //////////
//        for(SensorReading s: rez){
//            System.out.println(s.value);
//        }


    }
}