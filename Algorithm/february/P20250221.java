package Algorithm.february;

public class P20250221 {
  public static void main(String[] args) {
    int num = 1;
    System.out.println(Integer.toBinaryString(p20250221(num)));
    System.out.println("Clear");
  }

  public static int p20250221(int n) {
    if (n > 11) {
      return 11;
    }
    return p20250221(n + 1);
  }
}

