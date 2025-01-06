package Algorithm.december;

import java.util.Scanner;

public class P20250106 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("1<=n<=1,000,000사이의 n을 입력하시오");
    int n = sc.nextInt();
    int[] arr = new int[n];


    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();

    }
    System.out.println("몇개로 맞출지 K를 정하시오 K는 1<=K<=10,000 입니다");
    int k = sc.nextInt();

    int max  = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }

    int lt = 1;
    int rt = max;
    boolean flag = true;
    while(flag) {
      int mid = (lt + rt) / 2;

      int sum = 0;

      for (int i = 0; i < arr.length; i++) {
       sum += arr[i] / mid;


        if (sum > k) {
          lt = mid+1;
        } else if (sum < k) {
          rt = mid - 1;
        } else {
          System.out.println(k + "개인 최대수는 " + mid + "입니다.");
          flag = false;
        }
      }
    }

  }
}
