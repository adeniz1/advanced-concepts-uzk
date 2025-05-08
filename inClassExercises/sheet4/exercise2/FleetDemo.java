package inClassExercises.sheet4.exercise2;

public class FleetDemo {
    public static void main(String[] args) {
        // TODO: create a Truck and an EVan, test methods as described
        Truck truck1 = new Truck("Truck1", 1000, 1000);
        Evan evan1 = new Evan("Evan1",200, 600);

        System.out.println(truck1.getFuelLevel());
        truck1.canReach(300);
        truck1.refuel(100);
        System.out.println(truck1.getFuelLevel());
        //etwas funktioniert nicht

    }
}
