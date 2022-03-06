package isp.lab3.exercise4;

public class Exercise4 {
    public static void main(String[] args) {
        double distance;
        MyPoint p1= new MyPoint(2, 5, 1);
        MyPoint p2= new MyPoint(5, 3, 4);
        distance=p1.distance(p2);
        System.out.println("The distance between the two given points is: " +distance);
    }

}
