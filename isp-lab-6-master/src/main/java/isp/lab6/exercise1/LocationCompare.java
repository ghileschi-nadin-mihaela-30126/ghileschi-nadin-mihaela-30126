package isp.lab6.exercise1;

import java.util.Comparator;

public class LocationCompare implements Comparator<SensorReading> {

    @Override
    public int compare(SensorReading s1, SensorReading s2) {
        return s1.getLocation().compareTo(s2.getLocation());
    }

}
