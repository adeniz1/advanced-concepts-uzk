package inClassExercises.sheet4.exercise2;

public class Truck extends Vehicle implements Refuelable {
    private double fuelLevel; //Füllstand
    private double tankCapacity; //Kapazität
    private double consumptionPerKm ; //liter/km

public Truck(String id, double maxLoad, double tankCapacity) {
    super(id, maxLoad); //maxload ist kg
    this.tankCapacity=tankCapacity;
    this.fuelLevel = 0 ;
    this.consumptionPerKm = 0.3 ;
}
@Override
public void refuel(double liters) {
    if(fuelLevel+liters <= tankCapacity) {
        fuelLevel+=liters ;
    } else {
        fuelLevel = tankCapacity ;
    }
}

@Override
public double getFuelLevel() {
   return this.fuelLevel ;
}

@Override
// wie weit kommt man mit fuelLevel noch?
protected double getRange() {
    return this.fuelLevel / consumptionPerKm ;
}
    
}
