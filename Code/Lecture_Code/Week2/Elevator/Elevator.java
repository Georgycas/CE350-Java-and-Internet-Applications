public class Elevator {
    
    // Attributes
    private int initFloor;
    private int currentFloor;

    // Manager functions
    public Elevator(int startFloor) {
        this.initFloor = startFloor;
        this.currentFloor = startFloor;
        System.out.println("start on floor " + startFloor);
    }

    // Access functions
    public int getInitFloor() {
        return this.initFloor;
    }

    public int getCurrentFloor() {
        return this.currentFloor;
    }

    public void setInitFloor(int floor) {
        this.initFloor = floor;
    }

    public void setCurrentFloor(int floor) {
        this.currentFloor = floor;
    }

    // Predicate function to check if the elevator is on a specific floor
    public boolean isOnFloor(int floor) {
        return this.currentFloor == floor;
    }

    // Helping functions
    private void moveUp() {
        this.currentFloor++;
        System.out.println("going up to " + this.currentFloor);
    }

    private void moveDown() {
        this.currentFloor--;
        System.out.println("going down to " + this.currentFloor);
    }

    // Implementor function
    public void select(int targetFloor) {
        while (this.currentFloor != targetFloor) {
            if (this.currentFloor < targetFloor) {
                moveUp();
            } else {
                moveDown();
            }
        }
        System.out.println("open at " + this.currentFloor);
    }

    // Main function to demonstrate the behavior
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide the initial floor as an argument.");
            return;
        }

        try {
            int initialFloor = Integer.parseInt(args[0]);
            Elevator a = new Elevator(initialFloor);
            // For demonstration purposes, the select calls are hardcoded
            a.select(11);
            a.select(9);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide a numeric floor value.");
        }
    }
}
