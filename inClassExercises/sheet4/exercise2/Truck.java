package inClassExercises.sheet4.exercise2;

public class Truck extends Vehicle implements Refuelable {
    private double fuelLevel;

// TODO: add attributes , constants and implement required methods
public Truck(String id, double maxLoad, double tankCapacity) {
    super(id, maxLoad);
    this.fuelLevel=tankCapacity;
}
@Override
public void refuel(double liters) {
    if(fuelLevel+liters < maxLoad) {
        fuelLevel+=liters ;
    } else {
        double rest = maxLoad-fuelLevel;
        fuelLevel+=rest;
    }
}

@Override
public double getFuelLevel() {
   return this.fuelLevel ;
}

@Override
protected double getRange() {
    return maxLoad;
}
    
}
