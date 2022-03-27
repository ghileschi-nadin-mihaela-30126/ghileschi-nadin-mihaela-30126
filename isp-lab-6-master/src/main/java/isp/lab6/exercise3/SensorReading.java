package isp.lab6.exercise3;


import java.util.Comparator;
import java.time.LocalDateTime;

class SensorReading implements Comparator<SensorReading>{
    double value;
    long dateAndTime;

    public SensorReading(double value, long dateAndTime) {
        this.value = value;
        this.dateAndTime = dateAndTime;
    }

    @Override
    public String toString() {
        return "SensorReading{" +
                "value=" + value +
                ", dateAndTime=" + dateAndTime +
                '}';
    }

    public double getValue() {
        return value;
    }

    public long getDateAndTime() {
        return dateAndTime;
    }


    @Override
    public int compare(SensorReading s1, SensorReading s2) {
        if (s1.getValue() > s2.getValue()) {
            return 1;
        } else if (s1.getValue() < s2.getValue()) {
            return -1;
        }
        return 0;
    }
}