package isp.lab4.exercise4;

public class Exercise4 {

    public static void main(String[] args) {
        FireAlarm f1 = new FireAlarm(false);
        TemperatureSensor t1 = new TemperatureSensor(150, "engine");
        TemperatureSensor t2 = new TemperatureSensor(75, "engine");
        TemperatureSensor t3 = new TemperatureSensor(45, "engine");
        TemperatureSensor[] temp = new TemperatureSensor[3];
        temp[0]= t1;
        temp[1]= t2;
        temp[2]= t3;
        Controler c1 = new Controler(f1,temp);
        c1.controlStep();

    }
}
