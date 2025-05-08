package inClassExercises.sheet4.exercise2;

public class Evan extends Vehicle implements Electrified {

    double batteryLevel ;
   
public Evan(String id, double maxLoad, double batteryCapacity){
    super(id, maxLoad);
    this.batteryLevel = batteryCapacity;
}

@Override
public void charge(double kWh) {
    if(batteryLevel-kWh<maxLoad){
        batteryLevel+=kWh;
    } else {
        double rest = maxLoad - batteryLevel;
        batteryLevel+=rest;
    }
}

@Override
public double getBatteryLevel() {
    return batteryLevel;
}
    // TODO: implement Vehicle + Electrified methods

@Override
protected double getRange() {
    return maxLoad;
}
    
}
