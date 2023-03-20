package CreationalPattern.BuilderPattern;

public class Main {
    public static void main(String[] args) {
        Car car = new Car.Builder("Toyota","Camry")
                .setYear(2022)
                .setHorsepower(203)
                .build();
        System.out.println(car.toString());
    }
}
