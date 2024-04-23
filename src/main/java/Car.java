import java.util.Objects;

public class Car {

    String brand;
    String model;
    String color;
    int yearOfManufacture;
    int speed;

    public Car() {
    }

    public Car(String brand, String model, String color, int yearOfManufacture, int speed) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearOfManufacture = yearOfManufacture;
        this.speed = speed;
    }

    public String start() {
        String outputForStartMethod = "The " + color + " " + brand + " " + model + " has started.";
        System.out.println(outputForStartMethod);
        return outputForStartMethod;
    }

    public void accelerate(int acceleration) {
        speed += acceleration;
        System.out.println("The car is accelerating. Current speed: " + speed + " km/h");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfManufacture == car.yearOfManufacture && speed == car.speed && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, color, yearOfManufacture, speed);
    }
}
