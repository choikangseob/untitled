package Algorithm.december;

import java.util.ArrayList;
import java.util.Scanner;

public class P20241216 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<Integer> list1 = new ArrayList<>();

    int reversed = 0;
    int digit = 0 ;
    System.out.println("자연수 N의 개수를 정하시오");
    int n = sc.nextInt();
    System.out.println(n+"개의 자연수를 입력하시오");
    for (int i = 0; i < n; i++) {
      list.add(sc.nextInt());
    }

    for (int i = 0; i < n; i++) {
      int num = list.get(i);
      while(num!=0) {
        digit = num%10;
        reversed = reversed*10 + digit;

        num = num/10;

      }
      list1.add(reversed);
      reversed = 0 ;
    }

    for(int i=0;i<list1.size();i++) {
      for (int j = 2; j <=list1.get(i) ; j++) {

        if (list1.get(i) == 2) {
          System.out.println(list1.get(i) + "는 소수입니다");
        }

        if (list1.get(i) % j == 0) {
          if (list1.get(i) != j) {
            break;
          } else {
            System.out.println(list1.get(i) + "는 소수입니다");
          }
        }
      }
    }



  }

}
