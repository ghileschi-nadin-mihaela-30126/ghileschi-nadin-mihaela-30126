package isp.lab6.exercise3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Sensor{

   List<SensorReading> readings = new ArrayList<>();
    String id;
    SensorType type;

    public Sensor(String id, SensorType type) {
        this.id = id;
        this.type = type;
    }

    public boolean addSensorReading(SensorReading reading){
        readings.add(reading);
        return true;
    }

    List<SensorReading> getSensorReadingSortedByValue(){
      //  Collections.sort(readings); //aceasta metoda utilizeaaz criteriul definiti in compareTo din clasa SensorReading)
        return readings;
    }

    public List<SensorReading> getReadings() {
        return readings;
    }
    public List<SensorReading> getSensorReadingsSortedByDateAndTime() {
        if (readings != null) {
         //   Collections.sort(this.readings);
            return this.readings;
        }
        return null;
    }
    public String getId() {
        return id;
    }
}