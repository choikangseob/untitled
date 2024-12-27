package Algorithm.december;

import java.util.Scanner;

public class P20241227 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] arr = new int[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
    int s = n/2;
    int e = n/2;
    int sum = 0;
    for (int i = 0; i < n; i++) {
      for (int j = s; j <= e; j++) {
        sum += arr[i][j];
      }
        if(i<n/2){
          s--;
          e++;
        }else{
          s++;
          e--;
        }
      }

    System.out.println(sum);
  }
}
