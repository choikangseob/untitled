package Algorithm.december;

import java.util.Scanner;

public class P20241225 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("수열의 개수 n을 입력하세요 1<=n<=10,000");
    int n = sc.nextInt();
    System.out.println("수열의 i번쨰부터 j번째까지의 합이 m이되게하는 조건 m을 입력하세요 1<=m<=300,000,000");
    int m = sc.nextInt();
    System.out.println("수열을 입력하시오 각수는 30,000을 넘어선 안됩니다");
    int[] A = new int[n];
    for (int i = 0; i < n; i++) {
      A[i] = sc.nextInt();
    }

    int sum = 0;
    int count = 0;
    int lt = 0;

    for (int rt = 0; rt < n; rt++) {
      sum += A[rt];

      while (sum > m && lt <= rt) {
        sum -= A[lt];
        lt++;
      }

      if (sum == m) {
        count++;
      }
    }

    System.out.println("합이 " + m + "이 되는 부분 수열의 개수는 " + count + "개 입니다");
  }
}

