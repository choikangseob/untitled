package Algorithm.december;

import java.util.ArrayList;
import java.util.Scanner;

public class P202412118 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();

    System.out.println("문제의 개수 n 을 입력하시오 2<=n<=100");

    int n = sc.nextInt();

    System.out.println("답을 입력하시오");
    for (int i = 0; i < n; i++) {
      list.add(sc.nextInt());
    }
    System.out.println("채점을 하고 있습니다");
    int totalScore = 0;
    int count = 0;
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) == 1) {
        count++;
        totalScore += count;
      }else if(list.get(i)==0){
        count= 0;
      }
    }
    System.out.println("채점 점수는"+totalScore+"입니다");
  }
}
