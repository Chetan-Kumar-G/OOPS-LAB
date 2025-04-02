interface SmartDevice {
    void turnOn();
    void turnOff();
}


class Fan implements SmartDevice {
    public void turnOn() {
        System.out.println("Fan is now ON.");
    }

    public void turnOff() {
        System.out.println("Fan is now OFF.");
    }
}

class Light implements SmartDevice {
    public void turnOn() {
        System.out.println("Light is now ON.");
    }

    public void turnOff() {
        System.out.println("Light is now OFF.");
    }
}

class AC implements SmartDevice {
    public void turnOn() {
        System.out.println("AC is now ON.");
    }

    public void turnOff() {
        System.out.println("AC is now OFF.");
    }
}

public class interface_3 {
    public static void main(String[] args) {
        SmartDevice[] devices = { new Fan(), new Light(), new AC() };

        for (SmartDevice device : devices) {
            device.turnOn();
        }

        for (SmartDevice device : devices) {
            device.turnOff();
        }
    }
}
