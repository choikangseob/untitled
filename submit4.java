public class submit4 {

  public static void main(String[] args) {
    for (int i = 2; i <= 4; i++) {
      boolean isPrime = true; 

      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          isPrime = false;
          break;
        }
      }

      if (isPrime) {
        System.out.println(i + "는 소수입니다");
      } else {
        System.out.println(i + "는 소수가 아닙니다");
      }
    }
  }
}
