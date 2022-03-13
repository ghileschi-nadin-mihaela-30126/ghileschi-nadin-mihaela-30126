package isp.lab4.exercise5;

import isp.lab4.exercise1.TemperatureSensor;
import isp.lab4.exercise2.FireAlarm;
import isp.lab4.exercise4.Controler;

public class Exercise5 {
    public static void main(String[] args) {
        FireAlarm f1 = new FireAlarm(false);
        TemperatureSensor t1 = new TemperatureSensor(51, "engine");
        System.out.println(t1.toString());
        TemperatureSensor t2 = new TemperatureSensor(75, "engine");
        System.out.println(t2.toString());
       TemperatureSensor[] temp = new TemperatureSensor[2];
        temp[0] = t1;
        System.out.println(temp[0]);
        temp[1] = t2;
        ControlerH c1 = new ControlerH();
        c1.setFireAlarm(f1);
        c1.setTempSensors(temp);
        House h = new House(c1);
        h.getControler().controlStep();
    }
}
