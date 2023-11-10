interface CarParts {
    public void open();
    public void close();
}

interface LockableDoor extends CarParts {
    public void lock();
    public void unlock();
}

interface Alarm {
    public boolean isAlarmOn();
    public void turnOnAlarm();
    public void turnOffAlarm(); // Fixed the typo here (tunrOffAlaram to turnOffAlarm)
}

class CarPart {
    private int partID;
    private float weight;
    private float cost;

    public void aMethod() {
        System.out.println("This is a car part method");
    }

    public float getWeight() {
        return weight;
    }

    public int getPartID() {
        return partID;
    }

    public float getCost() {
        return cost;
    }
}

class CarDoor extends CarPart implements LockableDoor, Alarm {
    // Car door has a lock
    private boolean lockFlag = false;
    // Car door has an alarm switch for you to turn on/off alarm
    private boolean alarmFlag = false;

    public boolean isAlarmOn() {return alarmFlag;}

    public void turnOnAlarm() {
        alarmFlag = true;
    }

    public void turnOffAlarm() {
        alarmFlag = false;
    }

    // To simulate the situation that you open a car while
    // sitting in the car
    //
    // Step 1: Turn on the alarm
    // Step 2: Unlock the car
    // Step 3: Display "Look out, opening the door"
    public void open() {
        isAlarmOn();
        unlock();
        System.out.println("Look out, opening the door");
    }

    // To simulate the situation that you close a car while
    // sitting in the car
    //
    // Step 1: Display "Look out, closing the door"
    // Step 2: Lock the car
    // Step 3: Turn off the alarm
    public void close() {
        System.out.println("Look out, closing the door");
        lock();
        turnOffAlarm();
    }

    public void lock() {
        lockFlag = true;
    }

    public void unlock() {
        lockFlag = false;
    }
}
