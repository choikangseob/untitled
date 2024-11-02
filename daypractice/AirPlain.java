package daypractice;

public class AirPlain {

  String name;
  AirPlainEngine airPlainEngine;

  public void turnOn(){
    airPlainEngine.AirPlainEngine();
  }

  public AirPlain(String name,AirPlainEngine airPlainEngine) {
    this.name = name;
    this.airPlainEngine = airPlainEngine;

  }
}
