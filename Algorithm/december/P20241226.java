package Algorithm.december;

import java.util.Scanner;

public class P20241226 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [][] arr = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
    int sum = 0;
    int sum1 = 0;
    int maxSum = 0;
    for(int i = 0; i<n; i++) {
      sum += arr[i][i];
    }
    maxSum = sum;
    sum = 0;
    for(int i = 0; i<n; i++) {
      sum += arr[i][n-i-1];
    }
    if(sum > maxSum) {
      maxSum = sum;
    }
    sum = 0;
    for(int i = 0; i<n; i++) {
      for(int j = 0; j<n; j++) {
        sum += arr[i][j];
        sum1 += arr[j][i];
      }
      if(sum > maxSum) {
        maxSum = sum;
      }
      sum = 0;
      if(sum1>maxSum){
        maxSum = sum1;
      }
      sum1 = 0;
    }
    System.out.println("최대합은"+maxSum+"입니다");
    System.out.println("Clear");
  }

}
