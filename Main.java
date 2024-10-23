public class Main {




  public static void main(String[] args) {
    RemoteControl samsung = new SamsungTV();
    RemoteControl lg = new LGTV();

    samsung.turnOn();
    samsung.changeChannel(10);

    lg.turnOn();
    lg.changeChannel(5);
  }
}
