package Algorithm.december;

import java.util.ArrayList;
import java.util.Scanner;

public class P20241212 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    ArrayList<Integer> saveCombination = new ArrayList<>();
    ArrayList<Integer> combinationCount = new ArrayList<>();

    System.out.println("정n면체, 정m면체 두개를 고르시오 N과 M은 4, 6, 8, 12, 20 중의 하나입니다");

    int n = sc.nextInt();

    int m = sc.nextInt();

    int count = 0;
    int max=-2100000000;
    for (int i = 1; i <= n; i++) {
      for(int j = 1; j <= m; j++) {
        saveCombination.add(i+j);
      }
    }
    for(int target = 2 ;target<=(n+m);target++ ) {
      for (int i = 0; i < saveCombination.size(); i++) {
        if (saveCombination.get(i) == target) {
          count++;
        }
      }
      combinationCount.add(count);
      count = 0;
    }
    for(int i = 0 ; i<combinationCount.size(); i++) {
      if(combinationCount.get(i) > max) {
        max = combinationCount.get(i);
      }
    }
    for(int i = 0 ; i<combinationCount.size(); i++) {
      if(combinationCount.get(i) == max) {
        System.out.print((i+2)+" ");
      }
    }

  }
}
