package Algorithm.december;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P20241211 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();
    System.out.println("n개의숫자를 입력하세요 2<=n<=100");
    int n = sc.nextInt();
    System.out.println("k번째로 큰수를 기록합니다 1<=k<=50");
    int k = sc.nextInt();
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      list.add(sc.nextInt());
    }

    for (int i =1; i <= n-2 ; i++){
          list.get(i-1);
          sum += list.get(i-1);
      for (int j = i+1; j <= n-1 ; j++){
        list.get(j-1);
        sum += list.get(j-1);
        for (int l = i+2; l <= n ; l++){
          list.get(l-1);
          sum += list.get(l-1);
          list1.add(sum);
          sum -= list.get(l-1);
        }
        sum -= list1.get(j-1);
      }
      sum=0;
    }


    Collections.sort(list1.reversed());

    System.out.println(k+"번째로 큰 수는");
    System.out.println(list1.get(k-1));
  }
}
