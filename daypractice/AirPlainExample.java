package daypractice;

public class AirPlainExample {

  public static void main(String[] args) {

    AirPlainEngine engine = new AirPlainEngine();
    AirPlain airPlain = new AirPlain("보잉707",engine);

    airPlain.turnOn();
  }

}
