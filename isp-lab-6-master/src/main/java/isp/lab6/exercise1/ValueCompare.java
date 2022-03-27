package isp.lab6.exercise1;

import java.util.Comparator;

public class ValueCompare implements Comparator<SensorReading> {

    @Override
    public int compare(SensorReading s1, SensorReading s2) {
        if (s1.getValue() == s2.getValue())
            return 0;
        else if (s1.getValue() > s2.getValue())
            return 1;
        else
            return -1;
    }
}
