package Algorithm.december;

import java.util.Scanner;

public class P20241215 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("2<=N<=200000사의 자연수 N을 입력하세요");
    int n = sc.nextInt();
    int primeNumber = 0;

    for(int i = 2; i <= n; i++) {

      for(int j = 2; j <= i; j++) {

        if(i==2){
          primeNumber++;
          continue;
        }

        if(i%j==0){
         if(i!=j){
           break;
         }else{
           primeNumber++;
         }

        }
      }
    }
    System.out.println("소수의 개수는 " +primeNumber+"개 입니다");
  }
}
