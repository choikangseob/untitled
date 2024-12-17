package Algorithm.december;

import java.util.Scanner;

public class P20241217 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("참여하는 사람 수를 정하시오 2<=N<=1,000");
    int n = sc.nextInt();
    int maxMoney = 0;
    System.out.println("사람수의 주사위 를 3개씩 입력하시오");
    for (int i = 1; i <= n; i++) {
      int maxDice = 0;
      int count = 0;

      int dice1 = sc.nextInt();
      int dice2 = sc.nextInt();
      int dice3 = sc.nextInt();

      maxDice = Math.max(maxDice, dice1);
      maxDice = Math.max(maxDice, dice2);
      maxDice = Math.max(maxDice, dice3);

      if (dice1 == dice2 && dice1 == dice3) {
        count = 3;
      } else if (dice1 == dice2 || dice1 == dice3 || dice2 == dice3) {
        count = 2;
      } else {
        count = 1;
      }

      int Money = 0;
      if (count == 1) {
        Money = maxDice * 100;
      } else if (count == 2) {
        Money = 1000 + maxDice * 100;
      } else if (count == 3) {
        Money = 10000 + maxDice * 1000;
      }

      if (Money > maxMoney) {
        maxMoney = Money;
      }
    }
    System.out.println("가장 많은 상금을 받는 사람의 상금은"+maxMoney+"입니다");
  }
}
