package isp.lab4.exercise3;

import isp.lab4.exercise1.TemperatureSensor;
import isp.lab4.exercise2.FireAlarm;

public class Exercise3 {
    public static void main(String[] args) {

        FireAlarm f1 = new FireAlarm(false);
        TemperatureSensor t1 = new TemperatureSensor(150, "engine");
        Controler c1 = new Controler(f1, t1);
        c1.controlStep();

    }

    }
