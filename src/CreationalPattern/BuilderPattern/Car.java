package CreationalPattern.BuilderPattern;

public class Car {
    private String make;
    private String model;
    private int year;
    private int horsepower;

    public static class Builder {
        private String make;
        private String model;
        private int year;
        private int horsepower;

        public Builder(String make, String model) {
            this.make = make;
            this.model = model;
        }

        public Builder setYear(int year) {
            this.year = year;
            return this;
        }

        public Builder setHorsepower(int horsepower) {
            this.horsepower = horsepower;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    private Car(Builder builder) {
        this.make = builder.make;
        this.model = builder.model;
        this.year = builder.year;
        this.horsepower = builder.horsepower;
    }

    @Override
    public String toString() {
        return String.format("Make: %s\nModel: %s\nYear: %d\nHorsepower: %d", make, model, year, horsepower);
    }


}

