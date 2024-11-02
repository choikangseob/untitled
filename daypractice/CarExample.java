package daypractice;

public class CarExample {
  public static void main(String[] args) {

    CarEngine carEngine = new CarEngine();

    Car car = new Car("모닝",carEngine);

    car.turnOn();
  }
}
