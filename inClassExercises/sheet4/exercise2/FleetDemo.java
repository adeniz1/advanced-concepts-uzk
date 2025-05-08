package inClassExercises.sheet4.exercise2;

public class FleetDemo {
    public static void main(String[] args) {
        // TODO: create a Truck and an EVan, test methods as described
        Truck truck1 = new Truck("Truck1", 200, 500);
        Evan evan1 = new Evan("Evan1",200, 600);

        System.out.println(truck1.getFuelLevel());
        truck1.canReach(300);
        System.out.println(truck1.getFuelLevel());

    }
}
