public class TestDoor {
    public static void main(String[] args) {
        // I have an sedan car
        CarDoor sedan = new CarDoor();

        sedan.open();
        // I close the door
        sedan.close();

        sedan.turnOnAlarm();
        sedan.lock();

    }
}