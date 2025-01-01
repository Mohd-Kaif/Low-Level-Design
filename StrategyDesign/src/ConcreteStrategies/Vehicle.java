package ConcreteStrategies;

import Strategy.DriveStrategy;

public class Vehicle {
    public DriveStrategy driveObject;

    public Vehicle(DriveStrategy var1) {
        this.driveObject = var1;
    }

    public void drive() {
        this.driveObject.drive();
    }
}
