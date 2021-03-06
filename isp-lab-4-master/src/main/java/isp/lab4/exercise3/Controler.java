package isp.lab4.exercise3;

public class Controler {

    private FireAlarm fireAlarm;
    private TemperatureSensor tempSensor;

    public void controlStep(){
        if(tempSensor.getValue()>50){
            fireAlarm.setActive();
            System.out.println("Fire alarm started!!!");
        }
        else System.out.println("Fire alarm not started. All good ;)");
    }

    public Controler(FireAlarm fireAlarm, TemperatureSensor tempSensor) {
        this.fireAlarm = fireAlarm;
        this.tempSensor = tempSensor;
    }
}
