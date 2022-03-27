package isp.lab6.exercise1;

import sun.management.Sensor;

import java.util.ArrayList;
import java.util.*;
import java.util.List;

public class Implementation implements IReadingRepository{
    List<SensorReading> lst = new ArrayList<SensorReading>();
    ArrayList<SensorReading> list = new ArrayList<SensorReading>();
    List<SensorReading> list3 = new ArrayList<SensorReading>();
    private String location;

    public void addReading(SensorReading reading){
            list.add(reading);
        }

    @Override
    public double getAvarageValueByType(Type type, String location) {
        double result=0;
        int count=0;
       for(int i=0; i<list.size(); i++){
           if(list.get(i).getType().equals(type)){
               result= result + list.get(i).getValue();
               count++;
           }
       }
       result=result/count;
       System.out.println(result);
       return result;
    }

    public void displayList(){
        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i).displaySensorReading());
        }
        System.out.println();
    }


    public List<SensorReading> getReadingsByType(Type type){
        int i=0;
        for(int j=0; j<list.size(); j++){
            if(list.get(i).getType().equals(type)){
                lst.add(list.get(i));
            }
            i++;
        }
        System.out.println();
        return lst;
    }

    @Override
    public List<SensorReading> findAllByLocationAndType(String location, Type type) {
        int i=0;
        for(int j=0; j<list.size(); j++){
            if(list.get(i).getLocation().equals(location) && list.get(i).getType().equals(type)){
                list3.add(list.get(i));
            }
            i++;
        }
        System.out.println();
        return list3;
    }

    @Override
    public void listSortedByLocation() {
        LocationCompare location = new LocationCompare();
        Collections.sort(list, location);
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i).displaySensorReading());
        }
        System.out.println();
    }

    @Override
    public void listSortedByValue() {
         ValueCompare value = new ValueCompare();
         Collections.sort(list, value);
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i).displaySensorReading());
        }
        System.out.println();
    }
}

