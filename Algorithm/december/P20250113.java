package Algorithm.december;

import java.util.Arrays;
import java.util.Scanner;

public class P20250113 {


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] weights = new int[n];

    for (int i = 0; i < n; i++) {
      weights[i] = sc.nextInt();
    }

    Arrays.sort(weights);

    int count = 0;
    int left = 0;
    int right = n - 1;

    while (left <= right) {
      if (weights[left] + weights[right] <= m) {
        left++;
      }
      right--;
      count++;
    }

    System.out.println(count);
  }

}
