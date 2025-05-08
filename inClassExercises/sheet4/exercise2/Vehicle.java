package inClassExercises.sheet4.exercise2;

public abstract class Vehicle {
    protected String id;
    protected double maxLoad; // kg

    public Vehicle(String id, double maxLoad) {
    this.id = id;
    this.maxLoad = maxLoad;

}

    protected abstract double getRange();
}
