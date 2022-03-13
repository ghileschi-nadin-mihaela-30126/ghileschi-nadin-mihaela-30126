package isp.lab4.exercise4;

public class Controler {

    private FireAlarm fireAlarm;
    private TemperatureSensor[] tempSensors= new TemperatureSensor[3];

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

    public Controler(FireAlarm fireAlarm, TemperatureSensor[] tempSensor) {
        this.fireAlarm = fireAlarm;
        this.tempSensors = tempSensor;
    }
}
