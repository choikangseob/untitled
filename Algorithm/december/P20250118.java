package Algorithm.december;

import java.util.ArrayList;
import java.util.Scanner;

public class P20250118 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();

    System.out.println("숫자를 입력하시오 10입력시 종료");

    while (true) {
      int n = sc.nextInt();
      if(n == 10) {
        break;
      }
      list.add(n);
    }
    System.out.println("몇개를 지울건지 지울개수 m을 입력하시오");
    int m = sc.nextInt();
    int count = 0;
    for(int i = 0; i < list.size(); i++) {
      if(count<m && 0<i){
        if(list.get(i-1)<list.get(i)){
          list.remove(i-1);
          count++;
          i = 0;
        }
      }else if(count == m){
        break;
      }
    }

    while(count!=m){
      list.remove(list.size()-1);
      count++;
    }

    for(int i = 0; i<list.size(); i++) {
      System.out.print(list.get(i)+" ");
    }


    System.out.println("Clear");
  }
}
