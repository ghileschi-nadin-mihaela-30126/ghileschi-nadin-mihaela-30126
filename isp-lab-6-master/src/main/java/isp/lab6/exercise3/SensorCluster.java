package isp.lab6.exercise3;

import java.util.ArrayList;

class SensorCluster{
    ArrayList<Sensor> sensors = new ArrayList<>();
    boolean answer=false;
    public void addSensor(String id, SensorType type){
        sensors.add(new Sensor(id, type));
    }

    public boolean writeSensorReading(String id, double value, long dtaeTime){
        for(Sensor s: sensors){
            if(s.id.equals(id)){
                s.addSensorReading(new SensorReading(value,dtaeTime));
                answer=true;
            } else return answer=false;
        }
        return answer;
    }

    public Sensor getSensorById(String id){
        return sensors.stream().filter(s -> s.id.equals(id)).findFirst().get();
    }

}
