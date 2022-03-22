package isp.lab6.exercise1;

import sun.management.Sensor;

import java.util.ArrayList;
import java.util.*;
import java.util.List;

public class Implementation implements IReadingRepository{

    ArrayList<SensorReading> list = new ArrayList<SensorReading>();
    ArrayList<SensorReading> list2 = new ArrayList<SensorReading>();
    ArrayList<SensorReading> list3 = new ArrayList<SensorReading>();

    public void addReading(SensorReading reading){
            list.add(reading);
            for(int i=0; i<list.size();i++){
           System.out.println(list.get(i).displaySensorReading());
        }
    }

    public List<SensorReading> getReadingsByType(Type type){
        Type t1;
        for(int i=0; i<list.size(); i++){
            t1=list.get(i).getType();
           if(t1.equals(type)){
               list2.add(i,list.get(i));
           }
        }
        return list2;
    }

    public double getAvarageValueByType(Type type, String location){
        int value=0;
        double result=0;
                   for(int i=0; i<list2.size(); i++){
                       value=list2.get(i).getValue();
                       result=result+value;
                   }
                   result=result/2;
           return result;
    }

    @Override
    public List<SensorReading> findAllByLocationAndType(String location, Type type) {
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getLocation().equals(location) && list.get(i).getType().equals(type)){
                list3.add(i,list.get(i));
                System.out.println(list3.get(i).displaySensorReading());
            }
        }
        return list3;
    }

    @Override
    public void listSortedByLocation() {

    }

    @Override
    public void listSortedByValue() {

    }

}
