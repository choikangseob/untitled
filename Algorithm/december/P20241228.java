package Algorithm.december;

import java.util.Scanner;

public class P20241228 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = n-1;
    int[][] arr = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
    int M = sc.nextInt();
    for (int i = 0; i < M; i++) {
      int row = sc.nextInt() - 1;
      int direction = sc.nextInt();
      int shift = sc.nextInt();
      shift = shift % n;
      if (direction == 0) {
        int[] newRow = new int[n];
        for (int j = 0; j < n; j++) {
          newRow[j] = arr[row][(j + shift) % n];
        }
        arr[row] = newRow;
      } else {
        int[] newRow = new int[n];
        for (int j = 0; j < n; j++) {
          newRow[j] = arr[row][(j - shift + n) % n];
        }
        arr[row] = newRow;
      }
    }
    int s = 0;
    int e = q;
    int sum = 0;
    for(int i = 0 ; i <= n/2 ; i++) {
      for (int j = s; j <= e; j++) {
          sum += arr[i][j];
      }
      s++;
      e--;
    }
    s=(n/2)-1;
    e=(n/2)+1;
    for(int i = n/2+1 ; i < n ; i++) {
      for (int j = s; j <= e; j++) {
          sum += arr[i][j];
      }
      s--;
      e++;
    }
    System.out.println(sum);
  }
}
