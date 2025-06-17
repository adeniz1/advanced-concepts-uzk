package inClassExercises.sheet4.exercise2;

public class Evan extends Vehicle implements Electrified {

    double batteryLevel ;
    double maxCapacity = Electrified.MAX_BATTERY_KWH ;
    private double consumptionPerKm ;//kwh pro km
   
public Evan(String id, double maxLoad, double batteryCapacity){
    super(id, maxLoad); //maxLoad ist kg
    this.batteryLevel = batteryCapacity; // full tank
    this.consumptionPerKm = 0.25 ;
}

@Override
public void charge(double kWh) {
    if(batteryLevel+kWh<maxCapacity){
        batteryLevel+=kWh;
    } else {
        batteryLevel = maxCapacity;
    }
}

@Override
public double getBatteryLevel() {
    return this.batteryLevel;
}

@Override
protected double getRange() {
    return this.batteryLevel / consumptionPerKm;
}   
}
