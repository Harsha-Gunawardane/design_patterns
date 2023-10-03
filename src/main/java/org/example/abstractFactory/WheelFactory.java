package org.example.abstractFactory;

public class WheelFactory {
    protected static Wheel getWheel(String type){
        Wheel wheel = null;
        if("Sport".equals(type))
            wheel = new SportWheel();
        else if("Luxury".equals(type))
            wheel = new LuxuryWheel();

        return wheel;
    }
}
