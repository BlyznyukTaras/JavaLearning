package src.ExamplePrograms.TaskClasses.MediumClasses;

public class Car {
    private String brand;
    private String model;
    private int maxSpeed;
    private int currentSpeed;
    public Car() {
        brand = "Toyota";
        model = "Alphard";
        maxSpeed = 200;
        currentSpeed = 0;
    }
    public Car(String brand, String model, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
        currentSpeed = 0;
    }
    public Car(Car obj) {
        brand = obj.brand;
        model = obj.model;
        maxSpeed = obj.maxSpeed;;
        currentSpeed = obj.currentSpeed;;
    }
    public void speedUp(int addSpeed) {
        int remainingSpeed = maxSpeed - currentSpeed; // Getting the remaining speed from
        // substraction of these 2 fields' values;
        if (addSpeed > 0 && remainingSpeed > 0) { // If the value of speed you want to add and the remaining speed
            // are greater than zero
            if (addSpeed <= remainingSpeed) currentSpeed += addSpeed; // Adding the value of speed from parameter
            // if it's less or equal to the value of remaining speed
        }
        else System.out.println("Speeding more isn't possible now");
    }
    public void slowDown(int reduceSpeed) {
        int futureSpeed = maxSpeed - reduceSpeed; // Same about the reducing of speed, nothing much differs
        if (reduceSpeed > 0 && futureSpeed > 0) currentSpeed -= reduceSpeed;
        else System.out.println("Slowing more isn't possible now");
    }
    public void outputInfo() {
        System.out.printf("Car: %s %s, maximum speed: %d km/h, " +
                "current speed: %d km/h\n", brand, model, maxSpeed, currentSpeed);
    }
}
