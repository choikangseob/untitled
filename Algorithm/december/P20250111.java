package Algorithm.december;

import java.util.Scanner;

import static java.util.Arrays.sort;

public class P20250111 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int m = sc.nextInt();
    for (int i = 0; i < m; i++) {
      sort(arr);
      arr[0]=arr[0]+1;
      arr[n-1]=arr[n-1]-1;
    }
    sort(arr);
    System.out.println(arr[n-1]-arr[0]);
    System.out.println("Clear");
  }
}
