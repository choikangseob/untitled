package submit;

import java.util.Scanner;

public class submit2 {
  public static void main(String[] args) {
    Scanner Scanner = new Scanner(System.in);

    double A = Scanner.nextInt();
    double B = Scanner.nextInt();
    double result =0;
    if(0<A && 0<B && A<10 && B<10) {
      result = A/B;
    }
    System.out.println(result);
  }
}
