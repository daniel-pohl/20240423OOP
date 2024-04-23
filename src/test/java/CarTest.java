import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CarTest {

    //addWhen4Plus3ThenReturn7
    @Test
    public void testDefaultConstructor() {
        Car car = new Car();
        assertNotNull(car);
    }
    @Test
    public void testParameterizedConstructor() {
        String brand = "Toyota";
        String model = "Corolla";
        String color = "Red";
        int yearOfManufacture = 2020;
        int speed = 0;

        Car car = new Car(brand, model, color, yearOfManufacture, speed);

        assertEquals(brand, car.brand);
        assertEquals(model, car.model);
        assertEquals(color, car.color);
        assertEquals(yearOfManufacture, car.yearOfManufacture);
        assertEquals(speed, car.speed);
    }
    @Test
    public void testStart() {
        String brand = "Toyota";
        String model = "Corolla";
        String color = "Red";

        Car car = new Car();
        car.brand = brand;
        car.model = model;
        car.color = color;

        String expectedOutput = "The Red Toyota Corolla has started.";

        assertEquals(expectedOutput, car.start());
    }
    @Test
    public void testAccelerate() {
        int acceleration = 20;
        int initialSpeed = 30;

        Car car = new Car();
        car.speed = initialSpeed;

        car.accelerate(acceleration);

        assertEquals(initialSpeed + acceleration, car.speed);
    }

}
