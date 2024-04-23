public class Car {

    String brand;
    String model;
    String color;
    int yearOfManufacture;

    public Car() {

    }

    public Car(String brand, String model, String color, int yearOfManufacture) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearOfManufacture = yearOfManufacture;
    }


    public void start() {
        System.out.println("The " + color + " " + brand + " " + model + " has started.");
    }
}
