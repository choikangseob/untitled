  // 리모컨 인터페이스 정의
  public interface RemoteControl {
    void turnOn();
    void turnOff();
    void changeChannel(int channel);
  }

  // 삼성 TV 클래스 구현
  class SamsungTV implements RemoteControl {
    @Override
    public void turnOn() {
      System.out.println("Samsung TV 켜기");
    }

    @Override
    public void turnOff() {
      System.out.println("Samsung TV 끄기");
    }

    @Override
    public void changeChannel(int channel) {
      System.out.println("Samsung TV 채널 변경: " + channel);
    }
  }

  // LG TV 클래스 구현
  class LGTV implements RemoteControl {
    @Override
    public void turnOn() {
      System.out.println("LG TV 켜기");
    }

    @Override
    public void turnOff() {
      System.out.println("LG TV 끄기");
    }

    @Override
    public void changeChannel(int channel) {
      System.out.println("LG TV 채널 변경: " + channel);
    }
  }



