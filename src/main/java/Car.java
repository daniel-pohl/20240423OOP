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
}
