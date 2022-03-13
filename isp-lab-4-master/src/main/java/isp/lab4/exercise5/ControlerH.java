package isp.lab4.exercise5;

import isp.lab4.exercise1.TemperatureSensor;
import isp.lab4.exercise2.FireAlarm;

public class ControlerH {
    private FireAlarm fireAlarm;
    private TemperatureSensor[] tempSensors;

    public void controlStep() {
        for (int i = 0; i < 3; i++) {
            if (tempSensors[i].getValue() > 50) {
                fireAlarm.setActive();
            }
        }
        if(tempSensors[0].getValue()>50 || tempSensors[1].getValue()>50 || tempSensors[2].getValue()>50){
            fireAlarm.setActive();
            System.out.println("Fire alarm started!!!(one of the temps is >50)");
        }
        else System.out.println("The fire alarm not started. All good ;)");
    }

    public ControlerH() {
        this.fireAlarm =new FireAlarm(false) ;
        this.tempSensors =new TemperatureSensor[2];
    }

    public void setFireAlarm(FireAlarm fireAlarm) {
        this.fireAlarm = fireAlarm;
    }

    public void setTempSensors(TemperatureSensor[] tempSensors) {
        this.tempSensors = tempSensors;
    }
}
