public class Main {

    public static void main(String[] args) {

        Car myCar1 = new Car("BMW", "3er", "Black", 2022, 230);
        myCar1.start();

        Car myCar2 = new Car("BMW", "1er", "Orange", 2015, 60);
        myCar2.accelerate(10);
    }

}
