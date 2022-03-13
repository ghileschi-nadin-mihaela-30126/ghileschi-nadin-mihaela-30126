package isp.lab4.exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        FireAlarm fire = new FireAlarm(false);

        fire.isActive();
        System.out.println("The fire alarm is: " +fire.isActive());

        fire.setActive();
        System.out.println("The fire alarm is now: " +fire.isActive());

        fire.toString();
        System.out.println("The toString method: " +fire.toString());
    }
}
