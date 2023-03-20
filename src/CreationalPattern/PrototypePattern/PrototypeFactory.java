package CreationalPattern.PrototypePattern;

import java.util.HashMap;

public class PrototypeFactory {
    public static HashMap<String,Prototype> prototypes = new HashMap<>();

    static {
        prototypes.put("Standard",new Car("Ford", "Focus", 2019));
        prototypes.put("Luxury",new Car("BMW", "7 Series", 2020));
    }

    public static Prototype getPrototype(String type)
    {
        return prototypes.get(type).clone();
    }

}
