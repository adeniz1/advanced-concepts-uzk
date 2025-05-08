package inClassExercises.sheet4.exercise2;

public class Truck extends Vehicle implements Refuelable {

// TODO: add attributes , constants and implement required methods
public Truck(String id, double maxLoad, double tankCapacity) {
    super(id, maxLoad);
    // TODO: initialise attributes
    }

@Override
public void refuel(double liters) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'refuel'");
}

@Override
public double getFuelLevel() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getFuelLevel'");
}
    
}
