class Car {
    String color;
    int speed;

    void drive() {
        System.out.println("Car is running");
    }
}

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();   // object
        c1.color = "Red";
        c1.speed = 120;

        c1.drive();
        System.out.println("car color is : "+ c1.color);
        System.out.println("car speed is : "+ c1.speed);
    }
}