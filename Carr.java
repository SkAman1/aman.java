public interface Vehicle {
    void start();
    void stop();
}
 class car implements Vehicle {
    public void start() {
        System.out.println("Car started");
    }
    public void stop() {
        System.out.println("Car stopped");
    }
}
 class motorcycle implements Vehicle {
    public void start() {
        System.out.println("Motorcycle started");
    }
    public void stop() {
        System.out.println("Motorcycle stopped");
    }
}
class traffic{
public static void main(String[] args){
      car c1=new car();
      motorcycle m1=new motorcycle();
      c1.start();
      c1.stop();
      m1.start();
      m1.stop();
    }
}

