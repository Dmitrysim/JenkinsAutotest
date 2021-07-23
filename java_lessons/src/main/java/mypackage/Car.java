package mypackage;

public class Car {

    public Car() {
        System.out.println("New car created");
    }

    public Car(String color) {
        this.color = color;
    }

    public Car(String color, int weight, int length, int height) {
        this.color = color;
        this.weight = weight;
        this.length = length;
        this.height = height;
    }

    int height;
    int weight;
    int length;
    int width;
    String color;
    int speed;
    int maxSpeed = 200;

    public void addWeight(int weight) {
        this.weight = weight;
        System.out.println("New weight = " + this.weight);
    }

    public void drive(int speed) {
        if (weight <= maxSpeed) {
            this.speed = speed;
            System.out.println("You are driving");
        } else {
            System.out.println("Cannot drive");
        }
    }

}
