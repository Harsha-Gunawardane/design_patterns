package org.example.abstractFactory;

public class EngineFactory {
    public static Engine getEngine(String type){
        Engine engine = null;

        if("Sport".equals(type))
            engine = new SportEngine();
        else if ("Luxury".equals(type)) {
            engine = new LuxuryEngine();
        }
        return engine;
    }
}
