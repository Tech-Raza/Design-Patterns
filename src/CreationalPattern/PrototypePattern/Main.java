package CreationalPattern.PrototypePattern;

public class Main {
    public static void main(String[] args) {
        Prototype standardCar = PrototypeFactory.getPrototype("Standard");
        System.out.println(standardCar);

        Prototype luxuryCar = PrototypeFactory.getPrototype("Luxury");
        System.out.println(luxuryCar);

        luxuryCar.setMake("Mercedes-Benz");
        System.out.println(luxuryCar);

        Prototype anotherLuxuryCar = PrototypeFactory.getPrototype("Luxury");
        System.out.println(anotherLuxuryCar);
    }
}
