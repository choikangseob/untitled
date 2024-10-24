package submit;

import java.util.ArrayList;
import java.util.Scanner;

public class submit5 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    ArrayList<Integer> Argument = new ArrayList<Integer>();
    int a = s.nextInt();
    int b = s.nextInt();
    boolean flag = true;

    while (flag) {
      int N=0;
      if (a < b) {
        N = a;
      } else {
        N = b;
      }
      int i;
      for (i = 2; i < N; i++) {
        if (a % i == 0 && b % i == 0) {
          Argument.add(i);
          a = a / i;
          b = b / i;
          break;
        }
      }
      if(i==N){
        flag = false;
      }
    }
    int Max_num=1;
    for (int i =0; i<Argument.size(); i++){
      Max_num = Max_num*Argument.get(i);
    }
    System.out.println("최대 공약수"+Max_num);
    System.out.println("최소 공배수"+Max_num*a*b);
  }
}
