package Algorithm.december;

import java.util.ArrayList;
import java.util.Scanner;

public class P20241221 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();

    System.out.println("1부터 n까지의 수 n을 입력하시오");
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      list.add(i+1);
    }
    boolean flag = true;
    while(flag) {
      System.out.println("숫자를 뒤집을 구간을 작은수부터 M,L을 입력하시오 둘다 0을 입력시 종료");
      int m = sc.nextInt();
      int l = sc.nextInt();

      if(m==0 && l==0) {
        flag = false;
        break;
      }

      for (m = m - 1, l = l-1; m <= (m + (l)) / 2; m++, l--) {

        int changeNumber = 0;

        changeNumber = list.get(m);
        list.set(m, list.get(l));
        list.set(l, changeNumber);

      }
    }
    for (int i = 0; i < n; i++) {
      System.out.print(list.get(i));
    }
    System.out.println("Clear");
  }
}
