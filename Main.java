interface Vehicle {
    void start();
    void stop();
}
class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting.");
    }
    public void stop() {
        System.out.println("Car is stopping.");
    }
}
class Motorcycle implements Vehicle {
    public void start() {
        System.out.println("Motorcycle is starting.");
    }
    public void stop() {
        System.out.println("Motorcycle is stopping.");
    }
}
 class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        Motorcycle myMotorcycle = new Motorcycle();
        myCar.start();
        myCar.stop();
        myMotorcycle.start();
        myMotorcycle.stop();
    }
}