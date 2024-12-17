package Algorithm.december;

import java.util.Scanner;

public class P20241217 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("참여하는 사람 수를 정하시오 2<=N<=1,000");
    int n = sc.nextInt();

    int maxMoney = 0;
    int maxDice = 0;
    int countOfSameDice = 0;
    int count = 0;
    int Money = 0;
    System.out.println("사람수의 주사위 를 3개씩 입력하시오");
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= 3; j++) {
        int dice = sc.nextInt();
        countOfSameDice = dice;
        if(dice>maxDice){
          maxDice = dice;
        }else if(maxDice == countOfSameDice){
          count++;
        }
      }
      if(count==0){
        maxMoney = maxDice * 100;
      }else if (count==1){
        maxMoney = 1000 + maxDice * 100;
      }else if (count==2){
        maxMoney = 10000 + maxDice * 1000;
      }
      maxDice = 0;
      count = 0;
      countOfSameDice = 0;
      if(maxMoney>Money){
        Money = maxMoney;
      }
    }
    System.out.println("가장 많은 상금을 받는 사람의 상금은"+Money+"입니다");
  }
}
