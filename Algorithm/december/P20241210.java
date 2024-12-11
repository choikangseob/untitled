package Algorithm.december;

import java.util.ArrayList;
import java.util.Scanner;

public class P20241210 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("n을 입력하세요 n의 약수를 찾습니다");
    int n = sc.nextInt();
    ArrayList<Integer> list = new ArrayList<>();

    for (int i = 1; i <= n; i++){
      if(n%i==0){
        list.add(i);
      }
    }
    System.out.println("몇번째 약수를 볼건지 수를 입력하시오");
    int j = sc.nextInt();
    System.out.println(n+"의 약수 중"+j+"번째 약수의 수는");
    if(j>list.size()) {
      System.out.println("-1");
    }else if(j<list.size()){
      System.out.println(list.get(j - 1) + "입니다");

    }
  }
}
